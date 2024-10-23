package com.example.losowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

    @Override
    protected void onStart() {
        super.onStart();
        //metody cyklu życia nie powinny być wyłowywane przez programiste
        Log.i("CYKL ŻYCIA","Wykonana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL ŻYCIA","Wykonana metoda onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL ŻYCIA","Wykonana metoda onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CYKL ŻYCIA","Wykonana metoda onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL ŻYCIA","Wykonana metoda onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL ŻYCIA","Wykonana metoda onPause");
    }
}