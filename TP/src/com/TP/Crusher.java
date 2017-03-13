package com.TP;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class Crusher {
	public static final String TAG = "moto";
	
	public static int targetNum;
	public static boolean onStart = false;
	public static boolean autoTargetOn = true;
	
	public Drawable crusher;
	public Drawable cGun1;
	public Drawable cGun2;
	public Drawable cGun3;
	public Drawable cGun4;
	public Drawable cGun5;
	
	public Drawable sGun1;
	public Drawable sGun2;
	public Drawable sGun3;
	public Drawable sGun4;
	public Drawable sGun5;
	public Drawable sGun6;
	public Drawable sGun7;
	public Drawable sGun8;
	public Drawable sGun9;
	public Drawable sGun10;
	public Drawable sGun11;
	
	public Bitmap bitmapcGun1;
	public Bitmap bitmapcGun2;
	public Bitmap bitmapcGun3;
	public Bitmap bitmapcGun4;
	public Bitmap bitmapcGun5;

	
	public Bitmap bitmapsGun1;
	public Bitmap bitmapsGun2;
	public Bitmap bitmapsGun3;
	public Bitmap bitmapsGun4;
	public Bitmap bitmapsGun5;
	public Bitmap bitmapsGun6;
	public Bitmap bitmapsGun7;
	public Bitmap bitmapsGun8;
	public Bitmap bitmapsGun9;
	public Bitmap bitmapsGun10;
	public Bitmap bitmapsGun11;
	
	public Bitmap bitmapcGun1Death;
	public Bitmap bitmapcGun2Death;
	public Bitmap bitmapcGun3Death;
	public Bitmap bitmapcGun4Death;
	public Bitmap bitmapcGun5Death;
	
	public Bitmap bitmapsGun1Death;
	public Bitmap bitmapsGun2Death;
	public Bitmap bitmapsGun3Death;
	public Bitmap bitmapsGun4Death;
	public Bitmap bitmapsGun5Death;
	public Bitmap bitmapsGun6Death;
	public Bitmap bitmapsGun7Death;
	public Bitmap bitmapsGun8Death;
	public Bitmap bitmapsGun9Death;
	public Bitmap bitmapsGun10Death;
	public Bitmap bitmapsGun11Death;
	
	public Bitmap bitmapcGun1Hit;
	public Bitmap bitmapcGun2Hit;
	public Bitmap bitmapcGun3Hit;
	public Bitmap bitmapcGun4Hit;
	public Bitmap bitmapcGun5Hit;
	
	public Bitmap bitmapsGun1Hit;
	public Bitmap bitmapsGun2Hit;
	public Bitmap bitmapsGun3Hit;
	public Bitmap bitmapsGun4Hit;
	public Bitmap bitmapsGun5Hit;
	public Bitmap bitmapsGun6Hit;
	public Bitmap bitmapsGun7Hit;
	public Bitmap bitmapsGun8Hit;
	public Bitmap bitmapsGun9Hit;
	public Bitmap bitmapsGun10Hit;
	public Bitmap bitmapsGun11Hit;
	
	public double crusherX = 0;
	public double crusherY = 0;
	
	public static double cGun1X = 0;
	public static double cGun1Y = 0;
	public static double cGun1Z = 0;

	public static double cGun2X = 0;
	public static double cGun2Y = 0;
	public static double cGun2Z = 0;

	public static double cGun3X = 0;
	public static double cGun3Y = 0;
	public static double cGun3Z = 0;
	
	public static double cGun4X = 0;
	public static double cGun4Y = 0;
	public static double cGun4Z = 0;
	
	public static double cGun5X = 0;
	public static double cGun5Y = 0;
	public double cGun5Z = 0;
	
	public static double sGun1X = 0;
	public static double sGun1Y = 0;
	public static double sGun1Z = 0;
	
	public static double sGun2X = 0;
	public static double sGun2Y = 0;
	public static double sGun2Z = 0;
	
	public static double sGun3X = 0;
	public static double sGun3Y = 0;
	public static double sGun3Z = 0;
	
	public static double sGun4X = 0;
	public static double sGun4Y = 0;
	public static double sGun4Z = 0;
	
	public static double sGun5X = 0;
	public static double sGun5Y = 0;
	public static double sGun5Z = 0;
	
	public static double sGun6X = 0;
	public static double sGun6Y = 0;
	public static double sGun6Z = 0;
	
	public static double sGun7X = 0;
	public static double sGun7Y = 0;
	public static double sGun7Z = 0;
	
	public static double sGun8X = 0;
	public static double sGun8Y = 0;
	public static double sGun8Z = 0;
	
	public static double sGun9X = 0;
	public static double sGun9Y = 0;
	public static double sGun9Z = 0;
	
	public static double sGun10X = 0;
	public static double sGun10Y = 0;
	public static double sGun10Z = 0;
	
	public static double sGun11X = 0;
	public static double sGun11Y = 0;
	public static double sGun11Z = 0;

	public static Rect crusherRect;
	public static Rect cGun1Rect;
	public static Rect cGun2Rect;
	public static Rect cGun3Rect;
	public static Rect cGun4Rect;
	public static Rect cGun5Rect;
	
	public static Rect sGun1Rect;
	public static Rect sGun2Rect;
	public static Rect sGun3Rect;
	public static Rect sGun4Rect;
	public static Rect sGun5Rect;
	public static Rect sGun6Rect;
	public static Rect sGun7Rect;
	public static Rect sGun8Rect;
	public static Rect sGun9Rect;
	public static Rect sGun10Rect;
	public static Rect sGun11Rect;
	
	
	public static boolean cGun1Hit;
	public static boolean cGun2Hit;
	public static boolean cGun3Hit;
	public static boolean cGun4Hit;
	public static boolean cGun5Hit;
	
	public static boolean sGun1Hit;
	public static boolean sGun2Hit;
	public static boolean sGun3Hit;
	public static boolean sGun4Hit;
	public static boolean sGun5Hit;
	public static boolean sGun6Hit;
	public static boolean sGun7Hit;
	public static boolean sGun8Hit;
	public static boolean sGun9Hit;
	public static boolean sGun10Hit;
	public static boolean sGun11Hit;
	
	public static boolean cGun1HitExplode;
	public static boolean cGun2HitExplode;
	public static boolean cGun3HitExplode;
	public static boolean cGun4HitExplode;
	public static boolean cGun5HitExplode;
	
	public static boolean sGun1HitExplode;
	public static boolean sGun2HitExplode;
	public static boolean sGun3HitExplode;
	public static boolean sGun4HitExplode;
	public static boolean sGun5HitExplode;
	public static boolean sGun6HitExplode;
	public static boolean sGun7HitExplode;
	public static boolean sGun8HitExplode;
	public static boolean sGun9HitExplode;
	public static boolean sGun10HitExplode;
	public static boolean sGun11HitExplode;
	
	
	public static int cGun1HitNum;
	public static int cGun2HitNum;
	public static int cGun3HitNum;
	public static int cGun4HitNum;
	public static int cGun5HitNum;
	
	public static int sGun1HitNum;
	public static int sGun2HitNum;
	public static int sGun3HitNum;
	public static int sGun4HitNum;
	public static int sGun5HitNum;
	public static int sGun6HitNum;
	public static int sGun7HitNum;
	public static int sGun8HitNum;
	public static int sGun9HitNum;
	public static int sGun10HitNum;
	public static int sGun11HitNum;
	
	

	public static double crusherWidth = 140;
	public static double crusherHeight = 680;
	
	public static double cGun1Width = 50;
	public static double cGun1Height = 50;
	
	public static double cGun2Width = 50;
	public static double cGun2Height = 50;
	
	public static double cGun3Width = 50;
	public static double cGun3Height = 50;
	
	public static double cGun4Width = 50;
	public static double cGun4Height = 50;
	
	public static double cGun5Width = 50;
	public static double cGun5Height = 50;
	

	public static double sGun1Width = 20;
	public static double sGun1Height = 20;
	
	public static double sGun2Width = 20;
	public static double sGun2Height = 20;
	
	public static double sGun3Width = 20;
	public static double sGun3Height = 20;
	
	public static double sGun4Width = 20;
	public static double sGun4Height = 20;
	
	public static double sGun5Width = 20;
	public static double sGun5Height = 20;
	
	public static double sGun6Width = 20;
	public static double sGun6Height = 20;
	
	public static double sGun7Width = 20;
	public static double sGun7Height = 20;
	
	public static double sGun8Width = 20;
	public static double sGun8Height = 20;
	
	public static double sGun9Width = 20;
	public static double sGun9Height = 20;
	
	public static double sGun10Width = 20;
	public static double sGun10Height = 20;
	
	public static double sGun11Width = 20;
	public static double sGun11Height = 20;
	
	
	
	public double crusherSpeed;
	public int crusherAlpha = 255;
	
	private static double cGun1Rot;
	private static double cGun2Rot;
	private static double cGun3Rot;
	private static double cGun4Rot;
	private static double cGun5Rot;
	
	private static double sGun1Rot;
	private static double sGun2Rot;
	private static double sGun3Rot;
	private static double sGun4Rot;
	private static double sGun5Rot;
	private static double sGun6Rot;
	private static double sGun7Rot;
	private static double sGun8Rot;
	private static double sGun9Rot;
	private static double sGun10Rot;
	private static double sGun11Rot;
	
	
	
	public static double cGun1Heading;
	public static double cGun2Heading;
	public static double cGun3Heading;
	public static double cGun4Heading;
	public static double cGun5Heading;
	
	public static double sGun1Heading;
	public static double sGun2Heading;
	public static double sGun3Heading;
	public static double sGun4Heading;
	public static double sGun5Heading;
	public static double sGun6Heading;
	public static double sGun7Heading;
	public static double sGun8Heading;
	public static double sGun9Heading;
	public static double sGun10Heading;
	public static double sGun11Heading;
	
	public double radians; 
	
	private Resources res;
	//private boolean updatePlayerScore = false;
	
	public static float upDateBossHitNum;
	public static float weaponsPower;
	
	public int weaponsDamage;

	
	public Crusher(){
		
	upDateBossHitNum = 88.5f;
	
	crusherX = 90;
	crusherY = -3634;
	
	cGun1X = crusherX +42.1;
	cGun1Y = crusherY +133.1;
	
	cGun2X = crusherX +42.1;
	cGun2Y = crusherY +442.4;
	
	cGun3X = crusherX +42.1;
	cGun3Y = crusherY +487.4;
	
	cGun4X = crusherX +42.1;
	cGun4Y = crusherY +542.0;
	
	cGun5X = crusherX +42.1;
	cGun5Y = crusherY +586.3;
	
	
	
	
	sGun1X = crusherX +32.3;
	sGun1Y = crusherY +295.2;
	
	sGun2X = crusherX +82.0;
	sGun2Y = crusherY +295.2;
	
	sGun3X = crusherX +79.5;
	sGun3Y = crusherY +386.6;
	
	sGun4X = crusherX +35.8;
	sGun4Y = crusherY +386.6;
	
	sGun5X = crusherX +77.3;
	sGun5Y = crusherY +412.1;
	
	sGun6X = crusherX +38.8;
	sGun6Y = crusherY +412.1;
	
	sGun7X = crusherX +46.0;
	sGun7Y = crusherY +428.4;
	
	sGun8X = crusherX +69.0;
	sGun8Y = crusherY +428.4;
	
	sGun9X = crusherX +86.5;
	sGun9Y = crusherY +461.9;
	
	sGun10X = crusherX +30.0;
	sGun10Y = crusherY +461.9;
	
	sGun11X = crusherX +57.5;
	sGun11Y = crusherY +631.2;
	
	
	cGun1Heading = 0;
	cGun2Heading = 0;
	cGun3Heading = 0;
	cGun4Heading = 0;
	cGun5Heading = 0;
	
	sGun1Heading = 0;
	sGun2Heading = 0;
	sGun3Heading = 0;
	sGun4Heading = 0;
	sGun5Heading = 0;
	sGun6Heading = 0;
	sGun7Heading = 0;
	sGun8Heading = 0;
	sGun9Heading = 0;
	sGun10Heading = 0;
	sGun11Heading = 0;
	
	cGun1Hit = false;
	cGun2Hit = false;
	cGun3Hit = false;
	cGun4Hit = false;
	cGun5Hit = false;
	
	sGun1Hit = false;
	sGun2Hit = false;
	sGun3Hit = false;
	sGun4Hit = false;
	sGun5Hit = false;
	sGun6Hit = false;
	sGun7Hit = false;
	sGun8Hit = false;
	sGun9Hit = false;
	sGun10Hit = false;
	sGun11Hit = false;
	
	cGun1HitNum = 0;
	cGun2HitNum = 0;
	cGun3HitNum = 0;
	cGun4HitNum = 0;
	cGun5HitNum = 0;
	
	sGun1HitNum = 0;
	sGun2HitNum = 0;
	sGun3HitNum = 0;
	sGun4HitNum = 0;
	sGun5HitNum = 0;
	sGun6HitNum = 0;
	sGun7HitNum = 0;
	sGun8HitNum = 0;
	sGun9HitNum = 0;
	sGun10HitNum = 0;
	sGun11HitNum = 0;
	
	weaponsPower = +3; // add wep
	weaponsDamage = 0;
	
	
	
	
		
	}
	
	
	public void buildCrusher(Context context){
		res = context.getResources();
		
		crusher = context.getResources().getDrawable(R.drawable.crusher);
		
		bitmapcGun1 = BitmapFactory.decodeResource(res,R.drawable.crushergun); 
		bitmapcGun2 = BitmapFactory.decodeResource(res,R.drawable.crushergun);
		bitmapcGun3 = BitmapFactory.decodeResource(res,R.drawable.crushergun);
		bitmapcGun4 = BitmapFactory.decodeResource(res,R.drawable.crushergun);
		bitmapcGun5 = BitmapFactory.decodeResource(res,R.drawable.crushergun);

		
		bitmapcGun1Death = BitmapFactory.decodeResource(res,R.drawable.crushergundead);
		bitmapcGun2Death = BitmapFactory.decodeResource(res,R.drawable.crushergundead);
		bitmapcGun3Death = BitmapFactory.decodeResource(res,R.drawable.crushergundead);
		bitmapcGun4Death = BitmapFactory.decodeResource(res,R.drawable.crushergundead);
		bitmapcGun5Death = BitmapFactory.decodeResource(res,R.drawable.crushergundead);
		
		bitmapcGun1Hit = BitmapFactory.decodeResource(res,R.drawable.crushergunhit);
		bitmapcGun2Hit = BitmapFactory.decodeResource(res,R.drawable.crushergunhit);
		bitmapcGun3Hit = BitmapFactory.decodeResource(res,R.drawable.crushergunhit);
		bitmapcGun4Hit = BitmapFactory.decodeResource(res,R.drawable.crushergunhit);
		bitmapcGun5Hit = BitmapFactory.decodeResource(res,R.drawable.crushergunhit);
		
		
		
		
		bitmapsGun1 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun2 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun3 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun4 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun5 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun6 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun7 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun8 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun9 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun10 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
		bitmapsGun11 = BitmapFactory.decodeResource(res,R.drawable.crushersmallgun); 
	
		bitmapsGun1Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun2Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun3Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun4Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun5Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun6Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun7Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun8Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun9Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun10Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		bitmapsGun11Death = BitmapFactory.decodeResource(res,R.drawable.crushersmallgundead);
		
		bitmapsGun1Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun2Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun3Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun4Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun5Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun6Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun7Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun8Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun9Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun10Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
		bitmapsGun11Hit = BitmapFactory.decodeResource(res,R.drawable.crushersmallgunhit);
	
		
		//bitmapcGun5 = Bitmap.createScaledBitmap(bitmapcGun5, 50, 50, true);
		//newGun5 = Bitmap.createBitmap(bitmapcGun5, 0, 0, 50, 50, cGun5Rot, true);
		
		cGun1 = context.getResources().getDrawable(R.drawable.boxcollider);
		cGun2 = context.getResources().getDrawable(R.drawable.boxcollider);
		cGun3 = context.getResources().getDrawable(R.drawable.boxcollider);
		cGun4 = context.getResources().getDrawable(R.drawable.boxcollider);
		cGun5 = context.getResources().getDrawable(R.drawable.boxcollider);
		
		sGun1 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun2 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun3 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun4 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun5 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun6 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun7 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun8 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun9 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun10 = context.getResources().getDrawable(R.drawable.boxcollider);
		sGun11 = context.getResources().getDrawable(R.drawable.boxcollider);
		
		
		
		return;
	}
	
	public void crusherDoDraw(Canvas canvas){
		
		crusherRect = new Rect((int)crusherX,(int)crusherY,(int)crusherX + (int)crusherWidth, (int)crusherY + (int)crusherHeight);
		crusherRect.centerX();
		crusherRect.centerY();
		crusher.setBounds(crusherRect);
		crusher.draw(canvas);
		
		cGun1Rect = new Rect((int)cGun1X,(int)cGun1Y,(int)cGun1X + (int)cGun1Width, (int)cGun1Y + (int)cGun1Height);
		cGun1Rect.centerX();
		cGun1Rect.centerY();
		cGun1.setBounds(cGun1Rect);
		cGun1.draw(canvas);
		
		cGun2Rect = new Rect((int)cGun2X,(int)cGun2Y,(int)cGun2X + (int)cGun2Width, (int)cGun2Y + (int)cGun2Height);
		cGun2Rect.centerX();
		cGun2Rect.centerY();
		cGun2.setBounds(cGun2Rect);
		cGun2.draw(canvas);
		
		cGun3Rect = new Rect((int)cGun3X,(int)cGun3Y,(int)cGun3X + (int)cGun3Width, (int)cGun3Y + (int)cGun3Height);
		cGun3Rect.centerX();
		cGun3Rect.centerY();
		cGun3.setBounds(cGun3Rect);
		cGun3.draw(canvas);
		
		cGun4Rect = new Rect((int)cGun4X,(int)cGun4Y,(int)cGun4X + (int)cGun4Width, (int)cGun4Y + (int)cGun4Height);
		cGun4Rect.centerX();
		cGun4Rect.centerY();
		cGun4.setBounds(cGun4Rect);
		cGun4.draw(canvas);
		
		cGun5Rect = new Rect((int)cGun5X,(int)cGun5Y,(int)cGun5X + (int)cGun5Width, (int)cGun5Y + (int)cGun5Height);
		cGun5Rect.centerX();
		cGun5Rect.centerY();
		cGun5.setBounds(cGun5Rect);
		cGun5.draw(canvas);
		
		
		
		
		sGun1Rect = new Rect((int)sGun1X,(int)sGun1Y,(int)sGun1X + (int)sGun1Width, (int)sGun1Y + (int)sGun1Height);
		sGun1Rect.centerX();
		sGun1Rect.centerY();
		sGun1.setBounds(sGun1Rect);
		sGun1.draw(canvas);
		
		sGun2Rect = new Rect((int)sGun2X,(int)sGun2Y,(int)sGun2X + (int)sGun2Width, (int)sGun2Y + (int)sGun2Height);
		sGun2Rect.centerX();
		sGun2Rect.centerY();
		sGun2.setBounds(sGun2Rect);
		sGun2.draw(canvas);
		
		sGun3Rect = new Rect((int)sGun3X,(int)sGun3Y,(int)sGun3X + (int)sGun3Width, (int)sGun3Y + (int)sGun3Height);
		sGun3Rect.centerX();
		sGun3Rect.centerY();
		sGun3.setBounds(sGun3Rect);
		sGun3.draw(canvas);
		
		sGun4Rect = new Rect((int)sGun4X,(int)sGun4Y,(int)sGun4X + (int)sGun4Width, (int)sGun4Y + (int)sGun4Height);
		sGun4Rect.centerX();
		sGun4Rect.centerY();
		sGun4.setBounds(sGun4Rect);
		sGun4.draw(canvas);
		
		sGun5Rect = new Rect((int)sGun5X,(int)sGun5Y,(int)sGun5X + (int)sGun5Width, (int)sGun5Y + (int)sGun5Height);
		sGun5Rect.centerX();
		sGun5Rect.centerY();
		sGun5.setBounds(sGun5Rect);
		sGun5.draw(canvas);
		
		sGun6Rect = new Rect((int)sGun6X,(int)sGun6Y,(int)sGun6X + (int)sGun6Width, (int)sGun6Y + (int)sGun6Height);
		sGun6Rect.centerX();
		sGun6Rect.centerY();
		sGun6.setBounds(sGun6Rect);
		sGun6.draw(canvas);
		
		sGun7Rect = new Rect((int)sGun7X,(int)sGun7Y,(int)sGun7X + (int)sGun7Width, (int)sGun7Y + (int)sGun7Height);
		sGun7Rect.centerX();
		sGun7Rect.centerY();
		sGun7.setBounds(sGun7Rect);
		sGun7.draw(canvas);
		
		sGun8Rect = new Rect((int)sGun8X,(int)sGun8Y,(int)sGun8X + (int)sGun8Width, (int)sGun8Y + (int)sGun8Height);
		sGun8Rect.centerX();
		sGun8Rect.centerY();
		sGun8.setBounds(sGun8Rect);
		sGun8.draw(canvas);
		
		sGun9Rect = new Rect((int)sGun9X,(int)sGun9Y,(int)sGun9X + (int)sGun9Width, (int)sGun9Y + (int)sGun9Height);
		sGun9Rect.centerX();
		sGun9Rect.centerY();
		sGun9.setBounds(sGun9Rect);
		sGun9.draw(canvas);
		
		sGun10Rect = new Rect((int)sGun10X,(int)sGun10Y,(int)sGun10X + (int)sGun10Width, (int)sGun10Y + (int)sGun10Height);
		sGun10Rect.centerX();
		sGun10Rect.centerY();
		sGun10.setBounds(sGun10Rect);
		sGun10.draw(canvas);
		
		sGun11Rect = new Rect((int)sGun11X,(int)sGun11Y,(int)sGun11X + (int)sGun11Width, (int)sGun11Y + (int)sGun11Height);
		sGun11Rect.centerX();
		sGun11Rect.centerY();
		sGun11.setBounds(sGun11Rect);
		sGun11.draw(canvas);
		
	
		if(cGun1Hit){
		canvas.save();
		canvas.rotate((float) -cGun1Heading, (float)cGun1X + (float)cGun1Width /2 , (float) cGun1Y + (float)cGun1Height /2);
		canvas.drawBitmap(bitmapcGun1Hit, (int)cGun1X, (int)cGun1Y, null);
		}else if(cGun1HitExplode){
		canvas.drawBitmap(bitmapcGun1Death, (int)cGun1X, (int)cGun1Y, null);
		}else{
		canvas.rotate((float) -cGun1Heading, (float)cGun1X + (float)cGun1Width /2 , (float) cGun1Y + (float)cGun1Height /2);
		canvas.drawBitmap(bitmapcGun1, (int)cGun1X, (int)cGun1Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(cGun2Hit){
		canvas.rotate((float) -cGun2Heading, (float)cGun2X + (float)cGun2Width /2 , (float) cGun2Y + (float)cGun2Height /2);
		canvas.drawBitmap(bitmapcGun2Hit, (int)cGun2X, (int)cGun2Y, null);
		}else if(cGun2HitExplode){
		canvas.drawBitmap(bitmapcGun2Death, (int)cGun2X, (int)cGun2Y, null);
		}else{
		canvas.rotate((float) -cGun2Heading, (float)cGun2X + (float)cGun2Width /2 , (float) cGun2Y + (float)cGun2Height /2);
		canvas.drawBitmap(bitmapcGun2, (int)cGun2X, (int)cGun2Y, null);
		}	
		canvas.restore();
		
		canvas.save();
		if(cGun3Hit){
		canvas.rotate((float) -cGun3Heading, (float)cGun3X + (float)cGun3Width /2 , (float) cGun3Y + (float)cGun3Height /2);
		canvas.drawBitmap(bitmapcGun3Hit, (int)cGun3X, (int)cGun3Y, null);
		}else if(cGun3HitExplode){
		canvas.drawBitmap(bitmapcGun3Death, (int)cGun3X, (int)cGun3Y, null);
		}else{
		canvas.rotate((float) -cGun3Heading, (float)cGun3X + (float)cGun3Width /2 , (float) cGun3Y + (float)cGun3Height /2);
		canvas.drawBitmap(bitmapcGun3, (int)cGun3X, (int)cGun3Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(cGun4Hit){
		canvas.rotate((float) -cGun4Heading, (float)cGun4X + (float)cGun4Width /2 , (float) cGun4Y + (float)cGun4Height /2);
		canvas.drawBitmap(bitmapcGun4Hit, (int)cGun4X, (int)cGun4Y, null);
		}else if(cGun4HitExplode){
		canvas.drawBitmap(bitmapcGun4Death, (int)cGun4X, (int)cGun4Y, null);
		}else{
		canvas.rotate((float) -cGun4Heading, (float)cGun4X + (float)cGun4Width /2 , (float) cGun4Y + (float)cGun4Height /2);
		canvas.drawBitmap(bitmapcGun4, (int)cGun4X, (int)cGun4Y, null);
		}	
		canvas.restore();
		
		canvas.save();
		if(cGun5Hit){
		canvas.rotate((float) -cGun5Heading, (float)cGun5X + (float)cGun5Width /2 , (float) cGun5Y + (float)cGun5Height /2);
		canvas.drawBitmap(bitmapcGun5Hit, (int)cGun5X, (int)cGun5Y, null);	
		}else if(cGun5HitExplode){
		canvas.drawBitmap(bitmapcGun5Death, (int)cGun5X, (int)cGun5Y, null);
		}else{
		canvas.rotate((float) -cGun5Heading, (float)cGun5X + (float)cGun5Width /2 , (float) cGun5Y + (float)cGun5Height /2);
		canvas.drawBitmap(bitmapcGun5, (int)cGun5X, (int)cGun5Y, null);
		}
		canvas.restore();
		
		
		
		
		canvas.save();
		if(sGun1Hit){
		canvas.rotate((float) -sGun1Heading, (float)sGun1X + (float)sGun1Width /2 , (float) sGun1Y + (float)sGun1Height /2);
		canvas.drawBitmap(bitmapsGun1Hit, (int)sGun1X, (int)sGun1Y, null);
		}else if(sGun1HitExplode){
		canvas.drawBitmap(bitmapsGun1Death, (int)sGun1X, (int)sGun1Y, null);
		}else{
		canvas.rotate((float) -sGun1Heading, (float)sGun1X + (float)sGun1Width /2 , (float) sGun1Y + (float)sGun1Height /2);
		canvas.drawBitmap(bitmapsGun1, (int)sGun1X, (int)sGun1Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun2Hit){
		canvas.rotate((float) -sGun2Heading, (float)sGun2X + (float)sGun2Width /2 , (float) sGun2Y + (float)sGun2Height /2);
		canvas.drawBitmap(bitmapsGun2Hit, (int)sGun2X, (int)sGun2Y, null);
		}else if(sGun2HitExplode){
		canvas.drawBitmap(bitmapsGun2Death, (int)sGun2X, (int)sGun2Y, null);
		}else{
		canvas.rotate((float) -sGun2Heading, (float)sGun2X + (float)sGun2Width /2 , (float) sGun2Y + (float)sGun2Height /2);
		canvas.drawBitmap(bitmapsGun2, (int)sGun2X, (int)sGun2Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun3Hit){
		canvas.rotate((float) -sGun3Heading, (float)sGun3X + (float)sGun3Width /2 , (float) sGun3Y + (float)sGun3Height /2);
		canvas.drawBitmap(bitmapsGun3Hit, (int)sGun3X, (int)sGun3Y, null);
		}else if(sGun3HitExplode){
		canvas.drawBitmap(bitmapsGun3Death, (int)sGun3X, (int)sGun3Y, null);
		}else{
		canvas.rotate((float) -sGun3Heading, (float)sGun3X + (float)sGun3Width /2 , (float) sGun3Y + (float)sGun3Height /2);
		canvas.drawBitmap(bitmapsGun3, (int)sGun3X, (int)sGun3Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun4Hit){
		canvas.rotate((float) -sGun4Heading, (float)sGun4X + (float)sGun4Width /2 , (float) sGun4Y + (float)sGun4Height /2);
		canvas.drawBitmap(bitmapsGun4Hit, (int)sGun4X, (int)sGun4Y, null);
		}else if(sGun4HitExplode){
		canvas.drawBitmap(bitmapsGun4Death, (int)sGun4X, (int)sGun4Y, null);
		}else{
		canvas.rotate((float) -sGun4Heading, (float)sGun4X + (float)sGun4Width /2 , (float) sGun4Y + (float)sGun4Height /2);
		canvas.drawBitmap(bitmapsGun4, (int)sGun4X, (int)sGun4Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun5Hit){
		canvas.rotate((float) -sGun5Heading, (float)sGun5X + (float)sGun5Width /2 , (float) sGun5Y + (float)sGun5Height /2);
		canvas.drawBitmap(bitmapsGun5Hit, (int)sGun5X, (int)sGun5Y, null);
		}else if(sGun5HitExplode){
		canvas.drawBitmap(bitmapsGun5Death, (int)sGun5X, (int)sGun5Y, null);
		}else{
		canvas.rotate((float) -sGun5Heading, (float)sGun5X + (float)sGun5Width /2 , (float) sGun5Y + (float)sGun5Height /2);
		canvas.drawBitmap(bitmapsGun5, (int)sGun5X, (int)sGun5Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun6Hit){
		canvas.rotate((float) -sGun6Heading, (float)sGun6X + (float)sGun6Width /2 , (float) sGun6Y + (float)sGun6Height /2);
		canvas.drawBitmap(bitmapsGun6Hit, (int)sGun6X, (int)sGun6Y, null);
		}else if(sGun6HitExplode){
		canvas.drawBitmap(bitmapsGun6Death, (int)sGun6X, (int)sGun6Y, null);
		}else{
		canvas.rotate((float) -sGun6Heading, (float)sGun6X + (float)sGun6Width /2 , (float) sGun6Y + (float)sGun6Height /2);
		canvas.drawBitmap(bitmapsGun6, (int)sGun6X, (int)sGun6Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun7Hit){
		canvas.rotate((float) -sGun7Heading, (float)sGun7X + (float)sGun7Width /2 , (float) sGun7Y + (float)sGun7Height /2);
		canvas.drawBitmap(bitmapsGun7Hit, (int)sGun7X, (int)sGun7Y, null);
		}else if(sGun7HitExplode){
		canvas.drawBitmap(bitmapsGun7Death, (int)sGun7X, (int)sGun7Y, null);
		}else{
		canvas.rotate((float) -sGun7Heading, (float)sGun7X + (float)sGun7Width /2 , (float) sGun7Y + (float)sGun7Height /2);
		canvas.drawBitmap(bitmapsGun7, (int)sGun7X, (int)sGun7Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun8Hit){
		canvas.rotate((float) -sGun8Heading, (float)sGun8X + (float)sGun8Width /2 , (float) sGun8Y + (float)sGun8Height /2);
		canvas.drawBitmap(bitmapsGun8Hit, (int)sGun8X, (int)sGun8Y, null);
		}else if(sGun8HitExplode){
		canvas.drawBitmap(bitmapsGun8Death, (int)sGun8X, (int)sGun8Y, null);
		}else{
		canvas.rotate((float) -sGun8Heading, (float)sGun8X + (float)sGun8Width /2 , (float) sGun8Y + (float)sGun8Height /2);
		canvas.drawBitmap(bitmapsGun8, (int)sGun8X, (int)sGun8Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun9Hit){
		canvas.rotate((float) -sGun9Heading, (float)sGun9X + (float)sGun9Width /2 , (float) sGun9Y + (float)sGun9Height /2);
		canvas.drawBitmap(bitmapsGun9Hit, (int)sGun9X, (int)sGun9Y, null);
		}else if(sGun9HitExplode){
		canvas.drawBitmap(bitmapsGun9Death, (int)sGun9X, (int)sGun9Y, null);
		}else{
		canvas.rotate((float) -sGun9Heading, (float)sGun9X + (float)sGun9Width /2 , (float) sGun9Y + (float)sGun9Height /2);
		canvas.drawBitmap(bitmapsGun9, (int)sGun9X, (int)sGun9Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun10Hit){
		canvas.rotate((float) -sGun10Heading, (float)sGun10X + (float)sGun10Width /2 , (float) sGun10Y + (float)sGun10Height /2);
		canvas.drawBitmap(bitmapsGun10Hit, (int)sGun10X, (int)sGun10Y, null);
		}else if(sGun10HitExplode){
		canvas.drawBitmap(bitmapsGun10Death, (int)sGun10X, (int)sGun10Y, null);
		}else{
		canvas.rotate((float) -sGun10Heading, (float)sGun10X + (float)sGun10Width /2 , (float) sGun10Y + (float)sGun10Height /2);
		canvas.drawBitmap(bitmapsGun10, (int)sGun10X, (int)sGun10Y, null);
		}
		canvas.restore();
		
		canvas.save();
		if(sGun11Hit){
		canvas.rotate((float) -sGun11Heading, (float)sGun11X + (float)sGun11Width /2 , (float) sGun11Y + (float)sGun11Height /2);
		canvas.drawBitmap(bitmapsGun11Hit, (int)sGun11X, (int)sGun11Y, null);
		}else if(sGun11HitExplode){
		canvas.drawBitmap(bitmapsGun11Death, (int)sGun11X, (int)sGun11Y, null);
		}else{
		canvas.rotate((float) -sGun11Heading, (float)sGun11X + (float)sGun11Width /2 , (float) sGun11Y + (float)sGun11Height /2);
		canvas.drawBitmap(bitmapsGun11, (int)sGun11X, (int)sGun11Y, null);
		}
		canvas.restore();
		
	
		
		
		
		
		return;
	}

	
	
	public void updateCrusher(){
		
		
		if(GameView.GameState == "run"){
			
			
		
			
		//on start up
		if(Player.playerPosY < GameView.screenSyncUp){
			onStart = true;  
		}
		
		if(GameView.mBackgroundPosY == -GameView.offSetBackgroudHeight){
			onStart = false;  
		}
		
		
		
		
		
		
			
if(onStart){
			
	   if(GameMain.reverceControlls){	
			
			
			  if(Player.playerPosY > GameView.screenSyncDown){//down
				  crusherY += Maps.backgroundSpeed;
		    		cGun1Y += Maps.backgroundSpeed;
		    		cGun2Y += Maps.backgroundSpeed;
		    		cGun3Y += Maps.backgroundSpeed;
		    		cGun4Y += Maps.backgroundSpeed;
		    		cGun5Y += Maps.backgroundSpeed;
		    		
		    		sGun1Y += Maps.backgroundSpeed;
		    		sGun2Y += Maps.backgroundSpeed;
		    		sGun3Y += Maps.backgroundSpeed;
		    		sGun4Y += Maps.backgroundSpeed;
		    		sGun5Y += Maps.backgroundSpeed;
		    		sGun6Y += Maps.backgroundSpeed;
		    		sGun7Y += Maps.backgroundSpeed;
		    		sGun8Y += Maps.backgroundSpeed;
		    		sGun9Y += Maps.backgroundSpeed;
		    		sGun10Y += Maps.backgroundSpeed;
		    		sGun11Y += Maps.backgroundSpeed;
		      }
				
			  if(Player.playerPosY < GameView.screenSyncUp){//up 
				  crusherY -= Maps.backgroundSpeed;
					cGun1Y -= Maps.backgroundSpeed;
					cGun2Y -= Maps.backgroundSpeed;
					cGun3Y -= Maps.backgroundSpeed;
					cGun4Y -= Maps.backgroundSpeed;
					cGun5Y -= Maps.backgroundSpeed;
					
					sGun1Y -= Maps.backgroundSpeed;
					sGun2Y -= Maps.backgroundSpeed;
					sGun3Y -= Maps.backgroundSpeed;
					sGun4Y -= Maps.backgroundSpeed;
					sGun5Y -= Maps.backgroundSpeed;
					sGun6Y -= Maps.backgroundSpeed;
					sGun7Y -= Maps.backgroundSpeed;
					sGun8Y -= Maps.backgroundSpeed;
					sGun9Y -= Maps.backgroundSpeed;
					sGun10Y -= Maps.backgroundSpeed;
					sGun11Y -= Maps.backgroundSpeed;
				    	
	      	  }
			
		}else{
			
			  if(Player.playerPosY < GameView.screenSyncDown){//down
				  crusherY += Maps.backgroundSpeed;
		    		cGun1Y += Maps.backgroundSpeed;
		    		cGun2Y += Maps.backgroundSpeed;
		    		cGun3Y += Maps.backgroundSpeed;
		    		cGun4Y += Maps.backgroundSpeed;
		    		cGun5Y += Maps.backgroundSpeed;
		    		
		    		sGun1Y += Maps.backgroundSpeed;
		    		sGun2Y += Maps.backgroundSpeed;
		    		sGun3Y += Maps.backgroundSpeed;
		    		sGun4Y += Maps.backgroundSpeed;
		    		sGun5Y += Maps.backgroundSpeed;
		    		sGun6Y += Maps.backgroundSpeed;
		    		sGun7Y += Maps.backgroundSpeed;
		    		sGun8Y += Maps.backgroundSpeed;
		    		sGun9Y += Maps.backgroundSpeed;
		    		sGun10Y += Maps.backgroundSpeed;
		    		sGun11Y += Maps.backgroundSpeed;
		      }
				
			  if(Player.playerPosY > GameView.screenSyncUp){//up 
				  crusherY -= Maps.backgroundSpeed;
					cGun1Y -= Maps.backgroundSpeed;
					cGun2Y -= Maps.backgroundSpeed;
					cGun3Y -= Maps.backgroundSpeed;
					cGun4Y -= Maps.backgroundSpeed;
					cGun5Y -= Maps.backgroundSpeed;
					
					sGun1Y -= Maps.backgroundSpeed;
					sGun2Y -= Maps.backgroundSpeed;
					sGun3Y -= Maps.backgroundSpeed;
					sGun4Y -= Maps.backgroundSpeed;
					sGun5Y -= Maps.backgroundSpeed;
					sGun6Y -= Maps.backgroundSpeed;
					sGun7Y -= Maps.backgroundSpeed;
					sGun8Y -= Maps.backgroundSpeed;
					sGun9Y -= Maps.backgroundSpeed;
					sGun10Y -= Maps.backgroundSpeed;
					sGun11Y -= Maps.backgroundSpeed;
				    	
	      	  }
			
			
			
		}//c
		
}//start
	
		

	
	
		
	
	
	
	

		
		
		
		
		cGun1Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		cGun1Heading = (cGun1Rot * 360 / Math.PI);
		
		cGun2Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		cGun2Heading = (cGun2Rot * 360 / Math.PI);
		
		cGun3Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		cGun3Heading = (cGun3Rot * 360 / Math.PI);
		
		cGun4Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		cGun4Heading = (cGun4Rot * 360 / Math.PI);
		
		cGun5Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		cGun5Heading = (cGun5Rot * 360 / Math.PI);
		
		
		
		
		sGun1Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun1Heading = (sGun1Rot * 360 / Math.PI);
		
		sGun2Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun2Heading = (sGun2Rot * 360 / Math.PI);
		
		sGun3Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun3Heading = (sGun3Rot * 360 / Math.PI);
		
		sGun4Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun4Heading = (sGun4Rot * 360 / Math.PI);
		
		sGun5Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun5Heading = (sGun5Rot * 360 / Math.PI);
		
		sGun6Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun6Heading = (sGun6Rot * 360 / Math.PI);
		
		sGun7Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun7Heading = (sGun7Rot * 360 / Math.PI);
		
		sGun8Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun8Heading = (sGun8Rot * 360 / Math.PI);
		
		sGun9Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun9Heading = (sGun9Rot * 360 / Math.PI);
		
		sGun10Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun10Heading = (sGun10Rot * 360 / Math.PI);
		
		sGun11Rot = Math.atan2(Player.playerPosX, Player.playerPosY);
		sGun11Heading = (sGun11Rot * 360 / Math.PI);
		
	
		
	/*	if(cGun1HitExplode != true){
			
			if(cGun1Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				cGun1Hit = true;
			}else if(cGun1Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				cGun1Hit = true;
			}else if(cGun1Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				cGun1Hit = true;
			}else if(cGun1Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				cGun1Hit = true;
			}else if(cGun1Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				cGun1Hit = true;
			}else if(cGun1Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				cGun1Hit = true;
			}else{
				cGun1Hit = false;
			}
		}
		
		
		
		if(cGun2HitExplode != true){
			
			if(cGun2Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				cGun2Hit = true;
			}else if(cGun2Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				cGun2Hit = true;
			}else if(cGun2Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				cGun2Hit = true;
			}else if(cGun2Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				cGun2Hit = true;
			}else if(cGun2Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				cGun2Hit = true;
			}else if(cGun2Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				cGun2Hit = true;
			}else{
				cGun2Hit = false;
			}
		}
		
		
		
		if(cGun3HitExplode != true){
			
			if(cGun3Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				cGun3Hit = true;
			}else if(cGun3Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				cGun3Hit = true;
			}else if(cGun3Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				cGun3Hit = true;
			}else if(cGun3Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				cGun3Hit = true;
			}else if(cGun3Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				cGun3Hit = true;
			}else if(cGun3Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				cGun3Hit = true;
			}else{
				cGun3Hit = false;
			}
		}
		
		
		if(cGun4HitExplode != true){
			
			if(cGun4Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				cGun4Hit = true;
			}else if(cGun4Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				cGun4Hit = true;
			}else if(cGun4Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				cGun4Hit = true;
			}else if(cGun4Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				cGun4Hit = true;
			}else if(cGun4Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				cGun4Hit = true;
			}else if(cGun4Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				cGun4Hit = true;
			}else{
				cGun4Hit = false;
			}
		}


		
		
		if(cGun5HitExplode != true){
			
			if(cGun5Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				cGun5Hit = true;
			}else if(cGun5Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				cGun5Hit = true;
			}else if(cGun5Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				cGun5Hit = true;
			}else if(cGun5Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				cGun5Hit = true;
			}else if(cGun5Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				cGun5Hit = true;
			}else if(cGun5Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				cGun5Hit = true;
			}else{
				cGun5Hit = false;
			}
		}
		
		
		
		
		
if(sGun1HitExplode != true){
			
			if(sGun1Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun1Hit = true;
			}else if(sGun1Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun1Hit = true;
			}else if(sGun1Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun1Hit = true;
			}else if(sGun1Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun1Hit = true;
			}else if(sGun1Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun1Hit = true;
			}else if(sGun1Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun1Hit = true;
			}else{
				sGun1Hit = false;
			}
		}
		
		
		
		if(sGun2HitExplode != true){
			
			if(sGun2Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun2Hit = true;
			}else if(sGun2Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun2Hit = true;
			}else if(sGun2Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun2Hit = true;
			}else if(sGun2Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun2Hit = true;
			}else if(sGun2Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun2Hit = true;
			}else if(sGun2Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun2Hit = true;
			}else{
				sGun2Hit = false;
			}
		}
		
		
		
		if(sGun3HitExplode != true){
			
			if(sGun3Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun3Hit = true;
			}else if(sGun3Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun3Hit = true;
			}else if(sGun3Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun3Hit = true;
			}else if(sGun3Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun3Hit = true;
			}else if(sGun3Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun3Hit = true;
			}else if(sGun3Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun3Hit = true;
			}else{
				sGun3Hit = false;
			}
		}
		
		
		if(sGun4HitExplode != true){
			
			if(sGun4Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun4Hit = true;
			}else if(sGun4Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun4Hit = true;
			}else if(sGun4Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun4Hit = true;
			}else if(sGun4Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun4Hit = true;
			}else if(sGun4Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun4Hit = true;
			}else if(sGun4Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun4Hit = true;
			}else{
				sGun4Hit = false;
			}
		}


		
		
		if(sGun5HitExplode != true){
			
			if(sGun5Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun5Hit = true;
			}else if(sGun5Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun5Hit = true;
			}else if(sGun5Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun5Hit = true;
			}else if(sGun5Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun5Hit = true;
			}else if(sGun5Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun5Hit = true;
			}else if(sGun5Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun5Hit = true;
			}else{
				sGun5Hit = false;
			}
		}
		
		
		
		if(sGun6HitExplode != true){
			
			if(sGun6Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun6Hit = true;
			}else if(sGun6Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun6Hit = true;
			}else if(sGun6Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun6Hit = true;
			}else if(sGun6Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun6Hit = true;
			}else if(sGun6Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun6Hit = true;
			}else if(sGun6Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun6Hit = true;
			}else{
				sGun6Hit = false;
			}
		}
		
		
		
		if(sGun7HitExplode != true){
			
			if(sGun7Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun7Hit = true;
			}else if(sGun7Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun7Hit = true;
			}else if(sGun7Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun7Hit = true;
			}else if(sGun7Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun7Hit = true;
			}else if(sGun7Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun7Hit = true;
			}else if(sGun7Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun7Hit = true;
			}else{
				sGun7Hit = false;
			}
		}
		
		
		
		if(sGun8HitExplode != true){
			
			if(sGun8Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun8Hit = true;
			}else if(sGun8Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun8Hit = true;
			}else if(sGun8Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun8Hit = true;
			}else if(sGun8Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun8Hit = true;
			}else if(sGun8Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun8Hit = true;
			}else if(sGun8Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun8Hit = true;
			}else{
				sGun8Hit = false;
			}
		}
		
		
		if(sGun9HitExplode != true){
			
			if(sGun9Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun9Hit = true;
			}else if(sGun9Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun9Hit = true;
			}else if(sGun9Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun9Hit = true;
			}else if(sGun9Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun9Hit = true;
			}else if(sGun9Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun9Hit = true;
			}else if(sGun9Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun9Hit = true;
			}else{
				sGun9Hit = false;
			}
		}


		
		
		if(sGun10HitExplode != true){
			
			if(sGun10Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun10Hit = true;
			}else if(sGun10Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun10Hit = true;
			}else if(sGun10Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun10Hit = true;
			}else if(sGun10Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun10Hit = true;
			}else if(sGun10Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun10Hit = true;
			}else if(sGun10Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun10Hit = true;
			}else{
				sGun10Hit = false;
			}
		}
		
		
	if(sGun11HitExplode != true){
			
			if(sGun11Rect.intersect(Bullet.bulletRect)){
				setPOD(GameTable.bulletPower);
				sGun11Hit = true;
			}else if(sGun11Rect.intersect(Bullet.bullet2Rect)){
				setPOD(GameTable.bullet2Power);
				sGun11Hit = true;
			}else if(sGun11Rect.intersect(Bullet.smallRocketRect)){	
				setPOD(GameTable.smallRocketPower);
				sGun11Hit = true;
			}else if(sGun11Rect.intersect(Bullet.smallRocket2Rect)){		
				setPOD(GameTable.smallRocket2Power);
				sGun11Hit = true;
			}else if(sGun11Rect.intersect(Bullet.tracerRect)){	
				setPOD(GameTable.tracerPower);
				sGun11Hit = true;
			}else if(sGun11Rect.intersect(Bullet.hellfireRect)){			
				setPOD(GameTable.hellfirePower);
				sGun11Hit = true;
			}else{
				sGun11Hit = false;
			}
		}
		
		
*/		
		
		//cGun5Rect.offset((int)Player.playerPosX,(int)Player.playerPosY);
		
		
		//Log.i(TAG, "cGun5Heading  " + cGun5Heading );
		//Log.i(TAG, "	cGun5Heading   " + 	cGun5Heading );
		
		
		if(cGun1Hit){
			cGun1HitNum = cGun1HitNum + getPOD(); //% change hit
			upDateBossHitNum -= 1 + weaponsPower; // gui
				//Log.i(TAG, "cGun1HitNum++  " + cGun1HitNum++);
				if(cGun1HitNum > GameTable.cGun1Damage){
				//Crusher.cGun1HitNumMAX = true;
					cGun1HitExplode = true;
					cGun1Hit = false;
				}
		
		}
		
		if(cGun2Hit){
			cGun2HitNum = cGun2HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(cGun2HitNum > GameTable.cGun1Damage){
					cGun2HitExplode = true;
					cGun2Hit = false;
				}
		
		}
		
		if(cGun3Hit){
			cGun3HitNum = cGun3HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(cGun3HitNum > GameTable.cGun1Damage){
					cGun3HitExplode = true;
					cGun3Hit = false;
				}
		
		}
		
		if(cGun4Hit){
			cGun4HitNum = cGun4HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(cGun4HitNum > GameTable.cGun1Damage){
					cGun4HitExplode = true;
					cGun4Hit = false;
				}
		
		}
		
		if(cGun5Hit){
			cGun5HitNum = cGun5HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(cGun5HitNum > GameTable.cGun1Damage){
					cGun5HitExplode = true;
					cGun5Hit = false;
				}
		
		}
		
		
		
		
		if(sGun1Hit){
			sGun1HitNum = sGun1HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun1HitNum > GameTable.cGun1Damage){
					sGun1HitExplode = true;
					sGun1Hit = false;
				}
		
		}
		
		if(sGun2Hit){
			sGun2HitNum = sGun2HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun2HitNum > GameTable.cGun1Damage){
					sGun2HitExplode = true;
					sGun2Hit = false;
				}
		
		}
		
		if(sGun3Hit){
			sGun3HitNum = sGun3HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun3HitNum > GameTable.cGun1Damage){
					sGun3HitExplode = true;
					sGun3Hit = false;
				}
		
		}
		
		if(sGun4Hit){
			sGun4HitNum = sGun4HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun4HitNum > GameTable.cGun1Damage){
					sGun4HitExplode = true;
					sGun4Hit = false;
				}
		
		}
		
		if(sGun6Hit){
			sGun6HitNum = sGun6HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun6HitNum > GameTable.cGun1Damage){
					sGun6HitExplode = true;
					sGun6Hit = false;
				}
		
		}
		
		if(sGun7Hit){
			sGun7HitNum = sGun7HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun7HitNum > GameTable.cGun1Damage){
					sGun7HitExplode = true;
					sGun7Hit = false;
				}
		
		}
		
		if(sGun8Hit){
			sGun8HitNum = sGun8HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun8HitNum > GameTable.cGun1Damage){
					sGun8HitExplode = true;
					sGun8Hit = false;
				}
		
		}
		
		if(sGun9Hit){
			sGun9HitNum = sGun9HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun9HitNum > GameTable.cGun1Damage){
					sGun9HitExplode = true;
					sGun9Hit = false;
				}
		
		}
		
		if(sGun10Hit){
			sGun10HitNum = sGun10HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun10HitNum > GameTable.cGun1Damage){
					sGun10HitExplode = true;
					sGun10Hit = false;
				}
		
		}
		
		if(sGun11Hit){
			sGun11HitNum = sGun11HitNum + getPOD();
			upDateBossHitNum -= 1 + weaponsPower;
				if(sGun11HitNum > GameTable.cGun1Damage){
					sGun11HitExplode = true;
					sGun11Hit = false;
				}
		
		}
		
		
	
		
		}//run	
		
	return;	
	}
	
	
//power of destruction 
	public void setPOD(int wep){
		
		//Log.i(TAG, "weaponsDamage   " + weaponsDamage );
		
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
		
		
		}
		 
	return;		
	}

	public int getPOD(){
	return weaponsDamage; 
	}

 
   
	
}
