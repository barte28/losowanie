package com.example.losowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button buttonLosowanie;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.liczba);
        buttonLosowanie = findViewById(R.id.button);
        buttonLosowanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Random random = new Random();
            int liczba = random.nextInt(1000);
            textView.setText(""+liczba);
            }
        });
    }
}