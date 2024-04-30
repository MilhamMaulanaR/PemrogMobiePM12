package com.example.p1_h071221035;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText et1;
    ArrayList<String> list_text; //deklarasikan variabel
    ArrayAdapter<String> adapter;
    ListView listView; // Mengubah lv menjadi listView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1); //dihubungkan dengan id dari xml
        et1 = findViewById(R.id.et1);
        listView = findViewById(R.id.lv);

        list_text = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list_text); //menghubungkan
        listView.setAdapter(adapter); // untuk meanmpilkan

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_text = et1.getText().toString().trim();
                if (!input_text.isEmpty()){
                    list_text.add(input_text);
                    adapter.notifyDataSetChanged();
                    et1.setText("");
                }
            }
        });
    }
}
