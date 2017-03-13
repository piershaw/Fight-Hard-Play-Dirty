package com.TP;

/*
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.util.Log;*/

/*public class HellFire{
	public static final String TAG = "moto";
	
	public AnimationDrawable hellFire;
	
	public static double hellfireX = 0;
	public static double hellfireY = 0;
	public static double hellfireSpeed = 10;
	
	public static boolean showHellfire = false;
	public static int showHellfireAlpha = 0;
	public static final String hellfireName = "helfire";
	
	private int hellfireWidth = 8;
	private int hellfireHeight = 30;
	public static Rect hellfireRect;
	


	public HellFire(){
	
		
	}
	
	
	public void buildHellFire(Context context){
		  
		Resources res = context.getResources();
        hellFire = new AnimationDrawable();
        hellFire.addFrame(res.getDrawable(R.drawable.hellfire00010012), 100);
        hellFire.setOneShot(false);
		
	 return;
	}
	
	public void hellFireDoDraw(Canvas canvas){

        hellfireRect = new Rect((int)hellfireX,(int)hellfireY,(int)hellfireX + hellfireWidth, (int)hellfireY + hellfireHeight);
        hellfireRect.centerX();
        hellfireRect.centerY();
        
        hellFire.setBounds(hellfireRect);
        hellFire.setAlpha(showHellfireAlpha);
        hellFire.setVisible(showHellfire,false);
        hellFire.draw(canvas);

	}
	
	
	public void updateHellFire(){
		
      	if(SNESController.AhitIs == true){
      		
      		if(SNESController.fireOne){ 
      			hellfireY = Player.playerPosY;
      			hellfireX = Player.playerPosX + 45;
      			SNESController.fireOne = false; 
      			SNESController.reloadedHellFire = true;
      			showHellfire = false;
      			showHellfireAlpha = 0;
      			
      	//	Log.i(TAG, "working ");
      		}
      		
      		
      		
      		if(hellfireY < -0){
      			hellfireSpeed = 30;
      			hellfireY = Player.playerPosY;
      			hellfireX = Player.playerPosX + 45;
          		SNESController.AhitIs = false;
          		SNESController.reloadedHellFire = true;
          		showHellfire = false;
          		showHellfireAlpha = 0;
          		
          		Log.i(TAG, "Reload ");
          	
      		}else{
      			showHellfireAlpha = 255;
      			hellFire.start();
      			hellFire.run();
      			hellfireY -= hellfireSpeed;
      			hellfireX = Player.playerPosX + 45;
     			SNESController.reloadedHellFire = false;
      		}
      		
      	
      	}
	
		
	
	 return;	
	}
	
	
}
*/