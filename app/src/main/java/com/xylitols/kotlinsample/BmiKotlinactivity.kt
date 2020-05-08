package com.xylitols.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class BmiKotlinactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // UI로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding)

    }
}
