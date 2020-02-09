package com.example.admissionhelper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Diu extends AppCompatActivity {
    CardView uvinfo,adinfo,prequestion,modeltest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diu);
        uvinfo = findViewById(R.id.infoCardIddiu);
        adinfo = findViewById(R.id.AdmissioninfoCardIddiu);
        prequestion = findViewById(R.id.PreviousCardIddiu);
        modeltest = findViewById(R.id.ModelTestIddiu);
        uvinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uVinformation();
            }
        });
        adinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aDmissionInfo();
            }
        });
        prequestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diu.this,imagesActivity.class);
                intent.putExtra("DhakaUvpre","PrivateUvpre");
                startActivity(intent);
            }
        });
        modeltest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diu.this, QuestionSetSelectActivity.class);
                intent.putExtra("DhakaUvKA","Diu");
                startActivity(intent);
            }
        });
    }

    private void aDmissionInfo() {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(Diu.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Admission and Faculty:https://daffodilvarsity.edu.bd/article/faculties-and-departments");
        t2.setText("Exam Info:https://daffodilvarsity.edu.bd/");
        t3.setText("Result: https://daffodilvarsity.edu.bd/");
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void uVinformation() {
        View v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
        TextView t1 = v.findViewById(R.id.texttview1);
        t1.setText(R.string.diu);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.diu1);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.diu2);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
