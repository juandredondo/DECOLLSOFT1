package com.example.chino.rocas;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //funcion que llama al activity informacion
    public  void llamarInformacion(View vista)
    {
        // se declara la intencion de llamar al activity informacion
        Intent mostrarInfo = new Intent(this,informacionClass.class);
        //llama al aactivity
        startActivity(mostrarInfo);
    }

    //codigo para llamar a la vista configuracion
    public void llamarConfiguracion(View vista)
    {
        Intent mostrarConfig = new Intent(this,configurationClass.class);
        startActivity(mostrarConfig);

    }
    //llamada al activity envio de datos
    public  void llamarEnvioDatos(View vista)
    {
//        intencion de llamar al activity
        Intent mostrarEnvioDatos = new Intent(this,envioDatosClass.class);
        startActivity(mostrarEnvioDatos);

    }

    //este metodo cierra la aplicacion
    public  void salirApp(View vista)
    {
        finish();;
    }






}

