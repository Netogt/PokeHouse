package com.sdev.pokehome.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Table(name = "trainers")
@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
