package com.example.mysqlite_1;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MySqlite_Helper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "myDatabase_1";
    private static final String TABLE_NAME = "MYTABLE_1";
    private static final int DATABASE_VERSION = 2;
    private static final String UID = "_id";
    private static final String NAME = "Name";
//    private static final String ADDRESS = "Address";
    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+"("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+" VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS "+TABLE_NAME;
    private Context context;



    MySqlite_Helper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        Log.d("mysql", "onConstructor() called");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
            Log.d("mysql", "onCreate() called");
        }
        catch (SQLException e) {
            Message.message(context, ""+e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            Log.d("mysql", "onUpgrade() called");
            Log.d("mysql", "old Version: "+oldVersion);
            db.execSQL(DROP_TABLE);
            onCreate(db);
        }
        catch (SQLException e) {
            Message.message(context, ""+e);
        }
    }
}
