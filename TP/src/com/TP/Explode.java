package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;

public class Explode {
/*	public static final String TAG = "moto";
	
	public AnimationDrawable explode;
	public int explodeTimerNum = 0;
	public double explodeX = 10;
	public double explodeY = 10;
	public double explodeScaleY;
	public double explodeScaleX;
	public double explodeScale;
	public double explodeWidth = 200;
	public double explodeHeight = 200;
	public int explodeAlpha = 0;
	public Rect explodeRect;
	
	public static boolean explodeReady = false;
	public boolean explodeDoDraw = false;
	
	
	private Resources res;
	
	//make new class......

	public Explode(){
		//explodeBigTimer = new Timer();
		//explodeTimerNum = 0;
		//explodeScale = 2;
	}
	
	
	public void buildExplode(Context context){

		res = context.getResources();
	
		explode = new AnimationDrawable();
		explode.addFrame(res.getDrawable(R.drawable.bigboom0001), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0002), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0003), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0004), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0005), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0006), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0007), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0008), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0009), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0010), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0011), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0012), 100);
		explode.addFrame(res.getDrawable(R.drawable.bigboom0013), 100);
		explode.setOneShot(true);
	
		
		return;
	}
	
	public void explodeDoDraw(Canvas canvas){
		
		explodeRect = new Rect( (int)explodeX,(int)explodeY, (int)explodeX + (int)explodeWidth, (int)explodeY + (int)explodeHeight );
		explodeRect.centerX();
		explodeRect.centerY();
		explode.setBounds(explodeRect);
		explode.setAlpha(explodeAlpha);
		if(explodeDoDraw){ 
		explode.draw(canvas);
		}
		
		
		explodeReady = true;
		
		if(BadCoper1.badCoperIsHit){
		explodeAlpha = 255;
		explodeX = BadCoper1.badCoper1X;
		explodeY = BadCoper1.badCoper1Y;
		//explode.setOneShot(true);
		//showExplode = true
		}
		
		if(BadCoper1.playExplodeIs){

			explodeAlpha -= 30;
			if(explode.isRunning()){
				BadCoper1.playExplodeIs = false;
			}else if(explode.isRunning() == false){
				explode.draw(canvas);
			}
				
			//Log.i(TAG, "explode.isRunning() " + explode.isRunning());
			
			
			if(explodeAlpha < 0){
			//BadCoper1.playExplodeIs = false;
			}else{
				explode.draw(canvas);
			}
		}
		
		
		//Log.i(TAG, "Crusher.cGun5Hit" + Crusher.cGun5Hit);
		//Log.i(TAG, "explode.isRunning() " + explodeBig.isRunning());
	
		
		if(Crusher.cGun5Hit){
			explodeTimerNum += 1;
			explodeAlpha = 255;
			explodeY = Crusher.cGun5Y + Crusher.cGun5Height /2 - explodeHeight /2;
			explodeX = Crusher.cGun5X + Crusher.cGun5Width /2 - explodeWidth /2;
			explodeHeight += explodeScale;
			explodeWidth += explodeScale;
			explode.draw(canvas);
			
			if(explodeTimerNum > 30){
				explodeTimerNum = 0;
				explodeHeight = 1;
				explodeWidth = 1;
				explodeAlpha = 0;
			}
			
		
		}
			
			
   		
		return;
	}
	
	

	
	
	public void updateExplode(){
		

	 return;	
	}*/
	
}
