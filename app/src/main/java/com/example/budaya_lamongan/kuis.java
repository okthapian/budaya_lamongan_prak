package com.example.budaya_lamongan;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class kuis extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    TextView kuis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        kuis=(TextView)findViewById(R.id.txtkuis);
dbHelper = new DataHelper(this);
SQLiteDatabase db = dbHelper.getReadableDatabase();
//cursor = db.rawQuery("SELECT * FROM kuis", null);
//cursor.moveToFirst();
//        if (cursor.getCount() > 0) {
//            kuis.setText("soal:"+cursor.getString(1).toString()+
//                    "\nA"+cursor.getString(2).toString()+
//                    "\nB"+cursor.getString(3).toString()+
//                    "\nC"+cursor.getString(4).toString()+
//                    "\nD"+cursor.getString(5).toString()+
//                    "\nbenar"+cursor.getString(6).toString());
//        }else{
//            kuis.setText("soal:");
//        }
    }
}
