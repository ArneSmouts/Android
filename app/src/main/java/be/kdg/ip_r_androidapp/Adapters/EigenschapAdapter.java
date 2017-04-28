package be.kdg.ip_r_androidapp.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import be.kdg.ip_r_androidapp.Model.Eigenschap;

/**
 * Created by Arne on 31/03/2017.
 */

public class EigenschapAdapter extends ArrayAdapter<Eigenschap> {

    public EigenschapAdapter(Context context, Eigenschap[] eigenschappen) {
        super(context, -1, eigenschappen);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

}
