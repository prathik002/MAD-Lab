package com.example.shared_prefrence;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TintableCheckedTextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView fname = findViewById(R.id.tv1);
        TextView lname = findViewById(R.id.tv2);
        TextView email = findViewById(R.id.tv3);
        TextView mobno = findViewById(R.id.tv4);
        TextView password = findViewById(R.id.tv5);

        //Recieve Data
        String first= getIntent().getStringExtra("First Name");
        String last = getIntent().getStringExtra("Last Name");
        String mail = getIntent().getStringExtra("Email");
        String phno = getIntent().getStringExtra("Mob No");
        String pass = getIntent().getStringExtra("Password");

        fname.setText("First Name: " + first);
        lname.setText("Last Name: " + last);
        email.setText("Email: " + mail);
        mobno.setText("Mob No: " + phno);
        password.setText("Password: " + pass);




    }
}