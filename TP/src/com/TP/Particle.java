package com.TP;

import java.util.Random;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.content.res.Resources;

public class Particle {

    // location
   
    public Drawable smoke;
    public double posY;
    public double posX;
    public double posWidth;
    public double posHeight;
    public Rect smokeRect;
    public int smokeAlpha;
    public boolean smokeVisible;
	public boolean dontDrawSmoke;
    
    public Resources res;
   

    public Particle() {
    	//xv = (float) (Math.random() * 80 + 120);
    	//yv = (float) (Math.random() * 80 + 120);
       // this.x = xv;
        //this.y = yv;
    	
    	posY = 0;
        posX = -500;
        posWidth = 10;
        posHeight = 10;
        smokeAlpha = 255;
        smokeVisible = false;
     }
    
	public void buildParticle(Context context){
		res = context.getResources();
		smoke = context.getResources().getDrawable(R.drawable.smoke);
	}
    
	
	public void particleDoDraw(Canvas canvas){
		
		smokeRect = new Rect((int)posX,(int)posY,(int)posX + (int)posWidth, (int)posY + (int)posHeight);
		smokeRect.centerX();
		smokeRect.centerY();
		smoke.setBounds(smokeRect);
		smoke.setAlpha(smokeAlpha);
		//smoke.setVisible(smokeVisible,false);
		if(!dontDrawSmoke){
		smoke.draw(canvas);
		}
		
	}
    
    
    
    
	
	

	
	

}