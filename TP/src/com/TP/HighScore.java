package com.TP;


import android.app.Activity;
//import android.app.ListActivity;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
//import android.widget.ArrayAdapter;
import android.widget.Toast;

public class HighScore extends Activity {

	public static final String TAG = "moto";
	private String row1;
	private String row2;
	private String row3;
	
	
	private static String[] scoresArrayCol1;

	
	private Paint mTextPaint;
	
	//private ListView listView;
	//private ListActivity listact;
	
	 @Override
	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.score);
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	       
	        //listView = (ListView) findViewById(R.id.ScoreView1);
	        //listact.addContentView(listView, null);
	       // listact.setListAdapter(new ArrayAdapter<String>(HighScore.this, android.R.layout.simple_list_item_1, scoresArrayCol1)); 
	        //listact.getListView().setTextFilterEnabled(true);
	       
	    	
	        scoresArrayCol1 = new String[3];
	        //scoresArrayCol2 = new String[1];
	        //scoresArrayCol3 = new String[1];
	        
	       // setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, scoresArrayCol1));
	       // getListView().setTextFilterEnabled(true);

	        DBAdapter db = new DBAdapter(this);
	       // Log.i(TAG, "db "  + db);
	        
	        
	        
	        //---add 2 titles---
	      /*  db.open();        
	        long id;
	        id = db.insertTitle(
	        		"private",
	        		"pier",
	        		"1000");        
	        id = db.insertTitle(
	        		"private",
	        		"pier",
	        		"2000");
	        db.close();*/
	
	        
	        db.open(); 
	        long id = 1;
	        db.updateTitle(id, "sgt", "starr", "2000");
	        db.close();
	
	        
	        
	        
	        //---get all titles---
	        db.open();
	        Cursor c = db.getAllTitles();
	        if (c.moveToFirst())
	        {
	            do {          
	                DisplayTitle(c);
	            } while (c.moveToNext());
	        }
	        db.close();
	        
	        
	        mTextPaint = new Paint();
			mTextPaint.setARGB(255, 255, 255, 255);
			mTextPaint.setTextSize(20);
	 
      
    }





	public void DisplayTitle(Cursor c) {
		
		 //Log.i(TAG, "in DisplayTitle "  + c.getString(0));
		
		scoresArrayCol1[0] = row1;
        scoresArrayCol1[1] = row2;
        scoresArrayCol1[2] = row3;

		 
		    for(int i1 = 0; i1 < scoresArrayCol1.length; i1++){
	        	 row1 = c.getString(0).toString();
	        	 row2 = c.getString(2).toString();
	        	 row3 = c.getString(3).toString();
	    	
	    		 Log.i(TAG, "scoresArrayCol1 "  + scoresArrayCol1[i1]);
	        }
		    
		    /*for(int i2 = 0; i2 < scoresArrayCol1.length; i2++){
	        	 row2 = c.getString(1).toString();
	    	
	    		 Log.i(TAG, "scoresArrayCol2 "  + scoresArrayCol2[i2]);
	        }
		    
		    for(int i3 = 0; i3 < scoresArrayCol1.length; i3++){
	        	 row3 = c.getString(2).toString();
	    	
	    		 Log.i(TAG, "scoresArrayCol3 "  + scoresArrayCol3[i3]);
	        }
		*/
		
		
        Toast.makeText(this, 
                "id: " + c.getString(0) + "\n" +
                "RANK: " + c.getString(1) + "\n" +
                "NAME: " + c.getString(2) + "\n" +
                "SCORE  " + c.getString(3),
                Toast.LENGTH_LONG).show();  
        return;
    } 

	
	
	
	public void highScoreDoDraw(Canvas canvas){
		canvas.drawText( row1 ,90,30, mTextPaint);
		canvas.drawText( row2 ,90,60, mTextPaint);
		canvas.drawText( row3 ,90,90, mTextPaint);
		
		
		 
	 return;	
	}
 
  
}
    
