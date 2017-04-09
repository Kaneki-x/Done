package com.kaneki.done.model.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/4/6
 * @email yueqian@mogujie.com
 */
@Entity
public class DayEntity {
    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private long doneId;

    @NotNull
    private Date date;

    private int target_goals;

    private int current_goals;

    private String tag;

    @Generated(hash = 755233754)
    public DayEntity(Long id, long doneId, @NotNull Date date, int target_goals,
            int current_goals, String tag) {
        this.id = id;
        this.doneId = doneId;
        this.date = date;
        this.target_goals = target_goals;
        this.current_goals = current_goals;
        this.tag = tag;
    }

    @Generated(hash = 453592013)
    public DayEntity() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getDoneId() {
        return this.doneId;
    }

    public void setDoneId(long doneId) {
        this.doneId = doneId;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTarget_goals() {
        return this.target_goals;
    }

    public void setTarget_goals(int target_goals) {
        this.target_goals = target_goals;
    }

    public int getCurrent_goals() {
        return this.current_goals;
    }

    public void setCurrent_goals(int current_goals) {
        this.current_goals = current_goals;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
