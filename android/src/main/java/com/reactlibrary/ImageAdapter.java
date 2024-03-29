package com.reactlibrary;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.reactlibrary.R;

import java.util.List;

/**
 * Created by Ahmed Adel on 5/4/17.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private List<Bitmap> imageBitmaps;
    private LayoutInflater inflater;
    private OnImageClickListener onImageClickListener;

    public ImageAdapter(@NonNull Context context, @NonNull List<Bitmap> imageBitmaps) {
        this.inflater = LayoutInflater.from(context);
        this.imageBitmaps = imageBitmaps;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_photo_edit_image_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageBitmap(imageBitmaps.get(position));
    }

    @Override
    public int getItemCount() {
        return imageBitmaps.size();
    }

    public void setOnImageClickListener(OnImageClickListener onImageClickListener) {
        this.onImageClickListener = onImageClickListener;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.fragment_photo_edit_image_iv);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onImageClickListener != null)
                        onImageClickListener.onImageClickListener(imageBitmaps.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface OnImageClickListener {
        void onImageClickListener(Bitmap image);
    }
}
