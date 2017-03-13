package com.TP;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class Bird {
	
	public double vx;
	public double vy;
	public Drawable birdPic;
	public Rect birdRect;
	public int birdHeight;
	public int birdWidth;
	public double posX;
	public double posY;
	public double detectionRange;
	public double separationRange;
	

	
	
	public Bird() {
		vx = 0;
		vy = 0;
		birdHeight = 20;
		birdWidth = 50;
		posX = 120;
		posY = 120;
		detectionRange = 0;
		separationRange = 0;
	}


	public void doDrawBird(Canvas canvas){
      	
		 birdRect = new Rect((int)posX, (int)posY, (int)posX + birdWidth, (int)posY + birdHeight);
		 birdPic.setBounds(birdRect);
		 birdPic.draw(canvas);
           
         return;
      }
	
	
	public void buildBird(Context context){
	
		
		birdPic = context.getResources().getDrawable(R.drawable.bird);
		
	
		
	return;
	}
	
	
	public void updateBird(){
		
		//double r = Math.random() * -240 + 240;
		
		
		//vx = Math.signum(r);//Math.atan2(l, r);
		vy += 2.0;
		posX = Math.random() * -40 + 100;
		posY = Math.random() * 20 + 100 + vy;
	 
		
		
		
		
	return;
	}



}
