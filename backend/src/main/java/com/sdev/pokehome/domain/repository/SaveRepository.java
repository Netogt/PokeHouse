package com.sdev.pokehome.domain.repository;

import com.sdev.pokehome.domain.entity.Save;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaveRepository extends JpaRepository<Save, UUID> {
}
