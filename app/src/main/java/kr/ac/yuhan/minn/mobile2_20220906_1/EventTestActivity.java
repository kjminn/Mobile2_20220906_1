package kr.ac.yuhan.minn.mobile2_20220906_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EventTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_test);
        TextView t2 = findViewById(R.id.text2);
        t2.setText(R.string.btn);
//  xml에서 설정된 id에 의해서 메인메모리에서 View(Button)객체를 찾아서 주소값을 반환하는 메소드
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(EventTestActivity.this,
                                    "오늘은 9월 6일 화요일입니다.", Toast.LENGTH_LONG);
                t.show();

            }
        });
    }
}