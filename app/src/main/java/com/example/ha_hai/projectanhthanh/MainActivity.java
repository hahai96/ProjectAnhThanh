package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_row);

        tv_place = findViewById(R.id.tv_place);
        tv_place.setText(Html.fromHtml(getString(R.string.location)));
    }
}
