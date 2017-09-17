package com.here.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hyc on 2017/9/16 14:37
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_USER = "create table IF NOT EXISTS User(user_id text" +
            ",nickname text,sex text,age integer,birth text," +
            "introduction text,head text,address text,show_number boolean,show_age" +
            " boolean,show_birth boolean,background text,relevant_id text,tips text,is_follow INTEGER,primary key(user_id,relevant_id))";




    public MyDatabaseHelper(Context context, String name, SQLiteDatabase
            .CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}