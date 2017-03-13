/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.TP;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.TP.GameView.GameThread;



public class GameMain extends Activity implements SensorEventListener,ControllerListener{
	
	static final int PROGRESS_DIALOG = 0;
	public static Boolean resetGame = false;
    
   // private static final int MENU_EASY = 1;
   // private static final int MENU_HARD = 2;
   // private static final int MENU_MEDIUM = 3;
    private static final int MENU_PAUSE = 4;
    private static final int MENU_RESUME = 5;
   // private static final int MENU_START = 6;
    //private static final int MENU_STOP = 7;
    private static final int MENU_TOUCHTARGET = 8;
    private static final int MENU_AUTOTARGET = 9;
    private static final int MENU_RESTART = 10;
    private static final int MENU_REVERSE = 11;
    
    
    public Button fireB;
    public Button fireC;
    public Button fireD;
    
    public Button moveYUp;
    public Button moveYDown;
    public Button moveXRight;
    public Button moveXleft;
    
    public static double playerTargetX;
    public static double playerTargetY;
    public static boolean fireAtTarget;
    public static double fingerPos = 20;
    
    public static boolean reverceControlls = true;
   

    
	public static final String TAG = "moto";
	//private SNESController controller;
	
    /** A handle to the thread that's actually running the animation. */
    private GameThread mGameThread;

    /** A handle to the View in which the game is running. */
    private GameView mGameView;
    //private View mLoadingView;
   
    
    // the play start button
    public Button mButton;
    public TextView scoreText;
    
    // the about button
    public Button mAboutButton;
    
    
    
    public float pitch = 0; 
    public float roll = 0; 
    public static float pitchPointer; 
    public static float headingPointer;
    public float heading = 0; 
    public int mover = 4;
    
    
    
    
    public SensorManager sensorManager; 
    
    //public ProgressThread progressThread;
    //public ProgressDialog progressDialog;
    
    /**
     * Invoked during init to give the Activity a chance to set up its Menu.
     * 
     * @param menu the Menu to which entries may be added
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        //menu.add(0, MENU_START, 0, R.string.menu_start);
        menu.add(0, MENU_RESTART, 0, R.string.menu_restart);
        menu.add(0, MENU_PAUSE, 0, R.string.menu_pause);
        menu.add(0, MENU_RESUME, 0, R.string.menu_resume);
        menu.add(0, MENU_TOUCHTARGET, 0, R.string.touch);
        menu.add(0, MENU_AUTOTARGET, 0, R.string.autotarget);
        menu.add(0, MENU_REVERSE, 0, R.string.menu_reverse);
        //menu.add(0, MENU_MEDIUM, 0, R.string.menu_medium);
        //menu.add(0, MENU_HARD, 0, R.string.menu_hard);
         
        return true;
    }
    
    private void updateOrientation(float mRoll, float mPitch, float Heading){ 
    	
    	mPitch *= mover;
        Heading *= mover;
        roll = mRoll;
        pitch = mPitch;
        heading = Heading;
        
        pitchPointer = mPitch;
        headingPointer =  Heading;
        
        
     
       // Log.i(TAG, "mHeading " + mHeading);
       
       // Log.i(TAG, "mRoll " + mRoll);
       
      
        
        Player.playerPosY = pitch + 300; //was +
        Player.playerPosX  = heading + 100;
        Player.playerPosZ = roll;
        
        Bullet.stopSmoke = Player.playerPosX;
       // Log.i(TAG, "mRoll " + mGameThread.playerPosZ);
       
   } 

    /**
     * Invoked when the user selects an item from the Menu.
     * 
     * @param item the Menu entry which was selected
     * @return true if the Menu item was legit (and we consumed it), false
     *         otherwise
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_RESTART:
            	GameView.gameOver = false;
            	
            	mGameThread.setState(GameThread.STATE_LOSE);
            	onDestroy();
            	
                return true;
           // case MENU_STOP:
               // mGameThread.setState(GameThread.STATE_LOSE,
               // getText(R.string.message_stopped));
                //return true;
            case MENU_PAUSE:
                mGameThread.pause();
                return true;
            case MENU_RESUME:
                mGameThread.unpause();
                return true;
            case MENU_AUTOTARGET:
            	Ship.autoTargetOn = true;	
            	 mGameThread.unpause();
            	 return true;
            case MENU_TOUCHTARGET:
            	Ship.autoTargetOn = false;	
            	 mGameThread.unpause();
            	 return true;
            case MENU_REVERSE:
            	 reverceControlls = false;	
            	 mGameThread.unpause();
            	 return true;	 
            /**/
        }

        return false;
    }

    /**
     * Invoked when the Activity is created.
     * 
     * @param savedInstanceState a Bundle containing state saved from a previous
     *        execution, or null if this is a new execution
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    	//mActivity.requestWindowFeature(Window.FEATURE_PROGRESS);
    	//mActivity.getWindow().setFeatureInt(Window.FEATURE_PROGRESS, 50);
        //Log.i(TAG, "mActivity" + mActivity);
        
        // turn off the window's title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // tell system to use the layout defined in our XML file
        setContentView(R.layout.game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
         
        // get handles to the LunarView from XML, and its LunarThread
        mGameView = (GameView) findViewById(R.id.game);
        mGameThread = mGameView.getThread();
        
      
     
       // mGameView.setTextView((TextView) findViewById(R.id.score01));
        //Log.i(TAG, " mGameView.mStatusText" +  mGameView.mStatusText);
        
        
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE); 
        updateOrientation(0, 0, 0); 
        

        // Load the ImageView that will host the animation and
  		 // set its background to our AnimationDrawable XML resource.
  		
        
        //mButton = (Button)findViewById(R.id.Button01);
       /// mButton.setOnClickListener(this);
       // mButton.setVisibility(View.VISIBLE);
        
       //mAboutButton = (Button)findViewById(R.id.Button02);
       // mAboutButton.setOnClickListener(this);
       // mAboutButton.setVisibility(View.VISIBLE);
        
    	/*if ( controller == null) {
    		controller = new SNESController(this);
    		controller.setListener(this);
    	}*/
      
       
        
        if (savedInstanceState == null) {
            // we were just launched: set up a new game
            mGameThread.setState(GameThread.STATE_READY);
            Log.w(this.getClass().getName(), "SIS is null");
        } else {
            // we are being restored: resume a previous game
            mGameThread.restoreState(savedInstanceState);
            Log.w(this.getClass().getName(), "SIS is nonnull");
        }
    }
    
    
   
    
    
    @Override
    protected void onStart() {
   	 super.onStart();
   	 //showDialog(PROGRESS_DIALOG);
    	Log.i(TAG, "Loading");	
     }
    @Override
    protected void onResume() { 
      super.onResume(); 
      sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION), SensorManager.SENSOR_DELAY_UI); 
    } 
    @Override
    protected void onStop() { 
      super.onStop(); 
      sensorManager.unregisterListener(this); 
      
    } 

    @Override
	 public void onDestroy() {
  	 super.onDestroy();
  	 Log.i(TAG, "onDestroy() in GameMain");
  	 super.finish();
  	 Maps.mp.stop();
  	 //Player.chopperSound.stop();
  	 }
    
    
    

     public void onAccuracyChanged(Sensor sensor, int accuracy) { 
    	 ///
     } 
     public void onSensorChanged(SensorEvent event) { 
         updateOrientation(event.values[SensorManager.DATA_X], event.values[SensorManager.DATA_Y], event.values[SensorManager.DATA_Z]); 
     }
     
     
     
     
     
     
     
    /**
     * Invoked when the Activity loses user focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
       mGameView.getThread().pause(); // pause game when Activity pauses
    }
    
    
    
    
    

    /**
     * Notification that something is about to happen, to give the Activity a
     * chance to save state.
     * 
     * @param outState a Bundle into which this Activity should save its state
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // just have the View's thread save its state into our Bundle
        super.onSaveInstanceState(outState);
        mGameThread.saveState(outState);
        Log.w(this.getClass().getName(), "SIS called");
    }

	public void ControllerDown(int btnCode) {
		// TODO Auto-generated method stub
		
	}

	public void ControllerUp(int btnCode) {
		// TODO Auto-generated method stub
		
	}
    
	   
    /**
     * Touch event
     */
   
 
    public boolean onTouchEvent(MotionEvent event) {
    	
    	//int action = event.getAction(); // might need later
    	
    	
    	    //Log.i(TAG,"act" + action);
    	//Log.i(TAG,"act" + event.getAction());
    	
    		 //Log.i(TAG," GameView.DpadIS " + GameView.DpadIS );
    		
        	if (event.getAction() == MotionEvent.ACTION_DOWN) {
        		//Log.i(TAG, "MotionEvent.ACTION_DOWN " + event.getAction());
        		
        		playerTargetX = event.getX();
            	playerTargetY = event.getY() -fingerPos;
            	Player.playerTargetVisible = 255;
            	
            	//fireAtTarget = true;
            	
        	}
        	else if (event.getAction() == MotionEvent.ACTION_UP) {
        		Player.playerTargetVisible = 0;
        		//fireAtTarget = false;
        	}
        	
        	
        	else if (event.getAction() == MotionEvent.ACTION_MOVE) {
        		//Log.i(TAG, " MotionEvent.ACTION_MOVE " + event.getAction());
        		playerTargetX = event.getX() -fingerPos;
            	playerTargetY = event.getY() -fingerPos;
            	Player.playerTargetVisible = 255;
            	//fireAtTarget = false;
        	}
        	
        	
        	
     return true;
		
    }
	
  

    
    
   /* @Override 
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) 
    { 
     //viewA.setText("-" + "FLING" + "-"); 
     return true; 
    } 
    
    @Override 
    public void onLongPress(MotionEvent e) 
    { 
     //viewA.setText("-" + "LONG PRESS" + "-"); 
    } 
    
    @Override 
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) 
    { 
    // viewA.setText("-" + "SCROLL" + "-"); 
     return true; 
    } 
    
    @Override 
    public void onShowPress(MotionEvent e) 
    { 
    // viewA.setText("-" + "SHOW PRESS" + "-"); 
    }     
    
    @Override 
    public boolean onSingleTapUp(MotionEvent e)     
    { 
    // viewA.setText("-" + "SINGLE TAP UP" + "-"); 
     return true;
    }*/
    

  /// mouse event    
 
    
 

}
