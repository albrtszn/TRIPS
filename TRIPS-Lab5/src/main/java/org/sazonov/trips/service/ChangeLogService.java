package org.sazonov.trips.service;

import lombok.AllArgsConstructor;
import org.sazonov.trips.entity.ChangeLog;
import org.sazonov.trips.repository.ChangeLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ChangeLogService {
    @Autowired
    private ChangeLogRepository changeLogRepository;

    /**
     * Get all Logs
     * @return List of ChangeLog
     */
    public List<ChangeLog> findAll(){
        return changeLogRepository.findAll();
    }
    /**
     * Save by entity
     * @param log
     * @return ChangeLog
     */
    public ChangeLog save(ChangeLog log){
        return changeLogRepository.save(log);
    }
    /**
     * Save by String
     * @param info
     * @return ChangeLog
     */
    public ChangeLog save(String info){
        return changeLogRepository.save(new ChangeLog(info));
    }
}
