package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText name;
    public Button btnup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (EditText) findViewById(R.id.name);

        btnup = (Button) findViewById(R.id.btnup);

        btnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openregister();

            }
        });
    }

    public void openregister() {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }


    public void Onsingup(View view) {
        {
           btnup = (Button)findViewById(R.id.btnup);
           String message = btnup.getText().toString();
                Toast.makeText(MainActivity.this, "Hello! welcome to the MAD team", Toast.LENGTH_LONG).show();

        }

    }
}
