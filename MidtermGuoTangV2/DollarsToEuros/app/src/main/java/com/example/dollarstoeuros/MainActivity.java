package com.example.dollarstoeuros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText dollors;
    private Button button;
    private TextView euros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.convertTo);
        dollors = findViewById(R.id.enterDollors);
        euros = findViewById(R.id.showEuros);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == button) {
                    try {
                        Double getValue = Double.parseDouble(dollors.getText().toString());
                        getValue *= 0.88;
                        DecimalFormat decimalFormat = new DecimalFormat("00.00");
                        String out = decimalFormat.format(getValue);
                        euros.setText(out);


                    } catch (Exception e) {
                        Log.e("Invalid input", e.getMessage());
                    }
                }
            }
        }));
    }


}