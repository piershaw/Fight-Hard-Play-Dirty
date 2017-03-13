package com.TP;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class SNESController  
{
	public static final String TAG = "moto";
	
	private Activity mView;
	public static boolean AhitIs = false;
	public static boolean fireOne = false;
	public static boolean reloadedHellFire = true;
	
	public static boolean BhitIs = false;
	public static boolean fireTwo = false;
	public static boolean reloadedSuperBomb = true;
	
	private ControllerListener mListener;
	

	public SNESController(Context context) {
		mView = (Activity)context;
		init();
		 
	}

	public SNESController(Context context, AttributeSet attrs) {
		mView = (Activity)context;
		
		init();
	}
	public SNESController(Context context, AttributeSet attrs, int style) {
		mView = (Activity)context;
		init();
	}

	public void setListener (ControllerListener l) {
		mListener = l;
	}
	
	private void init() {
        //LayoutInflater factory = LayoutInflater.from(mContext);
        //mView =  factory.inflate(R.layout.wolf, null);
		//setupControls();
		Log.i(TAG, "controller set up");
		
		

	}

    /*private void setupControls() 
    {*/
    	//up
    	/*mView.findViewById(R.id.btn_up).setOnTouchListener(new View.OnTouchListener(){
		
			public boolean onTouch(View v, MotionEvent evt) {
				final ImageButton b = (ImageButton)v;
				
				int action = evt.getAction();
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("Up pressed");
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_UP); // ControllerListener.B_UP);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("Up released");
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_UP); // ControllerListener.B_UP);
				}
				return true;
			}
        });
        // down
    	mView.findViewById(R.id.btn_down).setOnTouchListener(new View.OnTouchListener(){
			
			public boolean onTouch(View v, MotionEvent evt) {
				final ImageButton b = (ImageButton)v;
				int action = evt.getAction();
				
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("Down pressed");
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_DOWN); // ControllerListener.B_DOWN);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("Down released");
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_DOWN);// ControllerListener.B_DOWN);
				}
				return true;
			}
        });
        // left
    	mView.findViewById(R.id.btn_left).setOnTouchListener(new View.OnTouchListener(){
		
			public boolean onTouch(View v, MotionEvent evt) {
				int action = evt.getAction();
				final ImageButton b = (ImageButton)v;
				
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("Left pressed");
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_LEFT); // ControllerListener.B_LEFT);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("Left released");
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_LEFT);
				}
				return true;
			}
        });
        // Right
    	mView.findViewById(R.id.btn_right).setOnTouchListener(new View.OnTouchListener(){
			
			public boolean onTouch(View v, MotionEvent evt) {
				int action = evt.getAction();
				final ImageButton b = (ImageButton)v;
				
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("Right pressed");
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_RIGHT);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("Right released");
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_RIGHT);
				}
				return true;
			}
        });
  */
      
        /*// X
    	mView.findViewById(R.id.btn_X).setOnTouchListener(new View.OnTouchListener(){
	
			public boolean onTouch(View v, MotionEvent evt) {
				int action = evt.getAction();
				final ImageButton b = (ImageButton)v;
				
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("X pressed");
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_X);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("X released");
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_X);
				}
				return true;
			}
        });
        // Y
    	mView.findViewById(R.id.btn_Y).setOnTouchListener(new View.OnTouchListener(){
		
			public boolean onTouch(View v, MotionEvent evt) {
				int action = evt.getAction();
				final ImageButton b = (ImageButton)v;
				
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("Y pressed");
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_Y);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("Y released");
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_Y);
				}
				return true;
			}
        });
*/
       /* // A
    	mView.findViewById(R.id.btn_A).setOnTouchListener(new View.OnTouchListener(){
			
			public boolean onTouch(View v, MotionEvent evt) {
				int action = evt.getAction();
				final ImageButton b = (ImageButton)v;
				
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("A pressed");
					//Log.i(TAG, "reloadedHellFire " + reloadedHellFire);
					if(reloadedHellFire == true){//reloaded
					AhitIs = true;
					fireOne = true;
					//Log.i(TAG, "A pressed");
					}
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_A);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("A released");
					//AhitIs = false;
					
					fireOne = false;
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_A);
				}
				return true;
			}
        });*/
        // B
    	/*mView.findViewById(R.id.btn_B).setOnTouchListener(new View.OnTouchListener(){
	
			public boolean onTouch(View v, MotionEvent evt) {
				int action = evt.getAction();
				final ImageButton b = (ImageButton)v;
				
				if ( action == MotionEvent.ACTION_DOWN) {
					b.setImageResource(R.drawable.firehit);
					//System.out.println("B pressed");
					if(reloadedSuperBomb == true){//reloaded
						BhitIs = true;
						fireTwo = true;
						//Log.i(TAG, "A pressed");
					}
					sendEvent(MotionEvent.ACTION_DOWN, KeyEvent.KEYCODE_B);
				}
				else if ( action == MotionEvent.ACTION_UP) {
					b.setImageResource(R.drawable.fire);
					//System.out.println("B released");
					sendEvent(MotionEvent.ACTION_UP, KeyEvent.KEYCODE_B);
				}
				return true;
			}
        });
    }*/

    /**
     * Send an event to the {@link ControllerListener}
     * @param state: Up (MotionEvent.ACTION_UP) or down (MotionEvent.ACTION_DOWN)
     * @param btn Android {@link KeyEvent}
     */
    private void sendEvent (int state, int btn) {
    	if (mListener != null) {
    		if ( state == MotionEvent.ACTION_UP)
    			mListener.ControllerUp(btn);
    		else
    			mListener.ControllerDown(btn);
    	}
    }
    
}
