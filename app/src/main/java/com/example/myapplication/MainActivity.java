package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ThemedSpinnerAdapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, password ;
    Button signup, forgotpassword ,btn_xx;
    TextView signuptitle;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
        signup = findViewById(R.id.btn_sign_up);
        forgotpassword = findViewById(R.id.btn_forgot_password);
        signuptitle = findViewById(R.id.tv_sign_up);
        newIntent();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("name")
                        && email.getText().toString().equals("email") &&
                        password.getText().toString().equals("password")) {
                    Toast.makeText(MainActivity.this, "Вход выполнен", Toast.LENGTH_SHORT).show();
                    name.setVisibility(View.INVISIBLE);
                    email.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    forgotpassword.setVisibility(View.INVISIBLE);
                    signuptitle.setVisibility(View.INVISIBLE);
                    btn_xx.setVisibility(View.INVISIBLE);

                } else {
                    Toast.makeText(MainActivity.this, "Неправильный пароль или логин", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
          public void newIntent(){
        forgotpassword.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);

        });
    }
}