package com.TP;


import java.util.Stack;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.util.Log;

public class Bullet{
	public static final String TAG = "moto";
	
	public int time = 1;
	public int fireSel = 0; 
	
	public MiniGunBullet miniB;
	public MiniGunBullet miniB1;
	public MiniGunBullet miniB2;
	//public MiniGunBullet miniB3;

	public Particle p0;
	public Particle p1;
	public Particle p2;
	public Particle p3;
	public Particle p4;
	public Particle p5;
	public Particle p6;
	public Particle p7;
	public Particle p8;
	public Particle p9;
	public Particle p10;
	public Particle p11;
	public Particle p12;
	public Particle p13;
	public Particle p14;
	public Particle p15;
	public Particle p16;
	public Particle p17;
	public Particle p18;
	public Particle p19;
	public Particle p20;
	public Particle p21;
	public Particle p22;
	public Particle p23;
	public Particle p24;
	public Particle p25;
	public Particle p26;
	public Particle p27;
	public Particle p28;
	public Particle p29;
	
	public int A;
	public boolean somkeFire = false;
	public boolean somkeWiating = false;
	private double gravitySmoke = 0.0085;
	

	
	
    public Particle smokeArray[];
    public double smokeTimer = 2;
    public int smokeSelector = 0;
    public int smokeTimerAlpha = 8;
    public double smokeSize = 1;
    //public Stack somkeList;
    public static double stopSmoke;
    
    
	public MiniGunBullet miniBArray[];
	
	public boolean minGunFire = false;
	public boolean inFlight = false;
	public boolean notInFlight = true;
	
	public double duration = 1.0;
	public static int badCoperUpDateHitNum = 88;
	public boolean badCoperIsHit = false;
	public boolean badCoperIsHitPow = false;
	public boolean badCoper1ExplodeIs = false;
	public boolean updatePlayerScore = false;
	public double badCoper1Time = 30; 
	public boolean reSpawn = false;
	
	public boolean shipIsHitPow0 = false;
	public boolean shipIsHitPow1 = false;
	
	
	public int eXMin = 320;
	public int eXMax = 0;
	public int eYMin = 480;
	public int eYMax = 0;
	public int superBumbTimer = 255;
	public int superBumbNum = 20;
	public int weaponsDamage;

	
	//public Drawable bullet;
	//public Drawable bullet2;
	public Drawable tracer;
	//public Drawable smallRocket;
	//public Drawable smallRocket2;

	public Bitmap bitmapTracer;
	
	
	public Drawable m22MissleColloder;
	public Drawable m22MissleColloder1;
	public Drawable m22MissleColloder2;
	public Drawable m22MissleColloder3;
	public Drawable m22MissleColloder4;
	public Drawable m22MissleColloder5;
	public Drawable m22MissleColloder6;
	public Drawable m22MissleColloder7;
	
	//public Drawable m22Smoke;
	//public Rect m22RectSmoke;
	//public double m22SmokeX;
	//public double m22SmokeY;
	//public double m22SmokeWidth = 20;
	//public double m22SmokeHeight = 20;
	//public int m22SmokeAlpha = 0;
	//public int m22SmokeAlphaNum = 255;

	
	public Bitmap m22Missle;
	public Bitmap m22Missle1;
	public Bitmap m22Missle2;
	public Bitmap m22Missle3;
	public Bitmap m22Missle4;
	public Bitmap m22Missle5;
	public Bitmap m22Missle6;
	public Bitmap m22Missle7;
	

	public Drawable cursherBullet;
	public Drawable cursherBullet1;
	public Drawable cursherBullet2;
	
	
	public static double bulletX = 0;
	public static double bulletY = 0;
	public double lastBulletX = 0;
	public double bulletSpeed = 50;
	public boolean showBullet = false;
	public static int showBulletAlpha = 0;
	public String bulletName;
	public boolean reloadedBullet = false;
	//private int bulletWidth = 2;
	//private int bulletHeight = 80;
	public boolean fireBullet = false; 
	
	public static double bullet2X = 0;
	public static double bullet2Y = 0;
	public double lastBullet2X = 0;
	public double bulletSpeed2 = 50;
	public int showBullet2Alpha = 0;
	public boolean reloadedBullet2 = false;
	//private int bullet2Width = 2;
	//private int bullet2Height = 80;
	
	
	public static double smallRocketX = 0;
	public static double smallRocketY = 0;
	public double lastsmallRocketX = 0;
	public double smallRocketSpeed = 50;
	public int showsmallRocketAlpha = 0;
	public boolean reloadedsmallRocket = false;
	//private int smallRocketWidth = 20;
	//private int smallRocketHeight = 20;
	public double smallRocket2X = 0;
	public double smallRocket2Y = 0;
	
	public double lastsmallRocket2X = 0;
	public double smallRocketSpeed2 = 50;
	public int showsmallRocket2Alpha = 0;
	public boolean reloadedsmallRocket2 = false;
	//private int smallRocket2Width = 20;
	//private int smallRocket2Height = 20;
	
	
	/*public Rect bulletRect;
	public Rect bullet2Rect;
	public Rect smallRocket2Rect;
	public Rect smallRocketRect;*/
	public Rect tracerRect;
	public Rect cursherBulletRect;
	public Rect cursherBulletRect1;
	public Rect cursherBulletRect2;
	
	
	public int rocketReloadNum;
	public int rocketReloadNum2;
	public String rocketName;

	
	public double tracerX = 0;
	public double tracerY = 0;
	public double tracerSpeed = 6;
	public double tracerXSpeed = 0;
	public double tracerYSpeed = 0;
	public int showtracerAlpha = 0;
	public String tracerName;
	public boolean reloadedtracer = false;
	public int tracerWidth = 12;
	public int tracerHeight = 32;
	public boolean fireTracer = false; 
	public boolean reloadTracer = false; 
	public int tracerReloadNum;
	public double tracerHeading;
	public double tracerDist;
	public double tracerRot;
	

	//public static double hellfireX = 0;
	//public static double hellfireY = 0;
	//public boolean showHellfire = false;
	//public int showHellfireAlpha = 0;
	//public final String hellfireName = "helfire";
	//private int hellfireWidth = 12;
	//private int hellfireHeight = 22;
	
	
	
	public static double cursherBulletX = 0;
	public static double cursherBulletY = 0;
	public int showcursherBulletAlpha = 0;
	public int cursherBulletReloadNum;
	public boolean reloadcursherBullet = false; 
	public double cursherBulletXSpeed = 0;
	public double cursherBulletYSpeed = 0;
	
	public static double cursherBulletX1 = 0;
	public static double cursherBulletY1 = 0;
	public int showcursherBulletAlpha1 = 0;
	public int cursherBulletReloadNum1;
	public boolean reloadcursherBullet1 = false; 
	public double cursherBulletXSpeed1 = 0;
	public double cursherBulletYSpeed1 = 0;
	
	public static double cursherBulletX2 = 0;
	public static double cursherBulletY2 = 0;
	public int showcursherBulletAlpha2 = 0;
	public int cursherBulletReloadNum2;
	public boolean reloadcursherBullet2 = false; 
	public double cursherBulletXSpeed2 = 0;
	public double cursherBulletYSpeed2 = 0;
	
	
	public double cursherBulletSpeed = 6;
	public String cursherBulletName;
	public int cursherBulletWidth = 10;
	public int cursherBulletHeight = 10;

	public double cursherBulletHeading;
	public double cursherBulletDist;
	public double cursherBulletRot;
	
	public Rect m22Rect;
	public static double m22X;
	public static double m22Y;
	public double m22XPointer;
	public double m22YPointer;
	public double m22Width = 20;
	public double m22Height = 20;
	public double m22Speed = 0.1;
	public double m22SpeedX = 0;
	public double m22SpeedY = 0;
	public double m22Heading = 0;
	public double m22Rot = 0;
	public double m22radians = 0;
	public double m22Angle = 0;
	public double m22AngleRot = 0;
	public double m22AngleHead = 0;
	public double m22DX;
	public double m22DY;
	public double m22ReloadNum;
	public int m22ReloadTime;
	private int m22SeletorNum = 0;
	public boolean reloadM22 = false;
	public boolean fireM22 = false;
	
	
	
	/*public double mbX;
	public double mbY;
	public double mbWidth = 20;
	public double mbHeight = 20;
	public double mbSpeed = 10;
	public double mbSpeedX = 0;
	public double mbSpeedY = 0;
	public int mbAlpha = 0;
	public double mbHeading = 0;
	public double mbRot = 0;
	public double mbradians = 0;
	public double mbAngle = 0;
	public double mbAngleRot = 0;
	public double mbAngleHead = 0;
	public double mbDX;
	public double mbDY;*/
	
	
	
	public boolean fireGb = false;
	public boolean reloadGb = false;
	
	
	public double gravity = 8.58;
	public double friction = 0.98;
	public double bounce = 0.4;
	public double areaBounce = 0.9;
	public int rot = 0;
 
	public static int shipUpDateHitNum1 = 88;
	public static int shipUpDateHitNum2 = 88;
	public static int shipUpDateHitNum3 = 88;
	public static int shipUpDateHitNum4 = 88;
	public static int shipUpDateHitNum5 = 88;
	public static int shipUpDateHitNum6 = 88;
	public static int shipUpDateHitNum7 = 88;
	public static int shipUpDateHitNum8 = 88;
	public static int shipUpDateHitNum9 = 88;
	public static int shipUpDateHitNum10 = 88;
	public static int shipUpDateHitNum11 = 88;
	public static int shipUpDateHitNum12 = 88;
	public static int shipUpDateHitNum13 = 88;
	public static int shipUpDateHitNum14 = 88;
	
	
	
	public int fireRate;
	public int fireGun;
	
	public double radians;
	
	public int bulletReloadNum;
	
	
	public Resources res;
	
	public MediaPlayer pointBeep;
	public MediaPlayer shipBlowUp;
	public MediaPlayer shipBlowUp2;
	public Boolean shipBlowUpTrue = false;
	
	
	/*public Rect clockRect;
	public double clockX = 120;
	public double clockY = 120;
	public double clockWidth = 30;
	public double clockHeight = 30;
	public double clock;	
	public double clockRot = 0;
	public double clockHeading = 0;
	public double clockSpeed = 30;
	public double clockXSpeed = 0;
	public double clockYSpeed = 0*/;
	

	public Bullet(){
		 fireTracer = false;
		 fireRate = 10;
		 fireGun = 1;
		 tracerReloadNum = 0;
		 bulletReloadNum = 0;
		 rocketReloadNum = 0;
		 rocketReloadNum2 = 0;
		 m22ReloadNum = 0;
		 
		 miniBArray = new MiniGunBullet[3];
		 
		 miniB = new MiniGunBullet();
		 miniB1 = new MiniGunBullet();
		 miniB2 = new MiniGunBullet();
		 //miniB3 = new MiniGunBullet();
		 
		 miniBArray[0] = miniB;
		 miniBArray[1] = miniB1;
		 miniBArray[2] = miniB2;
		 //miniBArray[3] = miniB3;
		 
		 p0 = new Particle();
		 p1 = new Particle();
		 p2 = new Particle();
		 p3 = new Particle();
		 p4 = new Particle();
		 p5 = new Particle();
		 p6 = new Particle();
		 p7 = new Particle();
		 p8 = new Particle();
		 p9 = new Particle();
		 p10 = new Particle();
		 p11 = new Particle();
		 p12 = new Particle();
		 p13 = new Particle();
		 p14 = new Particle();
		 p15 = new Particle();
		 p16 = new Particle();
		 p17 = new Particle();
		 p18 = new Particle();
		 p19 = new Particle();
		 p20 = new Particle();
		 p21 = new Particle();
		 p22 = new Particle();
		 p23 = new Particle();
		 p24 = new Particle();
		 p25 = new Particle();
		 p26 = new Particle();
		 p27 = new Particle();
		 p28 = new Particle();
		 p29 = new Particle();
		
		  
		 smokeArray = new Particle[30];
		 smokeArray[0] = p0;
		 smokeArray[1] = p1;
		 smokeArray[2] = p2;
		 smokeArray[3] = p3;
		 smokeArray[4] = p4;
		 smokeArray[5] = p5;	
		 smokeArray[6] = p6;
		 smokeArray[7] = p7;
		 smokeArray[8] = p8;
		 smokeArray[9] = p9;
		 smokeArray[10] = p10;
		 smokeArray[11] = p11;
		 smokeArray[12] = p12;
		 smokeArray[13] = p13;
		 smokeArray[14] = p14;
		 smokeArray[15] = p15;
		 smokeArray[16] = p16;
		 smokeArray[17] = p17;
		 smokeArray[18] = p18;
		 smokeArray[19] = p19;
		 smokeArray[20] = p20;
		 smokeArray[21] = p21;
		 smokeArray[22] = p22;
		 smokeArray[23] = p23;
		 smokeArray[24] = p24;
		 smokeArray[25] = p25;
		 smokeArray[26] = p26;
		 smokeArray[27] = p27;
		 smokeArray[28] = p28;
		 smokeArray[29] = p29;
		 
		 //somkeList = new Stack();
		 
		
		 
		// on/off
		//bulletName = "single";
		//bulletName = "double";
		//rocketName = "smallRocket";
		
		 
		
		
		 
		m22ReloadNum = 1.0;
		
		radians = Math.PI/360;
		tracerRot = tracerHeading * radians;
  		tracerHeading = (tracerRot * 360 / Math.PI);
  		
  		/*clock = Math.PI/360;
 		clockRot = clockHeading * clock;
 		clockHeading = (clockRot * 360 / Math.PI);*/
  		
  		
    	m22ReloadTime = 0;
  		m22radians = 360 * 2 / Math.PI;
  		
  		
  		
  		reloadM22Missle();
		reloadCrusherGun();
		reloadCrusherGun1();
		reloadCrusherGun2();
  	
			
	}
	
	
	public void buildBullet(Context context){
		res = context.getResources();
		
		/*bullet = context.getResources().getDrawable(R.drawable.sbulletlong);
		bullet2 = context.getResources().getDrawable(R.drawable.sbulletlong);*/
		
	
		
		/*smallRocket = context.getResources().getDrawable(R.drawable.smallrocket);
		smallRocket2 = context.getResources().getDrawable(R.drawable.smallrocket);*/
		
		cursherBullet = context.getResources().getDrawable(R.drawable.crusherbullet);
		cursherBullet1 = context.getResources().getDrawable(R.drawable.crusherbullet);
		cursherBullet2 = context.getResources().getDrawable(R.drawable.crusherbullet);
		
		tracer = context.getResources().getDrawable(R.drawable.boxcollider);
		bitmapTracer = BitmapFactory.decodeResource(res,R.drawable.tracer); 
		
		
		m22MissleColloder = context.getResources().getDrawable(R.drawable.boxcolliderm22);
		m22Missle = BitmapFactory.decodeResource(res,R.drawable.hellfire);
		//m22Smoke = context.getResources().getDrawable(R.drawable.smokesmall);
	
		
	
		miniB.buildGBullet(context);
		miniB1.buildGBullet(context);	
		miniB2.buildGBullet(context);
		
		p0.buildParticle(context); 
		p1.buildParticle(context); 
		p2.buildParticle(context); 
		p3.buildParticle(context); 
		p4.buildParticle(context);
		p5.buildParticle(context); 
		p6.buildParticle(context); 
		p7.buildParticle(context); 
		p8.buildParticle(context); 
		p9.buildParticle(context); 
		p10.buildParticle(context);
		p11.buildParticle(context); 
		p12.buildParticle(context); 
		p13.buildParticle(context); 
		p14.buildParticle(context); 
		p15.buildParticle(context); 
		p16.buildParticle(context);
		p17.buildParticle(context); 
		p18.buildParticle(context); 
		p19.buildParticle(context); 
		p20.buildParticle(context); 
		p21.buildParticle(context); 
		p22.buildParticle(context);
		p23.buildParticle(context); 
		p24.buildParticle(context); 
		p25.buildParticle(context); 
		p26.buildParticle(context); 
		p27.buildParticle(context);
		p28.buildParticle(context); 
		p29.buildParticle(context);
	
	
	

		//mp = MediaPlayer.create(context, R.raw.playershot2);
		shipBlowUp = MediaPlayer.create(context, R.raw.explosion);
		//pointBeep = MediaPlayer.create(context, R.raw.beep);
		
		
		
	 return;
	}
	
	public void bulletDoDraw(Canvas canvas){
		
	/*	clockRect = new Rect((int)clockX,(int)clockY,(int)clockX + (int)clockWidth, (int)clockY + (int)clockHeight);
		
		canvas.save();
		canvas.rotate((float)clockHeading, (float)clockX + (float)clockWidth /2 , (float)clockY + (float)clockHeight /2);
		canvas.restore();*/

		/*bulletRect = new Rect((int)bulletX,(int)bulletY,(int)bulletX + bulletWidth, (int)bulletY + bulletHeight);
		bulletRect.centerX();
		bulletRect.centerY();
        
        bullet.setBounds(bulletRect);
        bullet.setAlpha(showBulletAlpha);
        bullet.draw(canvas);
        
        bullet2Rect = new Rect((int)bullet2X,(int)bullet2Y,(int)bullet2X + bullet2Width, (int)bullet2Y + bullet2Height);
		bullet2Rect.centerX();
		bullet2Rect.centerY();
        
        bullet2.setBounds(bullet2Rect);
        bullet2.setAlpha(showBulletAlpha);
        bullet2.draw(canvas);*/
        
   /*     smallRocketRect = new Rect((int)smallRocketX,(int)smallRocketY,(int)smallRocketX + smallRocketWidth, (int)smallRocketY + smallRocketHeight);
		smallRocketRect.centerX();
		smallRocketRect.centerY();
        
        smallRocket.setBounds(smallRocketRect);
        smallRocket.setAlpha(showsmallRocketAlpha);
        smallRocket.draw(canvas);
        
        smallRocket2Rect = new Rect((int)smallRocket2X,(int)smallRocket2Y,(int)smallRocket2X + smallRocket2Width, (int)smallRocket2Y + smallRocket2Height);
		smallRocket2Rect.centerX();
		smallRocket2Rect.centerY();
        
        smallRocket2.setBounds(smallRocket2Rect);
        smallRocket2.setAlpha(showsmallRocket2Alpha);
        smallRocket2.draw(canvas)*/;
        
       
        tracerRect = new Rect((int)tracerX,(int)tracerY,(int)tracerX + tracerWidth, (int)tracerY + tracerHeight);
		tracerRect.centerX();
		tracerRect.centerY();
        tracer.setBounds(tracerRect);
        tracer.setAlpha(0);
        tracer.draw(canvas);
        
       
        
        cursherBulletRect = new Rect((int)cursherBulletX,(int)cursherBulletY,(int)cursherBulletX + cursherBulletWidth, (int)cursherBulletY + cursherBulletHeight);
		cursherBulletRect.centerX();
		cursherBulletRect.centerY();
		
		cursherBullet.setBounds(cursherBulletRect);
		cursherBullet.setAlpha(showcursherBulletAlpha);
		cursherBullet.draw(canvas);
		
		cursherBulletRect1 = new Rect((int)cursherBulletX1,(int)cursherBulletY1,(int)cursherBulletX1 + cursherBulletWidth, (int)cursherBulletY1 + cursherBulletHeight);
		cursherBulletRect1.centerX();
		cursherBulletRect1.centerY();
		
		cursherBullet1.setBounds(cursherBulletRect1);
		cursherBullet1.setAlpha(showcursherBulletAlpha1);
		cursherBullet1.draw(canvas);
		
		cursherBulletRect2 = new Rect((int)cursherBulletX2,(int)cursherBulletY2,(int)cursherBulletX2 + cursherBulletWidth, (int)cursherBulletY2 + cursherBulletHeight);
		cursherBulletRect2.centerX();
		cursherBulletRect2.centerY();
		
		cursherBullet2.setBounds(cursherBulletRect2);
		cursherBullet2.setAlpha(showcursherBulletAlpha2);
		cursherBullet2.draw(canvas);
		
		
		
		miniB.bulletGBDoDraw(canvas);
		miniB1.bulletGBDoDraw(canvas);
		miniB2.bulletGBDoDraw(canvas);
		//miniB3.bulletGBDoDraw(canvas);
		
		p0.particleDoDraw(canvas);
		p1.particleDoDraw(canvas);
		p2.particleDoDraw(canvas);
		p3.particleDoDraw(canvas);
		p4.particleDoDraw(canvas);
		p5.particleDoDraw(canvas);
		p6.particleDoDraw(canvas);
		p7.particleDoDraw(canvas);
		p8.particleDoDraw(canvas);
		p9.particleDoDraw(canvas);
		p10.particleDoDraw(canvas);
		p11.particleDoDraw(canvas);
		p12.particleDoDraw(canvas);
		p13.particleDoDraw(canvas);
		p14.particleDoDraw(canvas);
		p15.particleDoDraw(canvas);
		p16.particleDoDraw(canvas);
		p17.particleDoDraw(canvas);
		p18.particleDoDraw(canvas);
		p19.particleDoDraw(canvas);
		p20.particleDoDraw(canvas);
		p21.particleDoDraw(canvas);
		p22.particleDoDraw(canvas);
		p23.particleDoDraw(canvas);
		p24.particleDoDraw(canvas);
		p26.particleDoDraw(canvas);
		p27.particleDoDraw(canvas);
		p28.particleDoDraw(canvas);
		p29.particleDoDraw(canvas);
		
		
		
		
		
		m22Rect = new Rect((int)m22XPointer,(int)m22YPointer,(int)m22XPointer + (int)m22Width, (int)m22YPointer + (int)m22Height);
		m22Rect.centerX();
		m22Rect.centerY();
		m22MissleColloder.setBounds(m22Rect);
		m22MissleColloder.setAlpha(0);
		m22MissleColloder.draw(canvas);
		
		/*m22RectSmoke = new Rect((int)m22SmokeX,(int)m22SmokeY,(int)m22SmokeX + (int)m22SmokeWidth, (int)m22SmokeY + (int)m22SmokeHeight);
		m22RectSmoke.centerX();
		m22RectSmoke.centerY();
		m22Smoke.setBounds(m22RectSmoke);
		m22Smoke.setAlpha(m22SmokeAlpha);
		m22Smoke.draw(canvas);*/
		

		
		if(Player.playerTargetVisible == 255){
		canvas.save();
		canvas.rotate((float) -m22AngleHead, (float)m22XPointer + (float)m22Width /2 , (float)m22YPointer + (float)m22Height /2);
		canvas.drawBitmap(m22Missle, (int)m22XPointer, (int)m22YPointer, null);
		canvas.restore();
		}
		
		
		
//keep this is the tracer
		
		/*canvas.save();
		canvas.rotate((float)tracerHeading, (float)tracerX , (float)tracerY);
		canvas.drawBitmap(bitmapTracer, (int)tracerX, (int)tracerY + 60, null);
		canvas.restore();*/
		
		
		
		
		if(GameView.GameState == "run"){
			
			
        	
        if(GameView.shipArray[1].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[1].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum1 -= GameTable.bulletPower;
      			GameView.shipArray[1].shipHit = true;
      			 
      		}else if(GameView.shipArray[1].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum1 -= GameTable.m22Power;
      			GameView.shipArray[1].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[1].shipHit){//3
          			GameView.shipArray[1].shipHitNum = GameView.shipArray[1].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
          			
          					if(GameView.shipArray[1].shipHitNum > GameTable.ship0Damage){//4
          					GameView.shipArray[1].shipHitExplode = true;
          					shipBlowUpTrue = true;
          					shipIsHitPow0 = true;
          					GameView.shipArray[1].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[1].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
        
     	
        if(GameView.shipArray[2].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[2].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum2 -= GameTable.bulletPower;
      			GameView.shipArray[2].shipHit = true;
      		}else if(GameView.shipArray[2].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum2 -= GameTable.m22Power;
      			GameView.shipArray[2].shipHit = true;
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[2].shipHit){//3
          			GameView.shipArray[2].shipHitNum = GameView.shipArray[2].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
          			
          					if(GameView.shipArray[2].shipHitNum > GameTable.ship0Damage){//4
          					GameView.shipArray[2].shipHitExplode = true;
          					shipBlowUpTrue = true;
          					shipIsHitPow0 = true;
          					GameView.shipArray[2].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[2].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
        
     	
        if(GameView.shipArray[3].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[3].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum3 -= GameTable.bulletPower;
      			GameView.shipArray[3].shipHit = true;
      		}else if(GameView.shipArray[3].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum3 -= GameTable.m22Power;
      			GameView.shipArray[3].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[3].shipHit){//3
          			GameView.shipArray[3].shipHitNum = GameView.shipArray[3].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
          			
          					if(GameView.shipArray[3].shipHitNum > GameTable.ship0Damage){//4
          					GameView.shipArray[3].shipHitExplode = true;
          					shipBlowUpTrue = true;
          					shipIsHitPow0 = true;
          					GameView.shipArray[3].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[3].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
        
     	
        if(GameView.shipArray[4].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[4].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum4 -= GameTable.bulletPower;
      			GameView.shipArray[4].shipHit = true;
      		}else if(GameView.shipArray[4].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum4 -= GameTable.m22Power;
      			GameView.shipArray[4].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[4].shipHit){//3
          			GameView.shipArray[4].shipHitNum = GameView.shipArray[4].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
          			
          					if(GameView.shipArray[4].shipHitNum > GameTable.ship0Damage){//4
          					GameView.shipArray[4].shipHitExplode = true;
          					shipBlowUpTrue = true;
          					shipIsHitPow0 = true;
          					GameView.shipArray[4].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[4].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
        
     	
        if(GameView.shipArray[5].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[5].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum5 -= GameTable.bulletPower;
      			GameView.shipArray[5].shipHit = true;
      		}else if(GameView.shipArray[5].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum5 -= GameTable.m22Power;
      			GameView.shipArray[5].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[5].shipHit){//3
          			GameView.shipArray[5].shipHitNum = GameView.shipArray[5].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
          			
          					if(GameView.shipArray[5].shipHitNum > GameTable.ship0Damage){//4
          					GameView.shipArray[5].shipHitExplode = true;
          					shipBlowUpTrue = true;
          					shipIsHitPow0 = true;
          					GameView.shipArray[5].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[5].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
        
     	
        if(GameView.shipArray[6].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[6].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum6 -= GameTable.bulletPower;
      			GameView.shipArray[6].shipHit = true;
      		}else if(GameView.shipArray[6].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum6 -= GameTable.m22Power;
      			GameView.shipArray[6].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[6].shipHit){//3
          			GameView.shipArray[6].shipHitNum = GameView.shipArray[6].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
          			
          					if(GameView.shipArray[6].shipHitNum > GameTable.ship0Damage){//4
          					GameView.shipArray[6].shipHitExplode = true;
          					shipBlowUpTrue = true;
          					shipIsHitPow0 = true;
          					GameView.shipArray[6].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[6].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
    
        
    	
        if(GameView.shipArray[7].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[7].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum7 -= GameTable.bulletPower;
      			GameView.shipArray[7].shipHit = true;
      		}else if(GameView.shipArray[7].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum7 -= GameTable.m22Power;
      			GameView.shipArray[7].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[7].shipHit){//3
          			GameView.shipArray[7].shipHitNum = GameView.shipArray[7].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
          			
          					if(GameView.shipArray[7].shipHitNum > GameTable.ship1Damage){//4
          					GameView.shipArray[7].shipHitExplode = true; 
          					shipBlowUpTrue = true;
          					shipIsHitPow1 = true;
          					GameView.shipArray[7].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[7].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
     	
        if(GameView.shipArray[8].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[8].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum8 -= GameTable.bulletPower;
      			GameView.shipArray[8].shipHit = true;
      		}else if(GameView.shipArray[8].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum8 -= GameTable.m22Power;
      			GameView.shipArray[8].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[8].shipHit){//3
          			GameView.shipArray[8].shipHitNum = GameView.shipArray[8].shipHitNum + getPOD() * GameTable.ship1DamageTimes;
          			
          					if(GameView.shipArray[8].shipHitNum > GameTable.ship1Damage){//4
          					GameView.shipArray[8].shipHitExplode = true; 
          					shipBlowUpTrue = true;
          					shipIsHitPow1 = true;
          					GameView.shipArray[8].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[8].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
        if(GameView.shipArray[9].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[9].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum9 -= GameTable.bulletPower;
      			GameView.shipArray[9].shipHit = true;
      		}else if(GameView.shipArray[9].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum9 -= GameTable.m22Power;
      			GameView.shipArray[9].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[9].shipHit){//3
          			GameView.shipArray[9].shipHitNum = GameView.shipArray[9].shipHitNum + getPOD() * GameTable.ship1DamageTimes;
          			
          					if(GameView.shipArray[9].shipHitNum > GameTable.ship1Damage){//4
          					GameView.shipArray[9].shipHitExplode = true; 
          					shipBlowUpTrue = true;
          					shipIsHitPow1 = true;
          					GameView.shipArray[9].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[9].shipHit = false;
      			}//3
      			   			
      		
        }//1
        
        
        
if(GameView.shipArray[10].shipHitExplode != true){ //1
        	
        	
      		if(GameView.shipArray[10].shipRect.intersect(miniB.gBulletRect)){//2
      			setPOD(GameTable.bulletPower);
      			shipUpDateHitNum10 -= GameTable.bulletPower;
      			GameView.shipArray[10].shipHit = true;
      		}else if(GameView.shipArray[10].shipRect.intersect(m22Rect)){
      			setPOD(GameTable.m22Power);
      			shipUpDateHitNum10 -= GameTable.m22Power;
      			GameView.shipArray[10].shipHit = true;	
      		}
      			
      			
      		
      		
      			if(GameView.shipArray[10].shipHit){//3
          			GameView.shipArray[10].shipHitNum = GameView.shipArray[10].shipHitNum + getPOD() * GameTable.ship1DamageTimes;
          			
          					if(GameView.shipArray[10].shipHitNum > GameTable.ship1Damage){//4
          					GameView.shipArray[10].shipHitExplode = true; 
          					shipBlowUpTrue = true;
          					shipIsHitPow1 = true;
          					GameView.shipArray[10].shipHit = false;
          					}//4	
      			}else{
      			GameView.shipArray[10].shipHit = false;
      			}//3
      			   			
      		
        }//1



if(GameView.shipArray[11].shipHitExplode != true){ //1
	
	
		if(GameView.shipArray[11].shipRect.intersect(miniB.gBulletRect)){//2
			setPOD(GameTable.bulletPower);
			shipUpDateHitNum11 -= GameTable.bulletPower;
			GameView.shipArray[11].shipHit = true;
		}else if(GameView.shipArray[11].shipRect.intersect(m22Rect)){
			setPOD(GameTable.m22Power);
			shipUpDateHitNum11 -= GameTable.m22Power;
			GameView.shipArray[11].shipHit = true;	
		}
			
			
		
		
			if(GameView.shipArray[11].shipHit){//3
  			GameView.shipArray[11].shipHitNum = GameView.shipArray[11].shipHitNum + getPOD() * GameTable.ship1DamageTimes;
  			
  					if(GameView.shipArray[11].shipHitNum > GameTable.ship1Damage){//4
  					GameView.shipArray[11].shipHitExplode = true; 
  					shipBlowUpTrue = true;
  					shipIsHitPow1 = true;
  					GameView.shipArray[11].shipHit = false;
  					}//4	
			}else{
			GameView.shipArray[11].shipHit = false;
			}//3
			   			
		
}//1




if(GameView.shipArray[12].shipHitExplode != true){ //1
	
	
		if(GameView.shipArray[12].shipRect.intersect(miniB.gBulletRect)){//2
			setPOD(GameTable.bulletPower);
			shipUpDateHitNum12 -= GameTable.bulletPower;
			GameView.shipArray[12].shipHit = true;
		}else if(GameView.shipArray[12].shipRect.intersect(m22Rect)){
			setPOD(GameTable.m22Power);
			shipUpDateHitNum12 -= GameTable.m22Power;
			GameView.shipArray[12].shipHit = true;	
		}
			
			
		
		
			if(GameView.shipArray[12].shipHit){//3
  			GameView.shipArray[12].shipHitNum = GameView.shipArray[12].shipHitNum + getPOD() * GameTable.ship1DamageTimes;
  			
  					if(GameView.shipArray[12].shipHitNum > GameTable.ship1Damage){//4
  					GameView.shipArray[12].shipHitExplode = true; 
  					shipBlowUpTrue = true;
  					shipIsHitPow1 = true;
  					GameView.shipArray[12].shipHit = false;
  					}//4	
			}else{
			GameView.shipArray[12].shipHit = false;
			}//3
			   			
		
}//1



if(GameView.shipArray[13].shipHitExplode != true){ //1
	
	
		if(GameView.shipArray[13].shipRect.intersect(miniB.gBulletRect)){//2
			setPOD(GameTable.bulletPower);
			shipUpDateHitNum13 -= GameTable.bulletPower;
			GameView.shipArray[13].shipHit = true;
		}else if(GameView.shipArray[13].shipRect.intersect(m22Rect)){
			setPOD(GameTable.m22Power);
			shipUpDateHitNum13 -= GameTable.m22Power;
			GameView.shipArray[13].shipHit = true;	
		}
			
			
		
		
			if(GameView.shipArray[13].shipHit){//3
  			GameView.shipArray[13].shipHitNum = GameView.shipArray[13].shipHitNum + getPOD() * GameTable.ship1DamageTimes;
  			
  					if(GameView.shipArray[13].shipHitNum > GameTable.ship1Damage){//4
  					GameView.shipArray[13].shipHitExplode = true; 
  					shipBlowUpTrue = true;
  					shipIsHitPow1 = true;
  					GameView.shipArray[13].shipHit = false;
  					}//4	
			}else{
			GameView.shipArray[13].shipHit = false;
			}//3
			   			
		
}//1



if(GameView.shipArray[14].shipHitExplode != true){ //1
	
	
	if(GameView.shipArray[14].shipRect.intersect(miniB.gBulletRect)){//2
		setPOD(GameTable.bulletPower);
		shipUpDateHitNum14 -= GameTable.bulletPower;
		GameView.shipArray[14].shipHit = true;
	}else if(GameView.shipArray[14].shipRect.intersect(m22Rect)){
		setPOD(GameTable.m22Power);
		shipUpDateHitNum14 -= GameTable.m22Power;
		GameView.shipArray[14].shipHit = true;	
	}
			
			
		
		
			if(GameView.shipArray[14].shipHit){//3
  			GameView.shipArray[14].shipHitNum = GameView.shipArray[14].shipHitNum + getPOD() * GameTable.ship0DamageTimes;
  			
  					if(GameView.shipArray[14].shipHitNum > GameTable.ship0Damage){//4
  					GameView.shipArray[14].shipHitExplode = true;
  					shipBlowUpTrue = true;
  					shipIsHitPow0 = true;
  					GameView.shipArray[14].shipHit = false;
  					}//4	
			}else{
			GameView.shipArray[14].shipHit = false;
			}//3
			   			
		
}//1



		if(shipIsHitPow0){
			shipBlowUpTrue = true;
			updatePlayerScore = true;
		 	if(updatePlayerScore){
		 	updatePlayerScore = false;
			Player.playerPoints = Player.playerPoints + GameTable.ship0Points;
			shipIsHitPow0 = false;
		 	}
		}
		
		if(shipIsHitPow1){
			shipBlowUpTrue = true;
			updatePlayerScore = true;
		 	if(updatePlayerScore){
		 	updatePlayerScore = false;
			Player.playerPoints = Player.playerPoints + GameTable.ship1Points;
			shipIsHitPow1 = false;
		 	}
		}
    

		
      if(badCoper1ExplodeIs != true){ //1
      	
    	if(BadCoper1.badCoper1Rect.intersect(miniB.gBulletRect)){//2
    		setPOD(GameTable.bulletPower);
    		badCoperUpDateHitNum -= GameTable.bulletPower;
    		badCoperIsHit = true;
    		BadCoper1.badCoperIsHit = true;
    	}else if(BadCoper1.badCoper1Rect.intersect(m22Rect)){
    		setPOD(GameTable.m22Power);
    		badCoperUpDateHitNum -= GameTable.m22Power;
    		badCoperIsHit = true;
    		BadCoper1.badCoperIsHit = true;
    	}
    			
    		
    			if(badCoperIsHit){//3
    				badCoperIsHit = false;
    				BadCoper1.badCoper1HitNum = BadCoper1.badCoper1HitNum + getPOD() * GameTable.badCoper1DamageTimes;
    	
        					if(BadCoper1.badCoper1HitNum > GameTable.badCoper1Damage){//4
        						shipBlowUpTrue = true;
        						badCoperIsHit  = false;
    							BadCoper1.badCoperIsHit = false;
    							badCoper1ExplodeIs = true;
    							BadCoper1.badCoper1ExplodeIs = true;
    							reloadM22 = true;
        					}//4	
    			}else{
    			badCoperIsHit = false;
    			}//3
    			   			
    		
      }//1
      

		
		
		if(badCoperIsHitPow){
			updatePlayerScore = true;
	     	if(updatePlayerScore){
	     	updatePlayerScore = false;
	    	Player.playerPoints = Player.playerPoints + GameTable.badCoperPoints;
	    	badCoperIsHitPow = false;
	     	}
	    }
		
			
		 if(badCoper1ExplodeIs){
			 //badCoper1ExplodeIs = false;
			
			 BadCoper1.badCoper1Alpha -= GameTable.badCoper1AlphaTimer;
			 	if(BadCoper1.badCoper1Alpha <= 0){
			 	   BadCoper1.badCoper1Alpha = 0;
			 	   //badCoper1Time -= GameTable.badCoper1Timer;
				 	   //if(badCoper1Time < 0){	
				 	   BadCoper1.badCoper1ExplodeIs = false;
				 	   reSpawn = true;
				 	   //}
				 }
		 }else{
			BadCoper1.upDateCoper1();
		 }  
		 
		 
		 if(reSpawn){
			 badCoperIsHitPow = true;
			 badCoper1ExplodeIs = false;
			 BadCoper1.badCoper1X = Math.random() * 80 + 240;
			 BadCoper1.badCoper1Y = -100;
			 BadCoper1.badCoper1Alpha = 255;
			 BadCoper1.badCoper1ExplodeIs = false;
			 BadCoper1.badCoper1HitNum = 0;
			 badCoperUpDateHitNum = 88;
			 //badCoper1Time = 30;
			 reSpawn = false;
		 }
		 
		
/////		
		
		 //Player.playerPosY
		
		
	    
	  //run
		}//run
	

	return;
	}
	
	
	public void updateBullet(){
		
	
		if(GameView.GameState == "run"){
			
		
		
		tracerReloadNum += 1;
		rocketReloadNum += 1;
		rocketReloadNum2 += 1;
				
		cursherBulletReloadNum += 1;
		cursherBulletReloadNum1 += 1;
		cursherBulletReloadNum2 += 1;
		
		
		m22SeletorNum++;
		
		m22X = m22XPointer;
		m22Y = m22YPointer;
		
		
		
		//System.currentTimeMillis();
		
	
	
		//Log.i(TAG, "smokeTimer " + smokeTimer);
		
		//smokeTimerAlpha += 30;
		
		
		//if(fireM22){ 
		
			
		//for(A = 0; A < smokeArray.length; A++){
			//list
		//}
		//}
		
		
		
		//for(int active = 0; active < A; active++){
			 
			
			//Log.i(TAG, "active  " + active );
			
			
			
			//if(smokeSelector == active){
			
				//Log.i(TAG, " are active  " + active ); 
				//somkeList.push((float)active);
				/* for(Particle x : smokeArray){

					 
					x.smokeAlpha = smokeTimerAlpha--;
					x.posHeight++;
					x.posWidth++; 	
				}*/
				
			//}
			
			//if(smokeSelector != active){
				//somkeList.pop();
				//Log.i(TAG, " Not active  " + active ); 
				//smokeArray[active].smokeAlpha = 0;
				//smokeArray[active].posHeight = 1;
				//smokeArray[active].posWidth = 1;
			//}
			
		//}
		
		
	
		
	
		if(fireM22){
			smokeTimer -= 1;
			somkeFire = true;
		}
		
		
		/*smokeArray[0].smokeAlpha-= smokeTimerAlpha;
		smokeArray[1].smokeAlpha-= smokeTimerAlpha;
		smokeArray[2].smokeAlpha-= smokeTimerAlpha;
		smokeArray[3].smokeAlpha-= smokeTimerAlpha;
		smokeArray[4].smokeAlpha-= smokeTimerAlpha;
		smokeArray[5].smokeAlpha-= smokeTimerAlpha;
		smokeArray[6].smokeAlpha-= smokeTimerAlpha;
		smokeArray[7].smokeAlpha-= smokeTimerAlpha;
		smokeArray[8].smokeAlpha-= smokeTimerAlpha;
		smokeArray[9].smokeAlpha-= smokeTimerAlpha;
		smokeArray[10].smokeAlpha-= smokeTimerAlpha;
		smokeArray[11].smokeAlpha-= smokeTimerAlpha;
		smokeArray[12].smokeAlpha-= smokeTimerAlpha;
		smokeArray[13].smokeAlpha-= smokeTimerAlpha;
		smokeArray[14].smokeAlpha-= smokeTimerAlpha;
		smokeArray[15].smokeAlpha-= smokeTimerAlpha;
		smokeArray[16].smokeAlpha-= smokeTimerAlpha;
		smokeArray[17].smokeAlpha-= smokeTimerAlpha;
		smokeArray[18].smokeAlpha-= smokeTimerAlpha;
		smokeArray[19].smokeAlpha-= smokeTimerAlpha;
		smokeArray[20].smokeAlpha-= smokeTimerAlpha;
		smokeArray[21].smokeAlpha-= smokeTimerAlpha;
		smokeArray[22].smokeAlpha-= smokeTimerAlpha;
		smokeArray[23].smokeAlpha-= smokeTimerAlpha;
		smokeArray[24].smokeAlpha-= smokeTimerAlpha;
		smokeArray[25].smokeAlpha-= smokeTimerAlpha;
		smokeArray[26].smokeAlpha-= smokeTimerAlpha;
		smokeArray[27].smokeAlpha-= smokeTimerAlpha;
		smokeArray[28].smokeAlpha-= smokeTimerAlpha;*/
		

			
			
			//int stopSmoke = (int)Player.playerPosX + Player.playerWidth /2 - 10;
			
		 
			
		
			
			//Log.i(TAG, " somkeWiating " + somkeWiating); 
			//Log.i(TAG, " stopSmoke" + stopSmoke); 
			//Log.i(TAG, " stopSmoke" + smokeArray[smokeSelector].posX); 
			
			if(somkeWiating){//reset
				//smokeArray[smokeSelector].smokeAlpha = 255;	
				smokeArray[smokeSelector].dontDrawSmoke = true;
				 
			}else{//go
				
				smokeArray[smokeSelector].dontDrawSmoke = false;
				if(smokeArray[smokeSelector].smokeAlpha <= 0){
					smokeArray[smokeSelector].smokeAlpha = 0;	
				}else{
					//smokeArray[smokeSelector].smokeAlpha -= smokeTimerAlpha;
					
				}
			}
			
			
			
			
			
			
			/*if(smokeArray[smokeSelector].smokeAlpha <= 0){
				smokeArray[smokeSelector].smokeAlpha = 0;
				smokeArray[smokeSelector].dontDrawSmoke = true;
			}else{
				//smokeArray[smokeSelector].smokeAlpha -= 20;	
				
			}*/
			
			
			
		
		
		
		if(smokeTimer < 1){
		 smokeTimer = 2;
		 smokeArray[smokeSelector].posX = smokeArray[smokeSelector].posX;
		 smokeArray[smokeSelector].posY = smokeArray[smokeSelector].posY;
			if(fireM22){ 
				smokeSelector++;
			}
		}else{
		 smokeArray[smokeSelector].posX = m22XPointer;
		 smokeArray[smokeSelector].posY = m22YPointer;
		 smokeArray[smokeSelector].posHeight = 1;	
		 smokeArray[smokeSelector].posWidth = 1;	
		 //smokeArray[smokeSelector].smokeAlpha = 255;
		 
		}
		
		
		 
		 if(somkeFire){ 
			 
				smokeArray[0].posHeight+= smokeSize;
				smokeArray[1].posHeight+= smokeSize;
				smokeArray[2].posHeight+= smokeSize;
				smokeArray[3].posHeight+= smokeSize;
				smokeArray[4].posHeight+= smokeSize;
				smokeArray[5].posHeight+= smokeSize;
				smokeArray[6].posHeight+= smokeSize;
				smokeArray[7].posHeight+= smokeSize;
				smokeArray[8].posHeight+= smokeSize;
				smokeArray[9].posHeight+= smokeSize;
				smokeArray[10].posHeight+= smokeSize;
				smokeArray[11].posHeight+= smokeSize;
				smokeArray[12].posHeight+= smokeSize;
				smokeArray[13].posHeight+= smokeSize;
				smokeArray[14].posHeight+= smokeSize;
				smokeArray[15].posHeight+= smokeSize;
				smokeArray[16].posHeight+= smokeSize;
				smokeArray[17].posHeight+= smokeSize;
				smokeArray[18].posHeight+= smokeSize;
				smokeArray[19].posHeight+= smokeSize;
				smokeArray[20].posHeight+= smokeSize;
				smokeArray[21].posHeight+= smokeSize;
				smokeArray[22].posHeight+= smokeSize;
				smokeArray[23].posHeight+= smokeSize;
				smokeArray[24].posHeight+= smokeSize;
				smokeArray[25].posHeight+= smokeSize;
				smokeArray[26].posHeight+= smokeSize;
				smokeArray[27].posHeight+= smokeSize;
				smokeArray[28].posHeight+= smokeSize;
				smokeArray[29].posHeight+= smokeSize;
				
				smokeArray[0].posWidth+= smokeSize;
				smokeArray[1].posWidth+= smokeSize;
				smokeArray[2].posWidth+= smokeSize;
				smokeArray[3].posWidth+= smokeSize;
				smokeArray[4].posWidth+= smokeSize;
				smokeArray[5].posWidth+= smokeSize;
				smokeArray[6].posWidth+= smokeSize;
				smokeArray[7].posWidth+= smokeSize;
				smokeArray[8].posWidth+= smokeSize;
				smokeArray[9].posWidth+= smokeSize;
				smokeArray[10].posWidth+= smokeSize;
				smokeArray[11].posWidth+= smokeSize;
				smokeArray[12].posWidth+= smokeSize;
				smokeArray[13].posWidth+= smokeSize;
				smokeArray[14].posWidth+= smokeSize;
				smokeArray[15].posWidth+= smokeSize;
				smokeArray[16].posWidth+= smokeSize;
				smokeArray[17].posWidth+= smokeSize;
				smokeArray[18].posWidth+= smokeSize;
				smokeArray[19].posWidth+= smokeSize;
				smokeArray[20].posWidth+= smokeSize;
				smokeArray[21].posWidth+= smokeSize;
				smokeArray[22].posWidth+= smokeSize;
				smokeArray[23].posWidth+= smokeSize;
				smokeArray[24].posWidth+= smokeSize;
				smokeArray[25].posWidth+= smokeSize;
				smokeArray[26].posWidth+= smokeSize;
				smokeArray[27].posWidth+= smokeSize;
				smokeArray[28].posWidth+= smokeSize;
				smokeArray[29].posWidth+= smokeSize;
				
				smokeArray[0].posY += gravitySmoke;
				smokeArray[1].posY += gravitySmoke;
				smokeArray[2].posY += gravitySmoke;
				smokeArray[3].posY += gravitySmoke;
				smokeArray[4].posY += gravitySmoke;
				smokeArray[5].posY += gravitySmoke;
				smokeArray[6].posY += gravitySmoke;
				smokeArray[7].posY += gravitySmoke;
				smokeArray[8].posY += gravitySmoke;
				smokeArray[9].posY += gravitySmoke;
				smokeArray[10].posY += gravitySmoke;
				smokeArray[11].posY += gravitySmoke;
				smokeArray[12].posY += gravitySmoke;
				smokeArray[13].posY += gravitySmoke;
				smokeArray[14].posY += gravitySmoke;
				smokeArray[15].posY += gravitySmoke;
				smokeArray[16].posY += gravitySmoke;
				smokeArray[17].posY += gravitySmoke;
				smokeArray[18].posY += gravitySmoke;
				smokeArray[19].posY += gravitySmoke;
				smokeArray[20].posY += gravitySmoke;
				smokeArray[21].posY += gravitySmoke;
				smokeArray[22].posY += gravitySmoke;
				smokeArray[23].posY += gravitySmoke;
				smokeArray[24].posY += gravitySmoke;
				smokeArray[25].posY += gravitySmoke;
				smokeArray[26].posY += gravitySmoke;
				smokeArray[27].posY += gravitySmoke;
				smokeArray[28].posY += gravitySmoke;
				smokeArray[29].posY += gravitySmoke;
				
				 
				}
		
		
		
		
		if(smokeSelector > 29){
			smokeSelector = 0;
		
			smokeArray[0].posHeight = smokeArray[0].posHeight; 
			smokeArray[1].posHeight = smokeArray[1].posHeight; 
			smokeArray[2].posHeight = smokeArray[2].posHeight; 
			smokeArray[3].posHeight = smokeArray[3].posHeight; 
			smokeArray[4].posHeight = smokeArray[4].posHeight; 
			smokeArray[5].posHeight = smokeArray[5].posHeight; 
			smokeArray[6].posHeight = smokeArray[6].posHeight; 
			smokeArray[7].posHeight = smokeArray[7].posHeight; 
			smokeArray[8].posHeight = smokeArray[8].posHeight; 
			smokeArray[9].posHeight = smokeArray[9].posHeight; 
			smokeArray[10].posHeight = smokeArray[10].posHeight; 
			smokeArray[11].posHeight = smokeArray[11].posHeight; 
			smokeArray[12].posHeight = smokeArray[12].posHeight; 
			smokeArray[13].posHeight = smokeArray[13].posHeight; 
			smokeArray[14].posHeight = smokeArray[14].posHeight; 
			smokeArray[15].posHeight = smokeArray[15].posHeight; 
			smokeArray[16].posHeight = smokeArray[16].posHeight; 
			smokeArray[17].posHeight = smokeArray[17].posHeight; 
			smokeArray[18].posHeight = smokeArray[18].posHeight; 
			smokeArray[19].posHeight = smokeArray[19].posHeight; 
			smokeArray[20].posHeight = smokeArray[20].posHeight; 
			smokeArray[21].posHeight = smokeArray[21].posHeight; 
			smokeArray[22].posHeight = smokeArray[22].posHeight; 
			smokeArray[23].posHeight = smokeArray[23].posHeight; 
			smokeArray[24].posHeight = smokeArray[24].posHeight; 
			smokeArray[25].posHeight = smokeArray[25].posHeight; 
			smokeArray[26].posHeight = smokeArray[26].posHeight; 
			smokeArray[27].posHeight = smokeArray[27].posHeight; 
			smokeArray[28].posHeight = smokeArray[28].posHeight; 
			smokeArray[29].posHeight = smokeArray[29].posHeight; 
			
			smokeArray[0].posWidth = smokeArray[0].posWidth;
			smokeArray[1].posWidth = smokeArray[1].posWidth;
			smokeArray[2].posWidth = smokeArray[2].posWidth;
			smokeArray[3].posWidth = smokeArray[3].posWidth;
			smokeArray[4].posWidth = smokeArray[4].posWidth;
			smokeArray[5].posWidth = smokeArray[5].posWidth;
			smokeArray[6].posWidth = smokeArray[6].posWidth;
			smokeArray[7].posWidth = smokeArray[7].posWidth;
			smokeArray[8].posWidth = smokeArray[8].posWidth;
			smokeArray[9].posWidth = smokeArray[9].posWidth;
			smokeArray[10].posWidth = smokeArray[10].posWidth;
			smokeArray[11].posWidth = smokeArray[11].posWidth;
			smokeArray[12].posWidth = smokeArray[12].posWidth;
			smokeArray[13].posWidth = smokeArray[13].posWidth;
			smokeArray[14].posWidth = smokeArray[14].posWidth;
			smokeArray[15].posWidth = smokeArray[15].posWidth;
			smokeArray[16].posWidth = smokeArray[16].posWidth;
			smokeArray[17].posWidth = smokeArray[17].posWidth;
			smokeArray[18].posWidth = smokeArray[18].posWidth;
			smokeArray[19].posWidth = smokeArray[19].posWidth;
			smokeArray[20].posWidth = smokeArray[20].posWidth;
			smokeArray[21].posWidth = smokeArray[21].posWidth;
			smokeArray[22].posWidth = smokeArray[22].posWidth;
			smokeArray[23].posWidth = smokeArray[23].posWidth;
			smokeArray[24].posWidth = smokeArray[24].posWidth;
			smokeArray[25].posWidth = smokeArray[25].posWidth;
			smokeArray[26].posWidth = smokeArray[26].posWidth;
			smokeArray[27].posWidth = smokeArray[27].posWidth;
			smokeArray[28].posWidth = smokeArray[28].posWidth;
			smokeArray[29].posWidth = smokeArray[29].posWidth;
			
			 //somkeFire = false;
		}
		
		
		
	
		
		
		
		
		
		
		
		if(m22SeletorNum > 7){
			m22SeletorNum = 0;
		}

				if(rocketName == "smallRocket"){
					
					//Log.i(TAG, "working ");
					//Log.i(TAG, "working " + rocketReloadNum);
					
          		if(rocketReloadNum > 1){
          			rocketReloadNum = 0;
          			showsmallRocketAlpha = 255;
          			smallRocketY -= smallRocketSpeed;
          			smallRocketX = Player.playerPosX + 50;
          			//Log.i(TAG, "Reload r");
          		}else{
          			showsmallRocketAlpha = 0;
          		}
          		
          		
          		
          		if(rocketReloadNum2 > 2){
              		rocketReloadNum2 = 0;
              		showsmallRocket2Alpha = 255;
              		smallRocket2Y -= smallRocketSpeed;
          			smallRocket2X = Player.playerPosX + 10;
              	}else{
              		showsmallRocket2Alpha = 0;	
              	}
      			
      	
          		if(smallRocketY < -0){
          			smallRocketY = Player.playerPosY;
          			smallRocketX = Player.playerPosX + 50;
              	}
      			
      			if(smallRocket2Y < -0){
      				smallRocket2Y = Player.playerPosY;
      				smallRocket2X = Player.playerPosX + 10;
          		}
		
					
				}
		 
      			
    
          		if(bulletName == "single"){
          			showBulletAlpha = 255;
          			bulletY -= bulletSpeed;
          			bulletX = Player.playerPosX + 38;
          			//Log.i(TAG, "tracer ");
          		}else if(bulletName == "double"){
          			showBulletAlpha = 255;
          			//mp.start();
          			bulletY -= bulletSpeed;
          			bulletX = Player.playerPosX + 48;
          			bulletReloadNum++;
          			
          			bullet2Y -= bulletSpeed;
          			bullet2X = Player.playerPosX + 28;
          			
          			
          		}else{
          			showBulletAlpha = 0;
          			//mp.reset();
          		}
          		
          		
          		
          		 if(bulletName == "single"){
               		if(bulletY < -0){
               			bulletY = Player.playerPosY;
               			bulletX = Player.playerPosX + 38;
               		} 
          		 }else if(bulletName == "double"){
          			if(bulletY < -0){
                  		bulletY = Player.playerPosY;
               			bulletX = Player.playerPosX + 48;
                  	}
          			
          			if(bullet2Y < -0){
              			bullet2Y = Player.playerPosY;
              			bullet2X = Player.playerPosX + 28;
              		}
          			 
          		 }
          		 
           		
      		
      		if(cursherBulletY < -0){
      			reloadcursherBullet = true;
      		}
      		
      		if(cursherBulletY > 480){
      			reloadcursherBullet = true;
      		}
      		
      		if(cursherBulletX > 300){
      			reloadcursherBullet = true;
      		}
      		
      		if(cursherBulletX < -0){
      			reloadcursherBullet = true;
      		}
      		
      		if(reloadcursherBullet){
      			reloadCrusherGun();
      		}

      		
      	
      		if(cursherBulletY1 < -0){
      			reloadcursherBullet = true;
      		}
      		
      		if(cursherBulletY1 > 480){
      			reloadcursherBullet1 = true;
      		}
      		
      		if(cursherBulletX1 > 300){
      			reloadcursherBullet1 = true;
      		}
      		
      		if(cursherBulletX1 < -0){
      			reloadcursherBullet1 = true;
      		}
      		
      		if(reloadcursherBullet1){
      			reloadCrusherGun1();
      		}
      		
      		
      		
      		
      		if(cursherBulletY2 < -0){
      			reloadcursherBullet2 = true;
      		}
      		
      		if(cursherBulletY2 > 480){
      			reloadcursherBullet2 = true;
      		}
      		
      		if(cursherBulletX2 > 300){
      			reloadcursherBullet2 = true;
      		}
      		
      		if(cursherBulletX2 < -0){
      			reloadcursherBullet2 = true;
      		}
      		
      		if(reloadcursherBullet2){
      			reloadCrusherGun2();
      		}
      	  
      		
      		
      		
      		if(reloadcursherBullet == false){
      			
      			if(cursherBulletReloadNum > 2){
          			reloadcursherBullet = false;
      			cursherBulletDist = Math.sqrt(Player.playerPosY - Crusher.cGun5Y); // later
      			showcursherBulletAlpha = 255;
      			cursherBulletX += cursherBulletXSpeed;
          		cursherBulletY += cursherBulletYSpeed;
      			}
      		}
      		
      		if(reloadcursherBullet1 == false){
      			
      			
      			if(cursherBulletReloadNum1 > 3){
          			reloadcursherBullet1 = false;
      			showcursherBulletAlpha1 = 255;
      			cursherBulletX1 += cursherBulletXSpeed1;
          		cursherBulletY1 += cursherBulletYSpeed1;
      			}
      		}
      		
      		if(reloadcursherBullet2 == false){
      		
      		
      			if(cursherBulletReloadNum2 > 4){
          			reloadcursherBullet2 = false;
      			showcursherBulletAlpha2 = 255;
      			cursherBulletX2 += cursherBulletXSpeed2;
          		cursherBulletY2 += cursherBulletYSpeed2;
      			}
      		}
      		
      	
      		if(fireTracer){
      		//tracer
      		showtracerAlpha = 255;
      		tracerX = Player.playerPosX + 45; 
      		tracerY = Player.playerPosY + 38;
      		tracerHeading += 80; // speed around
      		tracerXSpeed = Math.cos(tracerHeading) * tracerSpeed; 
      		tracerYSpeed = Math.sin(tracerHeading) * tracerSpeed;
      		}
      		
      		
      		
      	/*	
      		if(SNESController.AhitIs == true){
          		
          		if(SNESController.fireOne){ 
          			SNESController.fireOne = false; 
          			SNESController.reloadedHellFire = true;
          			showHellfire = false;
          			showHellfireAlpha = 0;
          			hellFire.stop();
          	//	Log.i(TAG, "working ");
          		}
          		
          		
          		
          		if(hellfireY < -0){
          			hellfireY = Player.playerPosY;
          			hellfireX = Player.playerPosX + 34;
              		SNESController.AhitIs = false;
              		SNESController.reloadedHellFire = true;
              		showHellfire = false;
              		showHellfireAlpha = 0;
              		hellFire.stop();
              		//Log.i(TAG, "Reload ");
              	
          		}else{
          			hellFire.start();
          			hellFire.run();
          			showHellfireAlpha = 255;
          			hellfireY -= GameTable.hellfireSpeed;
         			SNESController.reloadedHellFire = false;
          		}
          		
          	
          	}*/
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		/*if(SNESController.BhitIs == true){
          		
          		if(SNESController.fireTwo){ 
          			
          			SNESController.fireTwo = false; 
          			SNESController.reloadedSuperBomb = true;
          			
          	
          			SNESController.reloadedSuperBomb = false;*/
          			
          			
          		//}
          		
          	
          	//}
      	

	
/*
 	if(Player.playerExplodeIs != true){
 		
 	     if(Player.playerIsHit){
 	    	Player.playerHitNum =  Player.playerHitNum + getPOD(); //% change hit
 				//upDateBossHitNum -= 1 + weaponsPower; // gui
 					//Log.i(TAG, "playerHitNum  " + playerHitNum);
 					if(Player.playerHitNum > Player.playerLife){
 						Player.playerIsHit  = false;
 						Player.playerExplodeIs = true;
 						
 					}
 			
 			}
 	 	
 	 	}
 	   
 	
 	//weapon power table
    if(Player.playerExplodeIs != true){
		if(Player.playerRect.intersect(Bullet.cursherBulletRect)){
			setPOD(GameTable.bulletPower);
			Player.playerIsHit = true;
		}else if(Player.playerRect.intersect(BadCoper1.gBulletRect)){
			setPOD(GameTable.badChoper1bulletPower);
			Player.playerIsHit = true;
		}else{
			Player.playerIsHit = false;
		}
	}
 
    
    if(Player.playersLeft <= 0){
    	GameView.gameOver = true;
    	
    	
    	
    }*/
      	
      		 
      	    if(Player.playersLeft <= 0){
      	    	GameView.gameOver = true;
      	    } 		
      		
      	    
      	    if(shipBlowUpTrue){
      	    	shipBlowUp.start();
      	    	shipBlowUpTrue = false;
      	    }else{
      	    	//shipBlowUp.reset();
      	    	//shipBlowUp.release();
      	    //	shipBlowUp.stop();
      	    }
      	

      	
      		
      		//fireSel = 1;
      		
      		for(int S = 0; S < miniBArray.length; S++){
      			
      			//Log.i(TAG, "miniBArray " + S);
      		   
      			if(miniBArray[S].gBulletY == 24.0){
      				/*switch(S){
      				
      				case 0:
      					 miniBArray[0].notInFlight = true; 
      					 //Log.i(TAG, "miniBArray 0 Wating");
      				    break;
      				
      				case 1:
      					miniBArray[1].notInFlight = true; 
      					//Log.i(TAG, "miniBArray 1 Wating");
          				break;
          				
      				case 2:
      					miniBArray[2].notInFlight = true; 
      					//Log.i(TAG, "miniBArray 2 Wating");
          				break;
          				
          			case 3:
          				miniBArray[3].notInFlight = true; 
          				//Log.i(TAG, "miniBArray 3 Wating");	
              			break;	
      				
      				}
      				*/
      				
      				
      			}
      		
      			
      			//for(fireSel = 0; fireSel < S; fireSel++){
          			
      			//}
      			
      			if(fireSel == S){
      			//Log.i(TAG, "miniBArray " + S);
      			//Log.i(TAG, "fireSel " + fireSel);
      			}
      			
      			if(miniBArray[S].gBulletY != 24.0){
  					miniBArray[S].inFlight = true; 
  					//Log.i(TAG, "inFlight " + S );
  				} 
      			
      			if(miniBArray[S].gBulletY == 24.0){
      				miniBArray[S].inFlight = false;
      				//Log.i(TAG, " " + S + "in flight false");
      				
      				
      			}
      			
  				
      			
      			
      		}
      		
    
      		if(time > 120){
    			time = 1;
    			fireSel++;
    		}else{
    			time += 30;	
    		}
      		
      		/*if(fireSel >= 6 && miniBArray[3].inFlight == false){
      			fireSel = 0;
      		}*/
      		if(fireSel >= 120){
      			fireSel = 0;
      		}
      
        
       //Log.i(TAG, "clock " + time);
       // Log.i(TAG, "FIRE " + FIRE);
        
		if(fireSel >= 1){
		miniB.updateGBullet();
		}
		if(fireSel >= 2){
		miniB1.updateGBullet();
		}
		if(fireSel >= 3){
		miniB2.updateGBullet();
		}
		if(fireSel >= 4){	
		//miniB3.updateGBullet();
		}
	
		/*//if in flight stay in until destroyed
			if(miniBArray[0].inFlight == true){
				miniB.updateGBullet();
			}
			if(miniBArray[1].inFlight == true){
				miniB.updateGBullet();
			}
			if(miniBArray[2].inFlight == true){
				miniB.updateGBullet();
			}
			if(miniBArray[3].inFlight == true){
				miniB.updateGBullet();
			}
		*/
		
		
		
		
		
 
      	 
      	m22ReloadNum -= 0.1;
      	if(m22ReloadNum < 0){
      		fireM22 = true; 
			m22ReloadNum = GameTable.m22ReloadNumTime; 
			somkeWiating = false;
		}
      	
      	
      
      	m22DX = (GameMain.playerTargetX + Player.playerTargetWidth /2)- (m22XPointer + m22Width /2);
      	m22DY = (GameMain.playerTargetY + Player.playerTargetHeight /2) - (m22YPointer + m22Height /2);
    	m22AngleRot = Math.atan2(m22DX,m22DY);
    	m22AngleHead = m22AngleRot * 180 / Math.PI;
  		
  		
		m22Heading = Math.atan2(GameMain.playerTargetY - Player.playerPosY ,GameMain.playerTargetX - Player.playerPosX);
		m22SpeedX = Math.cos(m22Heading) * m22Speed; 
		m22SpeedY = Math.sin(m22Heading) * m22Speed;
		
		
		//fireM22
      	if(Player.playerTargetVisible == 255){
  			m22XPointer += m22SpeedX;
  			m22YPointer += m22SpeedY; 
  			reloadM22 = false;
  			m22Speed += GameTable.m22SpeedSetting;
  			somkeWiating = false;
  			
  		}else{
  			somkeWiating = true;
  			m22XPointer = (int)Player.playerPosX + (int)Player.playerWidth /2 -10;
  			m22YPointer = (int)Player.playerPosY + (int)Player.playerHeight /2 + -10;
  			
  			m22Rot = m22Angle * m22radians;
 			m22Angle = Math.atan2(GameMain.playerTargetY - Player.playerPosY ,GameMain.playerTargetX - Player.playerPosX);
  	   		m22Heading = (m22Rot * 360 / Math.PI);
  	   		
  	   		
         	
  	   	}
      	
      	
      
      	
      		if(m22YPointer < -0){
	  			reloadM22 = true;
	  		}
	  		
	  		if(m22YPointer > 480){
	  			reloadM22 = true;
	  		}
	  		
	  		if(m22XPointer > 300){
	  			reloadM22 = true;
	  		}
	  		
	  		if(m22XPointer < -0){
	  			reloadM22 = true;
	  		}
	  		
	  		
	  		if(reloadM22 == true){
	  			fireM22 = false;
	  			reloadM22Missle();
	  			reloadM22 = false;
	  			
	  		}
	  		
	  		
	  		//clock = Math.PI/360;
	 		//clockRot = clockHeading * clock;
	 		//clockHeading = (clockRot * 360 / Math.PI);
	  		
	  		//System.currentTimeMillis();
			//clockXSpeed = Math.cos(clockHeading) * clockSpeed; 
			//clockYSpeed = Math.sin(clockHeading) * clockSpeed;
			//clockRot = Math.atan2(clockX, clockY);
	 	
	  		
		}//run
	
	 return;	
	}
	
	
	
	
	public void reloadCrusherGun(){
		reloadcursherBullet = false;
		
			showcursherBulletAlpha = 0;
			cursherBulletX = Crusher.cGun5X + Crusher.cGun5Width /2;
			cursherBulletY = Crusher.cGun5Y + Crusher.cGun5Height /2;
			cursherBulletHeading = Math.atan2(Player.playerPosY - Crusher.cGun5Y,Player.playerPosX - Crusher.cGun5X);
  			cursherBulletXSpeed = Math.cos(cursherBulletHeading) * cursherBulletSpeed; 
  			cursherBulletYSpeed = Math.sin(cursherBulletHeading) * cursherBulletSpeed;
  	
  		 return;	
	}
	
	public void reloadCrusherGun1(){
		reloadcursherBullet1 = false;
			showcursherBulletAlpha1 = 0;
			cursherBulletX1 = Crusher.cGun5X + Crusher.cGun5Width /2;
			cursherBulletY1 = Crusher.cGun5Y + Crusher.cGun5Height /2;
			
			cursherBulletHeading = Math.atan2(Player.playerPosY - Crusher.cGun5Y,Player.playerPosX - Crusher.cGun5X);
		
  			cursherBulletXSpeed1 = Math.cos(cursherBulletHeading) * cursherBulletSpeed; 
  			cursherBulletYSpeed1 = Math.sin(cursherBulletHeading) * cursherBulletSpeed;
	
  			//Log.i(TAG, "Reload1 ");
  		 return;	
	}
	
	public void reloadCrusherGun2(){
		reloadcursherBullet2 = false;
			showcursherBulletAlpha2 = 0;
			cursherBulletX2 = Crusher.cGun5X + Crusher.cGun5Width /2;
			cursherBulletY2 = Crusher.cGun5Y + Crusher.cGun5Height /2;
		
			cursherBulletHeading = Math.atan2(Player.playerPosY - Crusher.cGun5Y,Player.playerPosX - Crusher.cGun5X);
	
  			cursherBulletXSpeed2 = Math.cos(cursherBulletHeading) * cursherBulletSpeed; 
  			cursherBulletYSpeed2 = Math.sin(cursherBulletHeading) * cursherBulletSpeed;
  			
  			//Log.i(TAG, "Reload2 ");
  		 return;	
	}
	
	
	
	public boolean reloadM22Missle(){
		//reloadM22 = false;
		m22Speed = 0.2;
		m22XPointer = Player.playerPosX + Player.playerWidth /2 - 10;
		m22YPointer = Player.playerPosY + Player.playerHeight /2 + -10;
		
		
	    m22Heading = Math.atan2(GameMain.playerTargetY - Player.playerPosY ,GameMain.playerTargetX - Player.playerPosX);
		m22SpeedX = Math.cos(m22Heading) * m22Speed; 
		m22SpeedY = Math.sin(m22Heading) * m22Speed;
		
		
  		
  	return true;	
	}
	

	
	

	//power of destruction 
	public void setPOD(int wep){
		
	//	Log.i(TAG, "weaponsDamage   " + weaponsDamage );
		
		switch(wep){
		case 1 :
			weaponsDamage = wep; 
		break;
		
		case 100 :
			weaponsDamage = wep; 
		break;
		
		case 200 :
			weaponsDamage = wep; 
		break;	
		
		case 10000 :
			weaponsDamage = wep; 
		break;	
		
		}
		 
	return;		
	}

	public int getPOD(){
	return weaponsDamage; 
	}
	
}
