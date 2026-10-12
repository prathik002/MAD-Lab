package com.example.database;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;

    Button btn1, btn2;

    TextView tv1;

    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tv1 = findViewById(R.id.tv1);

        dbHelper = new DatabaseHelper(this);

        btn1.setOnClickListener(v ->{
            String name = edt1.getText().toString().trim();
            String email = edt2.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please Enter Name & Email", Toast.LENGTH_SHORT).show();
                return;
            }

            boolean inserted = dbHelper.insertData(name,email);

            if (inserted) {
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
                edt1.setText("");
                edt2.setText("");
            } else {
                Toast.makeText(this, "Insertion failed!!", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(v -> {
            String data = dbHelper.getAllData();
            tv1.setText(data);
        });

    }
}