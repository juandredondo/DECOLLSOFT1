package uniguajira.movil.desarrollo.decollsoft;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends  AppCompatActivity {

    private  long splashRetraso=3000; // tiempo de carga splash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                Intent IraLogin;
                IraLogin = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(IraLogin);

                SplashActivity.this.finish();



            }
        };

        Timer timer = new Timer();
        timer.schedule(task,splashRetraso);

    }
}
