package org.example.be.controllers;

import org.example.be.entities.Perfume;
import org.example.be.service.PerfumeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerfumeController {
    PerfumeService perfumeService;

    public PerfumeController(PerfumeService perfumeService) {
        this.perfumeService = perfumeService;
    }

    @GetMapping("/perfumes")
    public List<Perfume> getPerfumes(){
        List<Perfume> perfumes = perfumeService.getPerfumes();
        return perfumes;
    }
}
