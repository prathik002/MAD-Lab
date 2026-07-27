package com.example.shared_prefrence;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.tv1);
        EditText fname = findViewById(R.id.edt1);
        EditText lname = findViewById(R.id.edt2);
        EditText mail = findViewById(R.id.edt3);
        EditText mob = findViewById(R.id.edt4);
        EditText password = findViewById(R.id.edt5);
        EditText confpassword = findViewById(R.id.edt6);
        Button submit = findViewById(R.id.subbtn);

        sharedPreferences = getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = fname.getText().toString().trim();
                String last = lname.getText().toString().trim();
                String email = mail.getText().toString().trim();
                String phno = mob.getText().toString().trim();
                String pass = password.getText().toString().trim();
                String cpass = confpassword.getText().toString().trim();

                //Validation Section
                if (first.isEmpty()){
                    fname.setError("Fill First Name");
                    fname.requestFocus();
                    return;
                }

                if (last.isEmpty()){
                    lname.setError("Fill Last Name");
                    lname.requestFocus();
                    return;
                }

                if (email.isEmpty()){
                    mail.setError("Fill Email ID");
                    mail.requestFocus();
                    return;
                }

                if (phno.isEmpty()){
                    mob.setError("Fill Mobile Number");
                    mob.requestFocus();
                    return;
                }

                if (pass.isEmpty()){
                    password.setError("Required");
                    password.requestFocus();
                    return;
                }

                if (cpass.isEmpty()){
                    confpassword.setError("Required");
                    confpassword.requestFocus();
                    return;
                }

                if (pass.equals(cpass)){

                } else {
                    confpassword.setError("Password do not match!!");
                    confpassword.requestFocus();
                    return;
                }

                //Toast section
                Toast.makeText(MainActivity.this,"Registration Successful",Toast.LENGTH_SHORT).show();

                //editor section
                editor.putString("keyfname",first);
                editor.putString("keylname",last);
                editor.putString("keymail",email);
                editor.putString("keymob",phno);
                editor.putString("keypassword",pass);
                editor.putString("keyconfpassword",cpass);
                editor.apply();
            }
        });
    }
}