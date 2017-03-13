package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class MiniGunBullet{
	public static final String TAG = "moto";
	
	public static String type = ""; 
	
	public MiniGunBullet miniB;
	public Bitmap gBullet;
	public Drawable gBulletColloder;
	public Rect gBulletRect;
	public double gBulletX;
	public double gBulletY;
	public double gBulletSpeed;
	public double gBulletWidth;
	public double gBulletHeight;
	public double gBulletSpeedX;
	public double gBulletSpeedY;
	public int gBulletAlpha;
	public double gBulletRot;
	public double gBulletradians;
	public double gBulletAngle;
	public double gBulletAngleRot;
	public double gBulletAngleHead;
	public double gBulletHeading;
	public double gBulletDX;
	public double gBulletDY;
	public double gBRot;
	public double gBAngle;
	public double gBradians;
	public int offsetRot;

	public double offSetX;
	public double offSetY;
	
	//public Paint distLinePaint;
	
	public boolean fireGb = false;
	public boolean reloadGb = false;
	public boolean minGunFire = false;
	public boolean minGunFire1 = false;
	public boolean minGunFire2 = false;
	
	public double mbNumFire;
	public double mbNumFire1;
	public double mbNumFire2;
	
	public boolean notInFlight;
	public boolean inFlight;
	
	
	public Resources res;
	
	public double time;
	public String FIRE = "FIRE"; 
	
	

	public MiniGunBullet(){
		
		gBulletX = 0;
		gBulletY = 0;
		gBulletWidth = 9;
		gBulletHeight = 9;
		gBulletSpeedX = 0;
		gBulletSpeedY = 0;
		gBulletAlpha = 0;
		gBulletRot = 255;
		gBulletradians = 360 * 2 / Math.PI;
		gBulletAngle = 0;
		gBulletAngleRot = 0;
		gBulletAngleHead = 0;
		gBulletDX = 0;
		gBulletDY = 0;
		gBulletSpeed = 30;
		
		offSetX = 4;
		offSetY = 16;
		offsetRot = -32;
  		
		reloadGB();
		/*distLinePaint = new Paint();
        distLinePaint.setAntiAlias(true);
        distLinePaint.setARGB(255, 0, 255, 0);
        distLinePaint.setStrokeWidth(3);*/
		
	
	}
	
	public void buildGBullet(Context context){
		res = context.getResources();
	
		gBulletColloder = context.getResources().getDrawable(R.drawable.boxcollider);
		gBullet = BitmapFactory.decodeResource(res,R.drawable.smallrocket2); 
	
	 return;
	}
	
	
	public void bulletGBDoDraw(Canvas canvas){

	
	gBulletRect = new Rect((int)gBulletX,(int)gBulletY,(int)gBulletX + (int)gBulletWidth, (int)gBulletY + (int)gBulletHeight);
	gBulletRect.centerX();
	gBulletRect.centerY();
	gBulletColloder.setBounds(gBulletRect);
	gBulletColloder.draw(canvas);
	
	canvas.save();
	canvas.rotate((float) -gBulletAngleHead, (float)gBulletX + (float)gBulletWidth /2 , (float)gBulletY + (float)gBulletHeight /2);
	canvas.drawBitmap(gBullet, (int)gBulletX, (int)gBulletY, null);
	canvas.restore();
	
	

	
	return;
	}
	
	public void updateGBullet(){
		if(GameView.GameState == "run"){
		//mbNumFire -= 0.1;
     	//if(mbNumFire  < 0){
     		//minGunFire = true;
     		//mbNumFire = 0.2;
     	//}else{
     		//minGunFire = false;
     	//}
		//minGunFire = true;
		
		
		/*Log.i(TAG, "clock " + time);
		if(time >= 300){
		time = 0;
		FIRE = "FIRE";
		minGunFire = true;
		Log.i(TAG, " FIRE......");
		}else{
		FIRE = "";
		minGunFire = false;
		time += 30;
		}*/
		
		
		
		
		
		
		if(minGunFire){
			
			gBulletDX *= gBulletSpeedX;
			gBulletDY *= gBulletSpeedY;
			
			gBulletX += gBulletSpeedX;
			gBulletY += gBulletSpeedY;

			//gBRot = gBAngle * gBradians;
  			//gBulletAngleHead = (gBRot * 360 / Math.PI);
  			
			reloadGb = false;
  		}else{
  			
  			
  			
  			//Log.i(TAG,"num "+ Ship.targetNum); 
  			
  			// check this take out
  			
  			
  			
  			
  			
  			//gBulletX = Player.playerPosX + Player.playerWidth /2 - offSetX;
  	    	//gBulletY = Player.playerPosY + Player.playerHeight /2 + -offSetY;
  	    	
  			
  	   	}
		
		
		
		if(gBulletY < -0){
  			reloadGb = true;
  			
  		}
  		
  		if(gBulletY > 480){
  			reloadGb = true;
  		}
  		
  		if(gBulletX > 300){
  			reloadGb = true;	
  		}
  		
  		if(gBulletX < -0){
  			reloadGb = true;	
  		}
  		
  		if(reloadGb == true){
  			fireGb = false;
  			reloadGb = false;
  			reloadGB();
  			
  		}

  		
  		
		}//run
  		
	  return;		
	}
	
	

	

	public void reloadGB(){
		minGunFire = true;
		
		gBulletX = Player.playerPosX + Player.playerWidth /2 - offSetX;
		gBulletY = Player.playerPosY + Player.playerHeight /2 + -offSetY;
	
		gBAngle = Math.atan2(GameMain.playerTargetX - Player.playerPosX ,GameMain.playerTargetY - Player.playerPosY);
				
		
		gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
		gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
		
		
		
		
		gBulletDX = GameMain.playerTargetX - gBulletX;
		gBulletDY = GameMain.playerTargetY - gBulletY;
		//gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
		gBulletAngleHead = gBulletAngleRot * 380 / Math.PI;
		
		
		if(Ship.autoTargetOn){
			if(Ship.targetNum == 0){
				type = "Coast Guard";
				gBulletDX = BadCoper1.badCoper1X - gBulletX;
				gBulletDY = BadCoper1.badCoper1Y - gBulletY;
				gBulletHeading = Math.atan2(BadCoper1.badCoper1X + offsetRot - Player.playerPosX ,BadCoper1.badCoper1Y - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(BadCoper1.badCoper1X - gBulletX ,BadCoper1.badCoper1Y - gBulletY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 1){
				type = "Cruiser 1";
				gBulletDX = GameView.shipArray[1].shipX - gBulletX;
				gBulletDY = GameView.shipArray[1].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[1].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[1].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[1].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[1].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 2){
				type = "Cruiser 2";
				gBulletDX = GameView.shipArray[2].shipX - gBulletX;
				gBulletDY = GameView.shipArray[2].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[2].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[2].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[2].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[2].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 3){
				type = "Cruiser 3";
				gBulletDX = GameView.shipArray[3].shipX - gBulletX;
				gBulletDY = GameView.shipArray[3].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[3].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[3].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[3].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[3].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 4){
				type = "Cruiser 4";
				gBulletDX = GameView.shipArray[4].shipX - gBulletX;
				gBulletDY = GameView.shipArray[4].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[4].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[4].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[4].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[4].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 5){
				type = "Cruiser 5";
				gBulletDX = GameView.shipArray[5].shipX - gBulletX;
				gBulletDY = GameView.shipArray[5].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[5].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[5].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[5].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[5].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 6){
				type = "Cruiser 6";
				gBulletDX = GameView.shipArray[6].shipX - gBulletX;
				gBulletDY = GameView.shipArray[6].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[6].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[6].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[6].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[6].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 7){
				type = "Navy Boat 1";
				gBulletDX = GameView.shipArray[7].shipX - gBulletX;
				gBulletDY = GameView.shipArray[7].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[7].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[7].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[7].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[7].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 8){
				type = "Navy Boat 2";
				gBulletDX = GameView.shipArray[8].shipX - gBulletX;
				gBulletDY = GameView.shipArray[8].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[8].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[8].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[8].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[8].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 9){
				type = "Navy Boat 3";
				gBulletDX = GameView.shipArray[9].shipX - gBulletX;
				gBulletDY = GameView.shipArray[9].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[9].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[9].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[9].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[9].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 10){
				type = "Navy Boat 4";
				gBulletDX = GameView.shipArray[10].shipX - gBulletX;
				gBulletDY = GameView.shipArray[10].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[10].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[10].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[10].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[10].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 11){
				type = "Navy Boat 5";
				gBulletDX = GameView.shipArray[11].shipX - gBulletX;
				gBulletDY = GameView.shipArray[11].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[11].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[11].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[11].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[11].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 12){
				type = "Navy Boat 6";
				gBulletDX = GameView.shipArray[12].shipX - gBulletX;
				gBulletDY = GameView.shipArray[12].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[12].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[12].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[12].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[12].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 13){
				type = "Navy Boat 7";
				gBulletDX = GameView.shipArray[13].shipX - gBulletX;
				gBulletDY = GameView.shipArray[13].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[13].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[13].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[13].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[13].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			if(Ship.targetNum == 14){
				type = "Cruiser 7";
				gBulletDX = GameView.shipArray[14].shipX - gBulletX;
				gBulletDY = GameView.shipArray[14].shipY - gBulletY;
				gBulletHeading = Math.atan2(GameView.shipArray[14].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[14].shipY - Player.playerPosY);
				//gBulletAngleRot = Math.atan2(GameView.shipArray[14].shipX + offsetRot - Player.playerPosX ,GameView.shipArray[14].shipY - Player.playerPosY);
				
				gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
				gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
				gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
				gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
			}
			
			
		}else{
			gBulletDX = GameMain.playerTargetX - gBulletX;
			gBulletDY = GameMain.playerTargetY - gBulletY;
			gBulletHeading = Math.atan2(GameMain.playerTargetX + offsetRot - Player.playerPosX ,GameMain.playerTargetY - Player.playerPosY);
			gBulletSpeedY = Math.cos(gBulletHeading) * gBulletSpeed;
			gBulletSpeedX = Math.sin(gBulletHeading) * gBulletSpeed;
			gBulletAngleRot = Math.atan2(gBulletDX,gBulletDY);
			gBulletAngleHead = gBulletAngleRot * 180 / Math.PI;
		}
			
	
		 return;	
	}
	
	
	

}
