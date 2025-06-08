package com.sdev.pokehome.domain.repository;

import com.sdev.pokehome.domain.entity.BagItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InventoryRepository extends JpaRepository<BagItem, UUID> {
}
