package kr.co.tjoeun.a20200318_02_java_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// Alt + Enter (에러줄에서)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEvents();
        setValues();
//        1) 이벤트 설정

//        2) 초기 화면값 세팅 .setText 등
//        +main 함수는 가능한한 적은 코드만 남기자.
//        => onCreat 메쏘드도 가능한 깔끔하게 정리.

    }
    @Override
    public void setupEvents() {


    }
    @Override
    public void setValues() {


    }
}
