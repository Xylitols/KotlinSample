package com.xylitols.kotlinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class VariableKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // UI 로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_variable)
    }
}
