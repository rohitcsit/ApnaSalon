package com.apnasalon.dto;

import com.apnasalon.model.Booking;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {
    private Long id;
    private Long userId;
    private Long salonId;
    private LocalDate date;
    private LocalTime time;

    public BookingDTO(Booking booking) {
        this.id = booking.getId();
        this.userId = booking.getUser().getId();
        this.salonId = booking.getSalon().getId();
        this.date = booking.getDate();
        this.time = booking.getTime();
    }
}
