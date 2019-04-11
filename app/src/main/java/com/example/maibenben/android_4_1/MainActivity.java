package com.example.maibenben.android_4_1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private ImageView imag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        imag = (ImageView) findViewById(R.id.imag);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                ObjectAnimator objectAnimator_1 = ObjectAnimator.ofFloat(imag,"alpha",1f,0f);
                objectAnimator_1.setDuration(3000);
                objectAnimator_1.setRepeatCount(-1);
                objectAnimator_1.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_1.start();
                break;
            case R.id.btn_2:
                ObjectAnimator objectAnimator_2 = ObjectAnimator.ofFloat(imag,"translationX",
                        0f,1000f);
                objectAnimator_2.setDuration(3000);
                objectAnimator_2.setRepeatCount(-1);
                objectAnimator_2.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_2.start();
                break;
            case R.id.btn_3:
                ObjectAnimator objectAnimator_3 = ObjectAnimator.ofFloat(imag,"rotation",
                        0f,360);
                objectAnimator_3.setDuration(3000);
                objectAnimator_3.setRepeatCount(-1);
                objectAnimator_3.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_3.start();
                break;
            case R.id.btn_4:
                ObjectAnimator objectAnimator_4 = ObjectAnimator.ofFloat(imag,"scaleX",
                        1f,0.5f);
                objectAnimator_4.setDuration(3000);
                objectAnimator_4.setRepeatCount(-1);
                objectAnimator_4.setRepeatMode(ValueAnimator.REVERSE);
                objectAnimator_4.start();
                break;
            case R.id.btn_5:
                ObjectAnimator alpha=ObjectAnimator.ofFloat(imag,"alpha",1f,0f);
                ObjectAnimator translationX=ObjectAnimator.ofFloat(imag,"translationX",0f,100f);
                ObjectAnimator rotation=ObjectAnimator.ofFloat(imag,"rotation",0f,360f);
                ObjectAnimator scaleX=ObjectAnimator.ofFloat(imag,"scaleX",1f,0.5f);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.play(alpha).with(translationX).after(rotation).before(scaleX);
                animatorSet.setDuration(5000);
                animatorSet.start();
                break;
        }
    }
}
