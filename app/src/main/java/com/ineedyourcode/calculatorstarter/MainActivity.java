package com.ineedyourcode.calculatorstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_launcher).setOnClickListener(v -> {
            Uri calculatorUri = Uri.parse("calculator://launch");

            startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW, calculatorUri), ""));
        });
    }
}