package com.example.umerfarooq.gson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.gson.Gson;

public class Main2Activity extends AppCompatActivity {

    TextView t2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t2= (TextView) findViewById(R.id.TextView2);
        Gson gs=new Gson();
        String target =getIntent().getStringExtra("MyObjectString");
        Contact contact=gs.fromJson(target,Contact.class);
        t2.setText(contact.getName());
}
