package ru.javaops.android.tamagotchi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class WalkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);
        ImageView imageView = findViewById(R.id.pet);
        String pet = getIntent().getStringExtra("pet");
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
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(WalkActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
