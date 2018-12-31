package com.example.ha_hai.projectanhthanh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aigestudio.wheelpicker.WheelPicker;
import com.blankj.utilcode.util.ObjectUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DialogChooseCityFragment extends BottomSheetDialogFragment {

    @BindView(R.id.wp_city)
    WheelPicker mWpCity;

    private List<String> cities;

    public static DialogChooseCityFragment newInstance() {
        return new DialogChooseCityFragment();
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_chosse_city, container, false);
        ButterKnife.bind(this, view);

        if (!ObjectUtils.isEmpty(cities)) {
            mWpCity.setData(cities);
        }
        return view;
    }
}