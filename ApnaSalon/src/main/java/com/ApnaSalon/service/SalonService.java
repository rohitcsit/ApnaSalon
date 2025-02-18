package com.apnasalon.service;

import com.apnasalon.dto.SalonDTO;
import com.apnasalon.model.Salon;
import com.apnasalon.repository.SalonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SalonService {

    private final SalonRepository salonRepository;

    public SalonService(SalonRepository salonRepository) {
        this.salonRepository = salonRepository;
    }

    public SalonDTO addSalon(SalonDTO salonDTO) {
        Salon salon = new Salon();
        salon.setName(salonDTO.getName());
        salon.setLocation(salonDTO.getLocation());
        salon.setServices(salonDTO.getServices());
        salonRepository.save(salon);
        return new SalonDTO(salon);
    }

    public SalonDTO getSalonById(Long id) {
        Optional<Salon> salon = salonRepository.findById(id);
        return salon.map(SalonDTO::new).orElse(null);
    }

    public List<SalonDTO> getAllSalons() {
        return salonRepository.findAll().stream().map(SalonDTO::new).collect(Collectors.toList());
    }

    public SalonDTO updateSalon(Long id, SalonDTO salonDTO) {
        Optional<Salon> salonOptional = salonRepository.findById(id);
        if (salonOptional.isPresent()) {
            Salon salon = salonOptional.get();
            salon.setName(salonDTO.getName());
            salon.setLocation(salonDTO.getLocation());
            salon.setServices(salonDTO.getServices());
            salonRepository.save(salon);
            return new SalonDTO(salon);
        }
        return null;
    }

    public void deleteSalon(Long id) {
        salonRepository.deleteById(id);
    }
}
