package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.aigestudio.wheelpicker.WheelPicker;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    MyRecyclerAdapter mAdapterInvitee;

    RecyclerView rv_duong_family;

    Button btAccept;

    WheelPicker loop_view1;

    List<String> day = new ArrayList<>();
    List<String> month = new ArrayList<>();
    List<String> year = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_chosse_city);
        ButterKnife.bind(this);

        for (int i = 1; i < 32; i++) {
            day.add(i + "");
        }

        loop_view1 = findViewById(R.id.wp_city);
        loop_view1.setCurtainColor(getResources().getColor(R.color.dialog_transparent));
        loop_view1.setData(day);

    }
}


