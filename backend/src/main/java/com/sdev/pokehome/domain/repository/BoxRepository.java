package com.sdev.pokehome.domain.repository;

import com.sdev.pokehome.domain.entity.Box;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BoxRepository extends JpaRepository<Box, UUID> {
}
