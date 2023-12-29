package org.example.be.service;

import org.example.be.entities.Perfume;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PerfumeService {
    public List<Perfume> getPerfumes();

    public Perfume addPerfume(Perfume perfume);
}
