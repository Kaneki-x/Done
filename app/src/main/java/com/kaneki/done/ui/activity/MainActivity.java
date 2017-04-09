package com.kaneki.done.ui.activity;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kaneki.done.R;
import com.kaneki.done.adapter.DoneListAdapter;
import com.kaneki.done.base.BaseActivity;
import com.kaneki.done.model.intent.Done;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private RecyclerView doneRecyclerView;

    private DoneListAdapter doneListAdapter;
    private ArrayList<Done> doneArrayList;

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    public void findViews() {
        doneRecyclerView = (RecyclerView) findViewById(R.id.rlv_main_done);
    }

    @Override
    public void initDatas() {
        doneArrayList = new ArrayList<>();
        Done done = new Done();
        done.setColor(Color.RED);
        done.setTitle("机器学习");
        done.setAchievePoint(1);
        done.setCurrentPoints(5);
        done.setTargetPoints(10);

        doneArrayList.add(done);

        done = new Done();
        done.setColor(Color.YELLOW);
        done.setTitle("喝酒");
        done.setAchievePoint(2);
        done.setCurrentPoints(0);
        done.setTargetPoints(10);

        doneArrayList.add(done);
    }

    @Override
    public void initViews() {
        doneListAdapter = new DoneListAdapter(this, doneArrayList);

        doneRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        doneRecyclerView.setAdapter(doneListAdapter);
    }

    @Override
    public void setListeners() {

    }

    @Override
    public void onEvent(Object object) {

    }
}
