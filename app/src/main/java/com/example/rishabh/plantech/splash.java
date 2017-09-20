package com.example.rishabh.plantech;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class splash extends AppCompatActivity {
    ImageView s1, s2, ervice, back;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        //   gear = (ImageView) findViewById(R.id.gear);
        //  s1 = (ImageView) findViewById(R.id.s1);
        //   s2 = (ImageView) findViewById(R.id.s2);
        //    ervice = (ImageView) findViewById(R.id.ervice);
        back = (ImageView) findViewById(R.id.back);


        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        //  animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        //  animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate2);
        // animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);


        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        Thread thread = new Thread() {

            public void run() {

                try {
                    // gear.startAnimation(animation);
                    //  gear.animate().rotation(1800f).setDuration(5000);
                    //  s1.startAnimation(animation2);
                    //   s2.startAnimation(animation2);
                    //    ervice.startAnimation(animation3);
                    back.startAnimation(animation);


                    //  gear.animate().rotation(1080f).setDuration(3000);
                    sleep(3000);
                    Intent intent = new Intent(splash.this, Auth.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        thread.start();
    }

}