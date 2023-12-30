package org.example.be.service;

import org.example.be.entities.Perfume;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PerfumeService {
    public List<Perfume> getPerfumes();

    public Perfume addPerfume(Perfume perfume);

    public void removePerfume(Perfume perfume);

    public List<Perfume> searchPerfume(String mc);

    public Perfume findById(Long id);
}
