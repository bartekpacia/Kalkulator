package com.example.msi.kalkulator;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    TextView textView_result;

    double num1;
    double num2;
    double num3;
    double result;

    String message = "Kalkulator by Bartek Pacia\nwersja 2.0.2";
    int duration_long = Toast.LENGTH_LONG;
    int duration_short = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Dodawanie(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            num1 = Double.parseDouble(editText.getText().toString());
            num2 = Double.parseDouble(editText1.getText().toString());
            result = num1 + num2;


            TextView textView_result = (TextView) findViewById(R.id.textView_result);
            textView_result.setText(String.valueOf(result));

        } catch (Exception e) {
        }

        //dodawanie

    }


    public void Odejmowanie(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            num1 = Double.parseDouble(editText.getText().toString());
            num2 = Double.parseDouble(editText1.getText().toString());
            result = num1 - num2;

            TextView textView_result = (TextView) findViewById(R.id.textView_result);
            textView_result.setText(String.valueOf(result));
        } catch (Exception e) {
        }

        //odejmowanie
    }

    public void Mnozenie(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            num1 = Double.parseDouble(editText.getText().toString());
            num2 = Double.parseDouble(editText1.getText().toString());
            result = num1 * num2;

            TextView textView_result = (TextView) findViewById(R.id.textView_result);
            textView_result.setText(String.valueOf(result));
        } catch (Exception e) {;
        }

        //mnozenie
    }

    public void Dzielenie(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            num1 = Double.parseDouble(editText.getText().toString());
            num2 = Double.parseDouble(editText1.getText().toString());
            result = num1 / num2;

            if (num2 == 0) {
                Context context1 = getApplicationContext();
                String message_idiot = "Nie dziel przez zero, ty jasna cholero!";
                int duration1 = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context1, message_idiot, duration1);
                toast.show();
            }
            else {
                TextView textView_result = (TextView) findViewById(R.id.textView_result);
                textView_result.setText(String.valueOf(result));
            }
        }catch (Exception e) {
        }

        //dzielenie
    }

    public void Potega(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            num1 = Double.parseDouble(editText.getText().toString());
            num2 = Double.parseDouble(editText1.getText().toString());
            result = Math.pow(num1, num2);

            TextView textView_result = (TextView) findViewById(R.id.textView_result);
            textView_result.setText(String.valueOf(result));


        } catch (Exception e) {

            //potęgowanie
        }
    }

    public void Pierwiastek(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            num1 = Double.parseDouble(editText.getText().toString());
            num2 = Double.parseDouble(editText1.getText().toString());
            num3 = (1.0 / num2);

            if (num1 < 0 && num2 == 2) {
                TextView textView_result = (TextView) findViewById(R.id.textView_result);
                textView_result.setText("BŁĄD!");
            }
            else if (num1 ==16 && num2 == 2){
                result = 4;

                TextView textView_result = (TextView) findViewById(R.id.textView_result);
                textView_result.setText(String.valueOf(result));
            }

            else{
                result = Math.pow(num1, num3);

                TextView textView_result = (TextView) findViewById(R.id.textView_result);
                textView_result.setText(String.valueOf(result));
            }

        } catch (Exception e) {
        }

        //pierwiastek
    }

    public void Info(View view) {
        Context context = getApplicationContext();


        Toast toast_info = Toast.makeText(context, message, duration_long);
        toast_info.show();

        //informacje
    }

    public void Clear (View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText("");

        EditText editText1 = (EditText)findViewById(R.id.editText1);
        editText1.setText("");

        TextView textView_result = (TextView) findViewById(R.id.textView_result);
        textView_result.setText("");

        //czyszczenie
    }

    public void OpenPoleKola(View view) {
        Intent intent_pole_kola = new Intent(this, CircleActivity.class);
        startActivity(intent_pole_kola);
    }

    public void OpenObwodKola(View view) {
        Intent open_obwod_kola = new Intent(this, ObwodActivity.class);
        startActivity(open_obwod_kola);
    }
}
