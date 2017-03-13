package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

public class Ship {
	public static final String TAG = "moto";
	
	public static int targetNum;
	public static boolean onStart = false;
	public static boolean autoTargetOn = true;
	
	public double targetDist;
	public double targetDist1;
	public double targetDist2;
	public double targetDist3;
	public double targetDist4;
	public double targetDist5;
	public double targetDist6;
	public double targetDist7;
	public double targetDist8;
	public double targetDist9;
	public double targetDist10;
	public double targetDist11;
	public double targetDist12;
	public double targetDist13;
	public double targetDist14;
	

	public Drawable ship;
	public Drawable shiphitten;
	public AnimationDrawable shipdead;
	
	public double blackSmokeX1;
	public double blackSmokeY1;
	public double blackSmokeWidth1 = 100;
	public double blackSmokeHeight1 = 100;
	public int blackSmokeAlpha1;
	public static Rect blackSmokeRect1;
	
	public Drawable towMissleColloder;
	public Bitmap towMissle;
	public Path targetPath;
	
	public int whatKindOfShip = 0;
	
	
	
	public double shipX;
	public double shipY;
	public double shipWidth;
	public double shipHeight;
	public Rect shipRect;
	public double shipSpeed;
	public int shipAlpha;
	
	
	public Rect towRect;
	public double towX;
	public double towY;
	public double towDX;
	public double towDY;
	public double towWidth = 20;
	public double towHeight = 20;
	public double towSpeed = 0.002;
	public double towSpeedX = 0;
	public double towSpeedY = 0;
	public int towAlpha = 255;
	public double towHeading = 0;
	public double towRot = 0;
	public int towReloadNum = 1;
	public int towReloadTime;
	public boolean reloadTow = false;
	
	
	//private boolean updatePlayerScore = false;
	private double shipDist;
	private double playerDist;
	//private double shipRadius;
	//private double shipRad;
	
	
	private Paint shipLinePaint;
	private Paint playerLinePaint;
	private Paint towLinePaint;
	private Paint distLinePaint;
	
	private int playerLinePaintAlpha;
	private int towLinePaintAlpha;
	private int shipLinePaintAlpha;
	
	private int shipAtackRot = 50;
	private boolean shipStopFire = false; 
	
	public boolean shipHit;
	public boolean shipHitExplode;
	public int weaponsDamage; 
	public int shipHitNum;
	
	//private double radians; 
	private double angle;
	private double degrees;
	private double radius;
	private double rot;
	private double rot2;
	
	public double sumX;
	public double sumY;
	public double closestX;
	public double closestY;
	public int closest = 0;

	public static double numbers[];

	
	
	
	public Ship(double sX, double sY,int sWidth,int sHeight,int sAlpha, int KindOfShip){ 
		
		
		shipX = sX;
		shipY = sY;
		shipHeight = sHeight;
		shipWidth = sWidth;
		shipAlpha = sAlpha;
		whatKindOfShip = KindOfShip; 
		
		shipLinePaint = new Paint();
        shipLinePaint.setAntiAlias(true);
        
    	distLinePaint = new Paint();
        distLinePaint.setAntiAlias(true);
        distLinePaint.setARGB(255, 0, 255, 0);
        
        playerLinePaint = new Paint();
        playerLinePaint.setAntiAlias(true);
        playerLinePaint.setStyle(Paint.Style.STROKE);
        
        
        towLinePaint = new Paint();
        towLinePaint.setAntiAlias(true);
        towLinePaint.setStrokeWidth(3);
  
  
    	towReloadTime = (int)(Math.random() * 50 + 20);
    	shipHitNum = 0;
    	
    	radius = 2 * 180 / Math.PI;
		//radians = 2 * 180 / Math.PI;
  		reloadTowMissle();
  		
  		//shipYarray = new double[14];
  		//shipXarray = new double[14];
  		numbers = new double[15];
  		
	}
	
	
	public void buildShip(Context context){
	
		Resources res = context.getResources();
		
		towMissleColloder = context.getResources().getDrawable(R.drawable.towmisslecollider);
		towMissle = BitmapFactory.decodeResource(res,R.drawable.towmissle); 
		
		switch(whatKindOfShip){
		
		case 0 : 
			ship = context.getResources().getDrawable(R.drawable.smallcuzer1);
			shiphitten = context.getResources().getDrawable(R.drawable.smallcuzer1hit);
			
			shipdead = new AnimationDrawable();
			shipdead.addFrame(res.getDrawable(R.drawable.smallcuzerdead0001), 100);
			shipdead.addFrame(res.getDrawable(R.drawable.smallcuzerdead0002), 100);
			shipdead.addFrame(res.getDrawable(R.drawable.smallcuzerdead0003), 100);
			shipdead.addFrame(res.getDrawable(R.drawable.smallcuzerdead0004), 100);
			shipdead.setOneShot(true);
		break;
		
		case 1 : 
			ship = context.getResources().getDrawable(R.drawable.ptboat1);
			shiphitten = context.getResources().getDrawable(R.drawable.ptboat1hit);
			
			shipdead = new AnimationDrawable();
			shipdead.addFrame(res.getDrawable(R.drawable.ptboatdead0001), 100);
			shipdead.addFrame(res.getDrawable(R.drawable.ptboatdead0002), 100);
			shipdead.addFrame(res.getDrawable(R.drawable.ptboatdead0003), 100);
			shipdead.addFrame(res.getDrawable(R.drawable.ptboatdead0004), 100);
			shipdead.setOneShot(true);
		break;
		
		
		}
		
	
		return;
	}
	
	public void shipDoDraw(Canvas canvas){
		
		if(GameView.GameState == "run"){
		
		shipRect = new Rect((int)shipX,(int)shipY,(int)shipX + (int)shipWidth, (int)shipY + (int)shipHeight);
		shipRect.centerX();
		shipRect.centerY();
		ship.setBounds(shipRect);
		ship.setAlpha(shipAlpha);
		
		shiphitten.setBounds(shipRect);
		shiphitten.setAlpha(shipAlpha);
		shipdead.setBounds(shipRect);
		shipdead.setAlpha(shipAlpha);
		
	
		towRect = new Rect((int)towX,(int)towY,(int)towX + (int)towWidth, (int)towY + (int)towHeight);
		towRect.centerX();
		towRect.centerY();
		towMissleColloder.setBounds(towRect);
		towMissleColloder.draw(canvas);
	
//canvas.drawLine((float) 2 + (float)Player.playerPosX +(float)Player.playerWidth /2, (float)Player.playerPosY + (float)Player.playerHeight /2,(float)shipX + (float)shipWidth /2, (float)shipY + (float)shipHeight /2 ,playerLinePaint);
		
		if(shipHit){
			shipHit = false;
			shiphitten.draw(canvas);	
		}else if(shipHitExplode){
			shipdead.draw(canvas);
			 //towAlpha= 0;
			shipStopFire = true;
		}else{
			ship.draw(canvas);
		}
		
		if(shipHitExplode == false){
			
			if(shipDist < 12){
				shipStopFire = false;
				canvas.drawLine((float)shipX + (float)shipWidth /2, (float)shipY + (float)shipHeight /2,(float)Player.playerPosX +(float)Player.playerWidth /2, (float)Player.playerPosY + (float)Player.playerHeight /2, shipLinePaint);
			}else if(shipDist > 12){
				shipStopFire = true;
				
			}
			
			if(playerDist < 12){
				shipStopFire = false;
				canvas.drawLine((float)Player.playerPosX +(float)Player.playerWidth /2, (float)Player.playerPosY + (float)Player.playerHeight /2,(float)shipX + (float)shipWidth /2, (float)shipY + (float)shipHeight /2, shipLinePaint);
			}else if(playerDist > 12){
				shipStopFire = true;
			}
			
		}
			
		if(shipHitExplode == false && shipStopFire == false){	
			//targets test // crashed on droid
			//if(Player.playerTargetRect.intersect(shipRect)){
			//canvas.drawCircle((float)shipX + (float)shipWidth /2, (float)shipY + (float)shipHeight /2, shipAtackRot, playerLinePaint);
			//}
			//canvas.drawLine((float)shipX + (float)shipWidth /2, (float)shipY + (float)shipHeight /2,(float)degrees + (float)shipHeading ,(float)degrees + (float)shipHeading, playerLinePaint);
			//canvas.drawLine((float)shipX + (float)shipWidth /2, (float)shipY + (float)shipHeight /2,(float)towX + (float)towWidth /2 , (float) towY + (float)towHeight /2, towLinePaint);
			if(reloadTow == false){
			canvas.save();
			canvas.rotate((float) -degrees, (float)towX + (float)towWidth /2 , (float) towY + (float)towHeight /2);
			canvas.drawBitmap(towMissle, (int)towX, (int)towY, null);
			canvas.restore();
			}
		
		}
		
		if(shipHitExplode){
			shipdead.start();	
			shipdead.run();
			blackSmokeY1 = shipY + shipHeight /2 - shipHeight + 10;
			blackSmokeX1 = shipX + shipWidth /2 - shipWidth /2;
			blackSmokeAlpha1 = 255;
			shipdead.draw(canvas);
			shipStopFire = true;
		}
		
		
		
		}//run
		
		
		
		
		return;
	}

	
	public void updateShip(){
		if(GameView.GameState == "run"){
		
		
		
		if(autoTargetOn){
			autoTargeting();
		}else{
			targeting();
		}
		
		
		 /* if(GameMain.reverceControlls){
	      	  if(Player.playerPosY < screenSyncUp){
	      		  mBackgroundPosY -= Maps.backgroundSpeed; 
	      	  }
	      	  if(Player.playerPosY > screenSyncDown){
	      		  mBackgroundPosY += Maps.backgroundSpeed; 
	      	  }
	        }else{
	          if(Player.playerPosY > screenSyncUp){
	        	  mBackgroundPosY -= Maps.backgroundSpeed; 
	           }
	           if(Player.playerPosY < screenSyncDown){
	        	   mBackgroundPosY += Maps.backgroundSpeed; 
	           }	
	        }
		*/
		
		
		
		
	//on start
	
		
		if(Player.playerPosY > GameView.screenSyncUp){
			onStart = true;  
		}
		
		if(GameView.mBackgroundPosY == -GameView.offSetBackgroudHeight){
			
			onStart = false;  
		}
		
		


		
if(onStart){
			
		if(GameMain.reverceControlls){	
			
			  if(Player.playerPosY > GameView.screenSyncDown){//down
		      		shipY += Maps.backgroundSpeed;
		      }
				
			  if(Player.playerPosY < GameView.screenSyncUp){//up 
				    shipY -= Maps.backgroundSpeed;
			  }
	      	  
			  
			  
		}else{
			
			
			  if(Player.playerPosY < GameView.screenSyncDown){//down
		      		shipY += Maps.backgroundSpeed;
		      }
				
			  if(Player.playerPosY > GameView.screenSyncUp){//up 
				    shipY -= Maps.backgroundSpeed; 
			  }    	
			
			
			
			
		}
			
			
			
}
		

	
	


		
		
		
		
		
		//
		
		shipDist = Math.sqrt(Player.playerPosY - shipY);
		playerDist = Math.sqrt(shipY - Player.playerPosY);
		
		
		
		
		
		towLinePaintAlpha -= 5;
		towLinePaint.setARGB(towLinePaintAlpha, 255, 255, 255);
		
		playerLinePaintAlpha = (int) (Math.random() * 200 + 220);
		playerLinePaint.setARGB(playerLinePaintAlpha, 0, 0, 255);
		
		shipLinePaintAlpha = (int) (Math.random() * 180 + 220);
        shipLinePaint.setARGB(shipLinePaintAlpha, 255, 0, 0);
        
        
       
		
		//test stuff
		
	    //Log.i(TAG, "towLinePaintAlpha " + towLinePaintAlpha);
		//Log.i(TAG, " playerDist " + playerDist );
		//Log.i(TAG, " shipDist " + shipDist );
		
		//shipHeading = Math.atan2(shipX, shipY);
		//degrees = Math.sqrt(shipHeading - towHeading);
		
		
		//angle = Math.sqrt(shipHeading - shipHeading + degrees);
		//towHeading = (towRot * 180 / Math.PI);
	
		
		//shipRad = Math.abs((shipY + shipHeight /2) + shipAtackRot);
		//shipRadius = (shipY + shipHeight /2) + shipAtackRot;
		
		//radians = degrees * Math.PI/180
		//degrees = radians * 180/Math.PI
		
		//angle = degrees * (Math.PI/180);
		//shipRadius = shipRad * radians;
		//radius * Math.cos(angle);
		//radius * Math.sin(angle);
		
		/*
		 * 
var radius:Number = 100;
var degrees:Number = 0;
var speed:Number = 2;



		degrees = degrees + speed;
		
		yposition = radius * Math.cos(angle);
		xposition = radius * Math.sin(angle);
		
		moon_mc._x = xposition + ancor_mc._x;
		moon_mc._y = yposition + ancor_mc._y;*/
		
		//Log.i(TAG, "shipRadius " + 	shipRadius); // humm ok ill try to make a player one
	
		//if(shipStopFire){
		//towReloadNum = 0;
		//}else{
		//towReloadNum += 1;
		//}
		
		
		
		//if(towReloadNum > towReloadTime){
			//towReloadNum = 0;
			

  		/*if(towY < -0){
  			reloadTow = true;
  		}
  		
  		if(towY > 480){
  			reloadTow = true;
  		}
  		
  		if(towX > 300){
  			reloadTow = true;
  		}
  		
  		if(towX < -0){
  			reloadTow = true;
  		}
  		
  		if(reloadTow){
  			reloadTowMissle();
  		}*/
  		
  		if(towY < -100){
  			reloadTow = true;
  		}
  		
  		if(towY > 600){
  			reloadTow = true;
  		}
  		
  		if(towX > 600){
  			reloadTow = true;
  		}
  		
  		if(towX < -100){
  			reloadTow = true;
  		}
  		
  		if(reloadTow){
  			reloadTowMissle();
  		}
  		
  		
  		
		//}
		
		/*   		
		if(Player.playerRect.contains((int)towX, (int)towY)){
       		reloadTow = true;
       		//Log.i(TAG, "hit" );	
       	}*/
		
		
  			towDX = (Player.playerPosX + Player.playerWidth /2) - (towX + towWidth /2);
			towDY = (Player.playerPosY + Player.playerHeight /2) - (towY + towHeight /2);
			rot = Math.atan2(towDX,towDY);
			degrees = rot * 180 / Math.PI;
			
			//for follow fx
			/*towHeading = Math.atan2(Player.playerPosX - towX,Player.playerPosY - towY);
			towSpeedX = Math.cos(-towHeading) * towSpeed; 
			towSpeedY = Math.sin(-towHeading) * towSpeed;*/
			
			towHeading = Math.atan2(Player.playerPosY - shipY,Player.playerPosX - shipX);
			towSpeedX = Math.cos(towHeading) * towSpeed; 
			towSpeedY = Math.sin(towHeading) * towSpeed;
			
  		
  		if(reloadTow == false){
  			
  			//rot
  			towDX *= towSpeedX;
  			towDY *= towSpeedY;
  			towX += towSpeedX;
  			towY += towSpeedY;
  			
  			towSpeed += 0.0085;
  			//towSpeed = 20;
  		   
  		}else{
  			
  			towSpeed = 0.002;
  		//towSpeed = 20;
  			
  			towX = shipX + shipWidth /2;
  			towY = shipY + shipHeight /2;
  			rot2 = angle * radius;
  			angle = Math.atan2(Player.playerPosY - shipY,Player.playerPosX - shipX);
  			degrees = rot2 * 360 / Math.PI;
  		
  		}
  		
  		
  		
  		/*if(shipHit){
			shipHitNum = shipHitNum + getPOD();
			if(whatKindOfShip == 0){
				if(shipHitNum > GameTable.ship0Damage){
					shipHitExplode = true;
					shipHit = false;
				}
			}else if(whatKindOfShip == 1){
				if(shipHitNum > GameTable.ship1Damage){
					shipHitExplode = true;
					shipHit = false;
				}
				
			}
		
		}*/
  		
		}//run
  		
		return;	
	}

	

	
	public void reloadTowMissle(){
		reloadTow = false;
		towLinePaintAlpha = 0;
		towX = shipX + shipWidth /2;
		towY = shipY + shipHeight /2;
		
		towHeading = Math.atan2(Player.playerPosY - shipY,Player.playerPosX - shipX);
		towSpeedX = Math.cos(towHeading) * towSpeed; 
		towSpeedY = Math.sin(towHeading) * towSpeed;
	
		
  	return;	
	}
   

/*	public void setPOD(int wep){
		
		Log.i(TAG, "weaponsDamage   " + weaponsDamage );
		
		switch(wep){
		case 1 :
			weaponsDamage = wep; 
		break;
		
		case 2 :
			weaponsDamage = wep; 
		break;	
		
		case 3 :
			weaponsDamage = wep; 
		break;	
		
		case 4 :
			weaponsDamage = wep; 
		break;	
		
		case 5 :
			weaponsDamage = wep; 
		break;	
		
		case 6 :
			weaponsDamage = wep; 
		break;	
		
		case 7 :
			weaponsDamage = wep; 
		break;	
		
		
		}
		
	return;		
	}

	public int getPOD(){
	return weaponsDamage; 
	}
*/
	
	
	
	public void targeting(){
		
		if(Player.playerTargetRect.contains((int)BadCoper1.badCoper1X,(int)BadCoper1.badCoper1Y)){
			targetNum = 0;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[1].shipX,(int)GameView.shipArray[1].shipY)){
			targetNum = 1;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[2].shipX,(int)GameView.shipArray[2].shipY)){
			targetNum = 2;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[3].shipX,(int)GameView.shipArray[3].shipY)){
			targetNum = 3;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[4].shipX,(int)GameView.shipArray[4].shipY)){
			targetNum = 4;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[5].shipX,(int)GameView.shipArray[5].shipY)){
			targetNum = 5;	
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[6].shipX,(int)GameView.shipArray[6].shipY)){
			targetNum = 6;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[7].shipX,(int)GameView.shipArray[7].shipY)){
			targetNum = 7;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[8].shipX,(int)GameView.shipArray[8].shipY)){
			targetNum = 8;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[9].shipX,(int)GameView.shipArray[9].shipY)){
			targetNum = 9;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[10].shipX,(int)GameView.shipArray[10].shipY)){
			targetNum = 10;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[11].shipX,(int)GameView.shipArray[11].shipY)){
			targetNum = 11;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[12].shipX,(int)GameView.shipArray[12].shipY)){
			targetNum = 12;	
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[13].shipX,(int)GameView.shipArray[13].shipY)){
			targetNum = 13;
		}else if(Player.playerTargetRect.contains((int)GameView.shipArray[14].shipX,(int)GameView.shipArray[14].shipY)){
			targetNum = 14;
		}else{
			
		}
	return; 	
	}
	
	
	
	public void autoTargeting(){
		if(onStart){
			if(autoTargetOn){
		numbers[0] = targetDist = Math.sqrt(Player.playerPosY - BadCoper1.badCoper1Y);
		numbers[1] = targetDist1 = Math.sqrt(Player.playerPosY - GameView.shipArray[1].shipY);
		numbers[2] = targetDist2 = Math.sqrt(Player.playerPosY - GameView.shipArray[2].shipY);
		numbers[3] = targetDist3 = Math.sqrt(Player.playerPosY - GameView.shipArray[3].shipY);
		numbers[4] = targetDist4 = Math.sqrt(Player.playerPosY - GameView.shipArray[4].shipY);
		numbers[5] = targetDist5 = Math.sqrt(Player.playerPosY - GameView.shipArray[5].shipY);
		numbers[6] = targetDist6 = Math.sqrt(Player.playerPosY - GameView.shipArray[6].shipY);
		numbers[7] = targetDist7 = Math.sqrt(Player.playerPosY - GameView.shipArray[7].shipY);
		numbers[8] = targetDist8 = Math.sqrt(Player.playerPosY - GameView.shipArray[8].shipY);
		numbers[9] = targetDist9 = Math.sqrt(Player.playerPosY - GameView.shipArray[9].shipY);
		numbers[10] = targetDist10 = Math.sqrt(Player.playerPosY - GameView.shipArray[10].shipY);
		numbers[11] = targetDist11 = Math.sqrt(Player.playerPosY - GameView.shipArray[11].shipY);
		numbers[12] = targetDist12 = Math.sqrt(Player.playerPosY - GameView.shipArray[12].shipY);
		numbers[13] = targetDist13 = Math.sqrt(Player.playerPosY - GameView.shipArray[13].shipY);
		numbers[14] = targetDist14 = Math.sqrt(Player.playerPosY - GameView.shipArray[14].shipY);
		
	
		
		
	
   
				
		for(int s = 0; s < numbers.length; s++){
		
		//works to find numbers
				int i = s;
				//double great_no = 0;
				double small_no = 0;
				
				//for(i=0; i < GameView.shipArray.length; i++){
				//great_no = numbers[s];
				small_no = numbers[s];
				for(i=1; i < GameView.shipArray.length; i++) {
				//if(great_no< numbers[i]){
				//great_no = numbers[i];
					if(small_no > numbers[i]){
						small_no = numbers[i];
				
					}
				}
		
				
				
				
				//Log.i(TAG,"\nGreatest Number : "+great_no);
				//Log.i(TAG,"\nSmallest Number : "+ small_no);
				
				
				for(int ss = 0; ss < s; ss++){
				
					if(small_no == numbers[ss]){
						
						if(small_no < 20){
						
						switch(ss){
						
						case 0:
							targetNum = 0;
							break;	
						
						case 1:
							targetNum = 1;
							break;	
							
						case 2:
					
							targetNum = 2;
							break;	
							
						case 3:
						
							targetNum = 3;
							break;	
							
						case 4:
							
							targetNum = 4;
							break;	
							
						case 5:
							
							targetNum = 5;
							break;	
							
						case 6:
							
							targetNum = 6;
							break;	
							
						case 7:
							
							targetNum = 7;
							break;	
							
						case 8:
							
							targetNum = 8;
							break;	
							
						case 9:
							
							targetNum = 9;
							break;
							
						case 10:
							
							targetNum = 10;
							break;	
							
						case 11:
							
							targetNum = 11;
							break;	
						
						case 12:
						
							targetNum = 12;
							break;	
					
						case 13:
					
							targetNum = 13;
							break;	
						
						case 14:
							
							targetNum = 14;
							break;	
						
						
						 }//switch
					}//if
				}//if
			}//for
				
		}//for		
			}//	autoTargetOn
			
}//start	
		
		
		
	return;
	}
	
	
	
	
}
