package com.TP;

import java.util.Timer;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;


public class DeadSmoke {
	public static final String TAG = "moto";
	
	/*public AnimationDrawable blackSmoke1;
	public AnimationDrawable blackSmoke2;
	public AnimationDrawable blackSmoke3;
	public AnimationDrawable blackSmoke4;
	public AnimationDrawable blackSmoke5;
	public AnimationDrawable blackSmoke6;
	public AnimationDrawable blackSmoke7;
	public AnimationDrawable blackSmoke8;
	public AnimationDrawable blackSmoke9;
	public AnimationDrawable blackSmoke10;
	public AnimationDrawable blackSmoke11;
	public AnimationDrawable blackSmoke12;
	public AnimationDrawable blackSmoke13;
	public AnimationDrawable blackSmoke14;
	public AnimationDrawable blackSmoke15;
	public AnimationDrawable blackSmoke16;
	
	public static double blackSmokeX1;
	public static double blackSmokeY1;
	
	public static double blackSmokeX2;
	public static double blackSmokeY2;
	
	public static double blackSmokeX3;
	public static double blackSmokeY3;
	
	public static double blackSmokeX4;
	public static double blackSmokeY4;
	
	public static double blackSmokeX5;
	public static double blackSmokeY5;
	
	public static double blackSmokeX6;
	public static double blackSmokeY6;
	
	public static double blackSmokeX7;
	public static double blackSmokeY7;
	
	public static double blackSmokeX8;
	public static double blackSmokeY8;
	
	public static double blackSmokeX9;
	public static double blackSmokeY9;
	
	public static double blackSmokeX10;
	public static double blackSmokeY10;
	
	public static double blackSmokeX11;
	public static double blackSmokeY11;
	
	public static double blackSmokeX12;
	public static double blackSmokeY12;
	
	public static double blackSmokeX13;
	public static double blackSmokeY13;
	
	public static double blackSmokeX14;
	public static double blackSmokeY14;
	
	public static double blackSmokeX15;
	public static double blackSmokeY15;
	
	public static double blackSmokeX16;
	public static double blackSmokeY16;
	
	public double blackSmokeWidth1 = 100;
	public double blackSmokeHeight1 = 100;
	
	public double blackSmokeWidth2 = 100;
	public double blackSmokeHeight2 = 100;
	
	public double blackSmokeWidth3 = 100;
	public double blackSmokeHeight3 = 100;
	
	public double blackSmokeWidth4 = 100;
	public double blackSmokeHeight4 = 100;
	
	public double blackSmokeWidth5 = 100;
	public double blackSmokeHeight5 = 100;
	
	public double blackSmokeWidth6 = 100;
	public double blackSmokeHeight6 = 100;
	
	public double blackSmokeWidth7 = 100;
	public double blackSmokeHeight7 = 100;
	
	public double blackSmokeWidth8 = 100;
	public double blackSmokeHeight8 = 100;
	
	public double blackSmokeWidth9 = 100;
	public double blackSmokeHeight9 = 100;
	
	public double blackSmokeWidth10 = 100;
	public double blackSmokeHeight10 = 100;
	
	public double blackSmokeWidth11 = 100;
	public double blackSmokeHeight11 = 100;
	
	public double blackSmokeWidth12 = 100;
	public double blackSmokeHeight12 = 100;
	
	public double blackSmokeWidth13 = 100;
	public double blackSmokeHeight13 = 100;
	
	public double blackSmokeWidth14 = 100;
	public double blackSmokeHeight14 = 100;
	
	public double blackSmokeWidth15 = 100;
	public double blackSmokeHeight15 = 100;
	
	public double blackSmokeWidth16 = 100;
	public double blackSmokeHeight16 = 100;
	
	public static int blackSmokeAlpha1;
	public static int blackSmokeAlpha2;
	public static int blackSmokeAlpha3;
	public static int blackSmokeAlpha4;
	public static int blackSmokeAlpha5;
	public static int blackSmokeAlpha6;
	public static int blackSmokeAlpha7;
	public static int blackSmokeAlpha8;
	public static int blackSmokeAlpha9;
	public static int blackSmokeAlpha10;
	public static int blackSmokeAlpha11;
	public static int blackSmokeAlpha12;
	public static int blackSmokeAlpha13;
	public static int blackSmokeAlpha14;
	public static int blackSmokeAlpha15;
	public static int blackSmokeAlpha16;

	public static Rect blackSmokeRect1;
	public static Rect blackSmokeRect2;
	public static Rect blackSmokeRect3;
	public static Rect blackSmokeRect4;
	public static Rect blackSmokeRect5;
	public static Rect blackSmokeRect6;
	public static Rect blackSmokeRect7;
	public static Rect blackSmokeRect8;
	public static Rect blackSmokeRect9;
	public static Rect blackSmokeRect10;
	public static Rect blackSmokeRect11;
	public static Rect blackSmokeRect12;
	public static Rect blackSmokeRect13;
	public static Rect blackSmokeRect14;
	public static Rect blackSmokeRect15;
	public static Rect blackSmokeRect16;
	

	public String blackSmokeRun;
	
	public Timer blackSmokeTimer;
	public int blackSmokeTimerNum;
	

	
	
	private Resources res;

	public DeadSmoke(){
		//explodeBigTimer = new Timer();
		
		
	}
	
	
	public void buildDeadSmoke(Context context){
		
		res = context.getResources();
	    
	    blackSmoke1 = new AnimationDrawable();
	    blackSmoke1.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke1.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke1.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke1.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke1.setOneShot(true);
	    
	    blackSmoke2 = new AnimationDrawable();
	    blackSmoke2.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke2.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke2.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke2.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke2.setOneShot(true);
	   
	    blackSmoke3 = new AnimationDrawable();
	    blackSmoke3.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke3.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke3.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke3.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke3.setOneShot(true);
	    
	    blackSmoke4 = new AnimationDrawable();
	    blackSmoke4.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke4.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke4.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke4.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke4.setOneShot(true);
	 
	    blackSmoke5 = new AnimationDrawable();
	    blackSmoke5.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke5.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke5.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke5.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke5.setOneShot(true);
	  
	    blackSmoke6 = new AnimationDrawable();
	    blackSmoke6.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke6.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke6.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke6.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke6.setOneShot(true);
	  
	    blackSmoke7 = new AnimationDrawable();
	    blackSmoke7.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke7.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke7.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke7.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke7.setOneShot(true);
	 
	    blackSmoke8 = new AnimationDrawable();
	    blackSmoke8.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke8.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke8.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke8.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke8.setOneShot(true);
	  
	    blackSmoke9 = new AnimationDrawable();
	    blackSmoke9.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke9.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke9.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke9.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke9.setOneShot(true);
	    
	    blackSmoke10 = new AnimationDrawable();
	    blackSmoke10.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke10.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke10.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke10.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke10.setOneShot(true);
	    
	    blackSmoke11 = new AnimationDrawable();
	    blackSmoke11.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke11.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke11.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke11.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke11.setOneShot(true);
	    
	    blackSmoke12 = new AnimationDrawable();
	    blackSmoke12.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke12.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke12.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke12.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke12.setOneShot(true);
	    
	    blackSmoke13 = new AnimationDrawable();
	    blackSmoke13.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke13.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke13.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke13.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke13.setOneShot(true);
	   
	    blackSmoke14 = new AnimationDrawable();
	    blackSmoke14.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke14.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke14.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke14.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke14.setOneShot(true);
	 
	    blackSmoke15 = new AnimationDrawable();
	    blackSmoke15.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke15.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke15.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke15.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke15.setOneShot(true);
	   
	    blackSmoke16 = new AnimationDrawable();
	    blackSmoke16.addFrame(res.getDrawable(R.drawable.deadsmoke0001), 100);
	    blackSmoke16.addFrame(res.getDrawable(R.drawable.deadsmoke0002), 100);
	    blackSmoke16.addFrame(res.getDrawable(R.drawable.deadsmoke0003), 100);
	    blackSmoke16.addFrame(res.getDrawable(R.drawable.deadsmoke0004), 100);
	    blackSmoke16.setOneShot(true);
	    
		return;
	}
	
	public void deadSmokeDoDraw(Canvas canvas){
		
	    blackSmokeRect1 = new Rect( (int)blackSmokeX1,(int)blackSmokeY1, (int)blackSmokeX1 + (int)blackSmokeWidth1, (int)blackSmokeY1 + (int)blackSmokeHeight1 );
		blackSmokeRect1.centerX();
		blackSmokeRect1.centerY();
		blackSmoke1.setBounds(blackSmokeRect1);
		blackSmoke1.setAlpha(blackSmokeAlpha1);
		
		blackSmokeRect2 = new Rect( (int)blackSmokeX2,(int)blackSmokeY2, (int)blackSmokeX2 + (int)blackSmokeWidth2, (int)blackSmokeY2 + (int)blackSmokeHeight2 );
		blackSmokeRect2.centerX();
		blackSmokeRect2.centerY();
		blackSmoke2.setBounds(blackSmokeRect2);
		blackSmoke2.setAlpha(blackSmokeAlpha2);
		
		blackSmokeRect3 = new Rect( (int)blackSmokeX3,(int)blackSmokeY3, (int)blackSmokeX3 + (int)blackSmokeWidth3, (int)blackSmokeY3 + (int)blackSmokeHeight3 );
		blackSmokeRect3.centerX();
		blackSmokeRect3.centerY();
		blackSmoke3.setBounds(blackSmokeRect3);
		blackSmoke3.setAlpha(blackSmokeAlpha3);
		
		blackSmokeRect4 = new Rect( (int)blackSmokeX4,(int)blackSmokeY4, (int)blackSmokeX4 + (int)blackSmokeWidth4, (int)blackSmokeY4 + (int)blackSmokeHeight4 );
		blackSmokeRect4.centerX();
		blackSmokeRect4.centerY();
		blackSmoke4.setBounds(blackSmokeRect4);
		blackSmoke4.setAlpha(blackSmokeAlpha4);
		
		blackSmokeRect5 = new Rect( (int)blackSmokeX5,(int)blackSmokeY5, (int)blackSmokeX5 + (int)blackSmokeWidth5, (int)blackSmokeY5 + (int)blackSmokeHeight5 );
		blackSmokeRect5.centerX();
		blackSmokeRect5.centerY();
		blackSmoke5.setBounds(blackSmokeRect5);
		blackSmoke5.setAlpha(blackSmokeAlpha5);
		
		blackSmokeRect6 = new Rect( (int)blackSmokeX6,(int)blackSmokeY6, (int)blackSmokeX6 + (int)blackSmokeWidth6, (int)blackSmokeY6 + (int)blackSmokeHeight6 );
		blackSmokeRect6.centerX();
		blackSmokeRect6.centerY();
		blackSmoke6.setBounds(blackSmokeRect6);
		blackSmoke6.setAlpha(blackSmokeAlpha6);
	
		blackSmokeRect7 = new Rect( (int)blackSmokeX7,(int)blackSmokeY7, (int)blackSmokeX7 + (int)blackSmokeWidth7, (int)blackSmokeY7 + (int)blackSmokeHeight7 );
		blackSmokeRect7.centerX();
		blackSmokeRect7.centerY();
		blackSmoke7.setBounds(blackSmokeRect7);
		blackSmoke7.setAlpha(blackSmokeAlpha7);
		
		blackSmokeRect8 = new Rect( (int)blackSmokeX8,(int)blackSmokeY8, (int)blackSmokeX8 + (int)blackSmokeWidth8, (int)blackSmokeY8 + (int)blackSmokeHeight8 );
		blackSmokeRect8.centerX();
		blackSmokeRect8.centerY();
		blackSmoke8.setBounds(blackSmokeRect8);
		blackSmoke8.setAlpha(blackSmokeAlpha8);
		
		blackSmokeRect9 = new Rect( (int)blackSmokeX9,(int)blackSmokeY9, (int)blackSmokeX9 + (int)blackSmokeWidth9, (int)blackSmokeY9 + (int)blackSmokeHeight9 );
		blackSmokeRect9.centerX();
		blackSmokeRect9.centerY();
		blackSmoke9.setBounds(blackSmokeRect9);
		blackSmoke9.setAlpha(blackSmokeAlpha9);
		
		blackSmokeRect10 = new Rect( (int)blackSmokeX10,(int)blackSmokeY10, (int)blackSmokeX10 + (int)blackSmokeWidth10, (int)blackSmokeY10 + (int)blackSmokeHeight10 );
		blackSmokeRect10.centerX();
		blackSmokeRect10.centerY();
		blackSmoke10.setBounds(blackSmokeRect10);
		blackSmoke10.setAlpha(blackSmokeAlpha10);
		
		blackSmokeRect11 = new Rect( (int)blackSmokeX11,(int)blackSmokeY11, (int)blackSmokeX11 + (int)blackSmokeWidth11, (int)blackSmokeY11 + (int)blackSmokeHeight11 );
		blackSmokeRect11.centerX();
		blackSmokeRect11.centerY();
		blackSmoke11.setBounds(blackSmokeRect11);
		blackSmoke11.setAlpha(blackSmokeAlpha11);
		
		blackSmokeRect12 = new Rect( (int)blackSmokeX12,(int)blackSmokeY12, (int)blackSmokeX12 + (int)blackSmokeWidth12, (int)blackSmokeY12 + (int)blackSmokeHeight12 );
		blackSmokeRect12.centerX();
		blackSmokeRect12.centerY();
		blackSmoke12.setBounds(blackSmokeRect12);
		blackSmoke12.setAlpha(blackSmokeAlpha12);
		
		blackSmokeRect13 = new Rect( (int)blackSmokeX13,(int)blackSmokeY13, (int)blackSmokeX13 + (int)blackSmokeWidth13, (int)blackSmokeY13 + (int)blackSmokeHeight13 );
		blackSmokeRect13.centerX();
		blackSmokeRect13.centerY();
		blackSmoke13.setBounds(blackSmokeRect13);
		blackSmoke13.setAlpha(blackSmokeAlpha13);
		
		blackSmokeRect14 = new Rect( (int)blackSmokeX14,(int)blackSmokeY14, (int)blackSmokeX14 + (int)blackSmokeWidth14, (int)blackSmokeY14 + (int)blackSmokeHeight14 );
		blackSmokeRect14.centerX();
		blackSmokeRect14.centerY();
		blackSmoke14.setBounds(blackSmokeRect14);
		blackSmoke14.setAlpha(blackSmokeAlpha14);
		
		blackSmokeRect15 = new Rect( (int)blackSmokeX15,(int)blackSmokeY15, (int)blackSmokeX15 + (int)blackSmokeWidth15, (int)blackSmokeY15 + (int)blackSmokeHeight15 );
		blackSmokeRect15.centerX();
		blackSmokeRect15.centerY();
		blackSmoke15.setBounds(blackSmokeRect15);
		blackSmoke15.setAlpha(blackSmokeAlpha15);
	
		blackSmokeRect16 = new Rect( (int)blackSmokeX16,(int)blackSmokeY16, (int)blackSmokeX16 + (int)blackSmokeWidth16, (int)blackSmokeY16 + (int)blackSmokeHeight16 );
		blackSmokeRect16.centerX();
		blackSmokeRect16.centerY();
		blackSmoke16.setBounds(blackSmokeRect16);
		blackSmoke16.setAlpha(blackSmokeAlpha16);
		
		
		
		
			
			if(Crusher.cGun1HitExplode){
				blackSmoke1.start();	
				blackSmoke1.run();
				blackSmokeY1 = Crusher.cGun1Y + Crusher.cGun1Height /2 - blackSmokeHeight1 + 10;
				blackSmokeX1 = Crusher.cGun1X + Crusher.cGun1Width /2 - blackSmokeWidth1 /2;
				blackSmokeAlpha1 = 255;
				blackSmoke1.draw(canvas);
			}
		
			if(Crusher.cGun2HitExplode){
				blackSmoke2.start();	
				blackSmoke2.run();
				blackSmokeY2 = Crusher.cGun2Y + Crusher.cGun2Height /2 - blackSmokeHeight2 + 10;
				blackSmokeX2 = Crusher.cGun2X + Crusher.cGun2Width /2 - blackSmokeWidth2 /2;
				blackSmokeAlpha2 = 255;
				blackSmoke2.draw(canvas);
			}
			
			if(Crusher.cGun3HitExplode){
				blackSmoke3.start();	
				blackSmoke3.run();
				blackSmokeY3 = Crusher.cGun3Y + Crusher.cGun3Height /2 - blackSmokeHeight3 + 10;
				blackSmokeX3 = Crusher.cGun3X + Crusher.cGun3Width /2 - blackSmokeWidth3 /2;
				blackSmokeAlpha3 = 255;
				blackSmoke3.draw(canvas);
			}
			
			if(Crusher.cGun4HitExplode){
				blackSmoke4.start();	
				blackSmoke4.run();
				blackSmokeY4 = Crusher.cGun4Y + Crusher.cGun4Height /2 - blackSmokeHeight4 + 10;
				blackSmokeX4 = Crusher.cGun4X + Crusher.cGun4Width /2 - blackSmokeWidth4 /2;
				blackSmokeAlpha4 = 255;
				blackSmoke4.draw(canvas);
			}
			
			if(Crusher.cGun5HitExplode){
				blackSmoke5.start();	
				blackSmoke5.run();
				blackSmokeY5 = Crusher.cGun5Y + Crusher.cGun5Height /2 - blackSmokeHeight5 + 10;
				blackSmokeX5 = Crusher.cGun5X + Crusher.cGun5Width /2 - blackSmokeWidth5 /2;
				blackSmokeAlpha5 = 255;
				blackSmoke5.draw(canvas);
			}
			
			
			
			
			
			
			if(Crusher.sGun1HitExplode){
				blackSmoke6.start();	
				blackSmoke6.run();
				blackSmokeY6 = Crusher.sGun1Y + Crusher.sGun1Height /2 - blackSmokeHeight6 + 10;
				blackSmokeX6 = Crusher.sGun1X + Crusher.sGun1Width /2 - blackSmokeWidth6 /2;
				blackSmokeAlpha6 = 255;
				blackSmoke6.draw(canvas);
			}
			
			
			
			if(Crusher.sGun2HitExplode){
				blackSmoke7.start();	
				blackSmoke7.run();
				blackSmokeY7 = Crusher.sGun2Y + Crusher.sGun2Height /2 - blackSmokeHeight7 + 10;
				blackSmokeX7 = Crusher.sGun2X + Crusher.sGun2Width /2 - blackSmokeWidth7 /2;
				blackSmokeAlpha7 = 255;
				blackSmoke7.draw(canvas);
			}
		
			if(Crusher.sGun3HitExplode){
				blackSmoke8.start();	
				blackSmoke8.run();
				blackSmokeY8 = Crusher.sGun3Y + Crusher.sGun3Height /2 - blackSmokeHeight8 + 10;
				blackSmokeX8 = Crusher.sGun3X + Crusher.sGun3Width /2 - blackSmokeWidth8 /2;
				blackSmokeAlpha8 = 255;
				blackSmoke8.draw(canvas);
			}
		
			if(Crusher.sGun4HitExplode){
				blackSmoke9.start();	
				blackSmoke9.run();
				blackSmokeY9 = Crusher.sGun4Y + Crusher.sGun4Height /2 - blackSmokeHeight9 + 10;
				blackSmokeX9 = Crusher.sGun4X + Crusher.sGun4Width /2 - blackSmokeWidth9 /2;
				blackSmokeAlpha9 = 255;
				blackSmoke9.draw(canvas);
			}
		
			if(Crusher.sGun5HitExplode){
				blackSmoke10.start();	
				blackSmoke10.run();
				blackSmokeY10 = Crusher.sGun5Y + Crusher.sGun5Height /2 - blackSmokeHeight10 + 10;
				blackSmokeX10 = Crusher.sGun5X + Crusher.sGun5Width /2 - blackSmokeWidth10 /2;
				blackSmokeAlpha10 = 255;
				blackSmoke10.draw(canvas);
			}
			
			if(Crusher.sGun6HitExplode){
				blackSmoke11.start();	
				blackSmoke11.run();
				blackSmokeY11 = Crusher.sGun6Y + Crusher.sGun6Height /2 - blackSmokeHeight11 + 10;
				blackSmokeX11 = Crusher.sGun6X + Crusher.sGun6Width /2 - blackSmokeWidth11 /2;
				blackSmokeAlpha11 = 255;
				blackSmoke11.draw(canvas);
			}
			
			if(Crusher.sGun7HitExplode){
				blackSmoke12.start();	
				blackSmoke12.run();
				blackSmokeY12 = Crusher.sGun7Y + Crusher.sGun7Height /2 - blackSmokeHeight12 + 10;
				blackSmokeX12 = Crusher.sGun7X + Crusher.sGun7Width /2 - blackSmokeWidth12 /2;
				blackSmokeAlpha12 = 255;
				blackSmoke12.draw(canvas);
			}
			
			if(Crusher.sGun8HitExplode){
				blackSmoke13.start();	
				blackSmoke13.run();
				blackSmokeY13 = Crusher.sGun8Y + Crusher.sGun8Height /2 - blackSmokeHeight13 + 10;
				blackSmokeX13 = Crusher.sGun8X + Crusher.sGun8Width /2 - blackSmokeWidth13 /2;
				blackSmokeAlpha13 = 255;
				blackSmoke13.draw(canvas);
			}
			
			if(Crusher.sGun9HitExplode){
				blackSmoke14.start();	
				blackSmoke14.run();
				blackSmokeY14 = Crusher.sGun9Y + Crusher.sGun9Height /2 - blackSmokeHeight14 + 10;
				blackSmokeX14 = Crusher.sGun9X + Crusher.sGun9Width /2 - blackSmokeWidth14 /2;
				blackSmokeAlpha14 = 255;
				blackSmoke14.draw(canvas);
			}
			
			if(Crusher.sGun10HitExplode){
				blackSmoke15.start();	
				blackSmoke15.run();
				blackSmokeY15 = Crusher.sGun10Y + Crusher.sGun10Height /2 - blackSmokeHeight15 + 10;
				blackSmokeX15 = Crusher.sGun10X + Crusher.sGun10Width /2 - blackSmokeWidth15 /2;
				blackSmokeAlpha15 = 255;
				blackSmoke15.draw(canvas);
			}
			
			if(Crusher.sGun11HitExplode){
				blackSmoke16.start();	
				blackSmoke16.run();
				blackSmokeY16 = Crusher.sGun11Y + Crusher.sGun11Height /2 - blackSmokeHeight16 + 10;
				blackSmokeX16 = Crusher.sGun11X + Crusher.sGun11Width /2 - blackSmokeWidth16 /2;
				blackSmokeAlpha16 = 255;
				blackSmoke16.draw(canvas);
			}
			
			
		
		

   		
		return;
	}
	
	

	
	
	public void deadSmokeUpdate(){
		

	 return;	
	}*/
	
}
