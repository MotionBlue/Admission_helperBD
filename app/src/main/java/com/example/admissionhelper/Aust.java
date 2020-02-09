package com.example.admissionhelper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Aust extends AppCompatActivity {
    CardView uvinfo,adinfo,prequestion,modeltest;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aust);
        uvinfo = findViewById(R.id.infoCardIdaust);
        adinfo = findViewById(R.id.AdmissioninfoCardIdaust);
        prequestion = findViewById(R.id.PreviousCardIdaust);
        modeltest = findViewById(R.id.ModelTestIdaust);
       uvinfo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               showUvinfo();
           }
       });
       adinfo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               addmissioninfo();
           }
       });
       prequestion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Aust.this,imagesActivity.class);
               intent.putExtra("DhakaUvpre","PrivateUvprensu");
               startActivity(intent);
           }
       });
       modeltest.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Aust.this, QuestionSetSelectActivity.class);
               intent.putExtra("DhakaUvKA","Nsu");
               startActivity(intent);
           }
       });
    }

    private void addmissioninfo() {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(Aust.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Admission: http://www.aust.edu/admission.htm");
        t2.setText("Contact: http://www.aust.edu/contact_us.htm");
        t3.setText("Academic: http://www.aust.edu/academics_grading.html");
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showUvinfo() {
        View v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
        TextView t1 = v.findViewById(R.id.texttview1);
        t1.setText(R.string.aust1);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.aust2);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.aust3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
