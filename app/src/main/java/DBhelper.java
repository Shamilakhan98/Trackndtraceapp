import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;


public abstract class DBhelper extends SQLiteOpenHelper {

    public static final String DBNAME = "Login.db";

    public DBhelper(Context context) {
        super(context, "Login.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase myDB) {
myDB.execSQL("create Table users (uname TEXT primary key, upass TEXT)"
);
    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int oldVersion, int newVersion) {

        myDB.execSQL("drop Table if exists users");
    }

    public Boolean insertData(String uname, String upass, String address){
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("username",uname);
        contentvalues.put("password", upass);
        contentvalues.put("address", address);

        long result = myDB.insert("users", null, contentvalues);

        if(result == -1){
            return false;
        }
else{
    return true;
        }

    }

public Boolean checkuname (String uname) {
    SQLiteDatabase myDB = this.getWritableDatabase();
    Cursor cursor = myDB.rawQuery("select * from users where uname + ?", new String[]{uname});
    if (cursor.getCount() > 0) {
        return true;
    } else {
        return false;
    }
}

public Boolean checkunameupass(String uname, String upass){
    SQLiteDatabase myDB = this.getWritableDatabase();
    Cursor cursor = myDB.rawQuery("select * from users where uname + ?", new String[]{uname, upass});
    if (cursor.getCount() > 0) {
        return true;
    } else {
        return false;
    }





}





}
