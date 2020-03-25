package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    EditText name1, email,tlephn,paswrd,paswrd1;
    Button btnR, btnC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name1 = findViewById(R.id.name1);
        email = findViewById(R.id.email);
        tlephn = findViewById(R.id.tlephn);
        paswrd = findViewById(R.id.paswrd);
        paswrd1 = findViewById(R.id.paswrd1);
        btnR = findViewById(R.id.btnR);
        btnC = findViewById(R.id.btnC);
    }
}
