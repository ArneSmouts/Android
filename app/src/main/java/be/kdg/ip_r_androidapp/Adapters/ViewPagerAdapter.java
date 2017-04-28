package be.kdg.ip_r_androidapp.Adapters;

/**
 * Created by Arne on 12/04/2017.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import be.kdg.ip_r_androidapp.R;

public class ViewPagerAdapter extends PagerAdapter {
    // Declare Variables
    private Context context;
    private int[] polPartij;
    private int[] mening;
    private int[] logo;
    private LayoutInflater inflater;

    public ViewPagerAdapter(Context context, int[] polPartij, int[] mening, int[] logo) {
        this.context = context;
        this.polPartij = polPartij;
        this.mening = mening;
        this.logo = logo;
    }

    @Override
    public int getCount() {
        return polPartij.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        TextView txtpolpartij;
        TextView txtmening;
        ImageView imglogo;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.viewpager_item, container,
                false);

        // Locate the TextViews in viewpager_item.xml
        txtmening = (TextView) itemView.findViewById(R.id.txtmening);
        txtpolpartij = (TextView) itemView.findViewById(R.id.txtpolpartij);

        // Capture position and set to the TextViews
        txtmening.setText(mening[position]);
        txtpolpartij.setText(polPartij[position]);

        // Locate the ImageView in viewpager_item.xml
        imglogo = (ImageView) itemView.findViewById(R.id.imglogo);
        // Capture position and set to the ImageView
        imglogo.setImageResource(logo[position]);

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}