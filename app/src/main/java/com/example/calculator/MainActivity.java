package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private StringBuilder input = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        // Configura los listeners para los botones de números y operadores
        setNumberButtonListeners();
        setOperatorButtonListeners();
    }

    // Agrega lógica para los botones de números
    private void setNumberButtonListeners() {
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("1");
                updateResultText();
            }
        });

        // Agrega listeners para los otros botones de números aquí
    }

    // Agrega lógica para los botones de operadores
    private void setOperatorButtonListeners() {
        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("+");
                updateResultText();
            }
        });

        // Agrega listeners para otros botones de operadores aquí
    }

    // Actualiza el texto en el TextView de resultado
    private void updateResultText() {
        resultTextView.setText(input.toString());
    }
}