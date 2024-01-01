package org.example.be.controllers;

import lombok.AllArgsConstructor;
import org.example.be.entities.Perfume;
import org.example.be.service.PerfumeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PerfumeController {
    private PerfumeService perfumeService;

    @GetMapping("/perfumes")
    public List<Perfume> getPerfumes(){
        return perfumeService.getPerfumes();
    }

    @PostMapping("/perfumes")
    public Perfume addPerfume(@RequestBody Perfume perfume){
        return perfumeService.addPerfume(perfume);
    }

    @DeleteMapping("/perfumes/{id}")
    public void removePerfume(@PathVariable Long id){
        perfumeService.removePerfume(id);
    }

    @GetMapping("/perfumes/{mc}")
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
