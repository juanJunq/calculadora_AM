package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EmptyStackException;
import java.util.Stack;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Stack<Integer> stack1 = new Stack<Integer>();

        final Button empilharButton = findViewById(R.id.button5);
        final Button desempilharButton = findViewById(R.id.button7);
        final Button somaButton = findViewById(R.id.button);
        final Button menosButton = findViewById(R.id.button2);
        final Button divisaoButton = findViewById(R.id.button4);
        final Button multiplicacaoButton = findViewById(R.id.button3);

        EditText numeroEditText = findViewById(R.id.editTextNumber);
        TextView pilhaTextView = findViewById(R.id.textView4);
        TextView tituloTextView = findViewById(R.id.textView2);

        ColorStateList lightColor =  tituloTextView.getTextColors();

        empilharButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int numero = Integer.parseInt(String.valueOf(numeroEditText.getText()));
                    stack1.push(numero);
                    numeroEditText.setText("");

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (NumberFormatException e) {
                    String aviso = String.valueOf("Pilha vazia");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        desempilharButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    String numero = String.valueOf(stack1.pop());
                    numeroEditText.setText(numero);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Pilha vazia");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        somaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 + fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Pilha tem que ter 2 numeros no minimo");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        menosButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 - fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Pilha tem que ter 2 numeros no minimo");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        divisaoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 / fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Pilha tem que ter 2 numeros no minimo");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        multiplicacaoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 * fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Pilha tem que ter 2 numeros no minimo");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });
    }
}
