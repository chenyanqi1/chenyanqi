package com.example.maibenben.android_4_1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imag_1;
    private Button but_1;
    private Button but_2;
    private Button but_3;
    private Button but_4;
    private Button but_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        imag_1 = (ImageView) findViewById(R.id.imag_1);
        but_1 = (Button) findViewById(R.id.but_1);
        but_2 = (Button) findViewById(R.id.but_2);
        but_3 = (Button) findViewById(R.id.but_3);
        but_4 = (Button) findViewById(R.id.but_4);
        but_5 = (Button) findViewById(R.id.but_5);

        but_1.setOnClickListener(this);
        but_2.setOnClickListener(this);
        but_3.setOnClickListener(this);
        but_4.setOnClickListener(this);
        but_5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_1:
                ObjectAnimator objectAnimator_1 = ObjectAnimator.ofFloat(imag_1,"scaleX",1f,0.5f);
                objectAnimator_1.setDuration(3000);
                objectAnimator_1.setRepeatCount(-1);
                objectAnimator_1.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_1.start();
                break;
            case R.id.but_2:
                ObjectAnimator objectAnimator_2 = ObjectAnimator.ofFloat(imag_1,"rotation",0f,360);
                objectAnimator_2.setDuration(3000);
                objectAnimator_2.setRepeatCount(-1);
                objectAnimator_2.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_2.start();
                break;
            case R.id.but_3:
                ObjectAnimator objectAnimator_3 = ObjectAnimator.ofFloat(imag_1,"translationX",1f,1000f);
                objectAnimator_3.setDuration(3000);
                objectAnimator_3.setRepeatCount(-1);
                objectAnimator_3.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_3.start();
                break;
            case R.id.but_4:
                ObjectAnimator objectAnimator_4 = ObjectAnimator.ofFloat(imag_1,"alpha",4f,0f);
                objectAnimator_4.setDuration(3000);
                objectAnimator_4.setRepeatCount(-1);
                objectAnimator_4.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_4.start();
                break;
            case R.id.but_5:
                ObjectAnimator but_1 = ObjectAnimator.ofFloat(imag_1,"alpha",1f,0f);
                ObjectAnimator but_2 = ObjectAnimator.ofFloat(imag_1,"scaleX",1f,0.5f);
                ObjectAnimator but_3 = ObjectAnimator.ofFloat(imag_1,"translationY",1f,1000f);
                ObjectAnimator but_4 = ObjectAnimator.ofFloat(imag_1,"rotation",0f,360);

                AnimatorSet animationSet = new AnimatorSet();
                animationSet.play(but_1).with(but_3).after(but_2).before(but_4);
                animationSet.setDuration(3000);
                animationSet.start();
                break;
        }
    }
}
