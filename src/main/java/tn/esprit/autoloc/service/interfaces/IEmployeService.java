package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Employe;

import java.util.Set;

public interface IEmployeService {
    Employe addEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(Long id);
    Employe getEmployeById(Long id);
    Set<Employe> getAllEmployes();
}