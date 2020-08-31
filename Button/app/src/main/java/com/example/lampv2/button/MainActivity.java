package com.example.lampv2.button;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    TextView txtDisplay;
    boolean isClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button)findViewById(R.id.btn1);
        txtDisplay = (TextView)findViewById(R.id.txt1);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isClick == false) {
                    txtDisplay.setText("Lập trình Android");
                    btnClick.setText("ON");
                    isClick = true;
                }
                else{
                    txtDisplay.setText("Tôi là Phạm Văn Lâm");
                    btnClick.setText("OFF");
                    isClick = false;
                }
            }
        });

    }
}
