package com.example.ha_hai.projectanhthanh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.blankj.utilcode.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyHolder> {

    Context context;
    List<Guest> mGuest;
    List<Guest> mTempList = new ArrayList<>();

    public MyRecyclerAdapter(Context context, List<Guest> guests) {
        this.context = context;
        this.mGuest = guests;
        mTempList.addAll(guests);
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_guest, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.tvName.setText(mGuest.get(i).getName());
        myHolder.tvPhone.setText(mGuest.get(i).getPhone());
        myHolder.tvId.setText(mGuest.get(i).getId());
    }

    @Override
    public int getItemCount() {
        return mGuest.size();
    }

    public void filter(String text) {
        if (!StringUtils.isEmpty(text)) {
            mGuest.clear();
            for (int i = 0; i < mTempList.size(); i++) {
                if (mTempList.get(i).getName().toLowerCase().contains(text.toLowerCase())) {
                    mGuest.add(mTempList.get(i));
                }
            }

            notifyDataSetChanged();
        }
    }

    class MyHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_name_guest)
        TextView tvName;
        @BindView(R.id.tv_phone_guest)
        TextView tvPhone;
        @BindView(R.id.tv_id_guest)
        TextView tvId;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
