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

    @PostMapping("/perfumes")
    public Perfume addPerfume(@RequestBody Perfume perfume){
        return perfumeService.addPerfume(perfume);
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
