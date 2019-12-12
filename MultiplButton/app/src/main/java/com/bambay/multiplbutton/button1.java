package com.bambay.multiplbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class button1 extends AppCompatActivity {
    private TextView button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);
        button1=(TextView)findViewById(R.id.button1);
    }
}
