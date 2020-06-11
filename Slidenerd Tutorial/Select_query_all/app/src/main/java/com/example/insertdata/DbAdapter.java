package com.example.insertdata;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbAdapter {
    DbHelper dbHelper;
    public DbAdapter(Context context) {
        dbHelper = new DbHelper(context);
    }

    public long insertMethod(String name, String pass)
        {
            SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(DbHelper.dNAME, name);
            contentValues.put(DbHelper.dPASSWORD, pass);

            long id = sqLiteDatabase.insert(DbHelper.TABLE_NAME, null, contentValues);
            sqLiteDatabase.close();
            return id;
        }

        public String selectMethod()
        {
            SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();

            String[] coloumns = {DbHelper.dUID, DbHelper.dNAME, DbHelper.dPASSWORD};
            Cursor cursor = sqLiteDatabase.query(DbHelper.TABLE_NAME, coloumns, null, null, null, null, null);
            StringBuffer stringBuffer= new StringBuffer();

            while (cursor.moveToNext())
            {
                int cId = cursor.getInt(0);
                String name = cursor.getString(1);
                String password = cursor.getString(2);

                stringBuffer.append(cId + " "+ name+ " "+ password+ " "+ '\n');
            }

            return stringBuffer.toString();
        }


    class DbHelper extends SQLiteOpenHelper{
        private static final String DATABASE_NAME = "MyDatabase_2";
        private static final String TABLE_NAME = "Table_1";
        private static final int DATABASE_VERSION = 3;
        private static final String dUID = "_id";
        private static final String dNAME = "Name";
        private static final String dPASSWORD = "Password";
        private static final String dCREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" ("+dUID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+dNAME+" VARCHAR(255), " +
                ""+dPASSWORD+" VARCHAR(255));";
        private static final String dDROP_TABLE = "DROP TABLE IF EXISTS "+TABLE_NAME;


        public DbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            Log.d("mySqlite", "onConstructor() called");
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(dCREATE_TABLE);
                Log.d("mySqlite", "onCreate() called");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                Log.d("mySqlite", "onUpgrade() called");
                db.execSQL(dDROP_TABLE);
                onCreate(db);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
