package com.sdev.pokehome.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "trainers")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "t_id")
    private Integer tID;
    @Column(name = "s_id")
    private Integer sID;
    private String name;
    private Integer gender;
    private Integer badges;
    private Integer money;
    @Column(name = "play_time")
    private String playTime;
    @Column(name = "seen_count")
    private Integer seenCount;
    @Column(name = "caught_count")
    private Integer caughtCount;
    @Column(name = "game_version")
    private String gameVersion;
    @Column(name = "game_generation")
    private Integer gameGeneration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "save_id", referencedColumnName = "id")
    private Save save;
    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BagItem> inventories = new ArrayList<>();

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private  LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Trainer() {
    }

    public Trainer(UUID id, Integer tID, Integer sID, String name, Integer gender, Integer badges, Integer money, String playTime, Integer seenCount, Integer caughtCount, String gameVersion, Integer gameGeneration, User user, Save save, List<BagItem> inventories, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.tID = tID;
        this.sID = sID;
        this.name = name;
        this.gender = gender;
        this.badges = badges;
        this.money = money;
        this.playTime = playTime;
        this.seenCount = seenCount;
        this.caughtCount = caughtCount;
        this.gameVersion = gameVersion;
        this.gameGeneration = gameGeneration;
        this.user = user;
        this.save = save;
        this.inventories = inventories;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer gettID() {
        return tID;
    }

    public void settID(Integer tID) {
        this.tID = tID;
    }

    public Integer getsID() {
        return sID;
    }

    public void setsID(Integer sID) {
        this.sID = sID;
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

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    public Integer getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(Integer seenCount) {
        this.seenCount = seenCount;
    }

    public Integer getCaughtCount() {
        return caughtCount;
    }

    public void setCaughtCount(Integer caughtCount) {
        this.caughtCount = caughtCount;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public Integer getGameGeneration() {
        return gameGeneration;
    }

    public void setGameGeneration(Integer gameGeneration) {
        this.gameGeneration = gameGeneration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public List<BagItem> getInventories() {
        return inventories;
    }

    public void setInventories(List<BagItem> inventories) {
        this.inventories = inventories;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
