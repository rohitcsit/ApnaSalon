package com.apnasalon.dto;

import com.apnasalon.model.Salon;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalonDTO {
    private Long id;
    private String name;
    private String location;
    private List<String> services;
    private String ownerEmail;

    public SalonDTO(Salon salon) {
        this.id = salon.getId();
        this.name = salon.getName();
        this.location = salon.getLocation();
        this.services = salon.getServices();
        this.ownerEmail = salon.getOwnerEmail();
    }
}
