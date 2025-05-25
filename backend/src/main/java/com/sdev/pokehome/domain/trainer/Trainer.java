package com.sdev.pokehome.domain.trainer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "trainers")
public class Trainer {
    @Id
    @GeneratedValue
    private UUID id;
    private Integer user_id;
    private Integer sav_id;
    private Integer tid;
    private Integer sid;
    private String name;
    private Integer gender;
    private Integer badges;
    private Integer money;
    private Date playTime;
    private String seenCount;
    private String caughtCount;
    private String gameVersion;
    private Integer Generation;

    public Trainer() {
    }

    public Trainer(UUID id, Integer user_id, Integer sav_id, Integer tid, Integer sid, String name, Integer gender, Integer badges, Integer money, Date playTime, String seenCount, String caughtCount, String gameVersion, Integer generation) {
        this.id = id;
        this.user_id = user_id;
        this.sav_id = sav_id;
        this.tid = tid;
        this.sid = sid;
        this.name = name;
        this.gender = gender;
        this.badges = badges;
        this.money = money;
        this.playTime = playTime;
        this.seenCount = seenCount;
        this.caughtCount = caughtCount;
        this.gameVersion = gameVersion;
        Generation = generation;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSav_id() {
        return sav_id;
    }

    public void setSav_id(Integer sav_id) {
        this.sav_id = sav_id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getBadges() {
        return badges;
    }

    public void setBadges(Integer badges) {
        this.badges = badges;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(String seenCount) {
        this.seenCount = seenCount;
    }

    public String getCaughtCount() {
        return caughtCount;
    }

    public void setCaughtCount(String caughtCount) {
        this.caughtCount = caughtCount;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public Integer getGeneration() {
        return Generation;
    }

    public void setGeneration(Integer generation) {
        Generation = generation;
    }
}
