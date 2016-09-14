package com.example.chino.rocas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by CHINO on 12/08/2016.
 */
public class recibeDatosClass  extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recibe_datos);

        //recibe los datos que se mandan en el activity envio_datos
        //1. variable de tipo bundle o datos que
        Bundle datos =getIntent().getExtras();
        //2. variable enteras que son las que van a viajar de un activity a otro}
        int num1=datos.getInt("numero1");
        int num2=datos.getInt("numero2");

        //3. se identifican los elementos del xml a traves del id con la intencion de que los datos que se manden sean mostrador en los edtitext
        EditText txtnum1=(EditText)findViewById(R.id.editText1);
        EditText txtnum2=(EditText)findViewById(R.id.editText2);

        //4. se les asigna el valor que se mandaron en el anterior activity
        txtnum1.setText(""+num1);
        txtnum2.setText(""+num2);

       //5. se realiza la respectiva suma
        int resultado=num1+num2;

        //6 accedemos a la vsta large text
        TextView valor_resultado=(TextView) findViewById(R.id.texto_resultado);
        //7 se le asigna el resultado
        valor_resultado.setText("El  resultado es "+resultado);
    }
}
