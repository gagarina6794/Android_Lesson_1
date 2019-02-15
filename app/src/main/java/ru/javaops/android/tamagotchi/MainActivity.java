package ru.javaops.android.tamagotchi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this, OtherActivity.class);
        startActivity(intent);
    }

    public void onButtonClickWalk(View view) {
        Intent intent = new Intent(MainActivity.this, WalkActivity.class);
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        intent.putExtra("pet", buttonText);
        startActivity(intent);
    }
}
