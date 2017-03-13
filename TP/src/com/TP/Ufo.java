package com.TP;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class Ufo {
	
	public double vx;
	public double vy;
	public Drawable ufo0;
	public Drawable ufo1;
	public Rect ufoRect;
	public Rect ufoRect1;
	
	public int ufoHeight;
	public int ufoWidth;
	public double mX;
	public double mY;
	public double gravity;
	public double friction;
	
	private Context mContext;
	
	

	

	public Ufo(double uX, double uY) {
		mX = uX;
		mY = uY;
		//ufo1 = mContext.getResources().getDrawable(R.drawable.peglight
	}


	public void doDrawUfo(Canvas canvas){
      	
		//ufoRect = new Rect((int)uX, (int)uY, (int)uX + ufoWidth, (int)uY + ufoHeight);
		//ufo1.setBounds(ufoRect);
		//ufo1.draw(canvas);
           
         return;
      }
	
	public void updateUFO(){
		
		mY += gravity;
        mX += vx;
        mY += vy;
    	vx *= friction;
    	vy *= friction;
	}


	public void setmContext(Context mContext) {
		this.mContext = mContext;
	}


	public Context getmContext() {
		return mContext;
	}

}
