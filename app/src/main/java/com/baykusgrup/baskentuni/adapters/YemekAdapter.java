package com.baykusgrup.baskentuni.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baykusgrup.baskentuni.R;
import com.baykusgrup.baskentuni.holder.YemekViewHolders;
import com.baykusgrup.baskentuni.model.Yemek;

import java.util.List;

/**
 * Created by TAYİP on 31.12.2015.
 */
public class YemekAdapter extends RecyclerView.Adapter<YemekViewHolders> {

    private List<Yemek> itemList;
    private Context context;

    public YemekAdapter(Context context, List<Yemek> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public YemekViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_yemekhane, null);
        YemekViewHolders rcv = new YemekViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(YemekViewHolders holder, int position) {
        holder.date.setText(itemList.get(position).getDate());
        holder.menu.setText(itemList.get(position).getMenu());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
