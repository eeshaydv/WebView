package com.android.project;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import com.scwang.wave.MultiWaveHeader;


public class SplashScreenActivity extends AppCompatActivity {


TextView t ,t2;
ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        img=findViewById(R.id.img);
        t=findViewById(R.id.text);
        t2=findViewById(R.id.text2);
        img.bringToFront();
        t.bringToFront();
        t2.bringToFront();






        Splash ob=new Splash();
        ob.start();

    }
    private class Splash extends Thread
    {
        public void run()
        {
            try
            {
                sleep(3000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
            SplashScreenActivity.this.finish();
        }
    }
}
