package com.example.admissionhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShowQuestionActivity extends AppCompatActivity {
    private ListView listView;
    DatabaseReference databaseReference;
    private List<SetQuestion> quesitonList;
    CustomAdaper customAdaper;
    Button btn;
    public static boolean flag= true;
    int i=0;
    public static String answerAll[] = new String[300];
    TextView timer;
    double score = 0.0;
    int total = 0;
    CountDownTimer countDownTimer;
    LinearLayout n1;
    ProgressDialog progressDialog;
    public static String selecAnswer[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_question);
        progressDialog = new ProgressDialog(ShowQuestionActivity.this);
        progressDialog.setMessage("Loading....");
        listView = findViewById(R.id.simpleListView);
        flag = true;
        Intent intent = getIntent();
        String univerSity = intent.getStringExtra("universityName");
        String set = intent.getStringExtra("setName");
        String unit = intent.getStringExtra("unitName");
        if(univerSity.equals("Dhabi")&&set.equals("set1")&&unit.equals("koUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Rabi")&&set.equals("set1")&&unit.equals("kaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Rabi")&&set.equals("set1")&&unit.equals("khaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Ju")&&set.equals("set1")&&unit.equals("khaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Ju")&&set.equals("set1")&&unit.equals("kaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Dhabi")&&set.equals("set1")&&unit.equals("khaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Dhabi")&&set.equals("set1")&&unit.equals("GA")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Dhabi")&&set.equals("set1")&&unit.equals("GHA")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("public").child(univerSity).child(unit).child(set);
        }
        if(univerSity.equals("Diu")&&set.equals("set1")&&unit.equals("khaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("Private").child(univerSity).child(set);
        }
        if(univerSity.equals("Aiub")&&set.equals("set1")&&unit.equals("khaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("Private").child(univerSity).child(set);
        }
        if(univerSity.equals("Nsu")&&set.equals("set1")&&unit.equals("khaUnit")){
            databaseReference = FirebaseDatabase.getInstance().getReference("Questions").child("Private").child(univerSity).child(set);
        }
        quesitonList = new ArrayList<>();
        customAdaper = new CustomAdaper(ShowQuestionActivity.this,quesitonList);
        selecAnswer = new String[300];
        for(int i=0;i<selecAnswer.length;i++){
            selecAnswer[i] = "nothing select";
        }
        btn = findViewById(R.id.submitBtn);
        timer = findViewById(R.id.timerTv);
        n1 = findViewById(R.id.submitLayout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<selecAnswer.length;i++){
                    if(selecAnswer[i].equals(answerAll[i])) {
                        score += 1.50;
                        total++;
                    }

                }
               OnScore();
            }
        });
        startTimer();
    }
    private void startTimer() {
        int noOfMinit = 30*60*1000;
        countDownTimer = new CountDownTimer(noOfMinit, 1000) {
            public void onTick(long millisUntilFinished) {
                long millis = millisUntilFinished;
                String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis), TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)), TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
                timer.setText(hms);
            }
            public  void onFinish() {
                OnScore();
            }
        }.start();
    }
   public void OnScore() {
        View v = getLayoutInflater().inflate(R.layout.show_score_layout,null,false);
        AlertDialog.Builder builder = new AlertDialog.Builder(ShowQuestionActivity.this);
        builder.setView(v);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        TextView t1,t2,t3;
        t1 = v.findViewById(R.id.scoreShowTv);
        t2 =v.findViewById(R.id.totalQuestionTv);
        t3 = v.findViewById(R.id.totalCorrectAnswerTv);
        t1.setText("Your Score: "+score+"");
        t2.setText("Total Questions: "+quesitonList.size()+"");
        t3.setText("Total Correct Answer: "+total+"");
        Button b1 = v.findViewById(R.id.OKBtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=false;
                onStart();
                alertDialog.dismiss();
                countDownTimer.cancel();
                countDownTimer = null;
                timer.setVisibility(View.GONE);
                btn.setVisibility(View.GONE);
            }
        });
    }
    @Override
    protected void onStart() {
        progressDialog.show();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                quesitonList.clear();

                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                    SetQuestion setQuestion = dataSnapshot1.getValue(SetQuestion.class);
                    answerAll[i] = setQuestion.getAnswer();
                    i++;
                    quesitonList.add(setQuestion);
                }
                listView.setAdapter(customAdaper);
                progressDialog.dismiss();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        super.onStart();
    }
}
