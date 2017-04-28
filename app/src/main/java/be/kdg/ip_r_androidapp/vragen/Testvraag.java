package be.kdg.ip_r_androidapp.vragen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import be.kdg.ip_r_androidapp.Adapters.EigenschapAdapter;
import be.kdg.ip_r_androidapp.Adapters.ViewPagerAdapter;
import be.kdg.ip_r_androidapp.Model.Eigenschap;
import be.kdg.ip_r_androidapp.Resultaat;
import be.kdg.ip_r_androidapp.R;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Testvraag extends Activity {
    ViewPager viewPager;
    PagerAdapter vpadapter;
    int[] polPartij;
    int[] mening;
    int[] logo;
    TextView tvThema;
    TextView tvTestvraag;
    ListView lvKeuze1;
    ListView lvKeuze2;
    Button btnKeuze1;
    Button btnKeuze2;
    EigenschapAdapter keuze1adapter;
    EigenschapAdapter keuze2adapter;
    Eigenschap[] eigenschappen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_testvraag_alternatief);

        InitializeViewPager();
        InitializeViews();
        addEventHandlers();
        addAdapters();
    }

    //Voorbeeld
    //TODO De echte politieke partijen, logos en meningen in arrays zetten
    protected void InitializeViewPager(){
        polPartij = new int[] {R.string.cdenv, R.string.groen, R.string.nva};
        mening = new int[] {R.string.mening_cdenv, R.string.mening_groen, R.string.mening_nva};
        logo = new int[] {R.drawable.cdenv, R.drawable.groen, R.drawable.nva};
    }

    protected void InitializeViews(){
        viewPager = (ViewPager) findViewById(R.id.pager);
        tvThema = (TextView) findViewById(R.id.tvThema);
        tvTestvraag = (TextView) findViewById(R.id.tvTestvraag);
        lvKeuze1 = (ListView) findViewById(R.id.lvKeuze1);
        lvKeuze2 = (ListView) findViewById(R.id.lvKeuze2);
        btnKeuze1 = (Button) findViewById(R.id.btnKeuze1);
        btnKeuze2 = (Button) findViewById(R.id.btnKeuze2);
    }

    protected void addEventHandlers(){
        final Intent intent = new Intent(this, Resultaat.class);
        btnKeuze1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                //TODO (Waarden aanpassen enz)
            }
        });
        btnKeuze2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO (semi)
                startActivity(intent);
            }
        });
    }

    protected void addAdapters(){
        // Pass results to ViewPagerAdapter Class
        vpadapter = new ViewPagerAdapter(Testvraag.this, polPartij, mening, logo);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(vpadapter);

        /*
        //TODO EigenschapAdapter uitwerken
        keuze1adapter = new EigenschapAdapter(this, eigenschappen);
        keuze2adapter = new EigenschapAdapter(this, eigenschappen);

        lvKeuze1.setAdapter(keuze1adapter);
        lvKeuze2.setAdapter(keuze2adapter);
        */
    }
}
