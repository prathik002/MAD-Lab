package com.example.toggle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView Mig,Su30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mig = findViewById(R.id.mig);
        Su30 = findViewById(R.id.su30);
        Mig.setOnClickListener(this::onClick);
        Su30.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {
        if (view.getId()==R.id.su30){
            Su30.setVisibility(View.GONE);
            Mig.setVisibility(View.VISIBLE);
        }
        else{
            Su30.setVisibility(View.VISIBLE);
            Mig.setVisibility(View.GONE);
        }
    }
}