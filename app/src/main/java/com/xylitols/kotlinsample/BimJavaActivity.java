package com.xylitols.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BimJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // UI로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding);

        // bmiButton 이 클릭된 경우의 이벤트 리스너를 등록한다.
        findViewById(R.id.bmiButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // tallField 의 값을 읽어온다.
                EditText tallField = findViewById(R.id.tallField);
                String tall = tallField.getText().toString();

                // weightField 의 값을 읽어 온다.
                EditText weightField = findViewById(R.id.weightField);
                String weight = weightField.getText().toString();

                // BMI 를 계산한다. 체중(kg) / 키(m) * 키(m) >> 키를 cm로 입력받았으므로 100으로 나누어 제곱한다.
                // Math.pow() 는 넘겨받은 파라미터 값을 제곱하여 돌려준다.
                // 예를 들어 Math.pow(2, 3) 은 2의 3제곱 8을 돌려준다.
                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                // 결과 bmi 를 resultLable 에 보여준다.
                TextView resultLable = findViewById(R.id.resultLabel);
                resultLable.setText("키: " + tall + ", 체중:" + weight + ", BMI:" + bmi);
            }
        });
    }
}
