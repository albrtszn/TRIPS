package org.sazonov.trips.repository;

import org.sazonov.trips.entity.ChangeLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChangeLogRepository extends JpaRepository<ChangeLog, Integer> {
    List<ChangeLog> findAll();
}
