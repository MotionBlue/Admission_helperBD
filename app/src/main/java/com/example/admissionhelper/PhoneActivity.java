package com.example.admissionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends AppCompatActivity {
   EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        e1 = findViewById(R.id.pEt);
        b1 = findViewById(R.id.cotinurBtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = "+88";
                String number  = e1.getText().toString().trim();

                if(number.isEmpty()||number.length()<11){
                    e1.setError("Invalid Number");
                    e1.requestFocus();
                    return;
                }

                String phoneNUmber = "+" +code+number;
                Intent intent = new Intent(PhoneActivity.this,VerifyPhoneActivity.class);
                intent.putExtra("phonenumber",phoneNUmber);
                startActivity(intent);
            }
        });

    }
}
