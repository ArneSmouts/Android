package be.kdg.ip_r_androidapp.vragen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import be.kdg.ip_r_androidapp.R;

/**
 * Created by Arne on 13/04/2017.
 */

public class Personavraag extends Activity {
    ImageView imgSOLogo;
    TextView tvTestnaam;
    TextView tvPersonaVraagnr;
    TextView tvPersonavraag;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_personavraag);

        InitializeViews();
        addListeners();
    }

    protected void InitializeViews(){
        imgSOLogo = (ImageView) findViewById(R.id.imgSOlogo);
        tvTestnaam = (TextView) findViewById(R.id.tv_testnaam);
        tvPersonaVraagnr = (TextView) findViewById(R.id.tv_persona_vraagnr);
        tvPersonavraag = (TextView) findViewById(R.id.tv_personavraag);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
    }

    protected void addListeners(){
        final Intent intent = new Intent(this, Testvraag.class);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
