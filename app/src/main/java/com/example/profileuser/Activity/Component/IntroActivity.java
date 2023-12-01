package com.example.profileuser.Activity.Component;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.profileuser.Activity.MainActivity;
import com.example.profileuser.R;

public class IntroActivity extends AppCompatActivity {

    public AppCompatButton introBtn;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
        introBtn = findViewById(R.id.introBtn);



        introBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
            }
        });
    }
}
