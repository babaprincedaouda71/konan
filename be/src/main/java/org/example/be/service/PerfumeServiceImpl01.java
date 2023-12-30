package org.example.be.service;

import lombok.AllArgsConstructor;
import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Perfume;
import org.example.be.mappers.PerfumeMapper;
import org.example.be.repositories.PerfumeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PerfumeServiceImpl01 implements PerfumeService {
    private PerfumeRepository perfumeRepository;
    private PerfumeMapper perfumeMapper;

    @Override
    public List<PerfumeResponseDTO> getPerfumes() {
        List<Perfume> perfumes = perfumeRepository.findAll();
        List<PerfumeResponseDTO> perfumeResponseDTOList = new ArrayList<>();
        perfumes.forEach(perfume -> {
            PerfumeResponseDTO perfumeResponseDTO = perfumeMapper.fromPerfume(perfume);
            perfumeResponseDTOList.add(perfumeResponseDTO);
        });
        return perfumeResponseDTOList;
    }

    @Override
    public PerfumeResponseDTO addPerfume(PerfumeRequestDTO perfumeRequestDTO) {
        Perfume perfume = perfumeMapper.fromPerfumeDTO(perfumeRequestDTO);
        Perfume savedPerfume = perfumeRepository.save(perfume);
        return perfumeMapper.fromPerfume(savedPerfume);
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
