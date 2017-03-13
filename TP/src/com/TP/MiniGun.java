package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class MiniGun {

	/*public Bitmap gatGun;
	public Drawable gatGunColloder;
	
	public static Rect gatGunRect;
	public double gatGunX;
	public double gatGunY;
	public double gatGunWidth = 20;
	public double gatGunHeight = 20;
	public double gatGunSpeedX = 0;
	public double gatGunSpeedY = 0;
	public int gatGunAlpha = 0;
	public double gatGunRot = 0;
	public double gatGunradians = 0;
	public double gatGunAngle = 0;
	public double gatGunAngleRot = 0;
	public double gatGunAngleHead = 0;
	public double gatGunDX;
	public double gatGunDY;
	
	private Resources res;
	
	
	public MiniGun(){
		gatGunAlpha = 255;
  		gatGunradians = 360 * 2 / Math.PI;
	}
	
	
	public void buildMiniGun(Context context){
		res = context.getResources();
		gatGunColloder = context.getResources().getDrawable(R.drawable.boxcollider);
		gatGun = BitmapFactory.decodeResource(res,R.drawable.gatgun); 
		
	
		
	return;
	}
	
	
	public void miniGunDoDraw(Canvas canvas){
		
		gatGunRect = new Rect((int)gatGunX,(int)gatGunY,(int)gatGunX + (int)gatGunWidth, (int)gatGunY + (int)gatGunHeight);
		gatGunRect.centerX();
		gatGunRect.centerY();
		gatGunColloder.setBounds(gatGunRect);
		gatGunColloder.draw(canvas);
		
		canvas.save();
		canvas.rotate((float) -gatGunAngleHead, (float)gatGunX + (float)gatGunWidth /2 , (float)gatGunY + (float)gatGunHeight /2);
		canvas.drawBitmap(gatGun, (int)gatGunX, (int)gatGunY, null);
		canvas.restore();
		
	return;	
	}
	
	
	public void updateMiniGun(){
		
		gatGunX = Player.playerPosX + Player.playerWidth /2 -9;
	    gatGunY = Player.playerPosY + Player.playerHeight /2 + -20;
      	gatGunDX = (GameMain.playerTargetX + Player.playerTargetWidth /2)- (gatGunX + gatGunWidth /2);
      	gatGunDY = (GameMain.playerTargetY + Player.playerTargetHeight /2) - (gatGunY + gatGunHeight /2);
    	gatGunAngleRot = Math.atan2(gatGunDX,gatGunDY);
    	gatGunAngleHead = gatGunAngleRot * 180 / Math.PI;
		
		
	return;	
	}
	
	public void updateMiniGunBad(){
		
		gatGunX = BadCoper1.badCoper1X + BadCoper1.badCoper1Width /2 -9;
	    gatGunY = BadCoper1.badCoper1Y + BadCoper1.badCoper1Height /2 + 5;
      	gatGunDX = (Player.playerPosX + Player.playerWidth /2)- (gatGunX + gatGunWidth /2);
      	gatGunDY = (Player.playerPosY + Player.playerHeight /2) - (gatGunY + gatGunHeight /2);
    	gatGunAngleRot = Math.atan2(gatGunDX,gatGunDY);
    	gatGunAngleHead = gatGunAngleRot * 180 / Math.PI;
		
		
	return;	
	}
	
	*/
	
}
