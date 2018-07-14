package com.example.shashank.oru;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by shashank on 7/14/2018.
 */

public class arrayAdapter extends ArrayAdapter<cards>{

    Context context;

    public arrayAdapter(Context context, int resourceId, List<cards> items){
        super(context, resourceId, items)
    }

    public View getView(int position, View convertView, ViewGroup parent){
        cards card_item = getItem(position);

        convertView = LayoutInflater(getViewTypeCount()).inflate(R.layout.item, parent false);
    }
}
