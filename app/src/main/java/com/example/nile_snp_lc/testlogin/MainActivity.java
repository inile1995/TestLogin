package com.example.nile_snp_lc.testlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explicit ประการตัวแปร
    //String nameString; //Name


    EditText editText , editText2, editText3;
    String na,us,pa;
    String user = "admin"; //UserName
    String password = "1234"; //Password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    } //Method void


    public void btnLog (View view) {
            editText = (EditText) findViewById(R.id.editText);
            editText2 = (EditText) findViewById(R.id.editText2);
            editText3 = (EditText) findViewById(R.id.editText3);

            na = editText.getText().toString();
            us = editText2.getText().toString();
            pa = editText3.getText().toString();


            if (na.length() != 0 && us.equals(user) && pa.equals(password) ) {
                Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, Menu.class);
                intent.putExtra("N",na);
                startActivity(intent);

            } else if (na.length() == 0 || us.length() == 0 || pa.length() == 0 ) {
                Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูลให้ครบ!!", Toast.LENGTH_LONG).show();


            } else if (!us.equals(user)  && !pa.equals(password)){

                Toast.makeText(getApplicationContext(), "Login False", Toast.LENGTH_LONG).show();
            }



        } //void btnLog
}//Main Class
