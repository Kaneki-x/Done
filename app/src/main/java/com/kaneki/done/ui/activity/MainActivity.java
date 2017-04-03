package com.kaneki.done.ui.activity;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kaneki.done.R;
import com.kaneki.done.adapter.DoneListAdapter;
import com.kaneki.done.base.BaseActivity;
import com.kaneki.done.model.entity.DoneEntity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private RecyclerView doneRecyclerView;

    private DoneListAdapter doneListAdapter;
    private ArrayList<DoneEntity> doneEntityArrayList;

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
        doneEntityArrayList = new ArrayList<>();
        DoneEntity doneEntity = new DoneEntity();
        doneEntity.setColor(Color.RED);
        doneEntity.setTitle("test");
        doneEntity.setAchievePoint(1);
        doneEntity.setCurrentPoints(5);
        doneEntity.setTargetPoints(10);

        doneEntityArrayList.add(doneEntity);
    }

    @Override
    public void initViews() {
        doneListAdapter = new DoneListAdapter(this, doneEntityArrayList);

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
