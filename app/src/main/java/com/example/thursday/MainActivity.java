package com.example.thursday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void func1(View view) {
        EditText efnm = findViewById(R.id.edtFname);
        EditText elnm = findViewById(R.id.edtLname);
        EditText ecity = findViewById(R.id.edtCity);
        EditText eemail = findViewById(R.id.edtEmail);
        EditText euname = findViewById(R.id.edtUname);
        String fname = efnm.getText().toString();
        String lname = elnm.getText().toString();
        String city = ecity.getText().toString();
        String email = eemail.getText().toString();
        String username = euname.getText().toString();

        Intent a1 = new Intent(this, datalayout.class);
        a1.putExtra("Fname",fname);
        a1.putExtra("Lname",lname);
        a1.putExtra("City",city);
        a1.putExtra("Email",email);
        a1.putExtra("User",username);
        startActivity(a1);
    }
}