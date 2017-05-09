package com.example.nile_snp_lc.testlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        MainMenu();
    } //Method void



    public void MainMenu (){

        String name = getIntent().getStringExtra("N");
        TextView mainTextView = (TextView) findViewById(R.id.textView2);
        mainTextView.setText("ยินดีต้อรับ"+ name + "เข้าสู้ระบบ");


    }
} //Main Class
