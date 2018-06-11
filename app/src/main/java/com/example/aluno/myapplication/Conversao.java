package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Conversao extends AppCompatActivity {

    private Button btnConverter;
    private EditText editValor;
    private EditText editResultado;
    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao);

        btnConverter = (Button) findViewById(R.id.buttonConversao);

        editValor = (EditText) findViewById(R.id.editTextValor);

        btnConverter.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                resultado = Double.parseDouble(editValor.getText().toString())*3.74;

                editResultado.setText(" "+resultado);
            }

        });
    }
}
