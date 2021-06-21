package com.example.firstchallenge.view;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstchallenge.R;

import java.util.List;

import adapter.Adapter;
import model.Coffee;

public class OurProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_products);
        ListView listCoffees = this.findViewById(R.id.listCoffee);
        List<Coffee> coffees = Coffee.getAll();
        listCoffees.setAdapter(new Adapter(this, coffees));
    }
}
