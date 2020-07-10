package com.example.gogofitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Planer extends AppCompatActivity {

    String [] listString1= {"Day 1","Day 2","Day 3","Day 4","Day 5","Day 6","Day 7","Day 8","Day 9","Day 10",
            "Day 11", "Day 12","Day 13","Day 14","Day 15","Day 16","Day 17","Day 18","Day 19","Day 20",
            "Day 21","Day 22","Day 23","Day 24","Day 25","Day 26","Day 27","Day 28","Day 29","Day 30"};
    String [] listString2= {"15 Exercises","15 Exercises","15 Exercises","15 Exercises","15 Exercises",
            "15 Exercises", "15 Exercises","Rest","15 Exercises","15 Exercises",
            "15 Exercises","15 Exercises","15 Exercises", "15 Exercises","15 Exercises",
            "17 Exercises","17 Exercises","17 Exercises","19 Exercises","19 Exercises",
            "Rest","21 Exercises","21 Exercises", "Rest","24 Exercises",
            "24 Exercises","24 Exercises","24 Exercises","24 Exercises","24 Exercises"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planer);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intVariableName", 0);

        ListView list=(ListView) findViewById(R.id.listView);
        CustomAdaptor customAdaptor=new CustomAdaptor();
        list.setAdapter(customAdaptor);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent();
                myIntent.setClass(Planer.this, Exercise.class);
                myIntent.putExtra("intVariableName", position);
                startActivity(myIntent);
            }
        });
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return listString1.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.listlayout,null);
            TextView text1=(TextView) view.findViewById(R.id.textView2);
            TextView text2=(TextView) view.findViewById(R.id.textView3);
            text1.setText(listString1[position]);
            text2.setText(listString2[position]);
            return view;
        }
    }
}


