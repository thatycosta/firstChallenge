package com.example.firstchallenge.view;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstchallenge.R;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        ListView list = findViewById(R.id.aboutUs);
//        ArrayAdapter<String> listAdapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.menu));
//        list.setAdapter(listAdapter);
//        list.setOnItemClickListener(this);
    }

}
