package com.example.ha_hai.projectanhthanh;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.github.clans.fab.FloatingActionMenu;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FabActivity extends AppCompatActivity {

//    @BindView(R.id.fam_menu)
//    FloatingActionMenu mFamMenu;
//
//    private List<FloatingActionMenu> menus = new ArrayList<>();
//    private Handler mUiHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
//        ButterKnife.bind(this);

//        mFamMenu.setClosedOnTouchOutside(true);
//        mFamMenu.hideMenuButton(false);
//        menus.add(mFamMenu);
//
//        showMenuButton();
//
//        mFamMenu.setOnMenuButtonClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mFamMenu.getMenuIconView().setImageResource(mFamMenu.isOpened()
//                        ? R.drawable.ic_fab_menu : R.drawable.ic_fab_close);
//
//                mFamMenu.toggle(true);
//            }
//        });
//    }
//
//    private void showMenuButton() {
//        int delay = 400;
//        for (final FloatingActionMenu menu : menus) {
//            mUiHandler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    menu.showMenuButton(true);
//                }
//            }, delay);
//            delay += 150;
//        }
//    }
//
//    @OnClick(R.id.fab_back_home)
//    public void backHome(View view) {
//        Toast.makeText(this, "Fab back home...", Toast.LENGTH_SHORT).show();
    }
}
