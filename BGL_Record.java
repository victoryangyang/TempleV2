package uw_milwaukee.templev1;

/**
 * Created by yang_ on 7/16/2017.
 */

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;

public class BGL_Record{
    private String id;
    private double value;
    private Timestamp timestamp;

    public BGL_Record(String newId, double value, Timestamp timeStamp){
        setId(newId);
        setValue(value);
        setTimeStamp(timeStamp);
    }

    public void setId(String newId){
        id = newId;
    }

    public void setValue(double newValue){
        value = newValue;
    }

    public void setTimeStamp( Timestamp newTimeStamp){
        timestamp = newTimeStamp;
    }

    public String getId(){
        return id;
    }

    public double getValue(){
        return value;
    }

    public Timestamp getTimeStamp(){
        return timestamp;
    }
}
