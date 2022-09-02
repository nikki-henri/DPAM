package com.anahuac.anahuac.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.anahuac.anahuac.R;
import com.anahuac.anahuac.models.Campus;

import java.util.ArrayList;

public class ListCampusAdapter extends RecyclerView.Adapter<ListCampusAdapter.ViewHolder>{

    private ArrayList<Campus> data;

    public ListCampusAdapter(ArrayList<Campus> data) { this.data = data; }

    @NonNull
    @Override
    public ListCampusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_campus_item, parent, false);
        return new ListCampusAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListCampusAdapter.ViewHolder holder, int position) {
        Campus campus = data.get(position);
        holder.tvCampusName.setText(campus.getName());
        holder.ivCampus.setImageResource(campus.getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvCampusName;
        private ImageView ivCampus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCampusName = itemView.findViewById(R.id.tv_campus_name);
            ivCampus = itemView.findViewById(R.id.iv_campus);
        }
    }
}
