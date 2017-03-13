package com.TP;



import java.util.List;
import java.util.Random;
import java.util.Stack;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;

class GameView extends SurfaceView implements SurfaceHolder.Callback {

	class GameThread extends Thread{
		public static final String TAG = "moto";
        /*
         * Difficulty setting constants
         */
    	/*public int targetFPS = 40; 
        public int timeStep = (1000 / targetFPS); 
        public int iterations = 5; */
        
        public int targetFPS = 30; 
	    public float timeStep = 10.0f / targetFPS; 
	    public int iterations = 5; 

        public boolean allCanGo = false;
        public boolean gameLoadded = false;
        public double gameOverTimer = 600; 
     
        //public Ufo ufo;
    
        
        public Bitmap loader;
    	public Bitmap loaderLabel;
    	public Bitmap gameOverLabel;
        
       // public PowerUps powerUps;
        public BadCoper1 badCoper01;
      // public BadWeapons badWeapons;
        public Player player;
        public GUI gui;
        public Maps map1;
        public Sky sky1;
        public Sky sky2;
        //public DeadSmoke deadSmoke1;
       // public Explode explode1;
        public Bullet bullet1;
       // public MiniGun miniGun1;
       // public Particle particle1;
        
        public Crusher crusher1;
        
        public Ship smallCruiser1;
        public Ship smallCruiser2;
        public Ship smallCruiser3;
        public Ship smallCruiser4;
        public Ship smallCruiser5;
        public Ship smallCruiser6;
        public Ship smallCruiser7;
        
        public Ship ptBoat1;
        public Ship ptBoat2;
        public Ship ptBoat3;
        public Ship ptBoat4;
        public Ship ptBoat5;
        public Ship ptBoat6;
        public Ship ptBoat7;
       
   
      
       
    	
    
    	
        public static final int DIFFICULTY_EASY = 0;
        public static final int DIFFICULTY_HARD = 1;
        public static final int DIFFICULTY_MEDIUM = 2;
       
        public static final int PHYS_DOWN_ACCEL_SEC = 0;
        public static final int PHYS_FIRE_ACCEL_SEC = 90;
        public static final int PHYS_FUEL_INIT = 600; // 
        public static final int PHYS_FUEL_MAX = 600;
        public static final int PHYS_FUEL_SEC = 10;
        public static final int PHYS_SLEW_SEC = 120; // degrees/second rotate
        public static final int PHYS_SPEED_HYPERSPACE = 180;
        public static final int PHYS_SPEED_INIT = 0;
        public static final int PHYS_SPEED_MAX = 120;
     
        public static final int STATE_LOSE = 1;
        public static final int STATE_PAUSE = 2;
        public static final int STATE_READY = 3;
        public static final int STATE_RUNNING = 4;
        public static final int STATE_WIN = 5;

        public static final int TARGET_ANGLE = 18; // > this angle means crash
        public static final int TARGET_BOTTOM_PADDING = 17; // px below gear
        public static final int TARGET_PAD_HEIGHT = 8; // how high above ground
       
      
        public static final int TARGET_SPEED = 28; // > this speed means crash
        public static final double TARGET_WIDTH = 1.6; // width of target
        
        public static final int UI_BAR = 100; // width of the bar(s)
        public static final int UI_BAR_HEIGHT = 10; // height of the bar(s)
        //private static final String KEY_DIFFICULTY = "mDifficulty";
        //private static final String KEY_DX = "mDX";

        //private static final String KEY_DY = "mDY";
        //private static final String KEY_FUEL = "mFuel";
        //private static final String KEY_GOAL_ANGLE = "mGoalAngle";
        //private static final String KEY_GOAL_SPEED = "mGoalSpeed";
        //private static final String KEY_GOAL_WIDTH = "mGoalWidth";

        //private static final String KEY_GOAL_X = "mGoalX";
        //private static final String KEY_HEADING = "mHeading";
        //private static final String KEY_LANDER_HEIGHT = "mLanderHeight";
        //private static final String KEY_LANDER_WIDTH = "mLanderWidth";
        //private static final String KEY_WINS = "mWinsInARow";

        //private static final String KEY_X = "playerPosX";
        //private static final String KEY_Y = "playerPosY";
        
        //private int key;
        private boolean KEYUP;
        private boolean KEYRIGHT;
        private boolean KEYLEFT;
        private boolean KEYDOWN;
        
        public boolean crash0 = false; 
       
        private int mCanvasHeight;
        private int mCanvasWidth;
      
        
        private int mDifficulty;
        private double mDX;
        private double mDY;
        private boolean mEngineFiring;
        private double mFuel;
        //private int mGoalAngle;
        private int mGoalSpeed;
        private double mFriction = 0.98;
        
        private float lstartX = 9f;
    	private float lstartY = 418f;
    	private float lstopX = 9f;
    	private float lstopY = 418f;
    	
    	//public Paint loaderTextPaint;
    	//public int loaderTextPaintAlpha = 255;
    	//public String loaderString = "loading resources";
		
		
    	public Paint mLoaderPaint;
    	

        /** Message handler used by thread to interact with TextView */
        public Handler mHandler;
        /**
         * Lander heading in degrees, with 0 up, 90 right. Kept in the range
         * 0..360.
         */
        public double mHeading;

        /** Pixel height of lander image. */
       // private int mLanderHeight;

        /** What to draw for the Lander in its normal state */
        //private Drawable mLanderImage;

        /** Pixel width of lander image. */
        //private int mLanderWidth;

        /** Used to figure out elapsed time between frames */
        private long mLastTime;

        /** Paint to draw the lines on screen. */
        private Paint mLinePaint;

        /** "Bad" speed-too-high variant of the line color. */
        private Paint mLinePaintBad;

        /** The state of the game. One of READY, RUNNING, PAUSE, LOSE, or WIN */
        private int mMode;

        /** Currently rotating, -1 left, 0 none, 1 right. */
        private int mRotating;

        /** Indicate whether the surface has been created & is ready to draw */
        private boolean mRun = false;

        /** Scratch rect object. */
        private RectF mScratchRect;
       
       
        /** Handle to the surface manager object we interact with */
        public SurfaceHolder mSurfaceHolder;

        /** Number of wins in a row. */
        private int mWinsInARow;
       
        //private Random mRandom = new Random();
       
        private Resources res;
       
       
        //private double pSpeed = 0;
        public GameThread(SurfaceHolder surfaceHolder, Context context,
                Handler handler) {
        	
        	res = context.getResources();
            loader = BitmapFactory.decodeResource(res, R.drawable.logoscreen);
      		loaderLabel = BitmapFactory.decodeResource(res, R.drawable.loading);
      		gameOverLabel = BitmapFactory.decodeResource(res, R.drawable.gameover);
    		
      		
        
            // get handles to some important objects
            mSurfaceHolder = surfaceHolder;
            mHandler = handler;
            mContext = context;
            
            //ufo = new Ufo(Math.random() * 30, 1.0);
            
            
            for(int b = 0; b < birdArray.length; b++){
            	birdArray[b] = new Bird();
            	birdArray[b].buildBird(mContext);
            }
  
            //powerUps = new PowerUps();
            //powerUps.buildPowerUps(mContext);
            
            badCoper01 = new BadCoper1();
            badCoper01.buildbadCoper1(mContext);
            
            //badWeapons = new BadWeapons(); 
            //badWeapons.buildBadWeapons(mContext);
            //loaderTextPaint = new Paint();
            //loaderTextPaint.setARGB( loaderTextPaintAlpha , 255, 255, 255);
            //loaderTextPaint.setTextSize(12);
            
            
            
            player = new Player();
            player.buildPlayer(mContext);
            
            //screenSyncUp = Player.playerHeight * 3;
            screenSyncUp = canvasHeight / 3;
            
            screenSyncDown = screenSyncUp / 2;
            
           // miniGun1 = new MiniGun();
           // miniGun1.buildMiniGun(mContext);
            
            gui = new GUI();
            gui.buildGUI(mContext);
            
            //particle1 = new ParticleSystem();
            
            map1 = new Maps();
            map1.buildMaps(mContext);
            
            sky1 = new Sky();
            sky1.buildSky(mContext);
            sky2 = new Sky();
            sky2.buildSky(mContext);
            
            //explode1 = new Explode();
            //explode1.buildExplode(mContext);
            
            bullet1 = new Bullet();
            bullet1.buildBullet(mContext);
            
            crusher1 = new Crusher();
            crusher1.buildCrusher(mContext);
            
            smallCruiser1 = new Ship(100,-905,25,100,255,0);
           //smallCruiser1 = new Ship(100,200,25,100,255,0);//test
            smallCruiser1.buildShip(mContext);
            
            smallCruiser2 = new Ship(60,-1169,25,100,255,0);
           // smallCruiser2 = new Ship(40,90,25,100,255,0);//test
            smallCruiser2.buildShip(mContext);
            
            smallCruiser3 = new Ship(230,-1350,25,100,255,0);
            smallCruiser3.buildShip(mContext);
            
            smallCruiser4 = new Ship(240,-1630,25,100,255,0);
            smallCruiser4.buildShip(mContext);
            
            smallCruiser5 = new Ship(140,-1990,25,100,255,0);
            smallCruiser5.buildShip(mContext);
            
            smallCruiser6 = new Ship(90,-2203,25,100,255,0);
            smallCruiser6.buildShip(mContext);
            
            smallCruiser7 = new Ship(200,-2223,25,100,255,0);
            smallCruiser7.buildShip(mContext);
            
            ptBoat1 = new Ship(240,-284,13,32,255,1);
            ptBoat1.buildShip(mContext);
            
            ptBoat2 = new Ship(105,-385,13,32,255,1);
            ptBoat2.buildShip(mContext);
            
            ptBoat3 = new Ship(155,-516,13,32,255,1);
            ptBoat3.buildShip(mContext);
            
            ptBoat4 = new Ship(63,-906,13,32,255,1);
            ptBoat4.buildShip(mContext);
            
            ptBoat5 = new Ship(84,-1496,13,32,255,1);
            ptBoat5.buildShip(mContext);
            
            ptBoat6 = new Ship(56,-1913,13,32,255,1);
            ptBoat6.buildShip(mContext);
            
            ptBoat7 = new Ship(217,-2534,13,32,255,1);
            ptBoat7.buildShip(mContext);
            
            shipArray = new Ship[15];
            shipArray[0] = null;
            shipArray[1] = smallCruiser2;
            shipArray[2] = smallCruiser3;
            shipArray[3] = smallCruiser4;
            shipArray[4] = smallCruiser5;
            shipArray[5] = smallCruiser6;
            shipArray[6] = smallCruiser7;
            shipArray[7] = ptBoat1;
            shipArray[8] = ptBoat2;
            shipArray[9] = ptBoat3;
            shipArray[10] = ptBoat4;
            shipArray[11] = ptBoat5;
            shipArray[12] = ptBoat6;
            shipArray[13] = ptBoat7;
            shipArray[14] = smallCruiser1;
            
            
            //particleArray = new Stack<Particle>();
        	//particleArray.push(smoke);
        	//particleArray.push(smoke);
        	//particleArray.push(smoke);
            
        	// for(Particle s : particleArray){
             	// s.buildParticle(mContext);
             //}
            
           
            //deadSmoke1 = new DeadSmoke();
            //deadSmoke1.buildDeadSmoke(mContext);
            //Log.i(TAG," Game isInTouchMode()" + isInTouchMode() );
            
          
            
            //requestFocus();
 
            //setFocusableInTouchMode(true);
           // Log.i(TAG," Game requestFocus()" + requestFocus() );
            
            //test
           // Missle.getMissleX(10);
          //  Log.i(TAG, "Missle.setMissleX() " + Missle.setMissleX());
            
          
     
          
    		
    		
            // cache handles to our key sprites & other drawables
    
            // resize the bit map
           // matrix.postScale(scaleWidth, scaleHeight);
            // rotate the Bitmap
   
            
           // we don't need to transform it and it's faster to draw this way
           //mBackgroundImage = BitmapFactory.decodeResource(res, R.drawable.earthrise);
             // mTop = BitmapFactory.decodeResource(res, R.drawable.sky);
           
            // Use the regular lander image as the model size for all sprites
           // mLanderWidth = peu0.getIntrinsicWidth();
           // mLanderHeight = peu0.getIntrinsicHeight();

            // Initialize paints for speedometer
            mLinePaint = new Paint();
            mLinePaint.setAntiAlias(true);
            mLinePaint.setARGB(72, 0, 255, 0);

            mLinePaintBad = new Paint();
            mLinePaintBad.setAntiAlias(true);
            mLinePaintBad.setARGB(72, 0, 255, 0);
            
            
            mLoaderPaint = new Paint();
    		mLoaderPaint.setARGB(200, 183, 89, 8);
    		mLoaderPaint.setStrokeWidth(20);

            mScratchRect = new RectF(0, 0, 0, 0);
           

            mWinsInARow = 0;
            mDifficulty = DIFFICULTY_EASY;

            // initial show-up of lander (not yet playing)
         
            mFuel = PHYS_FUEL_INIT;
            mDX *= mFriction;
            mDY *= mFriction;
            mHeading = 0;
            mEngineFiring = true;
            

        }

        public boolean registerListener(SensorEventListener listener, Sensor sensor, int rate, Handler handler){
        	boolean rool = true;
        	
        	
        	return rool;
        }

		/**
         * Starts the game, setting parameters for the current difficulty.
         */
        public void doStart() {
        	
        	 
        	 Log.i(TAG, "start");
   
        	 
            synchronized (mSurfaceHolder) {
                // First set the game for Medium difficulty
              
             
                /*// Adjust difficulty params for EASY/HARD
                if (mDifficulty == DIFFICULTY_EASY) {
                	//Player.playerLife = 1000; 
                	Player.playersLeft = 6;
                } else if (mDifficulty == DIFFICULTY_MEDIUM) {
                	//Player.playerLife = 500;
                	Player.playersLeft = 3;
                } else if (mDifficulty == DIFFICULTY_HARD) {
                	//Player.playerLife = 200;
                	Player.playersLeft = 1;
                }*/

                mHeading = 0;
                	
           
                mLastTime = System.currentTimeMillis() + 100;
                setState(STATE_RUNNING);
                GameState = "run";
           	 	Log.i(TAG, "STATE_RUNNING");
            }
        }

        /**
         * Pauses the physics update & animation.
         */
        public void pause() {
            synchronized (mSurfaceHolder) {
                if (mMode == STATE_RUNNING) setState(STATE_PAUSE);
            }
        }

        /**
         * Restores game state from the indicated Bundle. Typically called when
         * the Activity is being restored after having been previously
         * destroyed.
         * 
         * @param savedState Bundle containing the game state
         */
        public synchronized void restoreState(Bundle savedState) {
            synchronized (mSurfaceHolder) {
                setState(STATE_PAUSE);
               // mRotating = 0;
               // mEngineFiring = false;
                GameState = "pause";
                

                // keep this to save stuff when phone rings
                
                //put here
                
                //mDifficulty = savedState.getInt(KEY_DIFFICULTY);
                //playerPosX = savedState.getDouble(KEY_X);
                //playerPosY = savedState.getDouble(KEY_Y);
          
               //mFuel = savedState.getDouble(KEY_FUEL);
            }
        }
        
       

        @Override
        public void run() {
            while (mRun) {
                Canvas c = null;
                try {
                  c = mSurfaceHolder.lockCanvas(null);
                    synchronized (mSurfaceHolder) {
                        if (mMode == STATE_RUNNING) updatePhysics();
                        doDraw(c);
                       }  
                } finally {
                    // do this in a finally so that if an exception is thrown
                    // during the above, we don't leave the Surface in an
                    // inconsistent state
                    if (c != null) {
                        mSurfaceHolder.unlockCanvasAndPost(c);
                    }
                }
            }
        }

  

		/**
         * Dump game state to the provided Bundle. Typically called when the
         * Activity is being suspended.
         * 
         * @return Bundle with this view's state
         */
        public Bundle saveState(Bundle map) {
            synchronized (mSurfaceHolder) {
                if (map != null) {
                 //   map.putInt(KEY_DIFFICULTY, Integer.valueOf(mDifficulty));
                      //map.putDouble(KEY_X, Double.valueOf(playerPosX));
                      //map.putDouble(KEY_Y, Double.valueOf(playerPosY));
                     // map.putDouble(KEY_DX, Double.valueOf(mDX));
                    //map.putDouble(KEY_DY, Double.valueOf(mDY));
                   // map.putDouble(KEY_HEADING, Double.valueOf(mHeading));
                  //  map.putInt(KEY_LANDER_WIDTH, Integer.valueOf(mLanderWidth));
                   // map.putInt(KEY_LANDER_HEIGHT, Integer
                   //         .valueOf(mLanderHeight));
                   // map.putInt(KEY_GOAL_X, Integer.valueOf(mGoalX));
                   // map.putInt(KEY_GOAL_SPEED, Integer.valueOf(mGoalSpeed));
                    //map.putInt(KEY_GOAL_ANGLE, Integer.valueOf(mGoalAngle));
                    //map.putInt(KEY_GOAL_WIDTH, Integer.valueOf(mGoalWidth));
                    //map.putInt(KEY_WINS, Integer.valueOf(mWinsInARow));
                    //map.putDouble(KEY_FUEL, Double.valueOf(mFuel));
                }
            }
            return map;
        }

        /**
         * Sets the current difficulty.
         * 
         * @param difficulty
         */
        public void setDifficulty(int difficulty) {
            synchronized (mSurfaceHolder) {
                mDifficulty = difficulty;
            }
        }

        /**
         * Sets if the engine is currently firing.
         */
        public void setFiring(boolean firing) {
            synchronized (mSurfaceHolder) {
                mEngineFiring = firing;
            }
        }

        /**
         * Used to signal the thread whether it should be running or not.
         * Passing true allows the thread to run; passing false will shut it
         * down if it's already running. Calling start() after this was most
         * recently called with false will result in an immediate shutdown.
         * 
         * @param b true to run, false to shut down
         */
        public void setRunning(boolean b) {
            mRun = b;
        }

        /**
         * Sets the game mode. That is, whether we are running, paused, in the
         * failure state, in the victory state, etc.
         * 
         * @see #setState(int, CharSequence)
         * @param mode one of the STATE_* constants
         */
        public void setState(int mode) {
            synchronized (mSurfaceHolder) {
                setState(mode, null);
            }
        }
        
       

        /**
         * Sets the game mode. That is, whether we are running, paused, in the
         * failure state, in the victory state, etc.
         * 
         * @param mode one of the STATE_* constants
         * @param message string to add to screen or null
         */
        public void setState(int mode, CharSequence message) {
            /*
             * This method optionally can cause a text message to be displayed
             * to the user when the mode changes. Since the View that actually
             * renders that text is part of the main View hierarchy and not
             * owned by this thread, we can't touch the state of that View.
             * Instead we use a Message + Handler to relay commands to the main
             * thread, which updates the user-text View.
             */
            synchronized (mSurfaceHolder) {
                mMode = mode;

                if (mMode == STATE_RUNNING) {
                    Message msg = mHandler.obtainMessage();
                    Bundle b = new Bundle();
                    b.putString("text", "");
                    b.putInt("viz", View.INVISIBLE);
                    msg.setData(b);
                    mHandler.sendMessage(msg);
               
               	 
                } else {
                    mRotating = 0;
                    mEngineFiring = false;
                    Resources res = mContext.getResources();
                    CharSequence str = "";
                    if (mMode == STATE_READY){
                        str = res.getText(R.string.mode_ready);
                    }else if (mMode == STATE_PAUSE){
                        str = res.getText(R.string.mode_pause);
                    }else if (mMode == STATE_LOSE){
                        str = res.getText(R.string.mode_lose);
                    }else if (mMode == STATE_WIN){
                        str = res.getString(R.string.mode_win_prefix)
                                + mWinsInARow + " "
                                + res.getString(R.string.mode_win_suffix);
                    }
                    
                    
                    if (message != null) {
                        str = message + "\n" + str;
                    }

                    if (mMode == STATE_LOSE){
                    mWinsInARow = 0;
                    Message msg = mHandler.obtainMessage();
                    Bundle b = new Bundle();
                    b.putString("text", str.toString());
                    b.putInt("viz", View.VISIBLE);
                    msg.setData(b);
                    mHandler.sendMessage(msg);
                    
                    }
                  
                }
            }
        }

        /* Callback invoked when the surface dimensions change. */
        public void setSurfaceSize(int width, int height) {
            // synchronized to make sure these all change atomically
            synchronized (mSurfaceHolder) {
                mCanvasWidth = width;
                mCanvasHeight = height;
                
                canvasHeight = mCanvasHeight;
            	canvasWidth = mCanvasWidth;
            	
            	if(mCanvasHeight < 310){
            		offSetBackgroudHeight =	mCanvasHeight + mBackgroundHeight /2 + 420; 
            		screenREZ = "QVGA";
            	}else if(mCanvasHeight > 320 && mCanvasHeight < 500){
            		offSetBackgroudHeight = mCanvasHeight + 3161; 
            		offSetSkyHeight = mCanvasHeight * 5; // 1820 5/ to mave it up one more slot
            		screenREZ = "HVGA";
            	}else if(mCanvasHeight > 500 && mCanvasHeight < 1000){
            		offSetBackgroudHeight = mCanvasHeight + mBackgroundHeight + mCanvasHeight /2;  
            		screenREZ = "WVGA854";
            	}
            	
            	//Log.i(TAG, "screenREZ  " +  screenREZ ); //301 //455 //816
            	
            	//to set size
            	mBackgroundWidth = mCanvasWidth;
        		mBackgroundPosY = -offSetBackgroudHeight;
        		
        		mSkyPosY = -offSetSkyHeight;
        		mSkyPosY2 = -offSetSkyHeight;
        		
        		
        		//mBackgroundPosX = 0;
        		
                //4096
            	Log.i(TAG, "H " +  mCanvasHeight); //301 //455 //816
            	Log.i(TAG, "W " +  mCanvasWidth); //240 //320 //480
                
                // don't forget to resize the background image
                //mBackgroundImage = Bitmap.createScaledBitmap(mBackgroundImage, 320, 3616, true);
               // mTop = Bitmap.createScaledBitmap(mTop, 1515, 2000, true);
                
                Player.playerPosX = canvasWidth /2 - Player.playerWidth /2;
                Player.playerPosY = canvasHeight /2 + Player.playerHeight;
        		
            }
        }

        /**
         * Resumes from a pause.
         */
        public void unpause() {
            // Move the real time clock up to now
            synchronized (mSurfaceHolder) {
                mLastTime = System.currentTimeMillis() + 100;
            }
            
            setState(STATE_RUNNING);
            GameState = "run";
        }

        
     
        
        
        /**
         * Handles a key-down event.
         * 
         * @param keyCode the key that was pressed
         * @param msg the original event object
         * @return true
         */
        boolean doKeyDown(int keyCode, KeyEvent msg) {
            synchronized (mSurfaceHolder) {
                boolean okStart = false;
                if (keyCode == KeyEvent.KEYCODE_DPAD_UP) okStart = true;
                if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN) okStart = true;
                if (keyCode == KeyEvent.KEYCODE_S) okStart = true;

               //boolean center = (keyCode == KeyEvent.KEYCODE_DPAD_UP);

                if (okStart
                        && (mMode == STATE_READY || mMode == STATE_LOSE || mMode == STATE_WIN)) {
                    // ready-to-start -> start
                    doStart();
                    return true;
                } else if (mMode == STATE_PAUSE && okStart) {
                    // paused -> running
                    unpause();
                    return true;
                } else if (mMode == STATE_RUNNING) {
                    // center/space -> fire
                    if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER
                            || keyCode == KeyEvent.KEYCODE_SPACE) {
                        //setFiring(true);
                    	//key = 0;
                        return true;
                        // left/q -> left
                    } else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
                            || keyCode == KeyEvent.KEYCODE_Q) {
                       // mRotating = -1;
                    	//playerPosX += -playerSpeed;
                    	//playerPosZ += -1; //keep for new game
                    	KEYLEFT = true;
                    	//key = 4;
                        return true;
                        // right/w -> right
                    } else if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
                            || keyCode == KeyEvent.KEYCODE_W) {
                        //mRotating = 1;
                    	//playerPosX += playerSpeed;
                    	//playerPosZ += 1; ////keep for new game
                    	KEYRIGHT = true;
                    	//key = 3;
                        return true;
                        // up -> pause
                    } else if (keyCode == KeyEvent.KEYCODE_DPAD_UP) {
                       // pause();
                    	//playerPosY += -playerSpeed;
                    	KEYUP = true;
                    	//key = 1;
                        return true;
                    } else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN) {
                        // pause();
                     	//playerPosY += playerSpeed;
                    	//key = 2;
                    	KEYDOWN = true;
                        return true;
                     }
                }

                return false;
            }
        }

        /**
         * Handles a key-up event.
         * 
         * @param keyCode the key that was pressed
         * @param msg the original event object
         * @return true if the key was handled and consumed, or else false
         */
        boolean doKeyUp(int keyCode, KeyEvent msg) {
            boolean handled = false;

            synchronized (mSurfaceHolder) {
                if (mMode == STATE_RUNNING) {
                    if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER
                            || keyCode == KeyEvent.KEYCODE_SPACE) {
                        setFiring(false);
                       handled = true;
                        ///take out later test for rotation
                  // } else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
                           // || keyCode == KeyEvent.KEYCODE_Q
                           // || keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
                           // || keyCode == KeyEvent.KEYCODE_W) {
                      //  mRotating = 0;
                     // handled = true; 
                   /// 
                    
                    
                    }else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
                            || keyCode == KeyEvent.KEYCODE_Q) {
                    	KEYLEFT = false;
                    	//playerPosX *= -0.05;
                        return true;
                        // right/w -> right
                    } else if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
                            || keyCode == KeyEvent.KEYCODE_W) {
                    	KEYRIGHT = false;
                    	//playerPosX *= 0.05;
                        return true;
                        // up -> pause
                    } else if (keyCode == KeyEvent.KEYCODE_DPAD_UP) {
                    	KEYUP = false;
                    	//playerPosY += -20;
                        return true;
                    } else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN) {
                    	KEYDOWN = false;
                     	//playerPosY += 20;
                        return true;
                     //}
                      
                       
                        
                    }
                    handled = true; 
                }
            }

            return handled;
        }
        
        
        
        public boolean doTrackBall(long downTime,long eventTime,int action,float x,float y,int metaState){
        	boolean handleds = true; 
        	Log.i(TAG, "dispatchTrackballEvent " + action);
        	
        	return handleds;
        }
  
     
        /**
         * Draws the ship, fuel/speed bars, and background to the provided
         * Canvas.
         */
        private void doDraw(Canvas c) {
        	map1.MapsDoDraw(c);
            smallCruiser1.shipDoDraw(c);
            smallCruiser2.shipDoDraw(c);
            smallCruiser2.shipDoDraw(c);
            smallCruiser3.shipDoDraw(c);
            smallCruiser4.shipDoDraw(c);
            smallCruiser5.shipDoDraw(c);
            smallCruiser6.shipDoDraw(c);
            smallCruiser7.shipDoDraw(c);
            ptBoat1.shipDoDraw(c);
            ptBoat2.shipDoDraw(c);
            ptBoat3.shipDoDraw(c);
            ptBoat4.shipDoDraw(c);
            ptBoat5.shipDoDraw(c);
            ptBoat6.shipDoDraw(c);
            ptBoat7.shipDoDraw(c);
            crusher1.crusherDoDraw(c);
            //sky1.skyDoDraw(c);
            for(int b = 0; b < birdArray.length; b++){
            	birdArray[b].doDrawBird(c);
            }
            badCoper01.badCoper1DoDraw(c);
            bullet1.bulletDoDraw(c);
            player.playerDoDraw(c);
            //sky2.skyDoDraw(c);
            gui.GUIDoDraw(c);
          
        	
        	
        	 if(gameLoadded == false){
                 lstopX++;
             }
        	
        	if(gameLoadded){
        	
    		}else{
    			c.drawBitmap(loader, 0, 0, null);
    			
    		    /*if(screenREZ == "QVGA"){
    		    	c.drawBitmap(loaderLabel, 0, 380, null);
    		    	c.drawLine(lstartX , lstartY, lstopX , lstopY , mLoaderPaint);
    		    }else if(screenREZ == "HVGA"){
    		    	c.drawBitmap(loaderLabel, 0, 380, null);
            		c.drawLine(lstartX , lstartY, lstopX , lstopY , mLoaderPaint);	
    		    }if(screenREZ == "WVGA854"){
    		    	c.drawBitmap(loaderLabel, 0, 380, null);
            		c.drawLine(lstartX , lstartY, lstopX , lstopY , mLoaderPaint);
    		    }*/
    			
    		}
        	
    		if(lstopX == 308f){
    	 		lstopX = 9;
    	 	}
    		
    		
    		
    		if(gameOver){
    			gameOverTimer -= 30;
    			c.drawBitmap(gameOverLabel, 0, 0, null);
    			if(gameOverTimer < 0){
    				gameOverTimer = 300;
    				GameMain.resetGame = true;
    				gameOver = false;
    				mRun = false;
    				setState(STATE_LOSE);
    				
    				Player.playerPoints = 0;
    				Player.playersLeft = 3;
    				Player.playerUpDateHitNum = 314; 
    				
    				Player.playerPosX = canvasWidth /2 - Player.playerWidth /2;
    	            Player.playerPosY = canvasHeight /2 + Player.playerHeight;
    	            
    	        	 mBackgroundPosY = -offSetBackgroudHeight;
    	        	 mSkyPosY = -offSetSkyHeight;
    	        	 mSkyPosY2 = -offSetSkyHeight;
    	                
    				 Bullet.badCoperUpDateHitNum = 88;
    				 BadCoper1.badCoper1X = Math.random() * 80 + 240;
    				 BadCoper1.badCoper1Y = -100;
    				 BadCoper1.badCoper1Alpha = 255;
    				 BadCoper1.badCoper1ExplodeIs = false;
    				 BadCoper1.badCoper1HitNum = 0;
    				 
    			
    				
    				
    		            shipArray[1].shipHitNum = 0;
    		            shipArray[2].shipHitNum = 0; 
    		            shipArray[3].shipHitNum = 0; 
    		            shipArray[4].shipHitNum = 0; 
    		            shipArray[5].shipHitNum = 0; 
    		            shipArray[6].shipHitNum = 0; 
    		            shipArray[7].shipHitNum = 0; 
    		            shipArray[8].shipHitNum = 0; 
    		            shipArray[9].shipHitNum = 0; 
    		            shipArray[10].shipHitNum = 0; 
    		            shipArray[11].shipHitNum = 0; 
    		            shipArray[12].shipHitNum = 0; 
    		            shipArray[13].shipHitNum = 0; 
    		            shipArray[14].shipHitNum = 0; 
    		            
    		            
    		            Bullet.shipUpDateHitNum1 = 88;
    		        	Bullet.shipUpDateHitNum2 = 88;
    		        	Bullet.shipUpDateHitNum3 = 88;
    		        	Bullet.shipUpDateHitNum4 = 88;
    		        	Bullet.shipUpDateHitNum5 = 88;
    		        	Bullet.shipUpDateHitNum6 = 88;
    		        	Bullet.shipUpDateHitNum7 = 88;
    		        	Bullet.shipUpDateHitNum8 = 88;
    		        	Bullet.shipUpDateHitNum9 = 88;
    		        	Bullet.shipUpDateHitNum10 = 88;
    		        	Bullet.shipUpDateHitNum11 = 88;
    		        	Bullet.shipUpDateHitNum12 = 88;
    		        	Bullet.shipUpDateHitNum13 = 88;
    		        	Bullet.shipUpDateHitNum14 = 88;
    		            
    		            
    			}
    			
    			

    			
    			
    			
    		}
    		
    	
    		 //Log.i(TAG, "Explode.explodeReady " + Explode.explodeReady);
    		
    		
            // Draw the background image. Operations on the Canvas accumulate
            // so this is like clearing the screen.
          
        	//canvas.drawCircle(posX, posY, posR, mLinePaint);
      
             //matrixGround.setRotate((float) playerPosZ);
          
            // Draw the landing pad
           /* canvas.drawLine(mGoalX, 1 + mCanvasHeight - TARGET_PAD_HEIGHT,
                    mGoalX + mGoalWidth, 1 + mCanvasHeight - TARGET_PAD_HEIGHT,
                    mLinePaint);*/
           
        	
            //car.set(xLeft, yTop, xLeft + mLanderWidth, yTop + mLanderHeight);
        	//canvas.drawRect(car, mLinePaint);
        	
            
            // Draw the ship with its current rotation
           // canvas.save();
           
            //keep for new game
          // canvas.rotate((float) playerPosZ, (float) playerPosX  + playerWidth /2 , (float) playerPosY + playerHeight /2);
           //
          

            
            //keep
        /*    if (mMode == STATE_LOSE) {
               // mCrashedImage.setBounds(xLeft, yTop, xLeft + mLanderWidth, yTop
                       // + mLanderHeight);
               // mCrashedImage.draw(canvas);
            } else if (mEngineFiring) {
               // mFiringImage.setBounds(xLeft, yTop, xLeft + mLanderWidth, yTop
                      // + mLanderHeight);
               // mFiringImage.draw(canvas);
            } else if (crash0 == true) {
            	//mCrashedImage.setBounds(xLeft, yTop, xLeft + mLanderWidth, yTop
                    //     + mLanderHeight);
               // mCrashedImage.draw(canvas);
            } else {
                peu0.setBounds(xLeft, yTop, xLeft + mLanderWidth, yTop + mLanderHeight);
                peu0.draw(canvas);
            }*/
        
            
           /* switch(key){
            
            case 0:
            	//playerCenter.draw(canvas);
            	
            
            break;
            case 1:
            	
                //playerForward.draw(canvas);
            break;
            
            case 2:
            	
                //playerBack.draw(canvas);
            break;
            
            case 3:
            	
                //playerRight.draw(canvas);
            break;
                
            case 4:
            	
            	//playerCenter.draw(canvas);
            break;
            
            }
          */
                   
          
          
        //	canvas.drawOval( ballArray[0], mLinePaint);
        	//canvas.drawCircle(posX,posY,posR, mLinePaint);
        // canvas.restore();
        
          //canvas.drawCircle(posX, posY, posR, mLinePaint);
     
          //canvas.drawBitmap(player[player.length],100,400,null);
        
        	//double radius1 = readDouble("Radius: ");
        	  // Circle circle1 = new Circle(new Point(0,0), radius1);
        	  // circle1.draw();

        	 //  double radius2 = readDouble("Radius: ");
        	 //  Circle circle2 = new Circle(new Point(0,4), radius2);
        	   //circle2.draw();
         
        	//float radius2 = 5;
        	//double distance1 = Math.sqrt ((175*175) + (103*103));
            //canvas.drawCircle(175,103,radius2, mLinePaint);
        	/*laser1Rect = new Rect((int)Lx, (int)Ly, (int)Lx + 5, (int)Ly + 11);
        	laser1.setBounds(laser1Rect);
        	laser1.draw(canvas);*/
      
            // Draw the fuel gauge
            /*int fuelWidth = (int) (UI_BAR * mFuel / PHYS_FUEL_MAX);
            mScratchRect.set(4, 40, 4 + fuelWidth, 4 + UI_BAR_HEIGHT);
            canvas.drawRect(mScratchRect, mLinePaint);*/

            // Draw the speed gauge, with a two-tone effect
            double speed = Math.sqrt(mDX * mDX + mDY * mDY);
            int speedWidth = (int) (UI_BAR * speed / PHYS_SPEED_MAX);

            if (speed <= mGoalSpeed) {
                mScratchRect.set(4 + UI_BAR + 4, 4,
                        4 + UI_BAR + 4 + speedWidth, 4 + UI_BAR_HEIGHT);
               // canvas.drawRect(mScratchRect, mLinePaint);
            } else {
                // Draw the bad color in back, with the good color in front of
                // it
                mScratchRect.set(4 + UI_BAR + 4, 4,
                        4 + UI_BAR + 4 + speedWidth, 4 + UI_BAR_HEIGHT);
              //  canvas.drawRect(mScratchRect, mLinePaintBad);
                int goalWidth = (UI_BAR * mGoalSpeed / PHYS_SPEED_MAX);
                mScratchRect.set(4 + UI_BAR + 4, 4, 4 + UI_BAR + 4 + goalWidth,
                        4 + UI_BAR_HEIGHT);
              //  canvas.drawRect(mScratchRect, mLinePaint);
            }
            
        } 
        
        
       
          
    
        private void updatePhysics() {
            long now = System.currentTimeMillis();
         
        // BadWeapons.machGun01X = BadCoper1.badCoper1X;
        // BadWeapons.machGun01Y = BadCoper1.badCoper1Y;
        if(GameView.GameState == "run"){
         badCoper01.updatebadCoper1();  
         map1.updateMaps();
         sky1.updateSky();
         sky2.updateSky();
         bullet1.updateBullet();
         crusher1.updateCrusher();
         smallCruiser1.updateShip();
         smallCruiser2.updateShip();
         smallCruiser3.updateShip();
         smallCruiser4.updateShip();
         smallCruiser5.updateShip();
         smallCruiser6.updateShip();
         smallCruiser7.updateShip();
         ptBoat1.updateShip();
         ptBoat2.updateShip();
         ptBoat3.updateShip();
         ptBoat4.updateShip();
         ptBoat5.updateShip();
         ptBoat6.updateShip();
         ptBoat7.updateShip();
         for(int b = 0; b < birdArray.length; b++){
         	birdArray[b].updateBird();
         }
        }
         
      
     
         
         //gui.updateGUI();
         
        
    
    	//playerRect.offset((int)playerPosZ,(int)playerPosZ);
       // mCanvasHeight;
        screenSyncUp = canvasHeight - canvasHeight /2;
        screenSyncDown = canvasHeight - canvasHeight /2 -24;
        
        
        //Log.i(TAG,"Player.playerPosY " + Player.playerPosY );
        //Log.i(TAG,"screenSyncUp " + screenSyncUp );
        
        
        
        if(GameMain.reverceControlls){
      	  if(Player.playerPosY < screenSyncUp){
      		  mBackgroundPosY -= Maps.backgroundSpeed; 
      		  heading = "down";
      	  }
      	  if(Player.playerPosY > screenSyncDown){
      		  mBackgroundPosY += Maps.backgroundSpeed; 
      		 heading = " ";
      	  }
        }else{
          if(Player.playerPosY > screenSyncUp){
        	  mBackgroundPosY -= Maps.backgroundSpeed; 
        	  heading = "down";
           }
           if(Player.playerPosY < screenSyncDown){
        	   mBackgroundPosY += Maps.backgroundSpeed; 
        	   heading = " ";
           }	
        }
        
        
        
        if(GameMain.reverceControlls){
      	  if(Player.playerPosY < screenSyncUp){
      		  mSkyPosY -= Sky.skySpeed; 
      	  }
      	  if(Player.playerPosY > screenSyncDown){
      		  mSkyPosY += Sky.skySpeed; 
      	  }
        }else{
          if(Player.playerPosY > screenSyncUp){
        	  mSkyPosY -= Sky.skySpeed; 
           }
           if(Player.playerPosY < screenSyncDown){
        	   mSkyPosY += Sky.skySpeed; 
           }	
        }
      		
        
        if(GameMain.reverceControlls){
        	  if(Player.playerPosY < screenSyncUp){
        		  mSkyPosY2 -= Sky.skySpeed2; 
        	  }
        	  if(Player.playerPosY > screenSyncDown){
        		  mSkyPosY2 += Sky.skySpeed2; 
        	  }
          }else{
            if(Player.playerPosY > screenSyncUp){
          	  mSkyPosY2 -= Sky.skySpeed2; 
             }
             if(Player.playerPosY < screenSyncDown){
          	   mSkyPosY2 += Sky.skySpeed2; 
             }	
          }
      		
      		
      		
      		
     /* 	  
      	  if(Player.playerPosX  > 80){
    //  		  for new game
      		//mTopPosX -= forgroundSpeed;
      	   //mBackgroundPosX -= backgroundSpeed; 
      	  }
      	  if(Player.playerPosX  < 140){
     //  		  for new game  		  
      		//mTopPosX += forgroundSpeed;
      	  //mBackgroundPosX += backgroundSpeed; 
      	  }*/
      	  
      
      	  if(KEYUP == true){
      		Player.vyPlayer = -Player.playerThrust;
      		//heading = "up";
      	  }	
      	  if(KEYUP == false){
      		//vyPlayer -= 8; 
      		//heading = "up";
      	  }
      	  if(KEYDOWN == true){
      		Player.vyPlayer = Player.playerThrust;
      		//heading = "down";
      		
          }
      	  if(KEYDOWN == false){
             //vyPlayer  *= 0.02; 
      		//heading = "down";
          }
      	  
      	  
      	  if(KEYRIGHT == true){
      		Player.vxPlayer = Player.playerThrust;
      		//heading = "right";
      	  }
      	  if(KEYRIGHT == false){
      		//vxPlayer += 8; 
      		//heading = "right";
      	  }
      	  
      	  if(KEYLEFT == true){
      		Player.vxPlayer = -Player.playerThrust;
      		//heading = "left";
      	  }
      	  if(KEYLEFT == false){
      		//vxPlayer -= 8; 
      		//heading = "left";
      	  }
     
      
          /*  //keep but may need to be fixed
            if (Player.playerPosY < 0 - Player.playerHeight /2 ) {
            	Player.playerPosY = 0 - Player.playerHeight /2;
            	Player.vyPlayer += Player.playerBounce;
            }
            if (Player.playerPosY > mCanvasHeight -Player.playerHeight /2) {
            	Player.playerPosY = mCanvasHeight -Player.playerHeight /2;
            	Player.vyPlayer-= Player.playerBounce;
            }
            if (Player.playerPosX  > mCanvasWidth -Player.playerWidth /2) {
            	Player.playerPosX =  mCanvasWidth -Player.playerWidth /2;
            	Player.vxPlayer -= Player.playerBounce;
            }
            if (Player.playerPosX  < 0 - Player.playerWidth /2 ) {
            	Player.playerPosX  = 0 - Player.playerWidth /2; 
            	Player.vxPlayer += Player.playerBounce;
            }*/
    
            
            
            
      //// keep for new game/////
            
            // Do nothing if mLastTime is in the future.
            // This allows the game-start to delay the start of the physics
            // by 100ms or whatever.
            if (mLastTime > now) return;

            double elapsed = (now - mLastTime) / 1000.0;

            // mRotating -- update heading
            if (mRotating != 0) {
                mHeading += mRotating * (PHYS_SLEW_SEC * elapsed);

                // Bring things back into the range 0..360
                if (mHeading < 0)
                    mHeading += 360;
                else if (mHeading >= 360) mHeading -= 360;
            }

            // Base accelerations -- 0 for x, gravity for y
            double ddx = 0.0;
            double ddy = -PHYS_DOWN_ACCEL_SEC * elapsed;

            if (mEngineFiring) {
                // taking 0 as up, 90 as to the right
                // cos(deg) is ddy component, sin(deg) is ddx component
                double elapsedFiring = elapsed;
                double fuelUsed = elapsedFiring * PHYS_FUEL_SEC;

                // tricky case where we run out of fuel partway through the
                // elapsed
                if (fuelUsed > mFuel) {
                    elapsedFiring = mFuel / fuelUsed * elapsed;
                    fuelUsed = mFuel;

                    // Oddball case where we adjust the "control" from here
                    mEngineFiring = false;
                }

                mFuel -= fuelUsed;

                // have this much acceleration from the engine
                double accel = PHYS_FIRE_ACCEL_SEC * elapsedFiring;

                double radians = 2 * Math.PI * mHeading / 360;
                ddx = Math.sin(radians) * accel;
                ddy += Math.cos(radians) * accel;
            }

            //double dxOld = mDX *= mFriction;
            //double dyOld = mDY *= mFriction;

            // figure speeds for the end of the period
            mDX += ddx *= mFriction;
            mDY += ddy *= mFriction;

            // figure position based on average speed during the period
           // mX += elapsed * (mDX + dxOld) / 2;
            //mY += elapsed * (mDY + dyOld) / 2;
            
           // mBackgroundPosX += elapsed * (mDX + dxOld) / 2;
            //mBackgroundPosY  += elapsed * (mDY + dyOld) / 2;
            
           // Log.i(TAG, "mHeadingsss " + mHeading);
            mLastTime = now;
            
             //// keep for new game/////        

    
    //// end of game or win
    
            // Evaluate if we have landed ... stop the game
           // double yLowerBound = TARGET_PAD_HEIGHT + mLanderHeight / 2
                    //- TARGET_BOTTOM_PADDING;
            //if (playerPosX <= yLowerBound) {
            	//playerPosY = yLowerBound;

               // int result = STATE_LOSE;
               
               // CharSequence message = "";
               //Resources res = mContext.getResources();
                //double speed = Math.sqrt(mDX * mDX + mDY * mDY);
               // boolean onGoal = (mGoalX <= mX - mLanderWidth / 2 && mX
                  
                		//+ mLanderWidth / 2 <= mGoalX + mGoalWidth);
                
                

                // "Hyperspace" win -- upside down, going fast,
                // puts you back at the top.
               /* if (onGoal && Math.abs(mHeading - 180) < mGoalAngle
                        && speed > PHYS_SPEED_HYPERSPACE) {
                 //   result = STATE_WIN;
                    mWinsInARow++;
                    doStart();

                    return;
                    // Oddball case: this case does a return, all other cases
                    // fall through to setMode() below.
                } else if (!onGoal) {
                    message = res.getText(R.string.message_off_pad);
                } else if (!(mHeading <= mGoalAngle || mHeading >= 360 - mGoalAngle)) {
                    message = res.getText(R.string.message_bad_angle);
                } else if (speed > mGoalSpeed) {
                    message = res.getText(R.string.message_too_fast);
                } else {
               //     result = STATE_WIN;
                    mWinsInARow++;
                }*/
                
                

             //   setState(result, message);
          //  }
            
           gameLoadded = true;
           
           
           
          
        	
           
        	
       }


       
        
    }

	
	public static final String TAG = "moto";
	public static boolean gameOver = false;
	public static int canvasHeight = 0;
	public static int canvasWidth = 0;
	public static int offSetBackgroudWidth = 0;
	public static int offSetBackgroudHeight = 0;
	public static int offSetSkyWidth = 0;
	public static int offSetSkyHeight = 0;
	public static double mBackgroundPosY;
	public static double mBackgroundPosX;
	public static double mSkyPosY = 0;
	public static double mSkyPosX = 0;
	public static double mSkyPosY2 = 0;
	public static double mSkyPosX2 = 0;
	public static int mBackgroundWidth = 240;
	public static int mBackgroundHeight = 4096;
	public static int mSkyWidth = 320;
	public static int mSkyHeight = 1820;
	public static int mSkyWidth2 = 320;
	public static int mSkyHeight2 = 1820;
	public static int screenSyncUp;
    public static int screenSyncDown;
    public static String screenREZ = "";
    
    public static String heading = " ";
    
    
    //public Stack<Particle> particleArray; 
    
	
	
    /** Handle to the application context, used to e.g. fetch Drawables. */
    public Context mContext;
   

    /** Pointer to the text view to display "Paused.." etc. */
    //private TextView mStatusText;
    
    /** The thread that actually draws the animation */
    private GameThread thread;
    public static String GameState = "";
	public static boolean DpadIS = false;
	public static TextView scoreText;
	
	public static Ship[] shipArray;
	
	public Bird bird;
	
	public Bird[] birdArray = new Bird[20];
	

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // register our interest in hearing about changes to our surface
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
        
        
       

        //my tost
        //int duration = Toast.LENGTH_LONG;
    	//CharSequence GetReady = "Get Ready !!";
    	//CharSequence fight = " Fight !! ";
    	
    	//Toast toast = Toast.makeText(context, GetReady, duration);
    	//toast.show();
        
    	//oast fightToast = Toast.makeText(context, fight, 2);
    	//fightToast.show();
        
        
        // create thread only; it's started in surfaceCreated()
        thread = new GameThread(holder, context, new Handler() {
        	
        /*   @Override
           public void handleMessage(Message m) {// had an error
              mStatusText.setVisibility(m.getData().getInt("viz"));
              mStatusText.setText(m.getData().getString("score01"));
           }*/
        	
        });

        setFocusable(true); // make sure we get key events
         
    }

 
    
    
    /**
     * Fetches the animation thread corresponding to this LunarView.
     * 
     * @return the animation thread
     */
    public GameThread getThread() {
        return thread;
    }

    /**
     * Standard override to get key-press events.
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent msg) {
        return thread.doKeyDown(keyCode, msg);
    }
    
 

    /**
     * Standard override for key-up. We actually care about these, so we can
     * turn off the engine or stop rotating.
     */
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent msg) {
        return thread.doKeyUp(keyCode, msg);
    }
    
  

    /**
     * Standard window-focus override. Notice focus lost so we can pause on
     * focus lost. e.g. user switches to take a call.
     */
    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        if (!hasWindowFocus){
        	thread.pause();
        	}else if(hasWindowFocus){
        		 Log.i(TAG, "hasWindowFocus ready" + hasWindowFocus);
        	
        	}
        
    }

    /**
     * Installs a pointer to the text view used for messages.
     */
   // public void setTextView(TextView textView) {
       // mStatusText = textView;
   // }

    /* Callback invoked when the surface dimensions change. */
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
            int height) {
        thread.setSurfaceSize(width, height);
    }

    /*
     * Callback invoked when the Surface has been created and is ready to be
     * used.
     */
    public void surfaceCreated(SurfaceHolder holder) {
        // start the thread here so that we don't busy-wait in run()
        // waiting for the surface to be created
        thread.setRunning(true);
        thread.start();
        thread.unpause();// make sure ready
    }

    /*
     * Callback invoked when the Surface has been destroyed and must no longer
     * be touched. WARNING: after this method returns, the Surface/Canvas must
     * never be touched again!
     */
    public void surfaceDestroyed(SurfaceHolder holder) {
        // we have to tell thread to shut down & wait for it to finish, or else
        // it might touch the Surface after we return and explode
        boolean retry = true;
        thread.setRunning(false);
        while (retry) {
            try {
                thread.join();
                retry = false;
            } catch (InterruptedException e) {
            }
        }
    }


	public void setTextView(TextView text){
		//text.append(Integer.toString(Player.playerPoints));	
		
		return;
	}

	
    

}
