package com.example.ashu.babypi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void liveLocationClcked(android.view.View view) {
    android.content.Intent i=new android.content.Intent(this,MapsActivity.class);
    startActivity(i);
    }
}
