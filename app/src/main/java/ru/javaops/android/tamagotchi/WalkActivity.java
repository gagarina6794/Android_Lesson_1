package ru.javaops.android.tamagotchi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class WalkActivity extends AppCompatActivity {
    private ImageView imageView;
    private float height;
    private int width;
    private int startHeight;
    private int startWidth;
    private float startDegrees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);
        imageView = findViewById(R.id.pet);
        String pet = getIntent().getStringExtra("pet").toLowerCase();
        int sourse;

        switch (pet) {
            case "cat":
                sourse = R.drawable.cat;
                break;
            case "dog":
                sourse = R.drawable.dog;
                break;
            case "cthulhu":
                sourse = R.drawable.cthulhu;
                break;
            default:
                sourse = R.drawable.cthulhu;
        }
        imageView.setImageResource(sourse);

        final FrameLayout frameLayout = findViewById(R.id.layout_walk);
        ViewHelper.executeAfterViewHasDrawn(imageView, new Runnable() {
            @Override
            public void run() {
                height = frameLayout.getHeight();
                width = frameLayout.getWidth();
                imageView.setRotation(-90);
                startAnimation();
            }
        });
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(WalkActivity.this, MainActivity.class);
        startActivity(intent);
    }

    private Animation.AnimationListener animationListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            startAnimation();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };

    private void startAnimation() {
        AnimationSet animationSet = new AnimationSet(true);
        int endHeight = (int) (Math.random() * (height + 1 - imageView.getHeight()));
        int endWidth = (int) (Math.random() * (width + 1 - imageView.getWidth()));
        float rotate = (float) Math.toDegrees(Math.atan2(startHeight - endHeight, startWidth - endWidth));
        RotateAnimation animation = new RotateAnimation(startDegrees, rotate, 1, 0.5f, 1, 0.5f);

        animation.setDuration(500);

        Animation translateAnimation = new TranslateAnimation(startWidth, endWidth, startHeight, endHeight);

        startHeight = endHeight;
        startWidth = endWidth;
        startDegrees = rotate;
        translateAnimation.setDuration(1000);
        translateAnimation.setStartOffset(500);
        animationSet.addAnimation(animation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(animationListener);
        imageView.startAnimation(animationSet);

    }

}
