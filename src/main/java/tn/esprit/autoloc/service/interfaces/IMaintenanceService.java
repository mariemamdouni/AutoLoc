package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Maintenance;

import java.util.Set;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);
    Maintenance getMaintenanceById(Long id);
    Set<Maintenance> getAllMaintenances();
}