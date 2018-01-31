package com.blaire.getaloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button btnlogin;
    private EditText editTextemail, editTextpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextemail = findViewById(R.id.editTextEmail);
        editTextpass = findViewById(R.id.editTextPass);
        btnlogin = findViewById(R.id.buttonLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

    }
}
