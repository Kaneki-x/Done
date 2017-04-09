package com.kaneki.done.model.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import com.kaneki.done.db.DaoSession;
import com.kaneki.done.db.DayEntityDao;
import com.kaneki.done.db.DoneEntityDao;

/**
 * @author yueqian
 * @Desctription
 * @date 2017/4/6
 * @email yueqian@mogujie.com
 */
@Entity
public class DoneEntity {
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

    private String tag;

    @ToMany(referencedJoinProperty = "doneId")
    List<DayEntity> dayDatas ;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 700796075)
    private transient DoneEntityDao myDao;

    @Generated(hash = 2046621518)
    public DoneEntity(Long id, @NotNull String name, int type, int color,
            int target_goals, int current_goals, int longest_streak,
            int current_streak, String tag) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.color = color;
        this.target_goals = target_goals;
        this.current_goals = current_goals;
        this.longest_streak = longest_streak;
        this.current_streak = current_streak;
        this.tag = tag;
    }

    @Generated(hash = 525838480)
    public DoneEntity() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
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

    public int getLongest_streak() {
        return this.longest_streak;
    }

    public void setLongest_streak(int longest_streak) {
        this.longest_streak = longest_streak;
    }

    public int getCurrent_streak() {
        return this.current_streak;
    }

    public void setCurrent_streak(int current_streak) {
        this.current_streak = current_streak;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1348635356)
    public List<DayEntity> getDayDatas() {
        if (dayDatas == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DayEntityDao targetDao = daoSession.getDayEntityDao();
            List<DayEntity> dayDatasNew = targetDao._queryDoneEntity_DayDatas(id);
            synchronized (this) {
                if (dayDatas == null) {
                    dayDatas = dayDatasNew;
                }
            }
        }
        return dayDatas;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 203121543)
    public synchronized void resetDayDatas() {
        dayDatas = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1872024690)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDoneEntityDao() : null;
    }
}
