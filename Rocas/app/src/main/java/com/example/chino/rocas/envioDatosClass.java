package com.example.chino.rocas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by CHINO on 12/08/2016.
 */
public class envioDatosClass extends Activity
{
//    clase de preparacion para llamar alactivity mencionado este es un codigo que lo genera android studio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.envio_datos);


    }

    public  void llamarRecibeDatos (View vista)
    {
        Intent mostrarRecibeDatos = new Intent(this,recibeDatosClass.class);

        // ENVIANDO DATOS DE UN ACTOVITY A OTRO
        //1.se ubica el id de los edittext que tiene los valores que se van a enviar
        EditText txtNum1 = (EditText) findViewById(R.id.txtNum1);
        EditText txtNum2 = (EditText) findViewById(R.id.txtNum2);

        //2.se capturan los datos que se van a enviar

        int n1 = Integer.parseInt(txtNum1.getText().toString());

//        Toast.makeText(envioDatosClass.this, " el numero 1 es "+num1, Toast.LENGTH_SHORT).show();

        int n2 = Integer.parseInt(txtNum2.getText().toString());




        //3. se envian los datos para enviar datos de un activiry a otro de usa el metodo putextra
        mostrarRecibeDatos.putExtra("numero1",n1);
        mostrarRecibeDatos.putExtra("numero2",n2);
        //4. se ejecuta la app llamando al activity que recibe los datos
        startActivity(mostrarRecibeDatos);

    }
}
