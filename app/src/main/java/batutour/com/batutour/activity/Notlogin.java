package batutour.com.batutour.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import batutour.com.batutour.MainActivity;
import batutour.com.batutour.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Notlogin extends AppCompatActivity {

    @BindView(R.id.buttonlogin)
    Button btnlogin;
    @BindView(R.id.buttonregister)
    Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notlogin);
        ButterKnife.bind(this);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Notlogin.this, Login.class));
            }
        });

    }


}
