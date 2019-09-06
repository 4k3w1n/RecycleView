package com.example.latihansekolah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSuperAdapter extends RecyclerView.Adapter<ListSuperAdapter.ListViewHolder>  {
    private ArrayList<Super> listSuper;

    public ListSuperAdapter(ArrayList<Super> list) {
        this.listSuper = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater .from(viewGroup.getContext()).inflate(R.layout.item_row_super, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Super hero = listSuper.get(position);

        Glide.with(holder.itemView.getContext())
                .load(((Super) hero).getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(((Super) hero).getName());
        holder.tvDetail.setText(((Super) hero).getDetail());

    }

    @Override
    public int getItemCount() {
        return listSuper.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

         ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.item_gambar);
            tvName = itemView.findViewById(R.id.item_name);
            tvDetail = itemView.findViewById(R.id.item_ditel);
        }
    }
}
