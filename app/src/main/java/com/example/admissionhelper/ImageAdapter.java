package com.example.admissionhelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private Context context;
    private List<saveImg> saveImgs;

    public ImageAdapter(Context context, List<saveImg> saveImgs) {
        this.context = context;
        this.saveImgs = saveImgs;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.imageview,null,false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        saveImg imgSave = saveImgs.get(position);
        holder.textViewName.setText(imgSave.getYear());
        Picasso.with(context).load(imgSave.getImageLink()).placeholder(R.drawable.placeholder).fit().into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return saveImgs.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;
        public ImageView imageView;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.text_view_id);
            imageView = itemView.findViewById(R.id.image_view_id);

        }
    }
}
