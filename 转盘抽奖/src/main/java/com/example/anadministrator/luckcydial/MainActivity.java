package com.example.anadministrator.luckcydial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import com.example.anadministrator.luckcydial.view.LuckyPanView;


public class MainActivity extends AppCompatActivity {


    private LuckyPanView mLuckyPanView;
    private ImageView mStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        mStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mLuckyPanView.isStart()) {
                    mStartBtn.setImageResource(R.drawable.stop);
                    mLuckyPanView.luckyStart(1);
                } else {
                    if (!mLuckyPanView.isShouldEnd())

                    {
                        mStartBtn.setImageResource(R.drawable.start);
                        mLuckyPanView.luckyEnd();
                    }
                }
            }
        });
    }

    private void initView() {
        mLuckyPanView = (LuckyPanView) findViewById(R.id.id_luckypan);
        mStartBtn = (ImageView) findViewById(R.id.id_start_btn);
    }
}
