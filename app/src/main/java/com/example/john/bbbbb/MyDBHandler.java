package com.example.john.bbbbb;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "scoreboardDB.db";
    private static final String TABLE_SCORES = "scores";

    public static final String COLUMN_PROFILEID = "_profileID";
    public static final String COLUMN_HIGHSCORE = "highScore";
    public static final String COLUMN_SHORTESTBATTLETIME = "shortestBattleTime";
    public static final String COLUMN_LONGESTBATTLETIME = "longestBattleTime";
    public static final String COLUMN_STRONGESTATK = "strongestAtk";
    public static final String COLUMN_STRONGESTCRITATK = "strongestCritAtk";

    public MyDBHandler(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SCORES_TABLE = "CREATE TABLE " +
                TABLE_SCORES + "("
                + COLUMN_PROFILEID + " INTEGER PRIMARY KEY," + COLUMN_HIGHSCORE
                + " INTEGER," + COLUMN_SHORTESTBATTLETIME + " INTEGER,"
                + COLUMN_LONGESTBATTLETIME + " INTEGER," + COLUMN_STRONGESTATK + " INTEGER,"
                + COLUMN_STRONGESTCRITATK + " INTEGER" + ")";
        db.execSQL(CREATE_SCORES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SCORES);
        onCreate(db);
    }

    public void addScores(Score scores) {

        ContentValues values = new ContentValues();
        values.put(COLUMN_HIGHSCORE, scores.getHighScore());
        values.put(COLUMN_SHORTESTBATTLETIME, scores.getShortestBattleTime());
        values.put(COLUMN_LONGESTBATTLETIME, scores.getLongestBattleTime());
        values.put(COLUMN_STRONGESTATK, scores.getStrongestAtk());
        values.put(COLUMN_STRONGESTCRITATK, scores.getStrongestCritAtk());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_SCORES, null, values);
        db.close();
    }

    public Score findScores(int profileID) {
        String query = "Select * FROM " + TABLE_SCORES + " WHERE " + COLUMN_PROFILEID + " =  " + profileID;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        Score scores = new Score();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            scores.setID(Integer.parseInt(cursor.getString(0)));
            scores.setHighScore(Integer.parseInt(cursor.getString(1)));
            scores.setShortestBattleTime(Integer.parseInt(cursor.getString(2)));
            scores.setLongestBattleTime(Integer.parseInt(cursor.getString(3)));
            scores.setStrongestAtk(Integer.parseInt(cursor.getString(4)));
            scores.setStrongestCritAtk(Integer.parseInt(cursor.getString(5)));
            cursor.close();
        }
        else {
            scores = null;
        }
        db.close();
        return scores;
    }

    public boolean deleteScore(int profileID) {

        boolean result = false;

        String query = "Select * FROM " + TABLE_SCORES + " WHERE " + COLUMN_PROFILEID + " =  " + profileID;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        Score scores = new Score();

        if (cursor.moveToFirst())
        {
            scores.setID(Integer.parseInt(cursor.getString(0)));
            db.delete(TABLE_SCORES, COLUMN_PROFILEID + " = ?",
                    new String[] { String.valueOf(scores.getID()) });
            cursor.close();
            result = true;
        }
        db.close();
        return result;
    }
    public void update(Score scores)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_HIGHSCORE, scores.getHighScore());
        values.put(COLUMN_SHORTESTBATTLETIME, scores.getShortestBattleTime());
        values.put(COLUMN_LONGESTBATTLETIME, scores.getLongestBattleTime());
        values.put(COLUMN_STRONGESTATK, scores.getStrongestAtk());
        values.put(COLUMN_STRONGESTCRITATK, scores.getStrongestCritAtk());

        db.update(TABLE_SCORES, values, COLUMN_PROFILEID + " = ?",
                new String[] { String.valueOf(scores.getID()) });
        db.close();
    }

}