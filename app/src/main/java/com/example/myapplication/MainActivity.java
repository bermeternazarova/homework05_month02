package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ThemedSpinnerAdapter;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email, password;
    Button signup, forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    name= findViewById(R.id.Name);
    email=findViewById(R.id.Email);
    signup=findViewById(R.id.SignUp);
    forgotpassword=findViewById(R.id.forgotpassword);


    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           if (name.getText().toString().equals("name")
                    &&email.getText().toString().equals("email")&&email.getText().toString().equals("1234"))
            {
                Toast.makeText(MainActivity.this, "Forgot your password?", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();
            }

        }
    });
    forgotpassword.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });

    }
}