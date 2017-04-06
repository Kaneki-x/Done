package com.kaneki.done.model.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.kaneki.done.R;
import com.kaneki.done.model.intent.DoneEntity;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/3/25
 * @email yueqian@mogujie.com
 */
public class DoneListHolder extends RecyclerView.ViewHolder {

    private RoundCornerProgressBar roundCornerProgressBar;
    private TextView tvName;
    private TextView tvDetail;
    private TextView tvAchievePoints;

    public DoneListHolder(View itemView) {
        super(itemView);

        roundCornerProgressBar = (RoundCornerProgressBar) itemView.findViewById(R.id.rpb_done_rate);
        tvName = (TextView) itemView.findViewById(R.id.tv_done_name);
        tvDetail = (TextView) itemView.findViewById(R.id.tv_done_detail);
        tvAchievePoints = (TextView) itemView.findViewById(R.id.tv_done_achieve_point);
    }

    public void bindView(DoneEntity doneEntity) {
        tvName.setText(doneEntity.getTitle());
        roundCornerProgressBar.setProgressColor(doneEntity.getColor());
        roundCornerProgressBar.setMax(doneEntity.getTargetPoints());
        roundCornerProgressBar.setProgress(doneEntity.getCurrentPoints());
        tvDetail.setText("每天: " + doneEntity.getCurrentPoints() + " / " + doneEntity.getTargetPoints());
        tvAchievePoints.setText(String.valueOf(doneEntity.getAchievePoint()));
    }
}
