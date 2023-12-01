package com.example.profileuser.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.profileuser.R;

import java.util.ArrayList;
import com.example.profileuser.Domain.TrendsDomain;
public class TrendAdapter extends RecyclerView.Adapter<TrendAdapter.Viewholder> {


    ArrayList<TrendsDomain> items;
    Context context;

    public TrendAdapter(ArrayList<TrendsDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public TrendAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflator = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_trend, parent, false);
        context = parent.getContext();

        return new Viewholder(inflator);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendAdapter.Viewholder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.subtitle.setText(items.get(position).getSubtitle());


        int drawableResourceId = holder.itemView.getResources().getIdentifier(items.get(position).getPicAddres(), "drawable", holder.itemView.getContext().getPackageName()) ;
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30, 30, 0, 0 ))
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {

        return items.size();
    }


    public static class Viewholder extends RecyclerView.ViewHolder{
        TextView title, subtitle;
        ImageView pic;
        public Viewholder(@NonNull View itemView){

            super(itemView);
            title = itemView.findViewById(R.id.titleText);
            subtitle = itemView.findViewById(R.id.subtitleText);
            pic = itemView.findViewById(R.id.pic);

        }
    }
}
