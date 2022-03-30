package com.example.prime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public EditText emailId, password;
    public Button login;
    public String emailValue,passwordValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailId=  findViewById(R.id.username);
        password=  findViewById(R.id.password);
        login = findViewById(R.id.signin);

       login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailValue = emailId.getText().toString();
                passwordValue=password.getText().toString();
               onLoginPressed(emailValue,passwordValue);
            }
        });


    }
   public void onLoginPressed(String emailValue, String passwordValue) {

        Intent intent = new Intent(this, HomePage.class);
        intent.putExtra("var", emailValue);
        startActivity(intent);
    }
    public void showinfo(View view) {
        Toast.makeText(MainActivity.this,R.string.msg_info,Toast.LENGTH_LONG)
                .show();
    }
}