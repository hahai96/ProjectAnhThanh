package com.example.ha_hai.projectanhthanh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AddPhotoBottomDialogFragment extends BottomSheetDialogFragment {

    MyRecyclerAdapter mAdapterBottom;
    RecyclerView mRvBottomSheet;

    public static AddPhotoBottomDialogFragment newInstance() {
        return new AddPhotoBottomDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_choose_invitee, container, false);

        mRvBottomSheet = view.findViewById(R.id.rv_invitee_bottom);
        mRvBottomSheet.setHasFixedSize(true);
        mRvBottomSheet.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvBottomSheet.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        mAdapterBottom = new MyRecyclerAdapter(getActivity(), R.layout.row_invitee);
        mRvBottomSheet.setAdapter(mAdapterBottom);
        return view;
    }
}