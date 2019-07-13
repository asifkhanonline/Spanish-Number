package com.lco.spanish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    SoundPool soundPool;
    int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        b10=findViewById(R.id.btn10);

        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes=new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool=new SoundPool.Builder()
                    .setMaxStreams(8)
                    .setAudioAttributes(audioAttributes).build();
        }
        else{
            soundPool=new SoundPool(8,AudioManager.STREAM_MUSIC,0);
        }
        s1=soundPool.load(this,R.raw.one,1);
        s2=soundPool.load(this,R.raw.two,1);
        s3=soundPool.load(this,R.raw.three,1);
        s4=soundPool.load(this,R.raw.four,1);
        s5=soundPool.load(this,R.raw.five,1);
        s6=soundPool.load(this,R.raw.six,1);
        s7=soundPool.load(this,R.raw.seven,1);
        s8=soundPool.load(this,R.raw.eight,1);
        s9=soundPool.load(this,R.raw.nine,1);
        s10=soundPool.load(this,R.raw.ten,1);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s1,1,1,0,0,1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s2,1,1,0,0,1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s3,1,1,0,0,1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s4,1,1,0,0,1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s5,1,1,0,0,1);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s6,1,1,0,0,1);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s7,1,1,0,0,1);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s8,1,1,0,0,1);
            }
        });




    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        soundPool.release();
        soundPool=null;
    }
}
