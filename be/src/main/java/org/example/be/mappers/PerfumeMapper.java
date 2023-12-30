package org.example.be.mappers;

import org.example.be.dto.PerfumeDTO;
import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Perfume;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PerfumeMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public PerfumeResponseDTO fromPerfume(Perfume perfume){
        return modelMapper.map(perfume, PerfumeResponseDTO.class);
    }

    public Perfume fromPerfumeDTO(PerfumeRequestDTO perfumeDTO){
        return modelMapper.map(perfumeDTO, Perfume.class);
    }
}
