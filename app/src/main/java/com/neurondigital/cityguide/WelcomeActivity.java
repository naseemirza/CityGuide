package com.neurondigital.cityguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        imageView=(ImageView)findViewById(R.id.simage);


        Thread myThred=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(4000);


                    Intent intent=new Intent(getApplicationContext(),SplashScreenActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThred.start();
    }
}
