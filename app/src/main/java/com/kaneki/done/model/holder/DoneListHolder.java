package com.kaneki.done.model.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.kaneki.done.R;
import com.kaneki.done.model.intent.Done;

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

    public void bindView(Done done) {
        tvName.setText(done.getTitle());
        roundCornerProgressBar.setProgressColor(done.getColor());
        roundCornerProgressBar.setMax(done.getTargetPoints());
        roundCornerProgressBar.setProgress(done.getCurrentPoints());
        tvDetail.setText("每天: " + done.getCurrentPoints() + " / " + done.getTargetPoints());
        tvAchievePoints.setText(String.valueOf(done.getAchievePoint()));
    }
}
