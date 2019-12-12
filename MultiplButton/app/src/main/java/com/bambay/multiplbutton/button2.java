package com.bambay.multiplbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class button2 extends AppCompatActivity {
    private TextView button2text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        button2text=(TextView)findViewById(R.id.button2text);
    }
}
