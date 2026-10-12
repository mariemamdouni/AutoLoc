package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.interfaces.IMaintenanceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    IMaintenanceService maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public Set<Maintenance> getMaintenances() {
        Set<Maintenance> listMaintenances = maintenanceService.getAllMaintenances();
        return listMaintenances;
    }

    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        Maintenance maintenance = maintenanceService.getMaintenanceById(maintenanceId);
        return maintenance;
    }

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        Maintenance newMaintenance = maintenanceService.addMaintenance(maintenance);
        return newMaintenance;
    }

    @DeleteMapping("/remove-maintenance/{maintenance-id}")
    public void removeMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        maintenanceService.deleteMaintenance(maintenanceId);
    }

    @PutMapping("/modify-maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance maintenance) {
        Maintenance updatedMaintenance = maintenanceService.updateMaintenance(maintenance);
        return updatedMaintenance;
    }
}
