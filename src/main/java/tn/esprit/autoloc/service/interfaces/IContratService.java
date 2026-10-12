package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Contrat;

import java.util.Set;

public interface IContratService {
    Contrat addContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    void deleteContrat(Long id);
    Contrat getContratById(Long id);
    Set<Contrat> getAllContrats();
}