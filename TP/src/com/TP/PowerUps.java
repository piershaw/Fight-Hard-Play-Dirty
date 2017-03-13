package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class PowerUps {
	public static final String TAG = "moto";
	
	
	public double powerUpX = 50;
	public double powerUpY = 50;
	public double powerUpWidth = 25;
	public double powerUpHeight = 25;
	public double powerUpSpeed = 0.5;
	public int powerUpAlpha = 255;
	public Bitmap powerUp;
	public Drawable powerUpColider;
	public Rect powerUpRect;
	public double powerUpRot;
	public double powerUpHeading;
	
	private Resources res;
	private double radians;
	
	public PowerUps(){
		radians = Math.PI/360;	
		powerUpRot = powerUpHeading * radians;
		powerUpHeading = (powerUpRot * 360 / Math.PI);
	}
	
	
	public void buildPowerUps(Context context){
		
		 res = context.getResources();
		 powerUpColider = context.getResources().getDrawable(R.drawable.boxcollider);
		 powerUp = BitmapFactory.decodeResource(res,R.drawable.powerup); 
		 return;
	}
	


	public void powerUpsDoDraw(Canvas canvas){
		
		powerUpRect = new Rect((int)powerUpX,(int)powerUpY,(int)powerUpX + (int)powerUpWidth, (int)powerUpY + (int)powerUpHeight );
		powerUpColider.setBounds(powerUpRect);
		powerUpColider.draw(canvas);
		powerUpRect.centerX();
		powerUpRect.centerY();
		
		
		canvas.save();
		canvas.rotate((float) powerUpHeading, (float)powerUpX + (float)powerUpWidth /2 , (float) powerUpY + (float)powerUpHeight /2);
		canvas.drawBitmap(powerUp, (int)powerUpX, (int)powerUpY, null);
		canvas.restore();
		
		

		
   	
	 return;
	}
	
	
	public void updatePowerUps(){
		
		powerUpRot = Math.atan2(powerUpX, powerUpY);
		powerUpHeading += 30;
		
	// Log.i(TAG, "particleY " +particleY);
	 return;	
	}


	
	
}
