package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView emaildisplay, passworddisplay;
    EditText email, password;
    Button logoutbButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emaildisplay = findViewById(R.id.EmailDisplay);
        passworddisplay = findViewById(R.id.PasswordDisplay);
        logoutbButton = findViewById(R.id.logoutbutton);

        Bundle bundle = getIntent().getExtras();
        emaildisplay.setText(bundle.getString("email"));
        passworddisplay.setText(bundle.getString("password"));

        logoutbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}