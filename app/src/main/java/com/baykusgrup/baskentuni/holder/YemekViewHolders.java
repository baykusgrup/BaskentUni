package com.baykusgrup.baskentuni.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.baykusgrup.baskentuni.R;

public class YemekViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView date;
    public TextView menu;

    public YemekViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        date = (TextView) itemView.findViewById(R.id.tvDate);
        menu = (TextView) itemView.findViewById(R.id.tvMenu);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
