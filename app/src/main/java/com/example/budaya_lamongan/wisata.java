 package com.example.budaya_lamongan;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

 public class wisata extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        view=(TextView)findViewById(R.id.txtview);
        dbHelper = new DataHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM budaya WHERE kategori = '1'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            view.setText("nama\t\t\t\t\t\t:"+cursor.getString(1).toString()+
                    "\nfoto\t\t\t\t:"+cursor.getString(2).toString()+"\nket\t\t:"+cursor.getString(3).toString());
        }
    }
}
