package uw_milwaukee.templev1;

/**
 * Created by yang_ on 7/14/2017.
 */

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;

public class DatabaseHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "temple.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "temple_table";
    private static final String ID = "ID";
    private static final String VALUE = "VALUE";
    private static final String TIME_STAMP = "TIME_STAMP";
    
    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreate = "CREATE TABLE " + TABLE_NAME + "( " + ID + "INTEGER PRIMARY KEY AUTOINCREMENT, ";
        sqlCreate += VALUE + " INTEGER NOT NULL, ";
        sqlCreate += TIME_STAMP + ", DATE NOT NULL, PRIMARY KEY(ID) );";

        db.execSQL( sqlCreate );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void insert(BGL_Record bgl_record){
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlInsert = "INSERT INTO " + TABLE_NAME;
        sqlInsert += " ( " + bgl_record.getId();
        sqlInsert += ", " + bgl_record.getValue();
        sqlInsert += ", " + bgl_record.getTimeStamp() + ");";

        db.execSQL( sqlInsert );
        db.close();
    }

    public void deleteById(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlDelete = "delete from " + TABLE_NAME;
        sqlDelete += " where " + ID + " = " + id + ";"
    }

    public void updateById(String id, double value, Timestamp timestamp){
        SQLiteDatabase db = this.getWritableDatabase();

        String sqlUpdate = "update " + TABLE_NAME;
        sqlUpdate += "set " + VALUE + " = '" + value + "', ";
        sqlUpdate += TIME_STAMP + " = '" + timestamp + "'";
        sqlUpdate += " where " + "ID" + " = " + id;

        db.execSQL( sqlUpdate );
        db.close();
    }

    public ArrayList<BGL_Record> selectAll(){
        String sqlQuery = "select * from " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery( sqlQuery, null );
    }
}
