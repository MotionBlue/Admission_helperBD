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

public class jagonnathUv extends AppCompatActivity {
    CardView infoCard2,adinfoCard2,previousQntinCard2,modetest;
    String unitName[] = {"KA unit","KHA unit"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagonnath_uv);
        infoCard2 = findViewById(R.id.infoCardIdju);
        adinfoCard2 = findViewById(R.id.AdmissioninfoCardju);
        previousQntinCard2 = findViewById(R.id.PreviousCardju);
        modetest = findViewById(R.id.ModelTestju);
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
        t1.setText(R.string.ju1);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.ju2);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.ju3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    private void openAdmissionInfo()
    {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(jagonnathUv.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Addmission: http://admissionjnu.info/web/index.html");
        t2.setText("Exam Info: http://admissionjnu.info/web/index.html");
        t3.setText("Result: http://admissionjnu.info/web/index.html");
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
                    Intent intent = new Intent(jagonnathUv.this,imagesActivity.class);
                    intent.putExtra("DhakaUvpre","jagonnathUvKApre");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
                if(position==1){
                    Intent intent = new Intent(jagonnathUv.this,imagesActivity.class);
                    intent.putExtra("DhakaUvpre","jagonnathUvKHApre");
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
                    Intent intent = new Intent(jagonnathUv.this, QuestionSetSelectActivity.class);
                    intent.putExtra("DhakaUvKA","JuKA");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
                if(position==1){
                    Intent intent = new Intent(jagonnathUv.this, QuestionSetSelectActivity.class);
                    intent.putExtra("DhakaUvKA","JuKHA");
                    startActivity(intent);
                    alertDialog.dismiss();
                }
            }
        });
    }
}
