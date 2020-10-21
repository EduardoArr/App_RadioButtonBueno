package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    RadioButton r1;
    RadioButton r2;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);


        r1 = (RadioButton)findViewById(R.id.btn_suma);
        r2 = (RadioButton)findViewById(R.id.btn_resta);

        tv = (TextView) findViewById(R.id.resultado);

    }

    public void calcular(View w){
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();



        //Comprobamos si algun valor esta vacio.
        if(num1.isEmpty() && num2.isEmpty() || num1.isEmpty() | num2.isEmpty()){
            Toast.makeText(this,"Ponme algo chiquillo",Toast.LENGTH_LONG).show();
        }else{
            int valor1 = Integer.parseInt(num1);
            int valor2 = Integer.parseInt(num2);
            if(r1.isChecked()) {
                tv.setText("La suma es: " + sumar(valor1, valor2));
            }else if(r2.isChecked()){
                tv.setText("La resta es: " + restar(valor1, valor2));
            }else{
                Toast.makeText(this,"Marca una opcion", Toast.LENGTH_LONG).show();

            }
        }




    }

    public int sumar(int num1, int num2){
        return num1 + num2;
    }


    public int restar(int num1, int num2){
        return num1 - num2;
    }
}