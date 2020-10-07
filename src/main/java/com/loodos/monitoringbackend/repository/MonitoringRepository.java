package com.loodos.monitoringbackend.repository;

import com.loodos.monitoringbackend.entity.Monitoring;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonitoringRepository extends MongoRepository<Monitoring, String> {
}
