package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    List<String> day = new ArrayList<>();
    List<String> month = new ArrayList<>();
    List<String> year = new ArrayList<>();
    List<String> cities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        for (int i = 1; i < 32; i++) {
            day.add(i + "");
        }

        for (int i = 1; i < 13; i++) {
            month.add("Tháng " + i);
        }

        for (int i = 1940; i < 2018; i++) {
            year.add(i + "");
        }

        cities.addAll(Arrays.asList(getResources().getStringArray(R.array.cities)));
    }

    @OnClick(R.id.bt_choose_birthday)
    public void onChooseBirthday() {
        DialogChooseBirthDayFragment birthDayFragment = DialogChooseBirthDayFragment.newInstance();
        birthDayFragment.setDate(day, month, year);
        birthDayFragment.show(getSupportFragmentManager(), "Custom Bottom Sheet");
    }

    @OnClick(R.id.bt_choose_city)
    public void onChooseCity() {
        DialogChooseCityFragment bottomSheetDialog = DialogChooseCityFragment.newInstance();
        bottomSheetDialog.setCities(cities);
        bottomSheetDialog.show(getSupportFragmentManager(), "Custom Bottom Sheet");
    }
}


