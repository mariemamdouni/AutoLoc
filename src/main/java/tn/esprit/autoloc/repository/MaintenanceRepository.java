package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.Maintenance;
//Long type wrapper mech long
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
