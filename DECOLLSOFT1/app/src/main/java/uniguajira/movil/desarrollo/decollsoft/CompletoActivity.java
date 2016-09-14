package uniguajira.movil.desarrollo.decollsoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompletoActivity extends AppCompatActivity {

    Button Cumplido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completo);

        Cumplido=(Button)findViewById(R.id.bCumplido);
        Cumplido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cumplido = new Intent(CompletoActivity.this, MainActivity.class);
                startActivity(Cumplido);

            }
        });
    }
}
