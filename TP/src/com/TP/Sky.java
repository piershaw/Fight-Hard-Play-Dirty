package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class Sky {
	public static final String TAG = "moto";
	
	public Rect rectSky;
	public Rect rectSky2;
	//public Bitmap sky;
	//public Bitmap sky2;
	public Drawable sky;
	public Drawable sky2;
	public static final double skySpeed = 3.60;
	public static final double skySpeed2 = 4.80;
	public Resources res;

	
	
	public Sky(){

	}
	
	
	public void buildSky(Context context){
		
		
		  res = context.getResources();
		  //sky = BitmapFactory.decodeResource(res,R.drawable.sky);
		  //sky2 = BitmapFactory.decodeResource(res,R.drawable.sky2);
		  
		  sky = context.getResources().getDrawable(R.drawable.sky);
		  sky2 = context.getResources().getDrawable(R.drawable.sky2);
		  
		 
		return;
	}
	
	public void skyDoDraw(Canvas canvas){
		
		 //canvas.drawBitmap(sky, (int)GameView.mSkyPosX, (int)GameView.mSkyPosY, null); 
		 //canvas.drawBitmap(sky2, (int)GameView.mSkyPosX2, (int)GameView.mSkyPosY2, null); 
		
		 rectSky = new Rect((int)GameView.mSkyPosX,(int)GameView.mSkyPosY,(int)GameView.mSkyPosX + GameView.mSkyWidth, (int)GameView.mSkyPosY + GameView.mSkyHeight);
         sky.setBounds(rectSky);
         sky.setAlpha(100);
         sky.draw(canvas);
         
         rectSky2 = new Rect((int)GameView.mSkyPosX2,(int)GameView.mSkyPosY2,(int)GameView.mSkyPosX2 + GameView.mSkyWidth2, (int)GameView.mSkyPosY2 + GameView.mSkyHeight2);
         sky2.setBounds(rectSky2);
         sky2.setAlpha(220);
         sky2.draw(canvas);
		
		return;
	}


	public void updateSky(){
		
		
		if(GameView.GameState == "run"){
	
	      
	      if( GameView.mSkyPosY <= -GameView.offSetSkyHeight ){
			  GameView.mSkyPosY = -GameView.offSetSkyHeight;
	      	}
	      	  
	      if( GameView.mSkyPosY >= 0){
	    	  GameView.mSkyPosY = 0;
	       }
	      
	      
	      if( GameView.mSkyPosY2 <= -GameView.offSetSkyHeight ){
			  GameView.mSkyPosY2 = -GameView.offSetSkyHeight;
	      	}
	      	  
	      if( GameView.mSkyPosY2 >= 0){
	    	  GameView.mSkyPosY2 = 0;
	       }
	      
	      
	      
	      
		}

	 return;	
	}

}
