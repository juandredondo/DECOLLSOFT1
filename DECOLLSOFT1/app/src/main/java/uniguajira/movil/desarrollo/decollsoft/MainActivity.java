package uniguajira.movil.desarrollo.decollsoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spCliente;
    String[] datos  = {"Lista de Cliente","Conexion con la BD1","Conexion con la BD 2","Conexion con la BD 3"}; // los campos del Spinner q deben ser los clientes

    Button admAbono; //el boton para pasar al adm de abonos


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //funcion del boton adm de abonos
        admAbono=(Button)findViewById(R.id.bAbono);
        admAbono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admAbono= new Intent(MainActivity.this,AbonosActivity.class);
                startActivity(admAbono);

            }
        });




        //funciones del spinner

        spCliente = (Spinner)findViewById(R.id.spCliente);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        spCliente.setAdapter(adaptador);
        spCliente.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int posicion, long id) {
                switch (posicion){
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(), datos[posicion], Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 2:
                        Toast t = Toast.makeText(getApplicationContext(), datos[posicion], Toast.LENGTH_LONG);
                        t.show();
                        break;

                    case 3:
                        Toast t3 = Toast.makeText(getApplicationContext(), datos[posicion], Toast.LENGTH_LONG);
                        t3.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        final EditText etUsuario = (EditText) findViewById(R.id.etUsuario);
        final TextView tvDecollsoftmovil = (TextView)findViewById(R.id.tvDecollsoftmovil);
    }
}
