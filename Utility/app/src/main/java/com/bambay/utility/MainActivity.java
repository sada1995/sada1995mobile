package com.bambay.utility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // appel
        Button appeler = (Button) findViewById(R.id.buttonCall);
        appeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:00221772755714"));
                startActivity(intent);
            }
        });

        //envoyer un sms
        Button sms = (Button) findViewById(R.id.btnSms);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSms = new Intent(Intent.ACTION_SENDTO);
                intentSms.setData(Uri.parse("smsto:" +Uri.encode("760277060")));
                intentSms.putExtra("sms_body","hello");
                startActivity(intentSms);
            }
        });



    }
}
