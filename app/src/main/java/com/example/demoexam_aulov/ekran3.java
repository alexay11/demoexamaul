package com.example.demoexam_aulov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ekran3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran3);
    }
    public void onClick(View view) {
        Intent intent = new Intent(ekran3.this, Email.class);
        startActivity(intent);
    }
}