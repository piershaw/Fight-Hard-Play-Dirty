package com.TP;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter 
{
	public static final String TAG = "moto";
    public static final String KEY_ROWID = "_id";
    public static final String KEY_RANK = "rank";
    public static final String KEY_NAME = "name";
    public static final String KEY_SCORE = "score";    
   
    
    public static final String DATABASE_NAME = "highscore.db";
    public static final String DATABASE_TABLE = "userdata";
    public static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE =
        "create table userdata (_id integer primary key autoincrement, "
        + "rank text not null, name text not null, " 
        + "score integer not null);";
        
    private final Context context; 
    
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public DBAdapter(Context ctx) 
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }
        
    private static class DatabaseHelper extends SQLiteOpenHelper 
    {
        DatabaseHelper(Context context) 
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) 
        {
            db.execSQL(DATABASE_CREATE);
            Log.i(TAG, "DATABASE_CREATE" );
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, 
        int newVersion) 
        {
            Log.w(TAG, "Upgrading database from version " + oldVersion 
                    + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS titles");
            onCreate(db);
        }
    }    
    
    //---opens the database---
    public DBAdapter open() throws SQLException 
    {
        db = DBHelper.getWritableDatabase();
        return this;
    }

    //---closes the database---    
    public void close() 
    {
        DBHelper.close();
    }
    
    //---insert a title into the database---
    public long insertTitle(String isbn, String title, String publisher) 
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_RANK, isbn);
        initialValues.put(KEY_NAME, title);
        initialValues.put(KEY_SCORE, publisher);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }

    //---deletes a particular title---
    public boolean deleteTitle(long rowId) 
    {
        return db.delete(DATABASE_TABLE, KEY_ROWID + 
        		"=" + rowId, null) > 0;
    }

    //---retrieves all the titles---
    public Cursor getAllTitles() 
    {
        return db.query(DATABASE_TABLE, new String[] {
        		KEY_ROWID, 
        		KEY_RANK,
        		KEY_NAME,
                KEY_SCORE}, 
                null, 
                null, 
                null, 
                null, 
                null);
    }
    
    /*public Cursor theData(){
    
    	 return db.query(false, "SELECT KEY_RANK,KEY_NAME,KEY_SCORE" + 
    	          " FROM " + DATABASE_TABLE  
    	          + " WHERE KEY_ROWID > 10 LIMIT 7;", 
    	          null, null, null, null, null, null, null);
    	  
    	  
    }*/

    //---retrieves a particular title---
    public Cursor getTitle(long rowId) throws SQLException 
    {
        Cursor mCursor =
                db.query(true, DATABASE_TABLE, new String[] {
                		KEY_ROWID,
                		KEY_RANK, 
                		KEY_NAME,
                		KEY_SCORE
                		}, 
                		KEY_ROWID + "=" + rowId, 
                		null,
                		null, 
                		null, 
                		null, 
                		null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    //---updates a title---
    public boolean updateTitle(long rowId, String rank, 
    String name, String score) 
    {
        ContentValues args = new ContentValues();
        args.put(KEY_RANK, rank);
        args.put(KEY_NAME, name);
        args.put(KEY_SCORE, score);
        return db.update(DATABASE_TABLE, args, 
                         KEY_ROWID + "=" + rowId, null) > 0;
    }
}