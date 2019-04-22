package com.example.msi.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ObwodActivity extends AppCompatActivity {

    double r;
    double l;
    double pi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obwod);
    }

    public void ObwodKola(View view) {
        try {
            EditText editText2 = (EditText) findViewById(R.id.editText2);
            TextView textView3 = (TextView) findViewById(R.id.textView3);

            r = Double.parseDouble(editText2.getText().toString());

            l = 2 * pi * r;

            textView3.setText(String.valueOf(l));
            }
            catch (Exception ex)
            {

            }
    }


    public void ClearObwod(View view) {
        try {
            EditText editText2 = (EditText) findViewById(R.id.editText2);
            TextView textView3 = (TextView) findViewById(R.id.textView3);

            textView3.setText("");
            editText2.setText("");
            }
            catch (Exception ex)
            {

            }
    }
}
