package com.example.msi.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {

    double r;
    double l;
    double pi = 3.14;

    double wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    public void PoleKola(View view) {
        try {
            EditText editText3 = (EditText) findViewById(R.id.editText3);
            TextView textView_wynik = (TextView) findViewById(R.id.textView_wynik);
            r = Double.parseDouble(editText3.getText().toString());

            wynik = pi * r * r;

            textView_wynik.setText(String.valueOf(wynik));
        }
        catch (Exception ex){

        }
    }

    public void ClearCircle(View view) {
        try {
            EditText editText3 = (EditText) findViewById(R.id.editText3);
            TextView textView_wynik = (TextView) findViewById(R.id.textView_wynik);

            textView_wynik.setText("");
            editText3.setText("");
        }
        catch (Exception ex){

        }

    }
}
