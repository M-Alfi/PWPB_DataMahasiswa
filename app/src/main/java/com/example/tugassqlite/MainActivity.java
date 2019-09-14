package com.example.tugassqlite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button  btnInformasi;
    private static final String DB_NAME = "Siswa";
    private static final String TABLE_NAME = "tbl_siswa";
    private static final String KEY_NAME = "name";
    private static final String KEY_NO = "nomor";
    private static final String KEY_TTL = "tanggal_lahir";
    private static final String KEY_GENDER = "jenkel";
    private static final String KEY_ADRESS = "alamat";
    private static final String KEY_AGE= "Age";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLihat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShowDataActivity.class));
            }
        });

        findViewById(R.id.btnInput).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InputDataActivity.class));
            }
        });

        Button btnInformasi = (Button)findViewById(R.id.btnInformasi);
        btnInformasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View v = inflater.inflate(R.layout.informasi_layout, null);
                builder.setView(v);

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }
}
