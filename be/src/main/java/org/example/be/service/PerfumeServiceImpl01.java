package org.example.be.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.be.entities.Perfume;
import org.example.be.repositories.PerfumeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class PerfumeServiceImpl01 implements PerfumeService {
    private PerfumeRepository perfumeRepository;

    @Override
    public List<Perfume> getPerfumes() {
        return perfumeRepository.findAll();
    }

    @Override
    public Perfume addPerfume(Perfume perfume) {
        return perfumeRepository.save(perfume);
    }

    @Override
    public void removePerfume(Long id) {
        perfumeRepository.delete(perfumeRepository.findById(id).get());
    }

    @Override
    public List<Perfume> searchPerfume(String mc) {
        return perfumeRepository.searchAllByNameContains(mc);
    }

    @Override
    public Perfume findById(Long id) {
        return perfumeRepository.findById(id).get();
    }

    @Override
    public Perfume updatePerfume(Long id, Perfume perfume) {
        Perfume updatedPerfume = perfumeRepository.findById(id).get();
        updatedPerfume.setName(perfume.getName());
        updatedPerfume.setDescription(perfume.getDescription());
        updatedPerfume.setPrice(perfume.getPrice());
        return perfumeRepository.save(updatedPerfume);
    }
}
