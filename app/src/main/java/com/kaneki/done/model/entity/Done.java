package com.kaneki.done.model.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/4/6
 * @email yueqian@mogujie.com
 */
@Entity
public class Done {
    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private int type;

    @NotNull
    private int color;

    @NotNull
    private int target_goals;

    private int current_goals;

    private int longest_streak;

    private int current_streak;
}
