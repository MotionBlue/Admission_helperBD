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

public class DhakaUv extends AppCompatActivity {
     CardView infoCard,adinfoCard,previousQntinCard,modelTestCard;
     String unitName[] = {"KA UNIT","KHA UNIT","GA UNIT","GHA UNIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_uv);
        infoCard = findViewById(R.id.infoCardId);
        adinfoCard = findViewById(R.id.AdmissioninfoCardId);
        previousQntinCard = findViewById(R.id.PreviousCardId);
        modelTestCard = findViewById(R.id.ModelTestId);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(DhakaUv.this,R.layout.itemview,R.id.textViewId,unitName);
        previousQntinCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v = getLayoutInflater().inflate(R.layout.select_unit,null,true);
                ListView lv = v.findViewById(R.id.simpleListView);
                lv.setAdapter(arrayAdapter);

                AlertDialog.Builder builder = new AlertDialog.Builder(DhakaUv.this);
                builder.setView(v);
                final AlertDialog alertDialog = builder.create();
                alertDialog.show();
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if(position==0){
                            Intent intent = new Intent(DhakaUv.this,imagesActivity.class);
                            intent.putExtra("DhakaUvpre","DhakaUvKApre");
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                        if(position==1){
                            Intent intent = new Intent(DhakaUv.this,imagesActivity.class);
                            intent.putExtra("DhakaUvpre","DhakaUvKHApre");
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                        if(position==2){
                            Intent intent = new Intent(DhakaUv.this,imagesActivity.class);
                            intent.putExtra("DhakaUvpre","DhakaUvGApre");
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                        if(position==3){
                            Intent intent = new Intent(DhakaUv.this,imagesActivity.class);
                            intent.putExtra("DhakaUvpre","DhakaUvGHApre");
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                    }
                });
            }
        });
        modelTestCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v = getLayoutInflater().inflate(R.layout.select_unit,null,true);
                ListView lv = v.findViewById(R.id.simpleListView);
                lv.setAdapter(arrayAdapter);
                AlertDialog.Builder builder = new AlertDialog.Builder(DhakaUv.this);
                builder.setView(v);
                final AlertDialog alertDialog = builder.create();
                alertDialog.show();
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                              if(position==0){
                                  Intent intent = new Intent(DhakaUv.this, QuestionSetSelectActivity.class);
                                  intent.putExtra("DhakaUvKA","DhakaKA");
                                  startActivity(intent);
                                  alertDialog.dismiss();
                              }
                        if(position==1){
                            Intent intent = new Intent(DhakaUv.this, QuestionSetSelectActivity.class);
                            intent.putExtra("DhakaUvKA","DhakaKHA");
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                        if(position==2){
                            Intent intent = new Intent(DhakaUv.this, QuestionSetSelectActivity.class);
                            intent.putExtra("DhakaUvKA","DhakaGA");
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                        if(position==3){
                            Intent intent = new Intent(DhakaUv.this, QuestionSetSelectActivity.class);
                            intent.putExtra("DhakaUvKA","DhakaGHA");
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                    }
                });
            }
        });
        adinfoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v = getLayoutInflater().inflate(R.layout.ad_info,null,true);
                AlertDialog.Builder builder = new AlertDialog.Builder(DhakaUv.this);
                builder.setView(v);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        infoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
                AlertDialog.Builder builder = new AlertDialog.Builder(DhakaUv.this);
                builder.setView(v);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}
