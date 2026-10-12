package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.interfaces.IVehiculeService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    IVehiculeService vehiculeService;

    @GetMapping("/retrieve-all-vehicules")
    public Set<Vehicule> getVehicules() {
        Set<Vehicule> listVehicules = vehiculeService.getAllVehicules();
        return listVehicules;
    }

    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        Vehicule vehicule = vehiculeService.getVehiculeById(vehiculeId);
        return vehicule;
    }

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        Vehicule newVehicule = vehiculeService.addVehicule(vehicule);
        return newVehicule;
    }

    @DeleteMapping("/remove-vehicule/{vehicule-id}")
    public void removeVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        vehiculeService.deleteVehicule(vehiculeId);
    }

    @PutMapping("/modify-vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule vehicule) {
        Vehicule updatedVehicule = vehiculeService.updateVehicule(vehicule);
        return updatedVehicule;
    }
}