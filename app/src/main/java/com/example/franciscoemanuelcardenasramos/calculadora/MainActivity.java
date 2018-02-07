package com.example.franciscoemanuelcardenasramos.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btnpunto, btnigual, btnsuma, btnresta, btnmulti, btndivi, btnlimpiar;
    EditText etProceso, etconcatenar;
    double numero1, numero2, resultado;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlimpiar = (Button)findViewById(R.id.btnlimpiar);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnpunto = (Button)findViewById(R.id.btnpunto);
        btnigual = (Button)findViewById(R.id.btnigual);
        btnsuma = (Button)findViewById(R.id.btnsuma);
        btnresta = (Button)findViewById(R.id.btnresta);
        btnmulti = (Button)findViewById(R.id.btnmulti);
        btndivi = (Button)findViewById(R.id.btndivi);
        etProceso = (EditText)findViewById(R.id.etProceso);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });
        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + ".");
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero2 = Double.parseDouble(etconcatenar.getText().toString());
                if(operador.equals("+")){
                    etProceso.setText("");
                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    etProceso.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")){
                    etProceso.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    etProceso.setText("");
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        etProceso.setText("Infinito");
                    }
                }
                etProceso.setText(String.valueOf(resultado));
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }




    

}
