package be.kdg.ip_r_androidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import be.kdg.ip_r_androidapp.MainActivity;

/**
 * Created by Arne on 18/04/2017.
 */

public class Resultaat extends Activity {
    ImageView imgSOLogo;
    Button btnBack;
    TextView tvTestnaam;
    TextView tvResultaat;
    Button btnDelen;
    TextView tvSituatie;
    TextView tvUitleg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_resultaat);

        InitializeViews();
        addListeners();
    }

    protected void InitializeViews(){
        imgSOLogo = (ImageView) findViewById(R.id.imgSOlogo);
        btnBack = (Button) findViewById(R.id.btnBack);
        tvTestnaam = (TextView) findViewById(R.id.tv_testnaam);
        tvResultaat = (TextView) findViewById(R.id.tv_resultaat);
        btnDelen = (Button) findViewById(R.id.btnDelen);
        tvSituatie = (TextView) findViewById(R.id.tv_situatie);
        tvUitleg = (TextView) findViewById(R.id.tv_extra_uitleg);
    }

    protected void addListeners(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Resultaat.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnDelen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                startActivity(intent);
            }
        });
    }
}
