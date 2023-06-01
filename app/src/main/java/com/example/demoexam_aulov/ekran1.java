package com.example.demoexam_aulov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ekran1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran1);
    }
    public void onClick(View view) {
        Intent intent = new Intent(ekran1.this, ekran2.class);
        startActivity(intent);
    }
}