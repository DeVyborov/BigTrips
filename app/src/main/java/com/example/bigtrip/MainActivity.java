package com.example.bigtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView clickPerm = findViewById(R.id.imageView);
        clickPerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                Intent intent = new Intent(MainActivity.this, ActivityPerm.class);
                startActivity(intent);
            }
        });

        ImageView clickMoscow = findViewById(R.id.imageView1);
        clickMoscow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Message();
            }
        });

        ImageView clickPiter = findViewById(R.id.imageView2);
        clickPiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Message();
            }
        });

        ImageView clickKazan = findViewById(R.id.imageView3);
        clickKazan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Message();
            }
        });
    }

    public  void Message() {
        Toast toast = Toast.makeText(this, "Путеводитель по городу находится в разработке", Toast.LENGTH_LONG);
        toast.show();
    }
}