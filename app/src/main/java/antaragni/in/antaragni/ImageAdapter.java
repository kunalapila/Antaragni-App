package antaragni.in.antaragni;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.app.*;

import java.util.zip.Inflater;

/**
 * Created by varun on 3/10/16.
 */

public class ImageAdapter extends BaseAdapter {
  private Context mContext;
  public Drawable mDrawable;
  public Object getItem(int position) {
    return null;
  }

  public long getItemId(int position) {
    return 0;
  }
  public class ViewHolder{
    public CardView mCard;
    public ImageView img;

    public ViewHolder(View v) {
      this.mCard = (CardView) v.findViewById(R.id.card_view);
      this.img= (ImageView) v.findViewById(R.id.image);

    }
  }
  // create a new ImageView for each item referenced by the Adapter
  public View getView(int position, View convertView, ViewGroup parent) {
    View imageView;
    if (convertView == null) {
      imageView = LayoutInflater.from(parent.getContext())
          .inflate(R.layout.main_activity_card, parent, false);
      ImageAdapter.ViewHolder vh = new ImageAdapter.ViewHolder(imageView);
      imageView.setTag(vh);
    } else {
       imageView = convertView;
    }
    ViewHolder vh=(ViewHolder)imageView.getTag();
    vh.img.setImageDrawable(mDrawable);
    return imageView;
  }


  public ImageAdapter(Drawable drawable,Context c) {
    mDrawable=drawable;
    mContext = c;
  }

  // Return the size of your dataset (invoked by the layout manager)
  @Override
  public int getCount() {
    return 10;
  }
}