package com.example.admissionhelper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Aiub extends AppCompatActivity {
    CardView aiubUv,aiubAdInfo,aiubPre,aiubModelTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiub);
        aiubUv = findViewById(R.id.infoCardIdaiub);
        aiubUv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showUvInfo();
            }
        });
        aiubAdInfo = findViewById(R.id.AdmissioninfoCardIdaiub);
        aiubAdInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAdmissionInfo();
            }
        });
        aiubPre = findViewById(R.id.PreviousCardIdaiub);
        aiubModelTest = findViewById(R.id.ModelTestIdaiub);
        aiubModelTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aiub.this, QuestionSetSelectActivity.class);
                intent.putExtra("DhakaUvKA","Aiub");
                startActivity(intent);
            }
        });
        aiubPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aiub.this,imagesActivity.class);
                intent.putExtra("DhakaUvpre","PrivateUvpreaiub");
                startActivity(intent);
            }
        });
    }

    private void showAdmissionInfo() {
        View view = getLayoutInflater().inflate(R.layout.ad_info,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(Aiub.this);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.addmissioninfoTv);
        t2 = view.findViewById(R.id.examSystemTv);
        t3 = view.findViewById(R.id.resultTv);
        t1.setText("Addmission: http://www.aiub.edu/admission");
        t2.setText("Contact:http://www.aiub.edu/contact");
        t3.setText("For more: http://www.aiub.edu/");
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showUvInfo() {
        View v = getLayoutInflater().inflate(R.layout.uv_info,null,true);
        TextView t1 = v.findViewById(R.id.texttview1);
        t1.setText(R.string.aiub1);
        TextView t2 = v.findViewById(R.id.textview2);
        t2.setText(R.string.aiub2);
        TextView t3 = v.findViewById(R.id.textview3);
        t3.setText(R.string.aiub3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
