package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.graphics.Matrix;

import android.util.Log;




public class Player {
	public static final String TAG = "moto";
	//private Explode explode1;

	public static int playerPoints = 0;
	public static int playersLeft = 3;
	public static CharSequence playerPointsString;
	public static double vxPlayer = 0;
	public static double vyPlayer = 0;
	public static double playerSpeedX = 0;
	public static double playerSpeedY = 0;
	public static double slide = 0.098;
	
	public static double playerPosX;
	public static double playerPosY;
	public static double playerPosxr;
	public static double playerPosyr;
	public static double playerPosZ;
	
	public double playerHeading;
	public double playerRot;
	public double playerRotSpeed;
	public double playerRotSpeedX;
	public double playerRotSpeedY;
	
	public double radians;
	
	public Matrix rotate;
	
	public static double playerThrust = 0.5;
	public static Rect playerRect;
    public static int playerWidth = 80;
    public static int playerHeight = 80;//80
    public double playerBounce = 0.8;
    public int playerAlpha = 255;
    public int playerHitNum = 0; 
    public double playerTimer = 3.0; 
    public static int playerUpDateHitNum = 80;//314; 
    //public int hitNumSize;//314; 
    
    public double newHeight = 80;
    public double newWidth = 80;
    
    private boolean reSpawn = false;
    private int weaponsDamage; 
    
    public AnimationDrawable player;
    public AnimationDrawable playerRight;
    public AnimationDrawable playerLeft;
    public AnimationDrawable playerDown;
    
    
    
    
    
    public Drawable playerDead;
    
    public Drawable playerTarget;
    public static Rect playerTargetRect;
    public static int playerTargetWidth = 50;
    public static int playerTargetHeight = 50;
    public static int playerTargetVisible;
    
    public boolean playerExplodeIs = false;
    public static boolean playerIsHit = false;
    
    private int dimTimer = 0; 
	
	public static MediaPlayer hitSound;
  
    public Player(){
    
    }
	


public void buildPlayer(Context context){
	
	Resources res = context.getResources();
	
	
	playerTarget = context.getResources().getDrawable(R.drawable.cross);
	playerDead = context.getResources().getDrawable(R.drawable.copterdead);
	
    player = new AnimationDrawable();
    player.addFrame(res.getDrawable(R.drawable.copter0001), 100);
    player.addFrame(res.getDrawable(R.drawable.copter0002), 100);
    player.addFrame(res.getDrawable(R.drawable.copter0003), 100);
    player.addFrame(res.getDrawable(R.drawable.copter0004), 100);
    player.addFrame(res.getDrawable(R.drawable.copter0005), 100);
    player.addFrame(res.getDrawable(R.drawable.copter0006), 100);
    player.setOneShot(true);
    player.start();
    
    playerLeft = new AnimationDrawable();
    playerLeft.addFrame(res.getDrawable(R.drawable.coperleft0001), 100);
    playerLeft.addFrame(res.getDrawable(R.drawable.coperleft0002), 100);
    playerLeft.addFrame(res.getDrawable(R.drawable.coperleft0003), 100);
    playerLeft.addFrame(res.getDrawable(R.drawable.coperleft0004), 100);
    playerLeft.addFrame(res.getDrawable(R.drawable.coperleft0005), 100);
    playerLeft.addFrame(res.getDrawable(R.drawable.coperleft0006), 100);
    playerLeft.setOneShot(true);
    playerLeft.start();
    
    playerRight = new AnimationDrawable();
    playerRight.addFrame(res.getDrawable(R.drawable.coperright0001), 100);
    playerRight.addFrame(res.getDrawable(R.drawable.coperright0002), 100);
    playerRight.addFrame(res.getDrawable(R.drawable.coperright0003), 100);
    playerRight.addFrame(res.getDrawable(R.drawable.coperright0004), 100);
    playerRight.addFrame(res.getDrawable(R.drawable.coperright0005), 100);
    playerRight.addFrame(res.getDrawable(R.drawable.coperright0006), 100);
    playerRight.setOneShot(true);
    playerRight.start();
    
    playerDown = new AnimationDrawable();
    playerDown.addFrame(res.getDrawable(R.drawable.coperdown0001), 100);
    playerDown.addFrame(res.getDrawable(R.drawable.coperdown0002), 100);
    playerDown.addFrame(res.getDrawable(R.drawable.coperdown0003), 100);
    playerDown.addFrame(res.getDrawable(R.drawable.coperdown0004), 100);
    playerDown.addFrame(res.getDrawable(R.drawable.coperdown0005), 100);
    playerDown.addFrame(res.getDrawable(R.drawable.coperdown0006), 100);
    playerDown.setOneShot(true);
    playerDown.start();
    
    //chopperSound = MediaPlayer.create(context, R.raw.player);
    //chopperSound.setLooping(true);
    //chopperSound.start();
    
    hitSound = MediaPlayer.create(context, R.raw.beep);

 
   
   //explode1.buildExplode(context);
    
    
	return;
}



public void playerDoDraw(Canvas canvas){

	//explode1.explodeDoDraw(canvas);


	
	
	if(playerExplodeIs){
		playerRect = new Rect((int)playerPosX , (int)playerPosY, (int)playerPosX + playerWidth, (int)playerPosY + playerHeight);
		playerRect.centerX();
		playerRect.centerY();
		playerDead.setBounds(playerRect);
		playerDead.draw(canvas);
		playerExplodeIs = false;
		
	}else{	
		
		
		
	if(GameView.heading == "right"){
		playerRect = new Rect((int)playerPosX , (int)playerPosY, (int)playerPosX + playerWidth, (int)playerPosY + playerHeight);
		playerRect.centerX();
		playerRect.centerY();
		playerRight.setBounds(playerRect);
		playerRight.draw(canvas);
		playerRight.run();
	}
	
	if(GameView.heading == "left"){
		playerRect = new Rect((int)playerPosX , (int)playerPosY, (int)playerPosX + playerWidth, (int)playerPosY + playerHeight);
		playerRect.centerX();
		playerRect.centerY();
		playerLeft.setBounds(playerRect);
		playerLeft.draw(canvas);
		playerLeft.run();
	}	
		
	if(GameView.heading == "down"){
		playerRect = new Rect((int)playerPosX , (int)playerPosY, (int)playerPosX + playerWidth, (int)playerPosY + playerHeight);
		playerRect.centerX();
		playerRect.centerY();
		playerDown.setBounds(playerRect);
		playerDown.draw(canvas);
		playerDown.run();	
	}
	
	if(GameView.heading == " "){	
		playerRect = new Rect((int)playerPosX , (int)playerPosY, (int)playerPosX + playerWidth, (int)playerPosY + playerHeight);
		playerRect.centerX();
		playerRect.centerY();
		player.setBounds(playerRect);
		player.draw(canvas);
		player.run();
	}
		
		/*canvas.save();
		canvas.rotate((float)30, (float)playerPosX + (float)playerWidth /2, (float)playerPosY + (float) playerHeight /2);
		canvas.drawBitmap(player, (int)playerPosX , (int)playerPosY, null);
		canvas.restore();*/
	}

	

playerTargetRect = new Rect((int)GameMain.playerTargetX, (int)GameMain.playerTargetY, (int)GameMain.playerTargetX  + playerTargetWidth, (int)GameMain.playerTargetY + playerTargetHeight);
playerTargetRect.centerX();
playerTargetRect.centerY();
playerTarget.setBounds(playerTargetRect);
playerTarget.setAlpha(playerTargetVisible);
playerTarget.draw(canvas);


/*playerLifeTextPaint.setARGB(playerLifeTextPaintAlpha, 255, 255, 255);
playerLifeTextPaint.setTextSize(30);
canvas.drawText(lifeString,10,400, playerLifeTextPaint);*/



//rotate.setRotate(180, (float)playerPosX, (float)playerPosY);


//vxPlayer = GameMain.playerTargetX - playerPosX;
//vyPlayer = GameMain.playerTargetY - playerPosY;

//playerHeading = Math.atan2(GameMain.playerTargetX - Player.playerPosX ,GameMain.playerTargetY - Player.playerPosY);
//playerRotSpeedY = Math.cos(playerHeading) * playerRotSpeed;
//playerRotSpeedX = Math.sin(playerHeading) * playerRotSpeed;

//playerRot = Math.atan2(vxPlayer,vyPlayer);
//playerHeading = radians * 180 / Math.PI;



//radians += playerRot;

//newHeight = ( (playerHeight * Math.cos(radians)) + (playerWidth *  Math.cos(radians)) ); 
//newWidth = ( (playerHeight * Math.sin(radians)) + (playerWidth  * Math.cos(radians)) );

//Log.i(TAG, "newHeight  " + newHeight);


	if(playerExplodeIs != true){//1
		
		
		
		if(playerRect.contains((int)Bullet.cursherBulletX, (int)Bullet.cursherBulletY)){
			setPOD(GameTable.bulletPower);
			playerUpDateHitNum -= GameTable.bulletPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)BadCoper1.gBCoper1BulletX,(int)BadCoper1.gBCoper1BulletY)){
			setPOD(GameTable.badChoper1bulletPower);
			playerUpDateHitNum -= GameTable.bulletPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[1].towX,(int)GameView.shipArray[1].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[2].towX,(int)GameView.shipArray[2].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[3].towX,(int)GameView.shipArray[3].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[4].towX,(int)GameView.shipArray[4].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[5].towX,(int)GameView.shipArray[5].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[6].towX,(int)GameView.shipArray[6].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[7].towX,(int)GameView.shipArray[7].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[8].towX,(int)GameView.shipArray[8].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[9].towX,(int)GameView.shipArray[9].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[10].towX,(int)GameView.shipArray[10].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[11].towX,(int)GameView.shipArray[11].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[12].towX,(int)GameView.shipArray[12].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[13].towX,(int)GameView.shipArray[13].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}else if(playerRect.contains((int)GameView.shipArray[14].towX,(int)GameView.shipArray[14].towY)){
			setPOD(GameTable.towPower);
			playerUpDateHitNum -= GameTable.towPower;
			playerIsHit = true;
		}
		
		
		
	     if(playerIsHit){
	    	GUI.playerLifeAlpha = 255; 
	    	dimTimer = 255;
	    	playerIsHit = false;
	    	hitSound.start();
	    	playerHitNum = playerHitNum + getPOD() * GameTable.playerDamageTimes;
	     
			
					//Log.i(TAG, "playerHitNum  " + playerHitNum);
					
					if(playerHitNum > GameTable.playerLife){
						playerIsHit = false;
						playerExplodeIs = true;
					}
			
			}else{
			playerIsHit = false;
			dimTimer -= 2;
			GUI.playerLifeAlpha = dimTimer;
			}
	 	
	
	}//1	
	   




	
	if(playerExplodeIs){
		
	   	
			playerAlpha -= GameTable.playerAlpha;

			 if(playerAlpha <= 0){
				playerAlpha = 0; 
				playerTimer -= 0.2;
				 if(playerTimer <= 0.0){
					 playerTimer = 3.0;
					 playerHitNum = 0;
					 reSpawn = true;
				 }
			 }
		 }else{
			 playerSpeedX += vxPlayer;
			 playerSpeedY += vyPlayer;
			 playerPosY += vyPlayer;
			 vxPlayer *= slide;
			 vyPlayer *= slide; 
			 playerPosX += playerSpeedX;
			 playerPosY += playerSpeedY;
	     }  
		 
		 
		 if(reSpawn){
		     	playerAlpha = 255;
		     	playerHitNum = 0;
		     	playerUpDateHitNum = 80;
		     	playerExplodeIs = false;
		     	playersLeft = playersLeft -1;
		     	reSpawn = false;
		     	GameView.gameOver = true;
		 }
	
	 

if(playersLeft <= 0){
	GameView.gameOver = true;
}



if(dimTimer <= 0){
	dimTimer = 0;
}

return;
}	



//power of destruction 
public void setPOD(int wep){
	
	//Log.i(TAG, "weaponsDamage   " + weaponsDamage );
	
	switch(wep){
	case 1 :
		weaponsDamage = wep; 
	break;
	
	case 20 :
		weaponsDamage = wep; 
	break;
	
	case 40 :
		weaponsDamage = wep; 
	break;
	
	
	}
	 
return;		
}

public int getPOD(){
return weaponsDamage; 
}

}
