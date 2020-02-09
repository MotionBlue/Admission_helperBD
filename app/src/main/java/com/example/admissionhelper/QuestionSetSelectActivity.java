package com.example.admissionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionSetSelectActivity extends AppCompatActivity {
     Button set1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_set_select);
        Intent intent = getIntent();
        set1 = findViewById(R.id.questionSet1Btn);
        String dhakaUv = intent.getStringExtra("DhakaUvKA");
        if(dhakaUv.equals("DhakaKA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Dhabi");
                    intent.putExtra("unitName","koUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("RabiKA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Rabi");
                    intent.putExtra("unitName","kaUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("JuKHA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Ju");
                    intent.putExtra("unitName","khaUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("JuKA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Ju");
                    intent.putExtra("unitName","kaUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("RabiKHA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Rabi");
                    intent.putExtra("unitName","khaUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("DhakaKHA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Dhabi");
                    intent.putExtra("unitName","khaUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("DhakaGA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Dhabi");
                    intent.putExtra("unitName","GA");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("DhakaGHA")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Dhabi");
                    intent.putExtra("unitName","GHA");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("Diu")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Diu");
                    intent.putExtra("unitName","khaUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("Aiub")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Aiub");
                    intent.putExtra("unitName","khaUnit");
                    startActivity(intent);
                }
            });
        }
        if(dhakaUv.equals("Nsu")){
            set1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuestionSetSelectActivity.this,ShowQuestionActivity.class);
                    intent.putExtra("setName","set1");
                    intent.putExtra("universityName","Nsu");
                    intent.putExtra("unitName","khaUnit");
                    startActivity(intent);
                }
            });
        }

    }
}
