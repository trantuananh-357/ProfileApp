package com.example.profileuser.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profileuser.Activity.Component.IntroActivity;
import com.example.profileuser.Activity.Component.ProfileActivity;
import com.example.profileuser.Activity.Component.SettingActivity;
import com.example.profileuser.Activity.Component.WalletActivity;
import com.example.profileuser.Adapter.TrendAdapter;
import com.example.profileuser.Domain.TrendsDomain;
import com.example.profileuser.R;

import java.util.ArrayList;





public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTrendList;
    private RecyclerView recyclerViewTrend;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        BottomNavigation();


    }










    private void BottomNavigation() {
        LinearLayout profileBtn = findViewById(R.id.profileBtn);
        LinearLayout settingBtn = findViewById(R.id.settingBtn);
        LinearLayout walletBtn = findViewById(R.id.walletBtn);
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        ImageView profile = findViewById(R.id.profileView);

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class ));
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class ));
            }
        });

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingActivity.class ));
            }
        });
        walletBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WalletActivity.class ));
            }
        });
         homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IntroActivity.class ));
            }
        });



    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> items = new ArrayList<>();


        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends2"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like", "The narrow", "trends"));

        recyclerViewTrend = findViewById(R.id.viewRender);

        recyclerViewTrend.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterTrendList = new TrendAdapter(items);
        recyclerViewTrend.setAdapter(adapterTrendList);

    }


}
