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
        return perfumeRepository.findAll();
    }

    @Override
    public Perfume addPerfume(Perfume perfume) {
        return perfumeRepository.save(perfume);
    }

    @Override
    public void removePerfume(Perfume perfume) {
        perfumeRepository.delete(perfume);
    }

    @Override
    public List<Perfume> searchPerfume(String mc) {
        return perfumeRepository.searchAllByNameContains(mc);
    }

    @Override
    public Perfume findById(Long id) {
        return perfumeRepository.findById(id).get();
    }
}
