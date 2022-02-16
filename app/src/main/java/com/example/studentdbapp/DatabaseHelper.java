package com.example.studentdbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {
    static  String DbName= "College.db";
    static  String TableName= "Students";
    static  String col1= "id";
    static  String col2= "name";
    static  String col3= "rollno";
    static  String col4= "admno";
    static  String col5= "college";

    public DatabaseHelper( Context context) {
        super(context, DbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="create table "+TableName+
                "("+col1+" integer primary key autoincrement,"+
                col2+" text,"+
                col3+" text,"+
                col4+" text,"+
                col5+" text)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insertData(String name,String rollno,String admno,String clg)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c= new ContentValues();
        c.put(col2,name);
        c.put(col3,rollno);
        c.put(col4,admno);
        c.put(col5,clg);

        long status=db.insert(TableName,null,c);

        if (status==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }


}
