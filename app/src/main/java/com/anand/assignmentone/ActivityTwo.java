package com.anand.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityTwo extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        ActivityOne.cycleCounter++;
    }

    public void destroyActivityTwo(View view) {
        ActivityTwo.this.finish();
    }
}