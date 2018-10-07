package com.hosam.nora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public void openRpt(){
        TextView resultTV = findViewById(R.id.resultTxt);
        Intent parmIntent = new Intent(this,ReportActivity.class);
        parmIntent.putExtra("result",resultTV.getText());
        startActivity(parmIntent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText num1ET = findViewById(R.id.num1Value);
        final EditText num2ET = findViewById(R.id.num2Value);
        final TextView resultTV = findViewById(R.id.resultTxt);


//Plus button click
        Button plusBtn = findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = new Double(num1ET.getText().toString());
                double num2 = new Double(num2ET.getText().toString());

                double total = num1 + num2;

                resultTV.setText(Double.toString(total));

            }
        });

//Minse Button click
        Button minseBtn = findViewById(R.id.minseBtn);
        minseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = new Double(num1ET.getText().toString());
                double num2 = new Double(num2ET.getText().toString());
                double outPut = num1 - num2;
                resultTV.setText(Double.toString(outPut));

            }
        });
//Divid Button click
        Button divBtn = findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = new Double(num1ET.getText().toString());
                Double num2 = new Double(num2ET.getText().toString());
                Double outPut;
                if (num1.equals(new Double("0"))) outPut = Double.valueOf("0");
                else outPut = num1 / num2;
                resultTV.setText(Double.toString(outPut));
            }
        });
//Multiplay
        Button byBtn = findViewById(R.id.byBtn);
        byBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = new Double(num1ET.getText().toString());
                double num2 = new Double(num2ET.getText().toString());
                double outPut = num1 * num2;
                resultTV.setText(Double.toString(outPut));
            }
        });
//Display result
        Button displayRpt = findViewById(R.id.displayRpt);
        displayRpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openRpt();
            }
        });

    }
}

