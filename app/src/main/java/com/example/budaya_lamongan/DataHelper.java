package com.example.budaya_lamongan;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    //==========================
    private static final String DATABASE_NAME = "budayalamongan.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table budaya(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nama text null, " +
                "foto text null," +
                "ket text null," +
                "kategori text null);";
        String sql1 ="create table kuis(" +
                "id_kuis INTEGER PRIMARY KEY AUTOINCREMENT," +
                "soal text null," +
                "jwbA text null," +
                "jwbB text null," +
                "jwbC text null," +
                "jwbD text null," +
                "jawaban text null);";
        Log.d("Data", "onCreate: " + sql);
        Log.d("Data", "onCreate: " + sql1);
        db.execSQL(sql);
        db.execSQL(sql1);
        String ket="Wisata bahari lamongan atau biasa disebut dengan WBL " +
                "merupakan tempat wisata yang terletak di kecamatan Paciran," +
                " kabupaten Lamongan jawa Timur. WBL lamongan merupakan tempat " +
                "rekreasi terbesar dipesisir pantai Jawa.  " +
                "Sebelum didirikan tempat ini lebih sering dikenal " +
                "dengan nama tanjung kodok kemudian dikembangkan" +
                " dengan memadukan konsep wisata bahari dengan dunia" +
                " wisata modern.WBL  ini di bangun pada tanggal 14 November dan diresmikan oleh H.Masyfuk,S.H yang saat itu menjabat sebagai  Bupati Lamongan.\n" +
                "\n" +
                "Tempat wisata tersebut berdiri diatas tanah dengan luas 11 " +
                "hektare dan siap memanjakan  anda mulai jam 08.30-16.30 WIB " +
                "setiap harinya dengan menggunakan konsep one stop servis." +
                " Didukung dengan wahana wisata bahari lamongan yang bervariasi " +
                "menjadikan wisata ini menjadi solusi bagi liburan keluarga " +
                "anda.";
        String klk = "INSERT INTO budaya(nama, foto,ket,kategori) VALUES (" +
                "'Wisata Bahari Lamongan'," +
                "'wbl.jpg','"+ket+"','jkjkj');";

        sql1="INSERT INTO kuis(soal,jwbA,jwbB,jwbC,jwbD,jawaban)VALUES('apa nama wisata di paciran?','uhuhu','WBL','jiji','koko','B');";

        db.execSQL(klk);
        db.execSQL(sql1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}
