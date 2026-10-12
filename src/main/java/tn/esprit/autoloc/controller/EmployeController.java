package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.interfaces.IEmployeService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeController {

    IEmployeService employeService;

    @GetMapping("/retrieve-all-employes")
    public Set<Employe> getEmployes() {
        Set<Employe> listEmployes = employeService.getAllEmployes();
        return listEmployes;
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        Employe employe = employeService.getEmployeById(employeId);
        return employe;
    }

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe employe) {
        Employe newEmploye = employeService.addEmploye(employe);
        return newEmploye;
    }

    @DeleteMapping("/remove-employe/{employe-id}")
    public void removeEmploye(@PathVariable("employe-id") Long employeId) {
        employeService.deleteEmploye(employeId);
    }

    @PutMapping("/modify-employe")
    public Employe modifyEmploye(@RequestBody Employe employe) {
        Employe updatedEmploye = employeService.updateEmploye(employe);
        return updatedEmploye;
    }
}