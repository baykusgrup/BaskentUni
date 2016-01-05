package com.baykusgrup.baskentuni.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.baykusgrup.baskentuni.R;
import com.baykusgrup.baskentuni.model.ServisChild;
import com.baykusgrup.baskentuni.model.ServisGrup;

import java.util.ArrayList;

/**
 * Created by TAYİP on 4.1.2016.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {

    Context context;
    ArrayList<ServisGrup> servisGrups;

    public ExpandableListAdapter(Context context, ArrayList<ServisGrup> servisGrups) {
        this.context = context;
        this.servisGrups = servisGrups;
    }

    @Override
    public int getGroupCount() {
        return servisGrups.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        ArrayList<ServisChild> childArrayList=servisGrups.get(groupPosition).getItems();
        return 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return servisGrups.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<ServisChild> servisChildArrayList=servisGrups.get(groupPosition).getItems();
        return servisChildArrayList.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ServisGrup servisGrup=(ServisGrup)getGroup(groupPosition);
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.servis_grup_item,null);
        }

        TextView semtName=(TextView)convertView.findViewById(R.id.textViewSemtName);
        semtName.setText(servisGrup.getSemtAdi().toString());

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ServisChild servisChild=(ServisChild)getChild(groupPosition,childPosition);
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.servis_child_item,null);
        }

        TextView guzergah=(TextView)convertView.findViewById(R.id.textViewGuzergah);
        TextView saati=(TextView)convertView.findViewById(R.id.textViewSaati);

        guzergah.setText(servisChild.getGuzergah().toString());
        saati.setText(servisChild.getSaat().toString());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
