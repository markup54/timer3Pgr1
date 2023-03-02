package com.example.pacak3pgr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int sekundy =0;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView  = findViewById(R.id.czasTextView);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
               sekundy++;
                textView.setText(Integer.toString(sekundy));
                handler.postDelayed(this,1000);
            }
        });
    }
}