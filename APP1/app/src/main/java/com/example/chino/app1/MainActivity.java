package com.example.chino.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {






      /*cuado carga el activiti que inicialize contador en cero */
    //1. opteniendo los id del archivo xmls y declarando variables globales

   public TextView txtMostrarTexto;
    public  TextView txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ESTE ES EL LOAD DEL ACTIVITY
        txtTitulo=(TextView)findViewById(R.id.txtTitulo);
        txtTitulo.setText("Escoja una Opcion  ");


    }

    //esta funcion permite poner visible el edittext
    public  void visible(View Vista)
    {
        RadioButton  rdoNormal =(RadioButton) findViewById(R.id.rdoNormal);
        RadioButton  rdoAleatorio =(RadioButton) findViewById(R.id.rdoAleatorio);
        txtTitulo=(TextView) findViewById(R.id.txtTitulo);

        EditText txtTexto= (EditText)findViewById(R.id.txtTexto);
        //1. si el rdo aleatorio realiza esta
        if (rdoAleatorio.isChecked()) {
            //1.1 Oculta el EditText
            txtTexto.setVisibility(View.GONE);
            //1.2  se le cambia el nombre al titulo de la  aplicacion
            txtTitulo.setText("Numero Aleatorio");
        }
        else {
            //2. en el caso de que el radio normal este activo
            if (rdoNormal.isChecked())
            {
               //2.1 visualiza el edidtex
                txtTexto.setVisibility(View.VISIBLE);
                //2.2 se le cambia el texto
                txtTitulo.setText("Cambio de Mensaje");

            }
        }
    }
    // esta funcion se coloca un nombre a el elemento TexView
    public void ejecutarFunciones(View vista)
    {
        // 1. se optienen los id de los diferentes elementos que se encuentran en el activity
        RadioButton  rdoNormal =(RadioButton) findViewById(R.id.rdoNormal);
        RadioButton  rdoAleatorio =(RadioButton) findViewById(R.id.rdoAleatorio);
        EditText txtTexto= (EditText)findViewById(R.id.txtTexto);
        //2. se realiza un casting para saber cual de los radios esta activo
        if (rdoAleatorio.isChecked())
            numeroAleatorio();
        else
        if (rdoNormal.isChecked())
            cambiarNombre(txtTexto.getText().toString());
        else
            Toast.makeText(MainActivity.this, " Por favor escoga una opcion", Toast.LENGTH_SHORT).show();

    }
    // esta funcion  cambia el nombre
    public void cambiarNombre( String texto)
    {
        //identificando elementos del xml del activity
        txtMostrarTexto=(TextView) findViewById(R.id.txtMostrarTexto);
        EditText txtTexto= (EditText)findViewById(R.id.txtTexto);

        // cambia el texto  del texview
        txtMostrarTexto.setText(texto);

        //oculta del activity el  editText
        txtTexto.setText("");

    }

    // ESTA FUNCION GENERA LOS NUMEROS ALEATORIOS  MENORES QUE 500
    public  void numeroAleatorio ()
    {
        txtMostrarTexto=(TextView) findViewById(R.id.txtMostrarTexto);

        int  numero = (int)(Math.random()*500);
        txtMostrarTexto.setText("#: "+numero);
    }


}
