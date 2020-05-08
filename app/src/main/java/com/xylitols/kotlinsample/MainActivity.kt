package com.xylitols.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼이 클릭되었을때의 코드 작성
        button1.setOnClickListener{
            // Intent 로 BmiJavaActivity 를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, BimJavaActivity::class.java))
        }

        // button2 클릭된 경우이 이벤트 리스너 설정
        button2.setOnClickListener{
            // Intent 로 BimActivity 를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, BmiKotlinactivity::class.java))
        }
    }
}

