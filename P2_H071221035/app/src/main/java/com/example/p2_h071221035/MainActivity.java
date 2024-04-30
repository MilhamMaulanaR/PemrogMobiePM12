package com.example.p2_h071221035;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {


    ImageButton imgbutton;
    EditText name;
    EditText username;
    Button btn1;
    Uri uriGambar;

    Boolean cekGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbutton = findViewById(R.id.imgbutton);
        name = findViewById(R.id.name);
        username = findViewById(R.id.username);
        btn1 = findViewById(R.id.btn1);
        cekGambar = false;

        ActivityResultLauncher<Intent> intentLaunch = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                        uriGambar = result.getData().getData();
                        try {
                            InputStream inputStream = getContentResolver().openInputStream(uriGambar);
                            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                            imgbutton.setImageBitmap(bitmap);
                            cekGambar = true;
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                            Toast.makeText(this, "Gagal memuat gambar", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGaleri = new Intent(Intent.ACTION_PICK);
                toGaleri.setType("image/*");
                intentLaunch.launch(toGaleri);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = name.getText().toString().trim();
                String username1 = username.getText().toString().trim();

                if (cekGambar == false){
                    Toast.makeText(MainActivity.this, "Silahkan pilih gambar terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else if (nama.length() == 0){
                    name.setError("Nama wajib diisi");
                } else if (username.length() == 0){
                   username.setError("Username wajib diisi");
                } else {
                    Intent toActivity2 = new Intent(MainActivity.this, MainActivity2.class);
                    toActivity2.putExtra("kirim_nama", nama);
                    toActivity2.putExtra("kirim_username", username1);
                    toActivity2.putExtra("kirim_gambar", uriGambar.toString());
                    startActivity(toActivity2);
                }


            }
        });
    }


}