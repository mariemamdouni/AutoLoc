package tn.esprit.autoloc.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.interfaces.IAgenceService;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {
    IAgenceService agenceService;

    @GetMapping("/retrieve-all-agences")
    public Set<Agence> getAgences() {
        Set<Agence> listAgences = agenceService.getAllAgences();
        return listAgences;
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        Agence agence = agenceService.getAgenceById(agenceId);
        return agence;
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        Agence newAgence = agenceService.addAgence(agence);
        return newAgence;
    }

    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.deleteAgence(agenceId);
    }

    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence agence) {
        Agence updatedAgence = agenceService.updateAgence(agence);
        return updatedAgence;
    }
}