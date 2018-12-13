package com.example.ha_hai.projectanhthanh;

import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.mancj.materialsearchbar.MaterialSearchBar;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv_admob;
    RecyclerView rv_link_invitee_detail;

    private ActionBarDrawerToggle drawerToggle;
    private DrawerLayout drawerLayout;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_search);

        mToolbar = findViewById(R.id.toolbar_search);
        setSupportActionBar(mToolbar);

//        tv_place = findViewById(R.id.tv_place);
//        tv_place.setText(Html.fromHtml(getString(R.string.location)));
//        tv_admob = findViewById(R.id.tv_admob);
//        tv_admob.setText(Html.fromHtml(getString(R.string.tv_admod)));

//
        rv_link_invitee_detail = findViewById(R.id.rv_search);
        rv_link_invitee_detail.setHasFixedSize(true);
        rv_link_invitee_detail.setLayoutManager(new LinearLayoutManager(this));
        rv_link_invitee_detail.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rv_link_invitee_detail.setAdapter(new MyRecyclerAdapter(this));

//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        drawerLayout = findViewById(R.id.drawer_layout);
//        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, mToolbar, R.string.open_drawer, R.string.close_drawer);
//        drawerLayout.addDrawerListener(drawerToggle);
//
//        drawerToggle.syncState();

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        drawerToggle.onOptionsItemSelected(item);
//
//        return true;
//    }
//
//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        drawerToggle.onConfigurationChanged(newConfig);
//    }

}


