package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.Set;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    Vehicule getVehiculeById(Long id);
    Set<Vehicule> getAllVehicules();
}