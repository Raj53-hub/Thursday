package com.example.thursday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class datalayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datalayout);
        String Fname = getIntent().getStringExtra("Fname");
        String Lname = getIntent().getStringExtra("Lname");
        String City = getIntent().getStringExtra("City");
        String Email = getIntent().getStringExtra("Email");
        String User = getIntent().getStringExtra("User");

        TextView t1 = (TextView)findViewById(R.id.tvFname);
        t1.setText(Fname);
        TextView t2 = (TextView)findViewById(R.id.tvLname);
        t2.setText(Lname);
        TextView t3 = (TextView)findViewById(R.id.tvCity);
        t3.setText(City);
        TextView t4 = (TextView)findViewById(R.id.tvEmail);
        t4.setText(Email);
        TextView t5 = (TextView)findViewById(R.id.tvUname);
        t5.setText(User);
    }
}