package ca.qc.bdeb.c5gm.tp1_mobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    public static final int VERSION = 1;
    public static final String NOM_BD = "iformations.db";
    public static final String CREATE_TABLE = "CREATE TABLE " + Infos.NOM_TABLE + "(" +
            Infos._ID + "INTEGER PRIMARY KEY, " +
            Infos.CONTACT + "TEXT, " +
            Infos.COURRIEL + "TEXT, " +
            Infos.TELEPHONE + "NUMBER, " +
            Infos.ADRESSE + "TEXT, " +
            Infos.SITE_WEB + "TEXT, " +
            Infos.VILLE + "TEXT, " +
            Infos.CODE_POSTAL + "TEXT) ";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + Infos.NOM_TABLE;
    private Context context;
    private static DBHelper instance = null;

    public DBHelper(@Nullable Context context) {
        super(context, NOM_BD, null, VERSION);
    }

    public static DBHelper getInstance(Context context){
        if(instance == null){
            instance = new DBHelper(context);
        }
        return instance;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        if (i1 > i) {
            sqLiteDatabase.execSQL(DROP_TABLE);
            sqLiteDatabase.execSQL(CREATE_TABLE);
        }
    }

    public static class Infos implements BaseColumns {
        public static final String NOM_TABLE = "scores";
        public static final String CONTACT = "contact";
        public static final String COURRIEL = "courriel";
        public static final String TELEPHONE = "telephone";
        public static final String ADRESSE= "adresse";
        public static final String SITE_WEB = "siteWeb";
        public static final String VILLE = "ville";
        public static final String CODE_POSTAL = "codePostal";
    }
}
