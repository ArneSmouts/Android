package be.kdg.ip_r_androidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import be.kdg.ip_r_androidapp.vragen.Personavraag;

public class MainActivity extends Activity {
    Button btnStart;
    ImageView imgSOlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        InitializeViews();
        addListeners();
    }

    protected void InitializeViews(){
        btnStart = (Button) findViewById(R.id.btnStarttest);
        imgSOlogo = (ImageView) findViewById(R.id.imgSOlogo);
    }

    protected void addListeners(){
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Personavraag.class);
                startActivity(intent);
            }
        });

        imgSOlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO verwijst naar de website van Samenlevingsopbouw (EXTRA)
            }
        });
    }

}
