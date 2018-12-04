package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_admob;
    RecyclerView rv_link_invitee_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list_guest);

//        tv_place = findViewById(R.id.tv_place);
//        tv_place.setText(Html.fromHtml(getString(R.string.location)));
//        tv_admob = findViewById(R.id.tv_admob);
//        tv_admob.setText(Html.fromHtml(getString(R.string.tv_admod)));


        rv_link_invitee_detail = findViewById(R.id.rv_guest);
        rv_link_invitee_detail.setHasFixedSize(true);
        rv_link_invitee_detail.setLayoutManager(new LinearLayoutManager(this));
        rv_link_invitee_detail.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rv_link_invitee_detail.setAdapter(new MyRecyclerAdapter(this));
    }
}


