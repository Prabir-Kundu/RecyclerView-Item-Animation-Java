package com.example.recyclerviewitemanimationjava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.HalfFloat;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewitemanimationjava.Model.Place;
import com.example.recyclerviewitemanimationjava.R;

import java.util.ArrayList;

public class PlaceAdapter6 extends RecyclerView.Adapter<PlaceAdapter6.MyViewHolder>{
    Context context;
    ArrayList<Place> placeList;

    public PlaceAdapter6(Context context, ArrayList<Place> placeList) {
        this.context = context;
        this.placeList = placeList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(placeList.get(position).getImage()).into(holder.imageView);
        holder.name.setText(placeList.get(position).getName());
        //holder.mainCardView.startAnimation(AnimationUtils.loadAnimation(holder.mainCardView.getContext(), R.anim.down_to_up));
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name,location;
        CardView mainCardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            location = itemView.findViewById(R.id.location);
            mainCardView = itemView.findViewById(R.id.mainCardView);
        }
    }
}
