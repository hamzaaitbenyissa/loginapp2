package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText email, password;
    Button loginButton;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),
                "Welcome to login page",
                Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.EmailAddress);
        password = findViewById(R.id.Password);
        loginButton = findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("") || password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "Invalid login",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("email", email.getText().toString());
                    bundle.putString("password", password.getText().toString());
                    i.putExtras(bundle);
                    startActivity(i);
                    finish();

                }
            }
        });

    }
}