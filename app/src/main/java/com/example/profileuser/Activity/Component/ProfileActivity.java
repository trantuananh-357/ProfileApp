package com.example.profileuser.Activity.Component;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.profileuser.R;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ConstraintLayout backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                handleBackButtonpress();
            }
        });




    }

    private void handleBackButtonpress() {
        getOnBackPressedDispatcher().onBackPressed();
    }


}
