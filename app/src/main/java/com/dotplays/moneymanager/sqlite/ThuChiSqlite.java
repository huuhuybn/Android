package com.dotplays.moneymanager.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ThuChiSqlite extends SQLiteOpenHelper {


    public ThuChiSqlite(Context context) {
        super(context, "thuChi.db", null, 1);
    }

    public static final String CREATE_TABLE_THU_CHI = "CREATE TABLE ThuChi " +
            "(id PRIMARY KEY AUTOINCREMENT," +
            "name TEXT,tien FLOAT,khoanThuChi TEXT,loaiThuChi TEXT)";
    public static final String TABLE_THU_CHI = "ThuChi";
    public static final String TC_ID = "id";
    public static final String TC_NAME = "name";
    public static final String TC_MONEY = "tien";
    public static final String TC_KHOAN_THU_CHI = "khoanThuChi";
    public static final String TC_LOAI_THU_CHI = "loaiThuChi";

    // sinh vien khai bao them 1 bang nua la LoaiThuChi



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CREATE_TABLE_THU_CHI);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
