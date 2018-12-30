package com.example.ha_hai.projectanhthanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    MyRecyclerAdapter mAdapterInvitee;
    MyRecyclerAdapter mAdapterQuestions;

    RecyclerView rv_person;
    RecyclerView mRvQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_change_infor);
        ButterKnife.bind(this);

        rv_person = findViewById(R.id.rv_change_infor);
        rv_person.setHasFixedSize(true);
        rv_person.setLayoutManager(new LinearLayoutManager(this));
        rv_person.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapterInvitee = new MyRecyclerAdapter(this, R.layout.item_information);
        rv_person.setAdapter(mAdapterInvitee);

//        mRvQuestions = findViewById(R.id.rv_question);
//        mRvQuestions.setHasFixedSize(true);
//        mRvQuestions.setLayoutManager(new LinearLayoutManager(this));
//        mRvQuestions.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
//        mAdapterQuestions = new MyRecyclerAdapter(this, R.layout.row_question);
//        mRvQuestions.setAdapter(mAdapterQuestions);
//
//        AddPhotoBottomDialogFragment addPhotoBottomDialogFragment = AddPhotoBottomDialogFragment.newInstance();
//        addPhotoBottomDialogFragment.show(getSupportFragmentManager(), "add_photo_dialog_fragment");
    }
}


