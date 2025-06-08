package com.sdev.pokehome.domain.repository;

import com.sdev.pokehome.domain.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainerRepository extends JpaRepository<Trainer, UUID> {
}
