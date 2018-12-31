package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.bruce.pickerview.LoopScrollListener;
import com.bruce.pickerview.LoopView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    MyRecyclerAdapter mAdapterInvitee;

    RecyclerView rv_duong_family;

    Button btAccept;

    LoopView loop_view1, loop_view2, loop_view3;

    List<String> day = new ArrayList<>();
    List<String> month = new ArrayList<>();
    List<String> year = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_fragmen);
        ButterKnife.bind(this);

        for (int i = 1; i < 32; i++) {
            day.add(i + "");
        }

        for (int i = 1; i < 13; i++) {
            month.add("Tháng " + i);
        }

        for (int i = 1990; i < 2050; i++) {
            year.add(i + "");
        }

        loop_view1 = (LoopView) findViewById(R.id.lv_day);
        loop_view1.setInitPosition(2);
        loop_view1.setCanLoop(false);
        loop_view1.setLoopListener(new LoopScrollListener() {
            @Override
            public void onItemSelect(int item) {
                Toast.makeText(MainActivity.this, day.get(item), Toast.LENGTH_SHORT).show();
            }
        });
        loop_view1.setTextSize(25);//must be called before setDateList
        loop_view1.setDataList(day);

        loop_view2= (LoopView) findViewById(R.id.lv_month);
        loop_view2.setInitPosition(2);
        loop_view2.setCanLoop(false);
        loop_view3.setMinimumHeight(40);
        loop_view2.setLoopListener(new LoopScrollListener() {
            @Override
            public void onItemSelect(int item) {
                Toast.makeText(MainActivity.this, month.get(item), Toast.LENGTH_SHORT).show();

            }
        });
        loop_view2.setTextSize(25);//must be called before setDateList
        loop_view2.setDataList(month);

        loop_view3 = (LoopView) findViewById(R.id.lv_year);
        loop_view3.setInitPosition(2);
        loop_view3.setCanLoop(false);
        loop_view3.setMinimumHeight(40);
        loop_view3.setLoopListener(new LoopScrollListener() {
            @Override
            public void onItemSelect(int item) {
                Toast.makeText(MainActivity.this, year.get(item), Toast.LENGTH_SHORT).show();
            }
        });
        loop_view3.setTextSize(25);//must be called before setDateList
        loop_view3.setDataList(year);

//        rv_duong_family = findViewById(R.id.rv_duong_family);
//        rv_duong_family.setHasFixedSize(true);
//        rv_duong_family.setLayoutManager(new GridLayoutManager(this, 2));
//        rv_duong_family.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
//        mAdapterInvitee = new MyRecyclerAdapter(this, R.layout.item_duong_family);
//        rv_duong_family.setAdapter(mAdapterInvitee);

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


