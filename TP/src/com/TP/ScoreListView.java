package com.TP;


import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ScoreListView extends ListActivity {
	public static final String TAG = "moto";
	private String row1;
	private String row2;
	private String row3;
	private String row4;
	
	private Cursor c1;
	private Cursor c2;
	private Cursor c3;
	private Cursor c4;
	
	public Drawable background;
	
	
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  // TODO Auto-generated method stub
  super.onCreate(savedInstanceState);
  
  
  DBAdapter db = new DBAdapter(this);
  
  		
		
   		
	    
	
	
  
/*  //---get all titles---
  db.open();
  Cursor c = db.getAllTitles();
  if (c.moveToFirst())
  {
      do {          
          DisplayTitle(c);
      } while (c.moveToNext());
  }
  db.close();*/
  
  db.open();
  c1  = db.getTitle(1);
  row1 = c1.getString(0)+"| " + c1.getString(1) + " " + c1.getString(2) + " SCORE |" + c1.getString(3);
  c2  = db.getTitle(2);
  row2 = c2.getString(0)+"| " + c2.getString(1) + " " + c2.getString(2) + " SCORE |" + c2.getString(3);
  c3  = db.getTitle(3);
  row3 = c3.getString(0)+"| " + c3.getString(1) + " " + c3.getString(2) + " SCORE |" + c3.getString(3);
  c4  = db.getTitle(4);
  row4 = c4.getString(0)+"| " + c4.getString(1) + " " + c4.getString(2) + " SCORE |" + c4.getString(3);
  db.close();
  
  final String[] SCORE = new String[] {row1,row2,row3,row4};
  
  setListAdapter(new ArrayAdapter<String>(this, android.R.layout.test_list_item, SCORE));
  getListView().setTextFilterEnabled(true);
  getListView().setPadding(20, 0, 0, 20);
  

 }
 
 
 

	public void DisplayTitle(Cursor c) {
		
 // Log.i(TAG, "  c.getPosition(); "  +   c.getPosition());

		
     Toast.makeText(this, 
             "id: " + c.getString(0) + "\n" +
             "RANK: " + c.getString(1) + "\n" +
             "NAME: " + c.getString(2) + "\n" +
             "SCORE  " + c.getString(3),
             Toast.LENGTH_LONG).show();  
     return;
 } 
	

 @Override
 protected void onListItemClick(ListView l, View v, int position, long id) {
  // TODO Auto-generated method stub
  super.onListItemClick(l, v, position, id);
  
    Intent intent = new Intent();
    Bundle bundle = new Bundle();
  
    bundle.putString("country", l.getItemAtPosition(position).toString());
    intent.putExtras(bundle);
    setResult(RESULT_OK, intent);
    finish();
 }

}