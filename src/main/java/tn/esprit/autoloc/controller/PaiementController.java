package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.interfaces.IPaiementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public Set<Paiement> getPaiements() {
        Set<Paiement> listPaiements = paiementService.getAllPaiements();
        return listPaiements;
    }

    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        Paiement paiement = paiementService.getPaiementById(paiementId);
        return paiement;
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        Paiement newPaiement = paiementService.addPaiement(paiement);
        return newPaiement;
    }

    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiementService.deletePaiement(paiementId);
    }

    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement paiement) {
        Paiement updatedPaiement = paiementService.updatePaiement(paiement);
        return updatedPaiement;
    }
}