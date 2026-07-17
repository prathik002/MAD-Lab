package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float mvalueone,mvaluetwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.tv1);
        EditText result = findViewById(R.id.edt);
        Button button0 = findViewById(R.id.btn0);
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button clear = findViewById(R.id.btnc);
        Button dot = findViewById(R.id.btndot);
        Button btnadd = findViewById(R.id.btnplus);
        Button btnsub = findViewById(R.id.btnminus);
        Button btnmul = findViewById(R.id.btninto);
        Button btndiv = findViewById(R.id.btndiv);
        Button btneq = findViewById(R.id.btneq);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else{
                    mvalueone = Float.parseFloat((result.getText()+" "));
                    add = true;
                    result.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else {
                    mvalueone = Float.parseFloat((result.getText()+" "));
                    sub = true;
                    result.setText(null);
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else {
                    mvalueone = Float.parseFloat((result.getText()+" "));
                    mul = true;
                    result.setText(null);
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else {
                    mvalueone = Float.parseFloat((result.getText()+" "));
                    div = true;
                    result.setText(null);
                }
            }
        });

        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvaluetwo = Float.parseFloat(result.getText().toString());

                if (add) {
                    result.setText(String.valueOf(mvalueone + mvaluetwo));
                    add = false;
                }

                if (sub) {
                    result.setText(String.valueOf(mvalueone - mvaluetwo));
                    sub = false;
                }

                if (mul) {
                    result.setText(String.valueOf(mvalueone * mvaluetwo));
                    mul = false;
                }

                if (div) {
                    result.setText(String.valueOf(mvalueone / mvaluetwo));
                    div = false;
                }
            }
        });

    }

}