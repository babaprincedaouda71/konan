package org.example.be.controllers;

import lombok.AllArgsConstructor;
import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Perfume;
import org.example.be.service.PerfumeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PerfumeController {
    private PerfumeService perfumeService;

    @GetMapping("/perfumes")
    public List<PerfumeResponseDTO> getPerfumes(){
        List<PerfumeResponseDTO> perfumes = perfumeService.getPerfumes();
        return perfumes;
    }

    @PostMapping("/perfumes")
    public PerfumeResponseDTO addPerfume(@RequestBody PerfumeRequestDTO perfumeRequestDTO){
        return perfumeService.addPerfume(perfumeRequestDTO);
    }

    @DeleteMapping("/perfumes/{id}")
    public void removePerfume(@PathVariable Long id){
        perfumeService.removePerfume(id);
    }

    public List<Perfume> searchPerfume(@PathVariable String mc){
        return perfumeService.searchPerfume(mc);
    }

    @GetMapping("/perfumes/{id}")
    public Perfume findById(@PathVariable Long id){
        return perfumeService.findById(id);
    }

    @PutMapping("/perfumes/{id}")
    public Perfume updatePerfume(@PathVariable Long id, @RequestBody Perfume perfume){
        return perfumeService.updatePerfume(id, perfume);
    }
}
