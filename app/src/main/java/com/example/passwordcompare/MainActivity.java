package com.example.passwordcompare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText password1, password2;
    TextView result;
    Button compare;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password1 = findViewById(R.id.password1);
        password2 = findViewById(R.id.password2);
        result = findViewById(R.id.result);
        compare = findViewById(R.id.button);

        compare.setOnClickListener(view -> {
            String p1 = password1.getText().toString().trim();
            String p2 = password2.getText().toString().trim();
            if (p1.equals(p2)) {
                result.setText("THANK YOU");
            } else {
                result.setText("PASSWORDS MUST MATCH");
            }
        });
    }
}