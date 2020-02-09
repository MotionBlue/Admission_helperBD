package com.example.admissionhelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PublicUniversityList extends AppCompatActivity implements View.OnClickListener {
     CardView dhakaUv,rajshahiUv,jagon,jahangir,buetCard,ruetCard,cuCard,kuCard,cuetCard,kuetCard,sustCard,bruCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_university_list);
        dhakaUv = findViewById(R.id.DhakaUvCard);
        rajshahiUv = findViewById(R.id.rajshahiUvCard);
        jagon = findViewById(R.id.jagonnath);
        jahangir = findViewById(R.id.jahangirnagor);
        buetCard = findViewById(R.id.buetcard);
        ruetCard = findViewById(R.id.ruetcard);
        cuCard = findViewById(R.id.cucard);
        kuCard = findViewById(R.id.kucard);
        cuetCard = findViewById(R.id.cuetcard);
        kuetCard = findViewById(R.id.kuetcard);
        sustCard = findViewById(R.id.sustcard);
        bruCard = findViewById(R.id.brucard);

        dhakaUv.setOnClickListener(this);
        rajshahiUv.setOnClickListener(this);
        jagon.setOnClickListener(this);
        jahangir.setOnClickListener(this);
        buetCard.setOnClickListener(this);
        ruetCard.setOnClickListener(this);
        cuCard.setOnClickListener(this);
        kuCard.setOnClickListener(this);
        cuetCard.setOnClickListener(this);
        kuetCard.setOnClickListener(this);
        sustCard.setOnClickListener(this);
        bruCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.DhakaUvCard:
                Intent intent = new Intent(PublicUniversityList.this,DhakaUv.class);
                startActivity(intent);
                break;
            case R.id.rajshahiUvCard:
                Intent intent1 = new Intent(PublicUniversityList.this,RajshahiUv.class);
                startActivity(intent1);
                break;
            case R.id.jagonnath:
                Intent intent2 = new Intent(PublicUniversityList.this,jagonnathUv.class);
                startActivity(intent2);
                break;
            case R.id.jahangirnagor:
                Intent intent3 = new Intent(PublicUniversityList.this,jahangirnagorUv.class);
                startActivity(intent3);
                break;
            case R.id.buetcard:
                Intent intent4 = new Intent(PublicUniversityList.this,buet.class);
                startActivity(intent4);
                break;
            case R.id.ruetcard:
                Intent intent5 = new Intent(PublicUniversityList.this,ruet.class);
                startActivity(intent5);
                break;
            case R.id.cucard:
                Intent intent6 = new Intent(PublicUniversityList.this,Cu.class);
                startActivity(intent6);
                break;
            case R.id.kucard:
                Intent intent7 = new Intent(PublicUniversityList.this,Ku.class);
                startActivity(intent7);
                break;
            case R.id.kuetcard:
                Intent intent8 = new Intent(PublicUniversityList.this,Kuet.class);
                startActivity(intent8);
                break;
            case R.id.cuetcard:
                Intent intent9 = new Intent(PublicUniversityList.this,Cuet.class);
                startActivity(intent9);
                break;
            case R.id.sustcard:
                Intent intent10 = new Intent(PublicUniversityList.this,Sust.class);
                startActivity(intent10);
                break;
            case R.id.brucard:
                Intent intent11 = new Intent(PublicUniversityList.this,Bru.class);
                startActivity(intent11);
                break;
        }
    }
}
