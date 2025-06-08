package com.sdev.pokehome.domain.trainer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sdev.pokehome.domain.inventory.Inventory;
import com.sdev.pokehome.domain.save.Save;
import com.sdev.pokehome.domain.user.User;
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
    private Integer tID;
    private Integer sID;
    private String name;
    private Integer gender;
    private Integer badges;
    private Integer money;
    private String playTime;
    private Integer seenCount;
    private Integer caughtCount;
    private String gameVersion;
    private Integer Generation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;
    @OneToOne(mappedBy = "trainer")
    private Save save;
    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inventory> inventories = new ArrayList<>();

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private  LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
