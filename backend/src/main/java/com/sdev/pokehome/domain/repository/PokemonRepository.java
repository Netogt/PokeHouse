package com.sdev.pokehome.domain.repository;

import com.sdev.pokehome.domain.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PokemonRepository extends JpaRepository<Pokemon, UUID> {
}
