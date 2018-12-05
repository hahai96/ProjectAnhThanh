package com.example.ha_hai.projectanhthanh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondRecyclerView extends RecyclerView.Adapter<SecondRecyclerView.SecondHolder> {

    Context context;

    public SecondRecyclerView(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SecondHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_textview, viewGroup, false);
        return new SecondHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SecondHolder myHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    class SecondHolder extends RecyclerView.ViewHolder {


        public SecondHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
