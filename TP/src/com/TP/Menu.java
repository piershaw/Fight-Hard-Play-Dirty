package com.TP;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;


public class Menu extends Activity implements View.OnClickListener{
	
	public static final String TAG = "moto";

	private ImageButton startTheGame;
	private ImageButton gameHelp;
	//private ImageButton multiplayer;
	private ImageButton aboutUs;
	private ImageButton moreGames;
	
	//static final int PROGRESS_DIALOG = 0;
	//private Button button;
	//private ProgressThread progressThread;
	//private GameThread mGameThread; 
	//private GameView mGameView;
	//private ProgressDialog progressDialog;
	
	 // get handles to some important objects
   
	
	//private Button gamecontol;
	//private Button highScores;
	
	

	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.menu);
	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
	startTheGame = (ImageButton) findViewById(R.id.SGame);
	startTheGame.setImageResource(R.drawable.startpage);
	startTheGame.setScaleType(ScaleType.CENTER_INSIDE);
	gameHelp = (ImageButton) findViewById(R.id.helpButton);
	gameHelp.setImageResource(R.drawable.helppage);
	gameHelp.setScaleType(ScaleType.CENTER_INSIDE);
	aboutUs = (ImageButton) findViewById(R.id.aboutUsButton);
	aboutUs.setImageResource(R.drawable.aboutpage);
	aboutUs.setScaleType(ScaleType.CENTER_INSIDE);
	//multiplayer = (ImageButton) findViewById(R.id.multiplayerButton);
	//multiplayer.setImageResource(R.drawable.multiplayerpage);
	//multiplayer.setScaleType(ScaleType.CENTER_INSIDE);
	moreGames = (ImageButton) findViewById(R.id.moreGamesButton);
	moreGames.setImageResource(R.drawable.websitepage);
	moreGames.setScaleType(ScaleType.CENTER_INSIDE);
	
	startTheGame.setOnClickListener(this);
	gameHelp.setOnClickListener(this);
	//multiplayer.setOnClickListener(this);
	aboutUs.setOnClickListener(this);
	moreGames.setOnClickListener(this);
	
	
     }
	
	 public void onClick(View v) {
	   	  switch(v.getId()){
	   	  
	   	  
		  case R.id.SGame :
         	Intent g = new Intent(Menu.this, GameMain.class);
            startActivity(g);
          break;
          
	   	  case R.id.aboutUsButton:
        	Intent u = new Intent(Menu.this, About.class);
        	startActivity(u);
          break;
        
	   	  case R.id.helpButton:
	        Intent h = new Intent(Menu.this, Help.class);
	        startActivity(h);
	      break;
	      
	   	 // case R.id.multiplayerButton:
        	//Intent sb = new Intent(Menu.this, ScoreListView.class);
        	//startActivity(sb); 
         // break;
        
	   	  case R.id.moreGamesButton:
        	Intent b = new Intent(Menu.this, Browserview.class);
        	startActivity(b);
          break;
	  }
	   	  
	 }

	 
	
	

	 @Override
	 public void onDestroy() {
    	 super.onDestroy();
    	Log.i(TAG, "onDestroy() in menu");	
    	this.finish();
    	
	 }
	 
	 
	 
	 
	 
    
	 // @Override
	   //public void onStart() {
	   	//super.onStart();
	   //Log.i(TAG, "onStart()");
	 	 //showDialog(PROGRESS_DIALOG);
	 	 
	 	 //Log.i(TAG, "Thread" );
	  // }
	    
	 /*   @Override 
	   public void onRestart(){
	   	 super.onResume();
	   	 Log.i(TAG, "onResume()");	
	   }
	    @Override
	   public void onResume() {
	  	 	super.onResume();
	  	 	Log.i(TAG, "onResume()");	
	  	  mButton.setVisibility(View.VISIBLE);
	  	 dismissDialog(PROGRESS_DIALOG);
	     progressThread.setState(ProgressThread.STATE_DONE);
	   }
	    @Override
	   public void onPause() {
	    	 super.onPause();
	    	Log.i(TAG, "onPause()");
	   }
	    @Override
	   public void onStop() {
	     	 super.onStop();
	     	Log.i(TAG, "stop()");
	   }
	    @Override
	   public void onDestroy() {
	    	 super.onDestroy();
	    	Log.i(TAG, "onDestroy()");	
	   }*/
	    
	
/*	 protected Dialog onCreateDialog(int id) {
	        switch(id) {
	        case PROGRESS_DIALOG:
	            progressDialog = new ProgressDialog(Menu.this);
	            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
	            progressDialog.setMessage("Loading...");
	            progressThread = new ProgressThread(handler);
	            progressThread.start();
	            return progressDialog;
	        default:
	            return null;
	        }
	    }

	    // Define the Handler that receives messages from the thread and update the progress
	    final Handler handler = new Handler() {
	        public void handleMessage(Message msg) {
	            int total = msg.getData().getInt("total");
	            progressDialog.setProgress(total);
	            if (total >= 100){
	                dismissDialog(PROGRESS_DIALOG);
	                progressThread.setState(progressThread.STATE_RUNNING);
	            }
	        }
	    };
	    */
	    




	 /*   *//** Nested class that performs progress calculations (counting) *//*
	    private class ProgressThread extends Thread {
	        Handler mHandler;
	        final static int STATE_DONE = 0;
	        final static int STATE_RUNNING = 1;
	        int mState;
	        int total;
	       
	        ProgressThread(Handler h) {
	            mHandler = h;
	        }
	       
	        public void run() {
	            mState = STATE_RUNNING;   
	            total = 0;
	            while (mState == STATE_RUNNING) {
	                try {
	                    Thread.sleep(100);
	                	// mGameThread.setState(GameThread.STATE_RUNNING);
	                	//Thread.yield();
	                	 //mGameThread = mGameView.getThread();
	                	Log.i(TAG, "wait for the game thread");	
	                    
	                	if(mState == STATE_DONE){
	                		//mState = 2;
	                		Log.i(TAG, "ready");	
	                		//Intent g = new Intent(Menu.this, GameMain.class);
		                     //startActivity(g);
	                	}
	                    
	               } catch (InterruptedException e) {
	                    Log.e("ERROR", "Thread Interrupted");
	               }
	                Message msg = mHandler.obtainMessage();
	                Bundle b = new Bundle();
	                b.putInt("total", total);
	                msg.setData(b);
	                mHandler.sendMessage(msg);
	                total++;
	            }
	            
	            
	            
	        }
	        
	         sets the current state for the thread,
	         * used to stop the thread 
	        public void setState(int state) {
	            mState = state;
	        }
	    }*/
	    
	    
	    
	
}    

