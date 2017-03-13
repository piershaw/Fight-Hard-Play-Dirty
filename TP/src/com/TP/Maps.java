package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.util.Log;
//import android.util.Log;

public class Maps {
	public static final String TAG = "moto";
	//public Bitmap mBackgroundImage;
	//public Bitmap mTop;
	//public double mTopPosY;
	//public double mTopPosX;
	//public double mSkyPosY;
	//public double mSkyPosX;

	//public Rect rectC;
	//public Rect rectB;
	//public Rect rectA;
	public Bitmap bitmapGroundC;
	//public Bitmap sky;
	//public double gravity = 0.8;
	//public static final double skySpeed = 2.85;
	public static final double backgroundSpeed = 1.85;
	//private Matrix matrixGround;
	//private double friction = 0.98;

    
	private Resources res;
	public static MediaPlayer mp;
	
	
	public Maps(){
	//matrixGround = new Matrix();
	
	//Level.setlevel("two"); 
	}
	
	
	public void buildMaps(Context context){
		
		  res = context.getResources();
		  mp = MediaPlayer.create(context, R.raw.pl);
		  mp.setLooping(true);
	   	  mp.start();
	  

		  //so not an error	  
		 // mBackgroundWidth = 320;
		 // mBackgroundHeight = 4096;
		  bitmapGroundC = BitmapFactory.decodeResource(res,R.drawable.level1c);
		  //sky = BitmapFactory.decodeResource(res,R.drawable.sky);
		  
		  //bitmapGroundC = BitmapFactory.decodeResource(res,R.drawable.level1c); 
		  //bitmapGroundC  = context.getResources().getDrawable(R.drawable.level1c);
		  // sky = context.getResources().getDrawable(R.drawable.sky);
		  //bitmapGroundA = context.getResources().getDrawable(R.drawable.level1a);
	      // recreate the new Bitmap
	     // mBackgroundImage = Bitmap.createBitmap(bitmapGroundC, 0, 0, mBackgroundWidth, mBackgroundHeight, matrixGround, true);
	     
		
		return;
	}
	
	public void MapsDoDraw(Canvas canvas){
		
		//matrixGround.setScale(scaleWidth, scaleHeight);
		//Log.i(TAG, "Level.whatLevel " + Level.whatLevel );
		
		
		// GameView.offSetBackgroudHeight = mBackgroundHeight + 3161; 
		 
		 
		 //to set size
		// mBackgroundPosY = -offSetBackgroudHeight;
		// mBackgroundPosX = 0;
			 
		// Log.i(TAG, "mBackgroundWidth " + mBackgroundWidth );
		 canvas.drawBitmap(bitmapGroundC, (int)GameView.mBackgroundPosX, (int)GameView.mBackgroundPosY, null); 
		 //canvas.drawBitmap(sky, (int)GameView.mSkyPosX, (int)GameView.mSkyPosY, null); 
		 

		//rectC = new Rect((int)mBackgroundPosX,(int)mBackgroundPosY,(int)mBackgroundPosX + (int)mBackgroundWidth, (int)mBackgroundPosY + (int)mBackgroundHeight);
         //rectB = new Rect((int)GameView.mSkyPosX,(int)GameView.mSkyPosY,(int)GameView.mSkyPosX + GameView.mSkyWidth, (int)GameView.mSkyPosY + GameView.mSkyHeight);
         //sky.setBounds(rectB);
        // sky.draw(canvas);
        //rectA = new Rect((int)mSkyPosX,(int)mSkyPosY,(int)mSkyPosX + (int)320,(int)mSkyPosY + (int)1157);
       // canvas.drawBitmap(mBackgroundImage, matrixGround, null);
    	//canvas.drawBitmap(mTop, (int)mTopPosX, (int)mTopPosY, null); 
        
        
        //bitmapGroundA.setBounds(rectA);
        //bitmapGroundA.draw(canvas);
		
		// bitmapGroundC.setBounds(rectC);
         //bitmapGroundC.draw(canvas);
		
		return;
	}


	public void updateMaps(){
		
		//Log.i(TAG, "mp.isPlaying() " + mp.isPlaying());
	    
	  
	
		 // for droid wide screens
		 ///mBackgroundWidth = GameView.canvasWidth;
		 //mBackgroundHeight = GameView.canvasHeight;
		
		if(GameView.GameState == "run"){
		//mBackgroundPosY += gravity; 
		//mTopPosY += gravity + 1;
		//mSkyPosY += gravity + 2;
		
		
		
		  if( GameView.mBackgroundPosY <= -GameView.offSetBackgroudHeight){
			  GameView.mBackgroundPosY = -GameView.offSetBackgroudHeight;
	      	}
	      	  
	      if( GameView.mBackgroundPosY >= 0){
	    	  GameView.mBackgroundPosY = 0;
	      }
	      
		}

	    /*  if( mTopPosY > 1157){
	    	  mTopPosY = 1157;
	      }*/
	      
	     // if( mSkyPosY > 1157){
	    	  //mSkyPosY = 1157;
	      //}
	      	 //if( mBackgroundPosX >= 0){
	     //  		  for new game   		  
	    		 // mBackgroundPosX = 0;
	     	  //}
	      	  
	      	 // if( mBackgroundPosX < -320){
	    //  		  for new game   		  
	      		 // mBackgroundPosX = -320;
	    	  //}
	      	  
	      	  //if(mTopPosY < -1520){
	       		//mTopPosY = -1520;
	       	  //}
	
		
	// Log.i(TAG, "mTopPosY " + mTopPosY );
	 return;	
	}

}
