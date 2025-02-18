package com.apnasalon.controller;

import com.apnasalon.dto.SalonDTO;
import com.apnasalon.service.SalonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salons")
public class SalonController {

    private final SalonService salonService;

    public SalonController(SalonService salonService) {
        this.salonService = salonService;
    }

    @PostMapping("/")
    public ResponseEntity<SalonDTO> addSalon(@RequestBody SalonDTO salonDTO) {
        return ResponseEntity.ok(salonService.addSalon(salonDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalonDTO> getSalonById(@PathVariable Long id) {
        return ResponseEntity.ok(salonService.getSalonById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<SalonDTO>> getAllSalons() {
        return ResponseEntity.ok(salonService.getAllSalons());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalonDTO> updateSalon(@PathVariable Long id, @RequestBody SalonDTO salonDTO) {
        return ResponseEntity.ok(salonService.updateSalon(id, salonDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSalon(@PathVariable Long id) {
        salonService.deleteSalon(id);
        return ResponseEntity.ok("Salon deleted successfully");
    }
}
