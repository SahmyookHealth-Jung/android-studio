package com.helper.testapp; // 실제 패키지 이름으로 변경

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    private static final int SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro); // 인트로 레이아웃 설정

        // UI 요소에 대한 참조 얻기
        ImageView introImage = findViewById(R.id.intro_image);



        new Handler().postDelayed(() -> {
            startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                }, SPLASH_SCREEN_DELAY);
        // "Skip Intro" 버튼 클릭 시 메인 액티비티로 이동


            }

    }

