package com.example.p2_h071221035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText title;
    EditText content;
    Button btn2;

    Uri uriGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title = findViewById(R.id.title);
        content = findViewById(R.id.content);
        btn2 = findViewById(R.id.btn2);

        String nama = getIntent().getStringExtra("kirim_nama");
        String username = getIntent().getStringExtra("kirim_username");

        if (getIntent().hasExtra("kirim_gambar")){
            String uriString = getIntent().getStringExtra("kirim_gambar");
            uriGambar = Uri.parse(uriString);
        }


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String judul = title.getText().toString().trim();
                String isi = content.getText().toString().trim();

                if (judul.length() == 0) {
                    title.setError("Judul wajib diisi");
                } else if (isi.length() == 0) {
                    content.setError("Isi konten wajib diisi");
                } else {
                    Intent toActivity3 = new Intent(MainActivity2.this, MainActivity3.class);
                    toActivity3.putExtra("kirim_nama", nama);
                    toActivity3.putExtra("kirim_username", username);
                    toActivity3.putExtra("kirim_gambar", uriGambar.toString());
                    toActivity3.putExtra("kirim_judul", judul);
                    toActivity3.putExtra("kirim_isi",isi);
                    startActivity(toActivity3);
                }
            }
   });
}
}