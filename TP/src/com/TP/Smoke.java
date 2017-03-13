package com.TP;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
//import android.util.Log;

public class Smoke {
	/*public static final String TAG = "moto";
	
	public Drawable smokeTrail;
	public Drawable smokeTrail2;
	public Drawable smokeTrail3;
	
	public double particleX = 30;
	public double particleY = 30;
	public double particleX2 = 30;
	public double particleY2 = 30;
	public double particleX3 = 30;
	public double particleY3 = 30;
	
	public Rect smokeRect;
	public Rect smokeRect2;
	public Rect smokeRect3;
	
	public double particleVX = 0;
	public double particleVY = 0;
	public double particleWidth = 30;
	public double particleHeight = 30;
	public double particleRot;
	
	public double particleScaleY;
	public double particleScaleX;
	
	public double particleSpeed;
	public double Speed = 20;
	public double particleAlpha = 1.0;
	public double particleTakeOffSpeed = 0.28;
	
	

	public Smoke(){
	
		//keep
		particleScaleX = particleWidth /2;
		particleSpeed = particleY;
		
	}
	
	
	public void buildMissile(Context context){
		
		smokeTrail = context.getResources().getDrawable(R.drawable.smoke);
		smokeTrail2 = context.getResources().getDrawable(R.drawable.smoke2);
		smokeTrail3 = context.getResources().getDrawable(R.drawable.smoke3);
		
		return;
	}
	
	public void missleDoDraw(Canvas c){
		
		smokeRect = new Rect((int)particleX,(int)particleY,(int)particleX + (int)particleWidth, (int)particleY + (int)particleHeight);
		smokeRect2 = new Rect((int)particleX2,(int)particleY2,(int)particleX2 + (int)particleWidth, (int)particleY2 + (int)particleHeight);
		smokeRect3 = new Rect((int)particleX3,(int)particleY3,(int)particleX3 + (int)particleWidth, (int)particleY3 + (int)particleHeight);
 
		
		if(GameView.GameState == "run"){
			
		int sA = (int) (Math.random() * 255 + 200);
		
		 //Log.i(TAG, "sA " +sA);
		 
   		smokeTrail.setBounds(smokeRect);
   		smokeTrail.setAlpha(sA);
   		smokeTrail.draw(c);
   		
   		if(particleY > 32){
   		smokeTrail2.setBounds(smokeRect2);
   		smokeTrail2.setAlpha(sA);
   		smokeTrail2.draw(c);
   		}else{
   		particleY2++;
   		}
   		
   		if(particleY2 > 32){
   	   		smokeTrail3.setBounds(smokeRect3);
   	   		smokeTrail3.setAlpha(sA);
   	   		smokeTrail3.draw(c);
   	   		}else{
   	   		particleY3++;
   	   	}
   		updateSmoke();
   		
	}
		return;
	}

	//public void updateSmoke(double playerPosX, double playerPosY, double missleX ,double missleY, String missleType,int missleAlpha,boolean missleVisible, AnimationDrawable missleAnime){
		
	
	public void updateSmoke(){
		
		
		if(particleY > 32){
		particleY = 30;
		}else{
		particleY++;	
		}
		
		if(particleY2 > 32){
			particleY2 = 30;	
		}
		
		if(particleY3 > 32){
			particleY3 = 30;	
		}
		
		
	// Log.i(TAG, "particleY " +particleY);
	 return;	
	}
		
   	if(SNESController.AhitIs == true){
      		
      		if(SNESController.fireOne){ 
      			//smoke.particleY = playerPosY + 50;
      			//smoke.particleX = playerPosX + 48;
      			//smoke.particleHeight = smoke.particleY / mCanvasHeight;
      			
      			
      			missleY = playerPosY;
      			missleX = playerPosX + 45;
      			SNESController.fireOne = false; 
      			SNESController.reloadedHellFire = true;
      			
      			missleVisible= false;
      			missleAlpha = 0;
      		}
      		
      		
      		
      		if(missleY < -0){
      			Speed = 30; // fix class pun in here or out
      			
          		//smoke.particleY = playerPosY + 50;
          		//smoke.particleX = playerPosX + 50;
          		//smoke.particleHeight = 0;
          		//smoke.particleWidth = 0;
      			//hellFire.stop();
      			missleY = playerPosY;
      			missleX = playerPosX + 45;
      			 
          		SNESController.AhitIs = false;
          		SNESController.reloadedHellFire = true;
          		
          		missleVisible = false;
          		missleAlpha = 0;
          		
          	Log.i(TAG, "Reload "+ particleY);
      		}else{
      			//showHellfire = false;
      			missleAlpha = 255;
      			missleAnime.start();
      			missleAnime.run();
      			
      			//smoke.Speed++;
      			//smoke.particleX = playerPosX + 50;
          		//smoke.particleY -= smoke.Speed; // moves y say 340 - 8
          		//smoke.particleHeight = smoke.particleY;
          		//smoke.particleHeight += smoke.Speed;
          		//smoke.particleWidth += 3.0 / smoke.particleScaleX;
          		
      			missleY -= Speed;
      			missleX = playerPosX + 45;
          		
          		//Log.i(TAG, "particleHeight "+ smoke.particleHeight);
          		//Log.i(TAG, "smoke.particleY "+ smoke.particleY);
     			
     			SNESController.reloadedHellFire = false;
     		
      		}
      		
      	
      	}
      
		//return;
	//}
	

	
	*/
}
