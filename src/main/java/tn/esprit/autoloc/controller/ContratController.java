package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.interfaces.IContratService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratController {

    IContratService contratService;

    @GetMapping("/retrieve-all-contrats")
    public Set<Contrat> getContrats() {
        Set<Contrat> listContrats = contratService.getAllContrats();
        return listContrats;
    }

    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        Contrat contrat = contratService.getContratById(contratId);
        return contrat;
    }

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        Contrat newContrat = contratService.addContrat(contrat);
        return newContrat;
    }

    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(@PathVariable("contrat-id") Long contratId) {
        contratService.deleteContrat(contratId);
    }

    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat contrat) {
        Contrat updatedContrat = contratService.updateContrat(contrat);
        return updatedContrat;
    }
}