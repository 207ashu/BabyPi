package com.example.ashu.babypi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Firebase Token",Helper.firebaseToken);
    }
public void liveLocationClcked(android.view.View view) {
    android.content.Intent i=new android.content.Intent(this,MapsActivity.class);
    startActivity(i);
    }

    public void sleepingMonitorCLicked(View view) {
        android.content.Intent i=new android.content.Intent(this,WebActivity.class);
        startActivity(i);
    }
}
