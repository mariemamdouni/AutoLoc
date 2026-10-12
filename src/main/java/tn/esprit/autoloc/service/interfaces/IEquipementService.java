package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Equipement;

import java.util.Set;

public interface IEquipementService {
    Equipement addEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(Long id);
    Equipement getEquipementById(Long id);
    Set<Equipement> getAllEquipements();
}