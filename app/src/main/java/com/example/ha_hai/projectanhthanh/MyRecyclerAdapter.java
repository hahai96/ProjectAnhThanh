package com.example.ha_hai.projectanhthanh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyHolder> {

    Context context;

    public MyRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_invitee, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.rv_link_invitee.setHasFixedSize(true);
        myHolder.rv_link_invitee.setLayoutManager(new LinearLayoutManager(context));
        myHolder.rv_link_invitee.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        myHolder.rv_link_invitee.setAdapter(new SecondRecyclerView(context));
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class MyHolder extends RecyclerView.ViewHolder {

        RecyclerView rv_link_invitee;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            rv_link_invitee = itemView.findViewById(R.id.rv_link_invitee);
        }
    }
}
