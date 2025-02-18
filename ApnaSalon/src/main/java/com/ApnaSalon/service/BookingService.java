package com.apnasalon.service;

import com.apnasalon.dto.BookingDTO;
import com.apnasalon.model.Booking;
import com.apnasalon.model.Salon;
import com.apnasalon.model.User;
import com.apnasalon.repository.BookingRepository;
import com.apnasalon.repository.SalonRepository;
import com.apnasalon.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;
    private final SalonRepository salonRepository;

    public BookingService(BookingRepository bookingRepository, UserRepository userRepository, SalonRepository salonRepository) {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        this.salonRepository = salonRepository;
    }

    public BookingDTO bookAppointment(BookingDTO bookingDTO) {
        Optional<User> userOptional = userRepository.findById(bookingDTO.getUserId());
        Optional<Salon> salonOptional = salonRepository.findById(bookingDTO.getSalonId());

        if (userOptional.isPresent() && salonOptional.isPresent()) {
            Booking booking = new Booking();
            booking.setUser(userOptional.get());
            booking.setSalon(salonOptional.get());
            booking.setDate(bookingDTO.getDate());
            booking.setTime(bookingDTO.getTime());
            bookingRepository.save(booking);
            return new BookingDTO(booking);
        }
        return null;
    }

    public BookingDTO getBookingById(Long id) {
        Optional<Booking> booking = bookingRepository.findById(id);
        return booking.map(BookingDTO::new).orElse(null);
    }

    public List<BookingDTO> getAllBookings() {
        return bookingRepository.findAll().stream().map(BookingDTO::new).collect(Collectors.toList());
    }

    public BookingDTO updateBooking(Long id, BookingDTO bookingDTO) {
        Optional<Booking> bookingOptional = bookingRepository.findById(id);
        if (bookingOptional.isPresent()) {
            Booking booking = bookingOptional.get();
            booking.setDate(bookingDTO.getDate());
            booking.setTime(bookingDTO.getTime());
            bookingRepository.save(booking);
            return new BookingDTO(booking);
        }
        return null;
    }

    public void cancelBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
