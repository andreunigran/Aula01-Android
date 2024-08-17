package br.unigran.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Calculadora calculadora;
    Button bt1;
    EditText campo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculadora=new Calculadora();

        bt1=findViewById(R.id.bt1);
        campo=findViewById(R.id.editTextText2);
        campo.setText("");

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //campo.setText(calculadora.soma());
            }
        });
    }
    public void acaoSoma(View v){
        calculadora.valor1=Float.parseFloat(String.valueOf(campo.getText()));

    }

    }
