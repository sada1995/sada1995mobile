package com.bambay.multiplbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bambay.multiplbutton.R;
import com.bambay.multiplbutton.button1;
import com.bambay.multiplbutton.button2;

public class MainActivity extends AppCompatActivity {
  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final  Button button1=(Button) findViewById(R.id.button1);
        final Button button2=(Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view){
            Intent int2=new Intent( MainActivity.this, com.bambay.multiplbutton.button1.class);
                                       startActivity(int2);

                                       }
                                   });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent( MainActivity.this, com.bambay.multiplbutton.button2.class);
                startActivity(int2);

            }
        });

    }
}
