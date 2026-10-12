package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.interfaces.IReservationService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public Set<Reservation> getReservations() {
        Set<Reservation> listReservations = reservationService.getAllReservations();
        return listReservations;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        Reservation reservation = reservationService.getReservationById(reservationId);
        return reservation;
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        Reservation newReservation = reservationService.addReservation(reservation);
        return newReservation;
    }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long reservationId) {
        reservationService.deleteReservation(reservationId);
    }

    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation reservation) {
        Reservation updatedReservation = reservationService.updateReservation(reservation);
        return updatedReservation;
    }
}