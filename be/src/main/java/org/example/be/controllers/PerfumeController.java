package org.example.be.controllers;

import org.example.be.entities.Perfume;
import org.example.be.service.PerfumeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addPerfume")
    public Perfume addPerfume(@RequestBody Perfume perfume){
        return perfumeService.addPerfume(perfume);
    }

    @DeleteMapping("/removePerfume")
    public void removePerfume(@RequestBody Perfume perfume){
        perfumeService.removePerfume(perfume);
    }

    public List<Perfume> searchPerfume(@PathVariable String mc){
        return perfumeService.searchPerfume(mc);
    }

    @GetMapping("/perfumes/{id}")
    public Perfume findById(@PathVariable Long id){
        return perfumeService.findById(id);
    }
}
