package com.example.fontcheck106;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
Button bt1,bt2,bt3;
TextView tv;
float font=30;
int ch=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        tv=findViewById(R.id.textview);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(font);
                font=font+5;
                if(font==50)
                {
                    font=30;
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch)
                {
                    case 1:tv.setTextColor(Color.RED);break;
                    case 2:tv.setTextColor(Color.BLUE);break;
                    case 3:tv.setTextColor(Color.YELLOW);break;
                    case 4:tv.setTextColor(Color.GREEN);break;
                    case 5:tv.setTextColor(Color.MAGENTA);break;

                }
                ch++;
                if(ch==6)
                    ch=1;
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="CSE")
                    tv.setText("ISE");
                else
                    tv.setText("CSE");
            }
        });
    }
}
