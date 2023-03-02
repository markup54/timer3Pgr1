package com.example.pacak3pgr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int sekundy =0;
TextView textView;
Button button;
boolean running;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView  = findViewById(R.id.czasTextView);
        button = findViewById(R.id.button);
        running = true;
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(running){
                    sekundy++;
                }
                textView.setText(Integer.toString(sekundy));
                handler.postDelayed(this,1000);
            }
        });
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(running) {
                            running = false;
                            button.setText("Start");
                        }
                        else{
                            running = true;
                            button.setText("Pauza");
                        }
                    }
                }
        );
    }
}