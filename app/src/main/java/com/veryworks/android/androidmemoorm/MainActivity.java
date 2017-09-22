package com.veryworks.android.androidmemoorm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * RecyclerView 를 사용한 목록 만들기
 *
 * 0. 화면만들기
 *
 * 1. 데이터를 정의
 *
 * 2. 아답터를 재정의
 *
 * 3. 재정의한 아답터를 생성하면서 데이터를 담는다
 *
 * 4. 아답터와 RecyclerView 컨테이너를 연결
 *
 * 5. RecyclerView 에 레이아웃매니저를 성정
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
