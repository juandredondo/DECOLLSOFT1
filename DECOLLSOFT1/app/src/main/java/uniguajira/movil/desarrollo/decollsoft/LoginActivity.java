package uniguajira.movil.desarrollo.decollsoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


       // EditText  etUsuario = (EditText) findViewById(R.id.etUsuario); para hacer con la BD
        //EditText etContraseña = (EditText) findViewById(R.id.etContraseña); para hacer con la BD

        //aqui para hacer la prueba del login con parametros enviados directamente
        final Button bEntrar = (Button)findViewById(R.id.bEntrar);
        bEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String Usuario = ((EditText) findViewById(R.id.etUsuario)).getText().toString();
                String Contraseña = ((EditText) findViewById(R.id.etContraseña)).getText().toString();
                if (Usuario.equals("empleado") && Contraseña.equals("123456"))
                {
                    Intent formularioPrincipal = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(formularioPrincipal);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña incorrecto", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }


}
