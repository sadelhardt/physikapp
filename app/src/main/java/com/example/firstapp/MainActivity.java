package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    int i=0;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        t1=findViewById(R.id.textView2);
    }
    public void onClick(View view){
        this.view = view;
        final int i = this.i++;
        if(this.i %2==0) {
            t1.setText("Nun hab ich geklickt");
        } else{
            t1.setText("Neuer Klick");
        }

    }

}
