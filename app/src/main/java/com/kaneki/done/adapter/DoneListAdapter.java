package com.kaneki.done.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.kaneki.done.R;
import com.kaneki.done.model.entity.DoneEntity;
import com.kaneki.done.model.holder.DoneListHolder;

import java.util.List;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/3/25
 * @email yueqian@mogujie.com
 */
public class DoneListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_DONE_TITLE = 0;
    private static final int TYPE_DONE_ITEM = 1;

    private DoneEntity[] datas;
    private LayoutInflater layoutInflater;

    public DoneListAdapter(Context context, List<DoneEntity> doneEntityList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.datas = doneEntityList.toArray(new DoneEntity[doneEntityList.size()]);
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return TYPE_DONE_TITLE;
        else
            return TYPE_DONE_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_DONE_TITLE)
            return new RecyclerView.ViewHolder(layoutInflater.inflate(R.layout.item_main_list_title, parent, false)){};
        else
            return new DoneListHolder(layoutInflater.inflate(R.layout.item_main_list_done, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position > 0)
            ((DoneListHolder) holder).bindView(datas[position - 1]);
    }

    @Override
    public int getItemCount() {
        return datas.length + 1;
    }
}
