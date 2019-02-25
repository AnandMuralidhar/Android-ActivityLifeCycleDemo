package com.anand.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class DialogBoxActivity extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_box_activity);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void destroyDialog(View view) {
        DialogBoxActivity.this.finish();
    }
}
