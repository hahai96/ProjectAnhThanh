package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;

import com.mancj.materialsearchbar.MaterialSearchBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.searchBar_suggestion)
    MaterialSearchBar mSearchBar;
    @BindView(R.id.toolbar_suggestion)
    Toolbar mToolbar;
    @BindView(R.id.rv_suggestion)
    RecyclerView mRvGuest;
    @BindView(R.id.fr_transparent)
    FrameLayout mFlTransparent;

    private List<Guest> suggestions = new ArrayList<>();

    // Sample data
    private final String[] products = {
            "Dương Văn A",
            "Nguyễn Văn B",
            "Phạm Thị C",
            "Lê Thị D",
            "Mai Thị Hạnh",
            "Trần Quốc Tuấn",
            "Lê Văn Đức",
            "Đinh Đức Trung",
            "Nguyễn Xuân Hậu",
            "Phạm Xuân Trường"
    };

    MyRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_suggestion);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        for (int i = 1; i < 11; i++) {
            suggestions.add(new Guest(products[i - 1], "Khách mời V123", "0123456789"));
        }

        mRvGuest = findViewById(R.id.rv_suggestion);
        mRvGuest.setHasFixedSize(true);
        mRvGuest.setLayoutManager(new LinearLayoutManager(this));
        mRvGuest.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapter = new MyRecyclerAdapter(this, suggestions);
        mRvGuest.setAdapter(mAdapter);

        mSearchBar.addTextChangeListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mFlTransparent.setVisibility(View.VISIBLE);
                mAdapter.filter(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}


