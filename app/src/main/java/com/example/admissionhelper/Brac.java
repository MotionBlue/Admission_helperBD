package com.example.admissionhelper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Brac extends AppCompatActivity {
    CardView uvinfo,adinfo,prequestion,modeltest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brac);
        uvinfo = findViewById(R.id.infoCardIdbrac);
        adinfo = findViewById(R.id.AdmissioninfoCardIdbrac);
        prequestion = findViewById(R.id.PreviousCardIdbrac);
        modeltest = findViewById(R.id.ModelTestIdbrac);
        uvinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showUvinfo();
            }
        });
        adinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                admissionInfo();
            }
        });
        prequestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Brac.this,imagesActivity.class);
                intent.putExtra("DhakaUvpre","PrivateUvpre");
                startActivity(intent);
            }
        });
        modeltest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Brac.this, QuestionSetSelectActivity.class);
                intent.putExtra("DhakaUvKA","Diu");
                startActivity(intent);
            }
        });
    }

    private void admissionInfo() {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(Brac.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Admission: https://www.bracu.ac.bd/admissions");
        t2.setText("Contact: https://www.bracu.ac.bd/contact");
        t3.setText("Result: https://www.bracu.ac.bd/admission-test-results-spring-2020");
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showUvinfo() {
        View v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
        TextView t1 = v.findViewById(R.id.texttview1);
        t1.setText(R.string.brac1);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.brac2);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.brac3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
