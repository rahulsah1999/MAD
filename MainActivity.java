package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et1=findViewById(R.id.editText);
        final EditText et2=findViewById(R.id.editText2);
        final Button bt=findViewById(R.id.button);
        final TextView tv=findViewById(R.id.textView);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(et1.getText().toString());
                int j=Integer.parseInt(et2.getText().toString());
                int sum=i+j;
                //tv.setText(Integer.toString(sum));
                tv.setText("The sum of the two numbers is: "+sum);
            }
        });
    }
}
