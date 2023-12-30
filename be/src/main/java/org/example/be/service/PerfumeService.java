package org.example.be.service;

import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Perfume;

import java.util.List;

public interface PerfumeService {
    public List<PerfumeResponseDTO> getPerfumes();

    public PerfumeResponseDTO addPerfume(PerfumeRequestDTO perfumeRequestDTO);

    public void removePerfume(Long id);

    public List<Perfume> searchPerfume(String mc);

    public Perfume findById(Long id);

    public Perfume updatePerfume(Long id, Perfume perfume);
}
