package batutour.com.batutour.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import batutour.com.batutour.MainActivity;
import batutour.com.batutour.R;

public class Splashscreen extends Activity {

    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(Splashscreen.this, MainActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
