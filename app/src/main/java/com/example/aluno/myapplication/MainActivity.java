package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnTela2;
private Button btnTelaConversao;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTela2 = (Button) findViewById(R.id.buttonTela2);
        btnTelaConversao = (Button) findViewById(R.id.buttonConversao);

        btnTela2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                startActivity( new Intent( MainActivity.this, Main2Activity.class));

            }

        });

        btnTelaConversao.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                startActivity( new Intent( MainActivity.this, Conversao.class));

            }

        });
    }

}
