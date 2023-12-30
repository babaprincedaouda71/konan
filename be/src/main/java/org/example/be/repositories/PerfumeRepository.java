package org.example.be.repositories;

import org.example.be.entities.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfumeRepository extends JpaRepository<Perfume, Long> {
    public List<Perfume> searchAllByNameContains(String mc);
}
