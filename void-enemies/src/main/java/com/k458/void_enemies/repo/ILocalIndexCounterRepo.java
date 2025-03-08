package com.k458.void_enemies.repo;

import com.k458.void_enemies.model.LocalIndexCounterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocalIndexCounterRepo extends JpaRepository<LocalIndexCounterEntity, Long> {
}
