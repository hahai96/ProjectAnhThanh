package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    MyRecyclerAdapter mAdapterInvitee;

    RecyclerView rv_duong_family;

    Button btAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_learn_about_duong_family);
        ButterKnife.bind(this);

        rv_duong_family = findViewById(R.id.rv_duong_family);
        rv_duong_family.setHasFixedSize(true);
        rv_duong_family.setLayoutManager(new GridLayoutManager(this, 2));
        rv_duong_family.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapterInvitee = new MyRecyclerAdapter(this, R.layout.item_duong_family);
        rv_duong_family.setAdapter(mAdapterInvitee);

//        btAccept = findViewById(R.id.bt_accept);
//        btAccept.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TimePickerDialog mDialogAll = new TimePickerDialog.Builder()
//                        .setCallBack(new OnDateSetListener() {
//                            @Override
//                            public void onDateSet(TimePickerDialog timePickerView, long millseconds) {
//
//                            }
//                        })
//                        .setCancelStringId("Cancel")
//                        .setSureStringId("Sure")
//                        .setTitleStringId("TimePicker")
//                        .setYearText("Year")
//                        .setMonthText("Month")
//                        .setDayText("Day")
//                        .setHourText("Hour")
//                        .setMinuteText("Minute")
//                        .setCyclic(false)
//                        .setMinMillseconds(System.currentTimeMillis())
//                        .setMaxMillseconds(System.currentTimeMillis() + 10000)
//                        .setCurrentMillseconds(System.currentTimeMillis())
//                        .setThemeColor(getResources().getColor(R.color.timepicker_dialog_bg))
//                        .setType(Type.ALL)
//                        .setWheelItemTextNormalColor(getResources().getColor(R.color.timetimepicker_default_text_color))
//                        .setWheelItemTextSelectorColor(getResources().getColor(R.color.timepicker_toolbar_bg))
//                        .setWheelItemTextSize(12)
//                        .build();
//            }
//        });
    }
}


