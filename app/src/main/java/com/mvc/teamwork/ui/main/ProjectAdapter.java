package com.mvc.teamwork.ui.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.mvc.teamwork.R;
import com.mvc.teamwork.entity.ProjectVO;

import javax.inject.Inject;
import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {

    private List<ProjectVO> items;

    @Inject
    public ProjectAdapter() {
    }

    public void addItems(List<ProjectVO> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ProjectVO item = items.get(position);
        Glide.with(holder.image.getContext())
                .load(item.getLogo())
                .into(holder.image);
        holder.title.setText(item.getName());
        holder.startDate.setText(item.getStartDate());
        holder.starImage.setImageResource(item.getStarred() ?
                android.R.drawable.star_big_on : android.R.drawable.star_big_off);
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private ImageView starImage;
        private TextView title;
        private TextView startDate;

        private ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            starImage = itemView.findViewById(R.id.starImageView);
            title = itemView.findViewById(R.id.textView);
            startDate = itemView.findViewById(R.id.textView2);
        }
    }
}
