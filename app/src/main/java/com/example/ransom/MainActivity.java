package com.example.ransom;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    public static final String EXTRA_MESSAGE = "com.example.ransom.extra.MESSAGE";

    private EditText idadeEditText;
    private EditText leucocitosEditText;
    private EditText glicoseEditText;
    private EditText astEditText;
    private EditText ldhEditText;
    private int contador;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeEditText      = findViewById(R.id.idadeEditTextView);
        leucocitosEditText = findViewById(R.id.leucocitosEditTextView);
        glicoseEditText    = findViewById(R.id.leucocitosEditTextView);
        astEditText        = findViewById(R.id.astTextEdit);
        ldhEditText        = findViewById(R.id.ldhTextEdit);


    }
    public void calculateRansomCriteria(View view){
        CheckBox checkBox = findViewById(R.id.litiase_checkBox);
        checkBox.isChecked();
        contador = 0;

        int idade = Integer.parseInt(idadeEditText.getText().toString());
        int leucocitos = Integer.parseInt(leucocitosEditText.getText().toString());
        int glicose = Integer.parseInt(glicoseEditText.getText().toString());
        int ast = Integer.parseInt(astEditText.getText().toString());
        int ldh = Integer.parseInt(ldhEditText.getText().toString());
        int valor = 0;

        if (checkBox != null){
            if (idade      > 70){valor = contador++;}
            if (leucocitos > 18.000){valor = contador++;}
            if (glicose    > 12.2){valor = contador++;}
            if (ast        > 250){valor = contador++;}
            if (ldh        > 400){valor = contador++;}
        }
        else{
            if (idade      > 55){contador++;}
            if (leucocitos > 16.000){contador++;}
            if (glicose    > 11){contador++;}
            if (ast        > 250){contador++;}
            if (ldh        > 350){contador++;}
        }
        valor = contador;

        if (contador >= 3) {boolean grave = true;
        }else {boolean grave = false;}

        if (contador <= 2){
            int mortalidade = 2;
        }else if (contador<= 4){
            int mortalidade = 15;
        }else if (contador<= 6){
            int mortalidade = 40;
        }else{
            int mortalidade = 100;
        }
    }
}