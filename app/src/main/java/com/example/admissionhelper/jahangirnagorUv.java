package com.example.admissionhelper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class jahangirnagorUv extends AppCompatActivity {
    CardView infoCard,adinfoCard,previousQntinCard,modelTestCard;
    String unitName[] = {"KA UNIT","KHA UNIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahangirnagor_uv);
        infoCard = findViewById(R.id.infoCardIdJnu);
        adinfoCard = findViewById(R.id.AdmissioninfoCardIdJnu);
        previousQntinCard = findViewById(R.id.PreviousCardIdJnu);
        modelTestCard = findViewById(R.id.ModelTestIdJnu);
        infoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo();
            }
        });
        adinfoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdmissionInfo();
            }
        });
        previousQntinCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousQuestions();
            }
        });
        modelTestCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showModelText();
            }
        });
    }
    private void openInfo() {

        View v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
        TextView t1 = v.findViewById(R.id.texttview1);
        t1.setText(R.string.jnu1);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.jnu2);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.jnu3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    private void openAdmissionInfo()
    {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(jahangirnagorUv.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Addmission: https://ju-admission.org/");
        t2.setText("Exam Info: https://ju-admission.org/");
        t3.setText("Result: https://ju-admission.org/apply/result");
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    private void previousQuestions()
    {
        View view = getLayoutInflater().inflate(R.layout.select_unit,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ListView lv = view.findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.itemview,R.id.textViewId,unitName);
        lv.setAdapter(arrayAdapter);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(jahangirnagorUv.this,imagesActivity.class);
                    intent.putExtra("DhakaUvpre","DhakaUvKApre");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
                if(position==1){
                    Intent intent = new Intent(jahangirnagorUv.this,imagesActivity.class);
                    intent.putExtra("DhakaUvpre","DhakaUvKHApre");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
            }
        });
    }
    public void showModelText()
    {
        View view = getLayoutInflater().inflate(R.layout.select_unit,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ListView lv = view.findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.itemview,R.id.textViewId,unitName);
        lv.setAdapter(arrayAdapter);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(jahangirnagorUv.this, QuestionSetSelectActivity.class);
                    intent.putExtra("DhakaUvKA","DhakaKA");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
                if(position==1){
                    Intent intent = new Intent(jahangirnagorUv.this, QuestionSetSelectActivity.class);
                    intent.putExtra("DhakaUvKA","DhakaKHA");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
            }
        });
    }
}
