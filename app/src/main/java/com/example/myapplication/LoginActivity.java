package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView login;
    EditText emailOfLogin, passwordOfLogin;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailOfLogin=findViewById(R.id.emailOfLogin);
        passwordOfLogin=findViewById(R.id.passwordOfLogin);
        signUp=findViewById(R.id.signUp);
        login=findViewById(R.id.login);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (emailOfLogin.getText().toString().equals("kaktus")&&
                passwordOfLogin.getText().toString().equals("1234")){
                    Toast.makeText(LoginActivity.this, "Вход выполнен", Toast.LENGTH_SHORT).show();
                    emailOfLogin.setVisibility(View.INVISIBLE);
                    passwordOfLogin.setVisibility(View.INVISIBLE);
                    login.setVisibility(View.INVISIBLE);
                }else {
                    Toast.makeText(LoginActivity.this, "Неправильный пароль или логин", Toast.LENGTH_SHORT).show();
                }
            }
        });
}}