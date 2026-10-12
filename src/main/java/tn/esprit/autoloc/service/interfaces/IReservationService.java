package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Reservation;

import java.util.Set;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
    Reservation getReservationById(Long id);
    Set<Reservation> getAllReservations();
}