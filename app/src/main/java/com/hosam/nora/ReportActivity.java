package com.hosam.nora;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;

public class ReportActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        TextView displatBox = (TextView)findViewById(R.id.userMsg);
        displatBox.setText(getIntent().getStringExtra("result"));

    }
}
