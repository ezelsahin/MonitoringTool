package com.loodos.monitoringbackend.repository;

import com.loodos.monitoringbackend.entity.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigurationRepository extends MongoRepository<Configuration, String> {

}