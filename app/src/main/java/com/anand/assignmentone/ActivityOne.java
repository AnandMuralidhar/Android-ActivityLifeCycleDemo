package com.anand.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;


public class ActivityOne extends AppCompatActivity{
    public static int cycleCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        TextView counterView = (TextView)findViewById(R.id.cycleCounter);
        counterView.setText("Restart Counter : " + cycleCounter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cycleCounter = 0;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        cycleCounter++;
        TextView counterView = (TextView)findViewById(R.id.cycleCounter);
        counterView.setText("Restart Counter : " + cycleCounter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void startActivityTwo(View view){
        startActivity(new Intent(ActivityOne.this, ActivityTwo.class));
    }

    public void showDialog(View view){
        startActivity(new Intent(ActivityOne.this, DialogBoxActivity.class));
    }

    public void destroyActivityOne(View view) {
        finish();
    }

}