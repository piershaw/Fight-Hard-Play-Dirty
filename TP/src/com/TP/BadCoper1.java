package com.TP;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
//import android.util.Log;

public class BadCoper1 {
	public static final String TAG = "moto";
	
	//private MiniGun minigun;
	//public Explode explode1;
	
	public static int badCoper1HitNum;
	public static boolean badCoper1ExplodeIs;
	public boolean badCoperReady; 
	public static boolean badCoperIsHit;
	public static boolean badCoperIsHitPow;
	
	public MiniGunBullet miniB;
	public Bitmap gBCoper1Bullet;
	public Drawable gBCoper1BulletColloder;
	public Rect gBCoper1BulletRect;
	public static double gBCoper1BulletX;
	public static double gBCoper1BulletY;
	public double gBCoper1BulletSpeed;
	public double gBCoper1BulletWidth;
	public double gBCoper1BulletHeight;
	public double gBCoper1BulletSpeedX;
	public double gBCoper1BulletSpeedY;
	public int gBCoper1BulletAlpha;
	public double gBCoper1BulletRot;
	public double gBCoper1Bulletradians;
	public double gBCoper1BulletAngle;
	public double gBCoper1BulletAngleRot;
	public double gBCoper1BulletAngleHead;
	public double gBCoper1BulletHeading;
	public double gBCoper1BulletDX;
	public double gBCoper1BulletDY;
	public double gBCoper1Rot;
	public double gBCoper1Angle;
	public double gBCoper1radians;

	public double gBCoper1offSetX;
	public double gBCoper1offSetY;
	

	
	public boolean firegBCoper1 = false;
	public boolean reloadgBCoper1 = false;
	public boolean minGunFire = false;
	//public boolean minGunFire1 = false;
	//public boolean minGunFire2 = false;
	
	public double mbNumFire;
	//public int mbNumFire1;
	//public int mbNumFire2;
	
	public static double badCoper1X = 0;
	public static double badCoper1Y = 0;
	public double badCoper1XPointer = 0;
	public double badCoper1YPointer = 0;
	public static double badCoper1vx = 0;
	public static double badCoper1vy = 0;
	public static double badCoper1Width = 80;
	public static double badCoper1Height = 80;
	public double badCoper1Speed = 0.5;
	public static int badCoper1AlphaHit = 0;
	public static int badCoper1Alpha = 255;
	public AnimationDrawable badCoper1;
	public static Rect badCoper1Rect;
	public Drawable deadBadCoper1;
	public Drawable hitBadCoper1;

	
	public double gravity;
	public double friction;
	public double bounce;
	public double areaBounce;
	public int rot;
	public static int rots;

	public static boolean updatePlayerScore = false;
    public int pegWidth;
    public int pegHeight;
    
    
	
    public Drawable pegstart;
    public Drawable peg0;
    public Drawable peg1;
    public Drawable peg2;
    public Drawable peg3;
    public Drawable peg4;
    public Drawable peg5;
    public Drawable peg6;
    public Drawable peg7;
    public Drawable peg8;
    public Drawable peg9;
    public Drawable peg10;
    public Drawable peg11;
    public Drawable peg12;
    public Drawable peg13;
    //14
    public Drawable peg15;
    public Drawable peg16;
    public Drawable peg17;
    public Drawable peg18;
    public Drawable peg19;
    public Drawable peg20;
    public Drawable peg21;
    public Drawable peg22;
    public Drawable peg23;
    public Drawable peg24;
    public Drawable peg25;
    public Drawable peg26;
    public Drawable peg27;
    public Drawable peg28;
    //29
    public Drawable peg30;
    public Drawable peg31;
    public Drawable peg32;
    public Drawable peg33;
    public Drawable peg34;
    public Drawable peg35;
    public Drawable peg36;
    public Drawable peg37;
    public Drawable peg38;
    public Drawable peg39;
    public Drawable peg40;
    public Drawable peg41;
    public Drawable peg42;
    public Drawable peg43;
    public Drawable peg44;
    public Drawable peg45;
    public Drawable peg46;
    public Drawable peg47;
    public Drawable peg48;
    public Drawable peg49;
    public Drawable peg50;
    public Drawable peg51;
    public Drawable peg52;
    public Drawable peg53;
    public Drawable peg54;
    
    public Rect pegstartRect;
    public Rect peg0Rect;
    public Rect peg1Rect;
    public Rect peg2Rect;
    public Rect peg3Rect;
    public Rect peg4Rect;
    public Rect peg5Rect;
    public Rect peg6Rect;
    public Rect peg7Rect;
    public Rect peg8Rect;
    public Rect peg9Rect;
    public Rect peg10Rect;
    public Rect peg11Rect;
    public Rect peg12Rect;
    public Rect peg13Rect;
  
    public Rect peg15Rect;
    public Rect peg16Rect;
    public Rect peg17Rect;
    public Rect peg18Rect;
    public Rect peg19Rect;
    public Rect peg20Rect;
    public Rect peg21Rect;
    public Rect peg22Rect;
    public Rect peg23Rect;
    public Rect peg24Rect;
    public Rect peg25Rect;
    public Rect peg26Rect;
    public Rect peg27Rect;
    public Rect peg28Rect;
  
    public Rect peg30Rect;
    public Rect peg31Rect;
    public Rect peg32Rect;
    public Rect peg33Rect;
    public Rect peg34Rect;
    public Rect peg35Rect;
    public Rect peg36Rect;
    public Rect peg37Rect;
    public Rect peg38Rect;
    public Rect peg39Rect;
    public Rect peg40Rect;
    public Rect peg41Rect;
    public Rect peg42Rect;
    public Rect peg43Rect;
    public Rect peg44Rect;
    public Rect peg45Rect;
    public Rect peg46Rect;
    public Rect peg47Rect;
    public Rect peg48Rect;
    public Rect peg49Rect;
    public Rect peg50Rect;
    public Rect peg51Rect;
    public Rect peg52Rect;
    public Rect peg53Rect;
    public Rect peg54Rect;
    
    public int weaponsDamage;
    
   
	
	public BadCoper1(){

		badCoper1XPointer = Math.random() * 80 + 240;
		badCoper1YPointer = 100;
		
		
		

		//Log.i(TAG, "badCoper1X " + badCoper1X);
		//minigun = new MiniGun();
		//explode1 = new Explode();
		gBCoper1BulletX = 0;
		gBCoper1BulletY = 0;
		gBCoper1BulletWidth = 9;
		gBCoper1BulletHeight = 9;
		gBCoper1BulletSpeedX = 0;
		gBCoper1BulletSpeedY = 0;
		gBCoper1BulletAlpha = 0;
		gBCoper1BulletRot = 255;
		gBCoper1Bulletradians = 360 * 2 / Math.PI;
		gBCoper1BulletAngle = 0;
		gBCoper1BulletAngleRot = 0;
		gBCoper1BulletAngleHead = 0;
		gBCoper1BulletDX = 0;
		gBCoper1BulletDY = 0;
		gBCoper1BulletSpeed = 10;
		
		gBCoper1offSetX = 7;
		gBCoper1offSetY = 10;
		
		badCoper1HitNum = 0;
		badCoper1ExplodeIs = false;
		badCoperIsHitPow = false;
		badCoperReady = false; 
		badCoperIsHit = false;
		
		gravity = 8.58;
		friction = 0.98;
		bounce = 0.4;
		areaBounce = 0.9;
		rot = 0;
		pegWidth = 15;
	    pegHeight = 15;
	
  		
		reloadgBCoper1();
	}
	
	
	public void buildbadCoper1(Context context){
		
		Resources res = context.getResources();
		
			//minigun.buildMiniGun(context);
		
		//	explode1.buildExplode(context);
		
			badCoper1 = new AnimationDrawable();
			badCoper1.addFrame(res.getDrawable(R.drawable.coptern0001), 100);
			badCoper1.addFrame(res.getDrawable(R.drawable.coptern0002), 100);
			badCoper1.addFrame(res.getDrawable(R.drawable.coptern0003), 100);
			badCoper1.addFrame(res.getDrawable(R.drawable.coptern0004), 100);
			badCoper1.addFrame(res.getDrawable(R.drawable.coptern0005), 100);
			badCoper1.addFrame(res.getDrawable(R.drawable.coptern0006), 100);
			badCoper1.setOneShot(true);
			badCoper1.start();
			
			pegstart = context.getResources().getDrawable(R.drawable.peg);
			peg0 = context.getResources().getDrawable(R.drawable.peg);
			peg1 = context.getResources().getDrawable(R.drawable.peg);
	        peg2= context.getResources().getDrawable(R.drawable.peg);
	        peg3= context.getResources().getDrawable(R.drawable.peg);
	        peg4= context.getResources().getDrawable(R.drawable.peg);
	        peg5= context.getResources().getDrawable(R.drawable.peg);
	        peg6= context.getResources().getDrawable(R.drawable.peg);
	        peg7= context.getResources().getDrawable(R.drawable.peg);
	        peg8= context.getResources().getDrawable(R.drawable.peg);
	        peg9= context.getResources().getDrawable(R.drawable.peg);
	        peg10= context.getResources().getDrawable(R.drawable.peg);
	        peg11= context.getResources().getDrawable(R.drawable.peg);
	        peg12= context.getResources().getDrawable(R.drawable.peg);
	        peg13= context.getResources().getDrawable(R.drawable.peg);
	      
	        peg15= context.getResources().getDrawable(R.drawable.peg);
	        peg16= context.getResources().getDrawable(R.drawable.peg);
	        peg17= context.getResources().getDrawable(R.drawable.peg);
	        peg18= context.getResources().getDrawable(R.drawable.peg);
	        peg19= context.getResources().getDrawable(R.drawable.peg);
	        peg20= context.getResources().getDrawable(R.drawable.peg);
	        peg21= context.getResources().getDrawable(R.drawable.peg);
	        peg22= context.getResources().getDrawable(R.drawable.peg);
	        peg23= context.getResources().getDrawable(R.drawable.peg);
	        peg24= context.getResources().getDrawable(R.drawable.peg);
	        peg25= context.getResources().getDrawable(R.drawable.peg);
	        peg26= context.getResources().getDrawable(R.drawable.peg);
	        peg27= context.getResources().getDrawable(R.drawable.peg);
	        peg28= context.getResources().getDrawable(R.drawable.peg);
	  
	        peg30= context.getResources().getDrawable(R.drawable.peg);
	        peg31= context.getResources().getDrawable(R.drawable.peg);
	        peg32= context.getResources().getDrawable(R.drawable.peg);
	        peg33= context.getResources().getDrawable(R.drawable.peg);
	        peg34= context.getResources().getDrawable(R.drawable.peg);
	        peg35= context.getResources().getDrawable(R.drawable.peg);
	        peg36= context.getResources().getDrawable(R.drawable.peg);
	        peg37= context.getResources().getDrawable(R.drawable.peg);
	        peg38= context.getResources().getDrawable(R.drawable.peg);
	        peg39= context.getResources().getDrawable(R.drawable.peg);
	        peg40= context.getResources().getDrawable(R.drawable.peg);
	        peg41= context.getResources().getDrawable(R.drawable.peg);
	        peg42= context.getResources().getDrawable(R.drawable.peg);
	        peg43= context.getResources().getDrawable(R.drawable.peg);
	        peg44= context.getResources().getDrawable(R.drawable.peg);
	        peg45= context.getResources().getDrawable(R.drawable.peg);
	        peg46= context.getResources().getDrawable(R.drawable.peg);
	        peg47= context.getResources().getDrawable(R.drawable.peg);
	        peg48= context.getResources().getDrawable(R.drawable.peg);
	        peg49= context.getResources().getDrawable(R.drawable.peg);
	        peg50= context.getResources().getDrawable(R.drawable.peg);
	        peg51= context.getResources().getDrawable(R.drawable.peg);
	        peg52= context.getResources().getDrawable(R.drawable.peg);
	        peg53= context.getResources().getDrawable(R.drawable.peg);
	        peg54= context.getResources().getDrawable(R.drawable.peg);
	        
	        gBCoper1BulletColloder = context.getResources().getDrawable(R.drawable.boxcollider);
			gBCoper1Bullet = BitmapFactory.decodeResource(res,R.drawable.laser); 
			
			deadBadCoper1 = context.getResources().getDrawable(R.drawable.copterndead);
			hitBadCoper1 = context.getResources().getDrawable(R.drawable.copternhit);
			
			badCoperReady = true; 
	        
		return;
	}
	
	public void badCoper1DoDraw(Canvas canvas){
		
		
		
		//minigun.miniGunDoDraw(canvas);
		//explode1.explodeDoDraw(canvas);
		
		gBCoper1BulletRect = new Rect((int)gBCoper1BulletX,(int)gBCoper1BulletY,(int)gBCoper1BulletX + (int)gBCoper1BulletWidth, (int)gBCoper1BulletY + (int)gBCoper1BulletHeight);
		gBCoper1BulletRect.centerX();
		gBCoper1BulletRect.centerY();
		gBCoper1BulletColloder.setBounds(gBCoper1BulletRect);
		gBCoper1BulletColloder.draw(canvas);
		
		canvas.save();
		canvas.rotate((float) -gBCoper1BulletAngleHead, (float)gBCoper1BulletX + (float)gBCoper1BulletWidth /2 , (float)gBCoper1BulletY + (float)gBCoper1BulletHeight /2);
		canvas.drawBitmap(gBCoper1Bullet, (int)gBCoper1BulletX, (int)gBCoper1BulletY, null);
		canvas.restore();
		
		    if(badCoper1ExplodeIs){
	        	badCoper1Rect = new Rect((int)badCoper1XPointer,(int)badCoper1YPointer,(int)badCoper1XPointer + (int)badCoper1Width, (int)badCoper1YPointer + (int)badCoper1Height);
	        	deadBadCoper1.setBounds(badCoper1Rect);
	        	deadBadCoper1.setAlpha(badCoper1Alpha);
	        	deadBadCoper1.draw(canvas);
	        	//badCoper1ExplodeIs = false;
	        }else if(badCoperIsHit){
	        	badCoperIsHit = false;
				badCoper1Rect = new Rect((int)badCoper1XPointer,(int)badCoper1YPointer,(int)badCoper1XPointer + (int)badCoper1Width, (int)badCoper1YPointer + (int)badCoper1Height);
		        hitBadCoper1.setBounds(badCoper1Rect);
		        hitBadCoper1.draw(canvas); 
	        }else{
	        	badCoper1Rect = new Rect((int)badCoper1XPointer,(int)badCoper1YPointer,(int)badCoper1XPointer + (int)badCoper1Width, (int)badCoper1YPointer + (int)badCoper1Height);
	        	badCoper1.setBounds(badCoper1Rect);
	        	badCoper1.setAlpha(badCoper1Alpha);
	        	badCoper1.draw(canvas);
	        	badCoper1.run();
	        }	
		
		pegstartRect = new Rect(28, 139, 28 + pegWidth, 139 + pegWidth);
		pegstart.setBounds(pegstartRect);
		pegstart.draw(canvas);
        
		peg1Rect = new Rect(67, 139, 67 + pegWidth, 139 + pegWidth);
 	    peg1.setBounds(peg1Rect);
        peg1.draw(canvas);
        
        peg2Rect = new Rect(103, 139, 103 + pegWidth, 139 + pegWidth);
 	    peg2.setBounds(peg2Rect);
        peg2.draw(canvas);
        
        peg3Rect = new Rect(139, 139, 139 + pegWidth, 139 + pegWidth);
 	    peg3.setBounds(peg3Rect);
        peg3.draw(canvas);
         
        peg4Rect = new Rect(175, 139, 175 + pegWidth, 139 + pegWidth);
 	    peg4.setBounds(peg4Rect);
        peg4.draw(canvas);
        
        peg5Rect = new Rect(211, 139, 211 + pegWidth, 139 + pegWidth);
 	    peg5.setBounds(peg5Rect);
        peg5.draw(canvas);
        
        peg6Rect = new Rect(247, 139, 247 + pegWidth, 139 + pegWidth);
 	    peg6.setBounds(peg6Rect);
        peg6.draw(canvas);
        
        peg0Rect = new Rect(280, 139, 280 + pegWidth, 139 + pegWidth);
 	    peg0.setBounds(peg0Rect);
        peg0.draw(canvas);
        
    
        //line 2  
        peg7Rect = new Rect(49, 175, 49 + pegWidth, 175 + pegWidth);
 	    peg7.setBounds(peg7Rect);
        peg7.draw(canvas);

        peg8Rect = new Rect(85, 175, 85 + pegWidth, 175 + pegWidth);
 	    peg8.setBounds(peg8Rect);
        peg8.draw(canvas);

        peg9Rect = new Rect(121, 175, 121 + pegWidth, 175 + pegWidth);
 	    peg9.setBounds(peg9Rect);
        peg9.draw(canvas);

        peg10Rect = new Rect(157, 175, 157 + pegWidth, 175 + pegWidth);
 	    peg10.setBounds(peg10Rect);
        peg10.draw(canvas);

        peg11Rect = new Rect(193, 175, 193 + pegWidth, 175 + pegWidth);
 	    peg11.setBounds(peg11Rect);
        peg11.draw(canvas);
        
        peg12Rect = new Rect(229, 175, 229 + pegWidth, 175 + pegWidth);
 	    peg12.setBounds(peg12Rect);
        peg12.draw(canvas);
        
        peg13Rect = new Rect(265, 175, 265 + pegWidth, 175 + pegWidth);
 	    peg13.setBounds(peg13Rect);
        peg13.draw(canvas);
        
        //line 3
    
        peg15Rect = new Rect(67, 211, 67 + pegWidth, 211 + pegWidth);
 	    peg15.setBounds(peg15Rect);
        peg15.draw(canvas);
        
        peg16Rect = new Rect(103, 211, 103 + pegWidth, 211 + pegWidth);
 	    peg16.setBounds(peg16Rect);
        peg16.draw(canvas);
        
        peg17Rect = new Rect(139, 211, 139 + pegWidth, 211 + pegWidth);
 	    peg17.setBounds(peg17Rect);
        peg17.draw(canvas);

        peg18Rect = new Rect(175, 211, 175 + pegWidth, 211 + pegWidth);
 	    peg18.setBounds(peg18Rect);
        peg18.draw(canvas);

        peg19Rect = new Rect(211, 211, 211 + pegWidth, 211 + pegWidth);
 	    peg19.setBounds(peg19Rect);
        peg19.draw(canvas);

        peg20Rect = new Rect(247, 211, 247 + pegWidth, 211 + pegWidth);
 	    peg20.setBounds(peg20Rect);
        peg20.draw(canvas);
        
        
        //line 4	
        peg21Rect = new Rect(49, 247, 49 + pegWidth, 247 + pegWidth);
 	    peg21.setBounds(peg21Rect);
        peg21.draw(canvas);

        peg22Rect = new Rect(85, 247, 85 + pegWidth, 247 + pegWidth);
 	    peg22.setBounds(peg22Rect);
        peg22.draw(canvas);

        peg23Rect = new Rect(121, 247, 121 + pegWidth, 247 + pegWidth);
 	    peg23.setBounds(peg23Rect);
        peg23.draw(canvas);

        peg24Rect = new Rect(157, 247, 157 + pegWidth, 247 + pegWidth);
 	    peg24.setBounds(peg24Rect);
        peg24.draw(canvas);

        peg25Rect = new Rect(193, 247, 193 + pegWidth, 247 + pegWidth);
 	    peg25.setBounds(peg25Rect);
        peg25.draw(canvas);
        
        peg26Rect = new Rect(229, 247, 229 + pegWidth, 247 + pegWidth);
 	    peg26.setBounds(peg26Rect);
        peg26.draw(canvas);
        
        peg27Rect = new Rect(265, 247, 265 + pegWidth, 247 + pegWidth);
 	    peg27.setBounds(peg27Rect);
        peg27.draw(canvas);
        
        

        
        //line 5	
        peg28Rect = new Rect(67, 283, 67 + pegWidth, 283 + pegWidth);
 	    peg28.setBounds(peg28Rect);
        peg28.draw(canvas);
        
        peg30Rect = new Rect(103, 283, 103 + pegWidth, 283 + pegWidth);
 	    peg30.setBounds(peg30Rect);
        peg30.draw(canvas);
        
        peg31Rect = new Rect(139, 283, 139 + pegWidth, 283 + pegWidth);
 	    peg31.setBounds(peg31Rect);
        peg31.draw(canvas);

        peg32Rect = new Rect(175, 283, 175 + pegWidth, 283 + pegWidth);
 	    peg32.setBounds(peg32Rect);
        peg32.draw(canvas);

        peg33Rect = new Rect(211, 283, 211 + pegWidth, 283 + pegWidth);
 	    peg33.setBounds(peg33Rect);
        peg33.draw(canvas);

        peg34Rect = new Rect(247, 283, 247 + pegWidth, 283 + pegWidth);
 	    peg34.setBounds(peg34Rect);
        peg34.draw(canvas);
        

        //line 6	       
        peg35Rect = new Rect(49, 319, 49 + pegWidth, 319 + pegWidth);
 	    peg35.setBounds(peg35Rect);
        peg35.draw(canvas);

        peg36Rect = new Rect(85, 319, 85 + pegWidth, 319 + pegWidth);
 	    peg36.setBounds(peg36Rect);
        peg36.draw(canvas);

        peg37Rect = new Rect(121, 319, 121 + pegWidth, 319 + pegWidth);
 	    peg37.setBounds(peg37Rect);
        peg37.draw(canvas);

        peg38Rect = new Rect(157, 319, 157 + pegWidth, 319 + pegWidth);
 	    peg38.setBounds(peg38Rect);
        peg38.draw(canvas);

        peg39Rect = new Rect(193, 319, 193 + pegWidth, 319 + pegWidth);
 	    peg39.setBounds(peg39Rect);
        peg39.draw(canvas);
        
        peg40Rect = new Rect(229, 319, 229 + pegWidth, 319 + pegWidth);
 	    peg40.setBounds(peg40Rect);
        peg40.draw(canvas);
        
        peg41Rect = new Rect(265, 319, 265 + pegWidth, 319 + pegWidth);
 	    peg41.setBounds(peg41Rect);
        peg41.draw(canvas);

        
        //line 7
        peg42Rect = new Rect(67, 355, 67 + pegWidth, 355 + pegWidth);
 	    peg42.setBounds(peg42Rect);
        peg42.draw(canvas);
        
        peg43Rect = new Rect(103, 355, 103 + pegWidth, 355 + pegWidth);
 	    peg43.setBounds(peg43Rect);
        peg43.draw(canvas);
        
        peg44Rect = new Rect(139, 355, 139 + pegWidth, 355 + pegWidth);
 	    peg44.setBounds(peg44Rect);
        peg44.draw(canvas);

        peg45Rect = new Rect(175, 355, 175 + pegWidth, 355 + pegWidth);
 	    peg45.setBounds(peg45Rect);
        peg45.draw(canvas);

        peg46Rect = new Rect(211, 355, 211 + pegWidth, 355 + pegWidth);
 	    peg46.setBounds(peg46Rect);
        peg46.draw(canvas);

        peg47Rect = new Rect(247, 355, 247 + pegWidth, 355 + pegWidth);
 	    peg47.setBounds(peg47Rect);
        peg47.draw(canvas);

        
        
        //line 8
        peg48Rect = new Rect(49, 391, 49 + pegWidth, 391 + pegWidth);
 	    peg48.setBounds(peg48Rect);
        peg48.draw(canvas);

        peg49Rect = new Rect(85, 391, 85 + pegWidth, 391 + pegWidth);
 	    peg49.setBounds(peg49Rect);
        peg49.draw(canvas);

        peg50Rect = new Rect(121, 391, 121 + pegWidth, 391 + pegWidth);
 	    peg50.setBounds(peg50Rect);
        peg50.draw(canvas);

        peg51Rect = new Rect(157, 391, 157 + pegWidth, 391 + pegWidth);
 	    peg51.setBounds(peg51Rect);
        peg51.draw(canvas);

        peg52Rect = new Rect(193, 391, 193 + pegWidth, 391 + pegWidth);
 	    peg52.setBounds(peg52Rect);
        peg52.draw(canvas);
        
        peg53Rect = new Rect(229, 391, 229 + pegWidth, 391 + pegWidth);
 	    peg53.setBounds(peg53Rect);
        peg53.draw(canvas);
        
        peg54Rect = new Rect(265, 391, 265 + pegWidth, 391 + pegWidth);
 	    peg54.setBounds(peg54Rect);
        peg54.draw(canvas);
        
     
		
        
        if (badCoper1Rect.intersect(peg1Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg2Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg3Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg4Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg5Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg6Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg7Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg8Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg9Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg10Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg12Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg13Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg15Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg16Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg17Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg18Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg19Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg20Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg21Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg22Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg23Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg24Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg25Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg26Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg27Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg28Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg30Rect)) {
        	moveChopper();	
        }else  if (badCoper1Rect.intersect(peg31Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg32Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg33Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg34Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg35Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg36Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg37Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg38Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg39Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg40Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg41Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg42Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg43Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg44Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg45Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg46Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg47Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg48Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg49Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg50Rect)) {
        	moveChopper();		
        }else  if (badCoper1Rect.intersect(peg51Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg52Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg53Rect)) {
        	moveChopper();
        }else  if (badCoper1Rect.intersect(peg54Rect)) {
        	moveChopper();
        }
		
    	
       /*//weapon power table
        if(badCoper1ExplodeIs != true){
        
			
			if(badCoper1Rect.contains((int)Bullet.hellfireX, (int)Bullet.hellfireY)){			
				setPOD(GameTable.hellfirePower);
				badCoperIsHit = true;
				badCoperIsHitPow = true;
				
			}else if(badCoper1Rect.contains((int)Bullet.m22X, (int)Bullet.m22Y)){			
				setPOD(GameTable.m22Power);	
				badCoperIsHit = true;
				badCoperIsHitPow = true;
				//Log.i(TAG, "weaponsDamage..........BadCoper class   " );
				//badCoperUpDateHitNum -= 1 + weaponsPower; // gui
			}else{
				badCoperIsHit = false;
				badCoperIsHitPow = false;
			}
			
		}*/
		
        
        
     
         	
   		
	 return;
	}
	
	public void moveChopper() { 
		if(rot > 2){
			badCoper1vy -= bounce;
           	}else{
           	//nothing
        }
		
		
   	 return;
    }


	public void updatebadCoper1(){
		
		if(GameView.GameState == "run"){
		
		badCoper1XPointer = badCoper1X;
		badCoper1YPointer = badCoper1Y;
		rot = rots;
		
		  //minigun.updateMiniGunBad();
		//explode1.updateExplode();

     /*	if(badCoperIsHitPow){
     	badCoperIsHitPow = false;
     	updatePlayerScore = true;
     	}else if(updatePlayerScore){
    	Player.playerPoints = Player.playerPoints + GameTable.badCoperPoints;
    	updatePlayerScore = false;
    	}
	
		
	 if(badCoper1ExplodeIs){
		explode1.explodeX = badCoper1X + badCoper1Width /2 - 100;
		explode1.explodeY = badCoper1Y + badCoper1Height /2 - 100;
		explode1.explodeDoDraw = true;
		explode1.explodeAlpha = 255;
		explode1.explode.start();
		explode1.explode.run();
		badCoper1Alpha -= GameTable.badCoper1Alpha;
		 if(badCoper1Alpha <= 0){
			 badCoper1Alpha = 0;
			explode1.explodeDoDraw = false;
			explode1.explodeAlpha = 0;
			explode1.explode.stop();
			reSpawn = true;
		 }
	 }else{
		  badCoper1Y += gravity;
		  badCoper1X += badCoper1vx;
          badCoper1Y += badCoper1vy;
          badCoper1vx *= friction;
          badCoper1vy *= friction;
          rot = (int) (Math.random() * 2 + 2);
	 }  
	 
	 
	 if(reSpawn){
	 		badCoper1X = Math.random() * 40 + 240;
	     	badCoper1Y = 10;
	     	badCoper1Alpha = 255;
	     	badCoper1HitNum = 0; 
	     	badCoper1ExplodeIs = false;
	     	reSpawn = false;
	     	
	 }
	 */
	
 	/*if(badCoper1ExplodeIs != true){
 		
     if(badCoperIsHit){
    		Log.i(TAG, "Hit..........   ");
    		
      	 badCoper1HitNum = badCoper1HitNum + getPOD(); //% change hit
     	Log.i(TAG, "badCoperIsHit.... " + badCoperIsHit);
     	
				Log.i(TAG, "badCoper1HitNum  " + badCoper1HitNum);
				
				if(badCoper1HitNum > GameTable.badCoper1Damage){
					badCoperIsHit  = false;
					badCoper1ExplodeIs = true;
					Log.i(TAG, "badCoper1ExplodeIs .................... " + badCoper1ExplodeIs);
					
				}
		
		}
 	}
 	*/
       
      
       // Log.i(TAG, "rot " + rot);
       	if(rot > 2){
       		badCoper1vx -= bounce;
           	}else{
           	badCoper1vx += bounce;
        }
       	
       
        
		
        if (badCoper1YPointer < -500 - 50) {
        	badCoper1vy -= areaBounce;
            //Log.i(TAG, "topTest " + topTest);
        }
        if (badCoper1YPointer > 400 - 50) {
        	badCoper1vy -= areaBounce; 
          //Log.i(TAG, "bottomTest " + bottomTest);
        }
        if (badCoper1XPointer > 320 - 50) {
        	badCoper1vx -= areaBounce;
           //Log.i(TAG, "rightTest " + rightTest);
        }
        if (badCoper1XPointer < 40 - 50) {
        	badCoper1vx += areaBounce;
           //Log.i(TAG, "leftTest " + leftTest); 
        }
     
        
       
        
   
        	
        	
        	
        	
        	//minGunFire = true;
        	
        	mbNumFire = Math.random() * 90 + 10;
        	//Log.i(TAG, "mbNumFire " + mbNumFire); 
        	
         	if(mbNumFire > 60.0){
         		minGunFire = true;
         		
         	}else{
         		//minGunFire = false;
         	}
        	
        	
        	if(minGunFire == true){
    			gBCoper1BulletX += gBCoper1BulletSpeedX;
    			gBCoper1BulletY += gBCoper1BulletSpeedY;
    			reloadgBCoper1 = false;
      		}else{
      			
      			gBCoper1Rot = gBCoper1Angle * gBCoper1radians;
      			gBCoper1Angle = Math.atan2(Player.playerPosY - badCoper1YPointer,Player.playerPosX - badCoper1XPointer);
      			gBCoper1BulletAngleHead = (gBCoper1Rot * 360 / Math.PI);
      			
      			
      			gBCoper1BulletX = badCoper1XPointer + badCoper1Width /2 - gBCoper1offSetX;
      	    	gBCoper1BulletY = badCoper1YPointer + badCoper1Height /2 + -gBCoper1offSetY;
      	    	
      			
      	   	}
    		
    		
    		
    		if(gBCoper1BulletY < -0){
      			reloadgBCoper1 = true;
      			
      		}
      		
      		if(gBCoper1BulletY > 480){
      			reloadgBCoper1 = true;
      		}
      		
      		if(gBCoper1BulletX > 300){
      			reloadgBCoper1 = true;	
      		}
      		
      		if(gBCoper1BulletX < -0){
      			reloadgBCoper1 = true;	
      		}
      		
      		if(reloadgBCoper1 == true){
      			firegBCoper1 = false;
      			reloadgBCoper1 = false;
      			reloadgBCoper1();
      			
      		}
      		
        	
		}//run	
	
	 return;	
	}

	

	public void reloadgBCoper1(){
		minGunFire = false;
		
		gBCoper1BulletX = badCoper1XPointer + badCoper1Width /2 - gBCoper1offSetX;
	    gBCoper1BulletY = badCoper1YPointer + badCoper1Height /2 + -gBCoper1offSetY;
		
		gBCoper1BulletHeading = Math.atan2(Player.playerPosY - badCoper1YPointer,Player.playerPosX - badCoper1XPointer);
		gBCoper1BulletSpeedX = Math.cos(gBCoper1BulletHeading) * gBCoper1BulletSpeed;
		gBCoper1BulletSpeedY = Math.sin(gBCoper1BulletHeading) * gBCoper1BulletSpeed;
		

		gBCoper1BulletDX = (Player.playerPosX + Player.playerWidth /2)- (gBCoper1BulletX + gBCoper1BulletWidth /2);
		gBCoper1BulletDY = (Player.playerPosY  + Player.playerHeight /2) - (gBCoper1BulletY + gBCoper1BulletHeight /2);
		gBCoper1BulletAngleRot = Math.atan2(gBCoper1BulletDX,gBCoper1BulletDY);
		gBCoper1BulletAngleHead = gBCoper1BulletAngleRot * 180 / Math.PI;
		
		
	
	return;	
	}
	
	
	public static void upDateCoper1(){
	 
		 badCoper1Y += GameTable.badCoper1Gravity;
		 badCoper1X += badCoper1vx;
		 badCoper1Y += badCoper1vy;
		 badCoper1vx *= GameTable.badCoper1friction;
		 badCoper1vy *= GameTable.badCoper1friction;
		 rots = (int) (Math.random() * 2 + 2);
		
		return;
	}
	
	
	//power of destruction 
	public void setPOD(int wep){
		
		//Log.i(TAG, "weaponsDamage..........   " + wep );
		
		switch(wep){
		case 1 :
			weaponsDamage = wep; 
		
		break;
		
		case 2 :
			weaponsDamage = wep; 
		break;	
		
		case 3 :
			weaponsDamage = wep; 
		break;	
		
		case 4 :
			weaponsDamage = wep; 
		break;	
		
		case 5 :
			weaponsDamage = wep; 
		break;	
		
		case 6 :
			weaponsDamage = wep; 
		break;	
		
		case 7 :
			weaponsDamage = wep; 
		break;	
		
		case 100 :
			weaponsDamage = wep; 
		break;	
		
		case 200 :
			weaponsDamage = wep; 
		break;	
		
		
		}
		 
	return;		
	}

	public int getPOD(){
	return weaponsDamage; 
	}



 
	
}
