package org.example.be.service;

import org.example.be.entities.Perfume;
import org.example.be.repositories.PerfumeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfumeServiceImpl01 implements PerfumeService {
    PerfumeRepository perfumeRepository;

    public PerfumeServiceImpl01(PerfumeRepository perfumeRepository) {
        this.perfumeRepository = perfumeRepository;
    }
    @Override
    public List<Perfume> getPerfumes() {
        List<Perfume> perfumes = perfumeRepository.findAll();
        return perfumes;
    }

    @Override
    public Perfume addPerfume(Perfume perfume) {
        Perfume savedPerfume = perfumeRepository.save(perfume);
        return savedPerfume;
    }
}
