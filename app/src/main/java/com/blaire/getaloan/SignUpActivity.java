package com.blaire.getaloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private Button btnsignup;
    private EditText editTextfname,editTextlname,editTextemail,editTextpassword,editTextdob,editTextid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        editTextfname = findViewById(R.id.editTextFname);
        editTextlname = findViewById(R.id.editTextLname);
        editTextdob = findViewById(R.id.editTextDob);
        editTextid = findViewById(R.id.editTextId);
        editTextemail = findViewById(R.id.editTextemail);
        editTextpassword = findViewById(R.id.editTextpass);
        btnsignup = findViewById(R.id.buttonSignUp);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextfname.getText().toString().isEmpty())
                {
                    editTextfname.setError("First Name is required");
                }
                if (editTextlname.getText().toString().isEmpty())
                {
                    editTextlname.setError("Last Name is required");
                }
                if(editTextdob.getText().toString().isEmpty()){
                    editTextdob.setError("Date of Birth is required");
                }
                if (editTextemail.getText().toString().isEmpty())
                {
                    editTextemail.setError("Email is required");
                }
                if(editTextid.getText().toString().isEmpty()){
                    editTextid.setError("National ID is required");
                }
                if(editTextpassword.getText().toString().isEmpty()){
                    editTextpassword.setError("Password is required");
                }
                    Intent i = new Intent(SignUpActivity.this,LoginActivity.class);
                    startActivity(i);


            }
        });
    }
}
