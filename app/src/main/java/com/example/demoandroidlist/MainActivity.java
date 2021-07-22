package com.example.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> al;
    CustomAdapter CustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        al = new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Pie", "7.0 - 7.1.2");
        AndroidVersion item4 = new AndroidVersion("Pie", "6.0 - 6.0.1");
        AndroidVersion item5 = new AndroidVersion("Pie", "5.0 - 5.1.1");
        AndroidVersion item6 = new AndroidVersion("Pie", "4.4 - 4.4.4");
        AndroidVersion item7 = new AndroidVersion("Pie", "4.1 - 4.3.1");

        al.add(item1);
        al.add(item2);
        al.add(item3);
        al.add(item4);
        al.add(item5);
        al.add(item6);
        al.add(item7);

        //aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);
        CustomAdapter = new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(CustomAdapter);


        /*
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
         */
    }
}