package com.TP;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class BadWeapons {
	public static final String TAG = "moto";
	public boolean machGun01Reloaded = true;
	public Rect machGun01Rect;
	public static double machGun01X;
	public static double machGun01Y;
	public double machGun01Height = 20;
	public double machGun01Width = 10;
	public int machGun01Alpha = 255;
	
	public Drawable machGun01;
	
	
	
	public BadWeapons(){
		machGun01Reloaded = true;
	}
	
	
	public void buildBadWeapons(Context context){
		
		machGun01 = context.getResources().getDrawable(R.drawable.laser);
		
		return;
	}
	
	public void badWeaponsDoDraw(Canvas canvas){
		
		machGun01Rect = new Rect((int)machGun01X, (int)machGun01Y, (int)machGun01X + (int)machGun01Width, (int)machGun01Y + (int)machGun01Height);
		machGun01.setBounds(machGun01Rect);
		machGun01.draw(canvas);
		
		if(GameView.GameState == "run"){
		
		}
		return;
	}

	
	public void updateBadWeapons(){
		
		//machGun01Y = BadCoper1.badCoper1Y;
		//machGun01X = BadCoper1.badCoper1X; 
		
		
		if(machGun01Reloaded == true){
			machGun01Y = fireWeopon(BadCoper1.badCoper1X,BadCoper1.badCoper1Y);  
      	  }else{
      		//Ly = reloadWeopon(mX,mY);
      	  }
      
      	
			/* for(int l = 0; l < 0; l++){
				 Ly = fireWeopon(mX,mY);
		        }*/
		   			
		
		
	    if (machGun01Y > 400) {
        	machGun01Y = reloadWeopon(BadCoper1.badCoper1X,BadCoper1.badCoper1Y);
        	machGun01Reloaded = false;
       // Log.i(TAG, "kill laser and reload ");
           
        }else{
        	machGun01Reloaded = true;	
        }
		
		
		if(machGun01Reloaded == true){
      		machGun01Y = fireWeopon(BadCoper1.badCoper1X,BadCoper1.badCoper1Y);  
      	  }else{
      		//machGun01Y = reloadWeopon(mX,mY);
      		// Log.i(TAG, "particleY " +particleY);
      	  }
		
		

	 return;	
	}
	
	 public double fireWeopon(double powX, double powY){
         machGun01X = powX + 50; 
         powY = machGun01Y + 10;
         machGun01Reloaded = true;
         return powY;
    }
    
    public double reloadWeopon(double powX, double powY){
    	 machGun01X = powX; 
         machGun01Y = powY;
         machGun01Reloaded = true;
    	return powY;
    }
        

	
}
