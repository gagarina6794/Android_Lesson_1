package ru.javaops.android.tamagotchi;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
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
    private SoundPlayer soundPlayer = new SoundPlayer();
    private float height;
    private int width;
    private int startHeight;
    private int startWidth;
    private float startDegrees;
    private int petSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);
        imageView = findViewById(R.id.pet);
        String pet = getIntent().getStringExtra("pet").toLowerCase();
        int imageSource;
        int soundSource;


        switch (pet) {
            case "cat":
                imageSource = R.drawable.cat;
                soundSource = R.raw.cat;
                break;
            case "dog":
                imageSource = R.drawable.dog;
                soundSource = R.raw.bark;
                imageView.getLayoutParams().height = 300;
                imageView.getLayoutParams().width = 300;
                imageView.requestLayout();
                break;
            case "cthulhu":
                imageSource = R.drawable.cthulhu;
                soundSource = R.raw.cthulhu;
                break;
            default:
                imageSource = R.drawable.cthulhu;
                soundSource = R.raw.cthulhu;
        }

        imageView.setImageResource(imageSource);
        petSound = soundPlayer.getSoundPool().load(this, soundSource, 1);
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

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventAction = event.getAction();

                if (eventAction == MotionEvent.ACTION_DOWN) {
                    soundPlayer.playSound(petSound);
                }

                return true;
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
        final int endHeight = (int) (Math.random() * (height + 1 - imageView.getHeight()));
        final int endWidth = (int) (Math.random() * (width + 1 - imageView.getWidth()));
        float rotate = (float) Math.toDegrees(Math.atan2(startHeight - endHeight, startWidth - endWidth));

        RotateAnimation animation = new RotateAnimation(startDegrees, rotate, 1, 0.5f, 1, 0.5f);
        Animation translateAnimation = new TranslateAnimation(startWidth, endWidth, startHeight, endHeight);

        //imageView.animate().setStartDelay(1000).x(endHeight).y(endWidth).setDuration(2000);

//        Path path = new Path();
//        path.rQuadTo(startWidth,endWidth,startHeight,endHeight);
//        objectAnimator = ObjectAnimator.ofFloat(imageView, "y");
//        objectAnimator.setDuration(3000);
//        objectAnimator.start();

        startHeight = endHeight;
        startWidth = endWidth;
        startDegrees = rotate;

        animation.setDuration(500);
        translateAnimation.setDuration(1000);
        translateAnimation.setStartOffset(500);

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(animationListener);

        imageView.startAnimation(animationSet);

    }

}
