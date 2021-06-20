package com.example.firstchallenge.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstchallenge.R;

public class DiscountCoupom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_coupom);
    }

    public void redeemCoupom(View view){
        EditText email = findViewById(R.id.editTextEmailAddress);
        Toast.makeText(this, "Cupom enviado para " + email.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
