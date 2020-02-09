package com.example.admissionhelper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Nsu extends AppCompatActivity {
    CardView uvinfo,adinfo,prequestion,modeltest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsu);
        uvinfo = findViewById(R.id.infoCardIdnsu);
        adinfo = findViewById(R.id.AdmissioninfoCardIdnsu);
        prequestion = findViewById(R.id.PreviousCardIdnsu);
        modeltest = findViewById(R.id.ModelTestIdnsu);
        uvinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showUvinfo();
            }
        });
        adinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAdinfo();
            }
        });
        modeltest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nsu.this, QuestionSetSelectActivity.class);
                intent.putExtra("DhakaUvKA","Nsu");
                startActivity(intent);
            }
        });
        prequestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(Nsu.this,imagesActivity.class);
                        intent.putExtra("DhakaUvpre","PrivateUvprensu");
                        startActivity(intent);
            }
        });
    }

    private void showAdinfo() {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(Nsu.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Addmission: http://admissions.northsouth.edu/");
        t2.setText("Contact: http://admissions.northsouth.edu/contact");
        t3.setText("Result: http://admissions.northsouth.edu/graduate_result");
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showUvinfo() {
        View v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
        TextView t1 = v.findViewById(R.id.texttview1);
        t1.setText(R.string.nsu1);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.nsu2);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.nsu3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
