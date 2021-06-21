package com.example.firstchallenge.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.firstchallenge.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.menuList);
        ArrayAdapter<String> listAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.menu));
        list.setAdapter(listAdapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Intent intent = new Intent(this, AboutUs.class);
            startActivity(intent);
        }

        if (position == 1) {
            Intent intent = new Intent(this, OurProducts.class);
            startActivity(intent);
        }

        if (position == 2) {
            Intent intent = new Intent(this, DiscountCoupom.class);
            startActivity(intent);
        }

        if (position == 3) {
            Intent intent = new Intent(this, TableReservation.class);
            startActivity(intent);
        }

        if (position == 4) {
            Intent intent = new Intent(this, VipList.class);
            startActivity(intent);
        }

        if (position == 5) {
            Intent intent = new Intent(this, PhotoGallery.class);
            startActivity(intent);
        }
    }
}