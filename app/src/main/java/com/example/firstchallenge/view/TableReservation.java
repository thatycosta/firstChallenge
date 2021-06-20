package com.example.firstchallenge.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstchallenge.R;

public class TableReservation extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinner;
    private Button buttonReserve;
    private EditText emailV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_reservation);
        emailV = findViewById(R.id.editTextEmailAddress);
        spinner = findViewById(R.id.spinner);
        buttonReserve = findViewById(R.id.buttonReserve);
        buttonReserve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String email = emailV.getText().toString();
        String table = spinner.getSelectedItem().toString();
        Toast.makeText(this, "Mesa " + table + " reservada para " + email, Toast.LENGTH_LONG).show();
    }
}
