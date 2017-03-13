package com.TP;



import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;



import android.widget.RadioButton;

public class SetUp extends Activity {
	
	 public static final String TAG = "moto";
	 public static float leftVolume;
	 public static float rightVolume;
	 public static float volume;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.setup);
	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
	 Log.i(TAG, "setUp loaded");
	final RadioButton startTheGame = (RadioButton) findViewById(R.id.dpad);
	
	startTheGame.setOnClickListener(new View.OnClickListener() {
		
		
          public void onClick(View v) {
        	  switch(v.getId()){
        	  
        	  case R.id.dpad:
         		 Log.i(TAG, "click...");
         		//GameView.DpadIS = true;	
         	break;
        	  }
          }
      });
	}


	
}
