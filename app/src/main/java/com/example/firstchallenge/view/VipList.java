package com.example.firstchallenge.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstchallenge.R;

public class VipList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vip_list);
    }

    public void vipReservation(View view){
        EditText name = findViewById(R.id.editName);
        Toast.makeText(this, "Reserva Lista Vip feita para " + name.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
