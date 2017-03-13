package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.util.Log;


public class GUI {
	public static final String TAG = "moto";
	
	//public Bitmap gasBitmap;
	//public Bitmap gasBitmapGlow;
	
	//public Drawable GUI;
	
	public static int playerLifeAlpha;
	
	private int guiY;
	private int guiX;
	private int guiWidth;
	private int guiHeight;
	private Rect GUIRect;

	private Paint mTextPaint;
	private Paint mPlayerPaint;
	private Paint mBossPaint;
	private Paint mPlayerTextPaint;
	private Paint mBossTextPaint;
	
	
	private float pstartX;
	private float pstartY;
	//private float pstopX;
	private float pstopY;
	
	private float bstartX;
	private float bstartY;
	//private float bstopX;
	private float bstopY;
	
	
	
	//private Resources res;
	public String updateScore;

	//public String updateHighScore;
	
	

	public GUI(){
		
		mTextPaint = new Paint();
		mTextPaint.setARGB(255, 255, 255, 255);
		
		
		mPlayerPaint = new Paint();
	
		
		mPlayerTextPaint = new Paint();
		mPlayerTextPaint.setARGB(255, 255, 255, 255);
		
		
		mBossTextPaint = new Paint();
		mBossTextPaint.setARGB(255, 255, 255, 255);
	
		
		mBossPaint = new Paint();
		mBossPaint.setARGB(255, 255, 0, 0);
		
		

	}
	
	
	public void buildGUI(Context context){
		
		 //res = context.getResources();
		// GUI = BitmapFactory.decodeResource(res, R.drawable.gui);
		 //GUI = context.getResources().getDrawable(R.drawable.gui);
		
		
		return;
	}
	
	public void GUIDoDraw(Canvas canvas){
		
		
		if(GameView.screenREZ == "QVGA"){
		
			mPlayerPaint.setARGB(playerLifeAlpha, 0, 255, 0);
			
			Log.i(TAG, "screenREZ  " +  GameView.screenREZ ); //301 //455 //816
        	
			pstartX = 228.8f;
			pstartY = 15f;
			//pstopX = 314.2f;
			pstopY = 15f;
			
			bstartX = 3.6f;
			bstartY = 15f;
			//bstopX = 88.5f;
			bstopY = 15f;
			
			guiY = 0;
			guiX = 0;
			guiWidth = 240;
			guiHeight = 50;
			
		}else if(GameView.screenREZ == "HVGA"){
		
			mPlayerPaint.setARGB(playerLifeAlpha, 0, 255, 0);
			
			//guiY = 0;
			//guiX = 0;
			//guiWidth = 320;
			//guiHeight = 50;

			//pstartX = 228.8f;
			//pstartY = 13.6f;
			pstartX = (int)Player.playerPosX;
			pstartY = (int)Player.playerPosY -10;
			//pstopX = 314.2f;
			//pstopY = 13.6f;
			pstopY = (int)Player.playerPosY -10;
			
			bstartX = 3.6f;
			bstartY = 13.6f;
			//bstopX = 88.5f;
			bstopY = 13.6f;
			
		
			
			
			
			
		}else if(GameView.screenREZ == "WVGA854"){
			
			mPlayerPaint.setARGB(playerLifeAlpha, 0, 255, 0);
			
			guiY = 0;
			guiX = 0;
			guiWidth = 480;
			guiHeight = 50;
			
			
			pstartX = 228.8f;
			pstartY = 13.6f;
			//pstopX = 314.2f;
			pstopY = 13.6f;
			
			bstartX = 3.6f;
			bstartY = 13.6f;
			//bstopX = 88.5f;
			bstopY = 13.6f;
		}
		
		
	
		updateScore = Integer.toString(Player.playerPoints);
		//updateHighScore = Integer.toString(Player.playerPoints);
		
		if((int)Player.playerPosX + Player.playerUpDateHitNum >= 0){//from going back
		canvas.drawLine(pstartX, pstartY, (int)Player.playerPosX + Player.playerUpDateHitNum, pstopY, mPlayerPaint);
		}
		
		if(MiniGunBullet.type == "Coast Guard"){
			canvas.drawLine(bstartX, bstartY, Bullet.badCoperUpDateHitNum, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "The Crusher"){	
			canvas.drawLine(bstartX, bstartY,Crusher.upDateBossHitNum, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Navy Boat 1"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum7, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Navy Boat 2"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum8, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Navy Boat 3"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum9, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Navy Boat 4"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum10, bstopY, mBossPaint);	
		}else if(MiniGunBullet.type == "Navy Boat 5"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum11, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Navy Boat 6"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum12, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Navy Boat 7"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum13, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Cruiser 1"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum1, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Cruiser 2"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum2, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Cruiser 3"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum3, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Cruiser 4"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum4, bstopY, mBossPaint);	
		}else if(MiniGunBullet.type == "Cruiser 5"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum5, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Cruiser 6"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum6, bstopY, mBossPaint);
		}else if(MiniGunBullet.type == "Cruiser 7"){
			canvas.drawLine(bstartX, bstartY, Bullet.shipUpDateHitNum14, bstopY, mBossPaint);
		}
		

		
		
		   //GUIRect = new Rect(guiX,guiY,guiX + guiWidth, guiY + guiHeight);
		   //GUIRect.centerX();
		   //GUIRect.centerY();
		   //GUI.setBounds(GUIRect);
	       //GUI.draw(canvas);
		
	        
	        
	    if(GameView.screenREZ == "QVGA"){
	    	mBossPaint.setStrokeWidth(20);
			mPlayerPaint.setStrokeWidth(20);
			mBossTextPaint.setTextSize(8);
			mPlayerTextPaint.setTextSize(8);
			mTextPaint.setTextSize(12);
			
	    	canvas.drawText("Player",191,30, mPlayerTextPaint);
	    	canvas.drawText(MiniGunBullet.type,16,30, mBossTextPaint);
	    	canvas.drawText("beta demo" ,93,40, mTextPaint);
	    	
	    	if(Player.playerPoints > 9){
				canvas.drawText("0000000"+updateScore,91.5F,20, mTextPaint);
			}else if(Player.playerPoints > 99){
				canvas.drawText("000000"+updateScore,91.5F,20, mTextPaint);
			}else{
				canvas.drawText("00000000"+updateScore,91.5F,20, mTextPaint);
			}
			
	    }else if(GameView.screenREZ == "HVGA"){
	    	mBossPaint.setStrokeWidth(3);
			mPlayerPaint.setStrokeWidth(3);
			
			mBossTextPaint.setTextSize(12);
			mPlayerTextPaint.setTextSize(12);
			mTextPaint.setTextSize(20);
			
	    	canvas.drawText("Player",255,30, mPlayerTextPaint);
			canvas.drawText(MiniGunBullet.type,34,30, mBossTextPaint);
			canvas.drawText("beta demo" ,111,40, mTextPaint);
			
			if(Player.playerPoints > 9){
				canvas.drawText("0000000"+updateScore,108,20, mTextPaint);
			}else if(Player.playerPoints > 99){
				canvas.drawText("000000"+updateScore,108,20, mTextPaint);
			}else{
				canvas.drawText("00000000"+updateScore,108,20, mTextPaint);
			}
			
	    
	    }else if(GameView.screenREZ == "WVGA854"){
	    	mBossPaint.setStrokeWidth(20);
			mPlayerPaint.setStrokeWidth(20);
			mBossTextPaint.setTextSize(12);
			mPlayerTextPaint.setTextSize(12);
			mTextPaint.setTextSize(20);
			
	    	canvas.drawText("Player",396,30, mPlayerTextPaint);
			canvas.drawText(MiniGunBullet.type,36,30, mBossTextPaint);
			canvas.drawText("beta demo" ,192,40, mTextPaint);
			
			
			if(Player.playerPoints > 9){
				canvas.drawText("0000000"+updateScore,192,20, mTextPaint);
			}else if(Player.playerPoints > 99){
				canvas.drawText("000000"+updateScore,192,20, mTextPaint);
			}else{
				canvas.drawText("00000000"+updateScore,192,20, mTextPaint);
			}
			
	    }
	
		
		//high score
		
		/*if(Player.playerPoints > 9){
			canvas.drawText("0000000"+updateScore,107,40, mTextPaint);
		}else if(Player.playerPoints > 99){
			canvas.drawText("000000"+updateScore,107,40, mTextPaint);
		}else{
			canvas.drawText("00000000"+updateScore,107,40, mTextPaint);
		}*/
		
		
		
		return;
	}



}
