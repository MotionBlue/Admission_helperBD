package com.example.admissionhelper;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdaper extends ArrayAdapter<SetQuestion> {
    private Activity context;
    private List<SetQuestion> questionList;
    public static String str="";
    //public static ArrayList<String> selectAnswer;
    boolean flag1=false,flag2 = false, flag3 = false, flag4 = false;
    RadioGroup radioGroup;
    int pos,pos1,pos2,pos3;
    public static String selectAnswer[];
    public CustomAdaper(Activity context, List<SetQuestion> questionList) {
        super(context,R.layout.simple_layout,questionList);
        this.context = context;
        this.questionList = questionList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        final View view = layoutInflater.inflate(R.layout.simple_layout, null, true);
        final SetQuestion setQuestion = questionList.get(position);
        TextView t1 = view.findViewById(R.id.questionViewId);
         radioGroup = view.findViewById(R.id.rbg);
        final RadioButton r1 = view.findViewById(R.id.radioBtn1);
        final RadioButton r2 = view.findViewById(R.id.radioBtn2);
        final RadioButton r3 = view.findViewById(R.id.radioBtn3);
        final RadioButton r4 = view.findViewById(R.id.radioBtn4);
        TextView t = view.findViewById(R.id.tvg);
        t1.setText(setQuestion.getQuestion());
        r1.setText(setQuestion.getAnswerA());
        r2.setText(setQuestion.getAnswerB());
        r3.setText(setQuestion.getAnswerC());
        r4.setText(setQuestion.getAnswerD());
        if(ShowQuestionActivity.flag==false){
            t.setVisibility(View.VISIBLE);
            t.setText("Correct Answer: "+setQuestion.getAnswer());
        }
        if(ShowQuestionActivity.selecAnswer[position].equals(setQuestion.getAnswerA())){
            r1.setChecked(true);
        }
        if(ShowQuestionActivity.selecAnswer[position].equals(setQuestion.getAnswerB())){
            r2.setChecked(true);
        }
        if(ShowQuestionActivity.selecAnswer[position].equals(setQuestion.getAnswerC())){
            r3.setChecked(true);
        }
        if(ShowQuestionActivity.selecAnswer[position].equals(setQuestion.getAnswerD())){
            r4.setChecked(true);
        }
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    ShowQuestionActivity.selecAnswer[position] = r1.getText().toString();
                }
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    ShowQuestionActivity.selecAnswer[position] = r2.getText().toString();
                }
            }
        });
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){

                    ShowQuestionActivity.selecAnswer[position] = r3.getText().toString();
                }
            }
        });
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){

                    ShowQuestionActivity.selecAnswer[position] = r4.getText().toString();
                }
            }
        });
        return view;
    }

}

