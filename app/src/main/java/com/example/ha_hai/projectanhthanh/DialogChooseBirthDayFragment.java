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

public class DialogChooseBirthDayFragment extends BottomSheetDialogFragment {

    @BindView(R.id.wp_day)
    WheelPicker mWpDay;
    @BindView(R.id.wp_month)
    WheelPicker mWpMonth;
    @BindView(R.id.wp_year)
    WheelPicker mWpYear;

    private List<String> mDay;
    private List<String> mMonth;
    private List<String> mYear;


    public static DialogChooseBirthDayFragment newInstance() {
        return new DialogChooseBirthDayFragment();
    }

    public void setDate(List<String> day, List<String> month, List<String> year) {
        this.mDay = day;
        this.mMonth = month;
        this.mYear = year;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_choose_birthday, container, false);
        ButterKnife.bind(this, view);

        if (!ObjectUtils.isEmpty(mDay)) {
            mWpDay.setData(mDay);
        }

        if (!ObjectUtils.isEmpty(mMonth)) {
            mWpMonth.setData(mMonth);
        }

        if (!ObjectUtils.isEmpty(mYear)) {
            mWpYear.setData(mYear);
        }
        return view;
    }
}