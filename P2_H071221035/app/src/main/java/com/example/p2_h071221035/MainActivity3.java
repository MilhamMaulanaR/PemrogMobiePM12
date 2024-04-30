package com.example.p2_h071221035;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainActivity3 extends AppCompatActivity {

    ImageView imgview3;
    TextView name3, username3, title3, content3;


    Uri uriGambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imgview3 = findViewById(R.id.imgview3);
        name3 = findViewById(R.id.name3);
        username3 = findViewById(R.id.username3);
        title3 = findViewById(R.id.title3);
        content3 = findViewById(R.id.content3);

        String uriString = getIntent().getStringExtra("kirim_gambar");
        if (uriString != null) {
            try {
                Uri uriGambar = Uri.parse(uriString);
                InputStream inputStream = getContentResolver().openInputStream(uriGambar);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                imgview3.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(this, "Gagal memuat gambar", Toast.LENGTH_SHORT).show();
            }
        }

        String nama = getIntent().getStringExtra("kirim_nama");
        String username = getIntent().getStringExtra("kirim_username");
        String judul = getIntent().getStringExtra("kirim_judul");
        String isi = getIntent().getStringExtra("kirim_isi");

        name3.setText(nama);
        username3.setText(username);
        title3.setText(judul);
        content3.setText(isi);
    }
}