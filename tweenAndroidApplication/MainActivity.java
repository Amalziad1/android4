package com.example.tweenanimationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonRotate=(Button)findViewById(R.id.button);
        Button buttonScale=(Button) findViewById(R.id.button2);
        Button buttonTranslate =(Button) findViewById(R.id.button3);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        buttonRotate.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate));
            }
        });
        buttonScale.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale));
            }
        });
        buttonTranslate.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate)); }
         });

    }
}