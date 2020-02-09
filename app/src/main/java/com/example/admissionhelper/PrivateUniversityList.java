package com.example.admissionhelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrivateUniversityList extends AppCompatActivity {
    CardView diu,aiub,nsu,aust,brac,uiuCard,eastCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_university_list);
        diu = findViewById(R.id.diuCardId);
        diu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivateUniversityList.this,Diu.class);
                startActivity(intent);
            }
        });
        aiub = findViewById(R.id.aiubCardId);
        aiub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(PrivateUniversityList.this,Aiub.class);
                    startActivity(intent);
            }
        });
        nsu = findViewById(R.id.nsuCardId);
        nsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivateUniversityList.this,Nsu.class);
                startActivity(intent);
            }
        });
        brac = findViewById(R.id.bracCardId);
        brac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivateUniversityList.this,Brac.class);
                startActivity(intent);
            }
        });
        aust = findViewById(R.id.austCardId);
        aust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivateUniversityList.this,Aust.class);
                startActivity(intent);
            }
        });
        uiuCard = findViewById(R.id.uiucard);
        eastCard = findViewById(R.id.eastcard);
        uiuCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivateUniversityList.this,Uiu.class);
                startActivity(intent);
            }
        });
        eastCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivateUniversityList.this,East.class);
                startActivity(intent);
            }
        });
    }
}
