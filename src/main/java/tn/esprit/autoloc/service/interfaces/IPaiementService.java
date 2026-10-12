package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Paiement;

import java.util.Set;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
    Paiement getPaiementById(Long id);
    Set<Paiement> getAllPaiements();
}