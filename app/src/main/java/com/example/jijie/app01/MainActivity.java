package com.example.jijie.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText ET1 = null;
    private EditText ET2 = null;
    private EditText ET3 = null;
    private EditText ET4 = null;
    private EditText ET5 = null;
    private EditText ET6 = null;
    private EditText ET7 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initData() {

    }
    private void initView() {
        TextView eText1 = findViewById(R.id.tv_title);
        TextView eText2 = findViewById(R.id.tv_name1);
        TextView eText3 = findViewById(R.id.tv_name2);
        TextView eText4 = findViewById(R.id.tv_Dage);
        TextView eText5 = findViewById(R.id.tv_Dheight);
        TextView eText6 = findViewById(R.id.tv_BT1);
        TextView eText7 = findViewById(R.id.tv_BT2);
        ET1 = (EditText) findViewById(R.id.et_1);
        ET2 = (EditText) findViewById(R.id.et_2);
        ET3 = (EditText) findViewById(R.id.et_3);
        ET4 = (EditText) findViewById(R.id.et_4);
        ET5 = (EditText) findViewById(R.id.et_5);
        ET6 = (EditText) findViewById(R.id.et_6);
        ET7 = (EditText) findViewById(R.id.et_7);
        findViewById(R.id.button).setOnClickListener(this);
    }
    public void onClick(View view) {
        String Name5 = ET5.getText().toString();
        String Name6 = ET6.getText().toString();
        int c = Integer.parseInt(ET2.getText().toString());
        int a = Integer.parseInt(ET3.getText().toString());
        int b = Integer.parseInt(ET4.getText().toString());
        int count = 100;
        switch (view.getId()) {
            case R.id.button:
                if (a > 10) {
                    count -= 15;
                } else if (a > 5) {
                    count -= 10;
                } else if (a > 3) {
                    count -= 5;
                }
                if (c < 30) {
                    count -= 15;
                } else if (c < 90 ) {
                    count -= 10;
                } else if (c < 180) {
                    count -= 5;
                }
                if (b > 44 || b < 10) {
                    count -= 5;
                }
                if (Name5.equals("A") && Name6.equals("B")) {
                    count -= 10;
                }
                if (Name5.equals("B") && Name6.equals("A")) {
                    count -= 10;
                }
                if (Name5.equals("B") && Name6.equals("B")) {
                    count -= 10;
                }
                if (Name5.equals("O") && Name6.equals("B")) {
                    count -= 10;
                }
                if (Name5.equals("B") && Name6.equals("O")) {
                    count -= 10;
                }
                if (Name5.equals("AB") && Name6.equals("B")) {
                    count -= 10;
                }
                if (Name5.equals("B") && Name6.equals("AB")) {
                    count -= 10;
                }
                if (Name5.equals("AB") && Name6.equals("AB")) {
                    count -= 10;
                }
                String text = count + "";
                ET7.setText(text);

        }
    }
}
