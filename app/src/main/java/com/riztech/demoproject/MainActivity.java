package com.riztech.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtAddresss, edtPhone;

    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtAddresss = findViewById(R.id.edt_address);
        edtPhone = findViewById(R.id.edt_phone);

        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString().trim();
                String address = edtAddresss.getText().toString().trim();
                String phone = edtPhone.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(IntentExtra.NAME, name);
                intent.putExtra(IntentExtra.ADDRESS, address);
                intent.putExtra(IntentExtra.PHONE, phone);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Name is "+name, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
