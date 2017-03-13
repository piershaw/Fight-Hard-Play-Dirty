package com.TP;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;

import com.admob.android.ads.AdView;
import com.admob.android.ads.SimpleAdListener;


public class TP extends Activity implements View.OnClickListener{
    /** Called when the activity is first created. */
	
	public static final String TAG = "moto";
	
    private ImageButton loader;
   
    
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

      //Log.i(TAG, "load Menu loaded");
  	  loader = (ImageButton) findViewById(R.id.startgame01);
  	  loader.setImageResource(R.drawable.startpagept);
  	  loader.setScaleType(ScaleType.CENTER_INSIDE);
  	  loader.setOnClickListener(this);
  	  
  	 AdView ad = (AdView) findViewById(R.id.ad);
     ad.setAdListener(new adListener());
   
    
     /*AdManager.setTestDevices( new String[] {                 
    	     AdManager.TEST_EMULATOR,             // Android emulator
    	     "E83D20734F72FB3108F104ABC0FFC738",  // My T-Mobile G1 Test Phone
    	     } ); */ 


		/*if (android.os.Environment.MEDIA_MOUNTED.equals("mounted")){
			  Log.i(TAG, "User Has an SD Card");
			  
		}*/
		
	
  	  
    }

  	public void onClick(View v) {
  		
  		switch(v.getId()){
  	     
      	case R.id.startgame01 :
      		 Log.i(TAG, "click");
      		Intent i = new Intent(TP.this, Menu.class);
          	startActivity(i);
      	break;
      }  
  		
  		
  	}
  	
  	 private class adListener extends SimpleAdListener{

 		/* (non-Javadoc)
 		 * @see com.admob.android.ads.AdView.SimpleAdListener#onFailedToReceiveAd(com.admob.android.ads.AdView)
 		 */
 		@Override
 		public void onFailedToReceiveAd(AdView adView)
 		{
 			// TODO Auto-generated method stub
 			super.onFailedToReceiveAd(adView);
 		}

 		/* (non-Javadoc)
 		 * @see com.admob.android.ads.AdView.SimpleAdListener#onFailedToReceiveRefreshedAd(com.admob.android.ads.AdView)
 		 */
 		@Override
 		public void onFailedToReceiveRefreshedAd(AdView adView){
 			// TODO Auto-generated method stub
 			super.onFailedToReceiveRefreshedAd(adView);
 		}

 		/* (non-Javadoc)
 		 * @see com.admob.android.ads.AdView.SimpleAdListener#onReceiveAd(com.admob.android.ads.AdView)
 		 */
 		@Override
 		public void onReceiveAd(AdView adView){
 			// TODO Auto-generated method stub
 			super.onReceiveAd(adView);
 		}

 		/* (non-Javadoc)
 		 * @see com.admob.android.ads.AdView.SimpleAdListener#onReceiveRefreshedAd(com.admob.android.ads.AdView)
 		 */
 		@Override
 		public void onReceiveRefreshedAd(AdView adView){
 			// TODO Auto-generated method stub
 			super.onReceiveRefreshedAd(adView);
 		}
     	
     }

     /* (non-Javadoc)
 	 * @see com.admob.android.ads.AdView.AdListener#onFailedToReceiveAd(com.admob.android.ads.AdView)
 	 */
 	public void onFailedToReceiveAd(AdView adView){
 		 Log.i(TAG,"onFailedToReceiveAd");
 	}

 	/* (non-Javadoc)
 	 * @see com.admob.android.ads.AdView.AdListener#onFailedToReceiveRefreshedAd(com.admob.android.ads.AdView)
 	 */
 	public void onFailedToReceiveRefreshedAd(AdView adView){
 		 Log.i(TAG, "onFailedToReceiveRefreshedAd");
 	}

 	/* (non-Javadoc)
 	 * @see com.admob.android.ads.AdView.AdListener#onReceiveAd(com.admob.android.ads.AdView)
 	 */
 	public void onReceiveAd(AdView adView){
 		 Log.i(TAG, "onReceiveAd");
 	}

 	/* (non-Javadoc)
 	 * @see com.admob.android.ads.AdView.AdListener#onReceiveRefreshedAd(com.admob.android.ads.AdView)
 	 */
 	public void onReceiveRefreshedAd(AdView adView){
 		 Log.i(TAG,"onReceiveRefreshedAd");
 	}

 	
 	
 	
	@Override
	 public void onDestroy() {
   	 super.onDestroy();
   	 Log.i(TAG, "onDestroy() in TP");	
   	 this.finish();
   	 }
  	
    
 /*  @Override
   public void onStart() {
   	super.onStart();
   
 	 }*/
    
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
    
 
  /*  @Override
   protected Dialog onCreateDialog(int id) {
       switch(id) {
       case PROGRESS_DIALOG:
           progressDialog = new ProgressDialog(TP.this);
           progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
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
           
 
           if (total >= 50){
               dismissDialog(PROGRESS_DIALOG);
               progressThread.setState(ProgressThread.STATE_DONE);
               
               Log.i(TAG, "loading Menu");
               Intent i = new Intent(TP.this, Menu.class);
               startActivity(i);
              
           }
       }
   };

   
   
   *//** Nested class that performs progress calculations (counting) *//*
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
    
   }
*/


	 
	 //to do list 
	 // revese stig in menu makes ships disiper
 	
	 //make m22 kill
	 //bug with crusher
	 //change website
	 
	 
	 
	 
	 
	 
	 //make game end
	 //make game win
	 //make not target if dead
	 //make m22 blow up
	 
	 //make all sounds 
	 //make all coliders
	 //make background music 
	
	 //make 2cnd weapon buttons
	 
	
	 //do point system
	 //do high score
	 

	 
	 
	 //update
	
	 

	 //make random power ups
	 
	 
	 // good for each loop
		//for each loop
		/*for(Ship ship : GameView.shipArray ){
			sumX = ship.shipX;
			sumY = ship.shipY;
			
			targetDist = Math.sqrt(Player.playerPosY - sumY);

		      Log.i(TAG, "  targetDist		 " + 		targetDist);
		}
		*/
		

    
}
