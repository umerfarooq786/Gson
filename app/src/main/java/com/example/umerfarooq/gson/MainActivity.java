package com.example.umerfarooq.gson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Gson gson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView) findViewById(R.id.TextView);
        gson = new Gson();

        Contact c = new Contact(1,"Salman",true);
        String str=gson.toJson(c);

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);

        intent.putExtra("MyObjectString",str);
        startActivity(intent);
}
