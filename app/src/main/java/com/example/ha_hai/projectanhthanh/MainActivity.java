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

    RecyclerView mRvGuest;
    RecyclerView mRvQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_task_detail);
        ButterKnife.bind(this);

        mRvGuest = findViewById(R.id.rv_invitee);
        mRvGuest.setHasFixedSize(true);
        mRvGuest.setLayoutManager(new LinearLayoutManager(this));
        mRvGuest.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapterInvitee = new MyRecyclerAdapter(this, R.layout.row_invitee);
        mRvGuest.setAdapter(mAdapterInvitee);

        mRvQuestions = findViewById(R.id.rv_question);
        mRvQuestions.setHasFixedSize(true);
        mRvQuestions.setLayoutManager(new LinearLayoutManager(this));
        mRvQuestions.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapterQuestions = new MyRecyclerAdapter(this, R.layout.row_question);
        mRvQuestions.setAdapter(mAdapterQuestions);

        AddPhotoBottomDialogFragment addPhotoBottomDialogFragment = AddPhotoBottomDialogFragment.newInstance();
        addPhotoBottomDialogFragment.show(getSupportFragmentManager(), "add_photo_dialog_fragment");
    }
}


