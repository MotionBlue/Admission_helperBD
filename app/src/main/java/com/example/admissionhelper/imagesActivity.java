package com.example.admissionhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class imagesActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ImageAdapter mImageAdapter;
    DatabaseReference databaseReference;
    private List<saveImg> mSaveImg;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        progressDialog = new ProgressDialog(imagesActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mSaveImg = new ArrayList<>();
        Intent intent = getIntent();
        String v = intent.getStringExtra("DhakaUvpre");
        if(v.equals("DhakaUvKApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Dhabi").child("KAUnit");
        }
        if(v.equals("DhakaUvKHApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Dhabi").child("KHAUnit");
        }
        if(v.equals("DhakaUvGApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Dhabi").child("GAUnit");
        }
        if(v.equals("DhakaUvGHApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Dhabi").child("GHAUnit");
        }
        if(v.equals("RajshahiUvKApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Rabi").child("KAUnit");
        }
        if(v.equals("jagonnathUvKApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Ju").child("KaUnit");
        }
        if(v.equals("jagonnathUvKHApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Ju").child("KhaUnit");
        }
        if(v.equals("RajshahiUvKHApre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Public").child("Rabi").child("KHAUnit");
        }
        if(v.equals("PrivateUvpre")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Private").child("Diu");
        }
        if(v.equals("PrivateUvpreaiub")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Private").child("Aiub");
        }
        if(v.equals("PrivateUvprensu")){
            databaseReference = FirebaseDatabase.getInstance().getReference("PreviousQuestions").child("Private").child("Nsu");
        }
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                    saveImg imt = dataSnapshot1.getValue(saveImg.class);
                    mSaveImg.add(imt);
                }
                mImageAdapter = new ImageAdapter(imagesActivity.this,mSaveImg);
                mRecyclerView.setAdapter(mImageAdapter);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
