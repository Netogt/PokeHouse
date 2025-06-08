package com.sdev.pokehome.domain.repository;

import com.sdev.pokehome.domain.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {
}
