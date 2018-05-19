package com.riztech.demoproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtName, txtAddress, txtPhone;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtName = findViewById(R.id.txt_name);
        txtAddress = findViewById(R.id.txt_address);
        txtPhone = findViewById(R.id.txt_phone);

        Intent intent = getIntent();

        String name = intent.getStringExtra(IntentExtra.NAME);
        String phone = intent.getStringExtra(IntentExtra.PHONE);
        String address = intent.getStringExtra(IntentExtra.ADDRESS);

        txtPhone.setText(phone);
        txtAddress.setText(address);
        txtName.setText(name);

        btnBack = findViewById(R.id.btn_back);



    }
}