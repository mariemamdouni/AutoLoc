package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.interfaces.IEquipementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public Set<Equipement> getEquipements() {
        Set<Equipement> listEquipements = equipementService.getAllEquipements();
        return listEquipements;
    }

    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        Equipement equipement = equipementService.getEquipementById(equipementId);
        return equipement;
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        Equipement newEquipement = equipementService.addEquipement(equipement);
        return newEquipement;
    }

    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipementService.deleteEquipement(equipementId);
    }

    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement equipement) {
        Equipement updatedEquipement = equipementService.updateEquipement(equipement);
        return updatedEquipement;
    }
}