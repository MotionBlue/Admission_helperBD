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

public class RajshahiUv extends AppCompatActivity {
    CardView infoCard2,adinfoCard2,previousQntinCard2,modetest;
    String unitName[] = {"KA unit","KHA unit"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi_uv);
        infoCard2 = findViewById(R.id.infoCardId2);
        adinfoCard2 = findViewById(R.id.AdmissioninfoCardId2);
        previousQntinCard2 = findViewById(R.id.PreviousCardId2);
        modetest = findViewById(R.id.ModelTestId2);
        infoCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo();
            }
        });
        adinfoCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdmissionInfo();
            }
        });
        previousQntinCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrevious();
            }
        });
        modetest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showModelText();
            }
        });

    }

    private void openInfo() {

        View v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
        TextView t1 = v.findViewById(R.id.texttview1);
        t1.setText(R.string.rajUv1);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.rajUv2);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.rajUv3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    private void openAdmissionInfo()
    {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(RajshahiUv.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Addmission: http://admission.ru.ac.bd/undergraduate/");
        t2.setText("Exam Info: https://www.admissionwar.com/admission-ru-ac-bd/");
        t3.setText("Result: http://admission.ru.ac.bd/undergraduate/");
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    private void openPrevious()
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
                    Intent intent = new Intent(RajshahiUv.this,imagesActivity.class);
                    intent.putExtra("DhakaUvpre","RajshahiUvKApre");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
                if(position==1){
                    Intent intent = new Intent(RajshahiUv.this,imagesActivity.class);
                    intent.putExtra("DhakaUvpre","RajshahiUvKHApre");
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
                    Intent intent = new Intent(RajshahiUv.this, QuestionSetSelectActivity.class);
                    intent.putExtra("DhakaUvKA","RabiKA");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
                if(position==1){
                    Intent intent = new Intent(RajshahiUv.this, QuestionSetSelectActivity.class);
                    intent.putExtra("DhakaUvKA","RabiKHA");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
            }
        });
    }
}
