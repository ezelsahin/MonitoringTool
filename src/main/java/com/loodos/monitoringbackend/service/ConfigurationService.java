package com.loodos.monitoringbackend.service;

import com.loodos.monitoringbackend.entity.Configuration;
import com.loodos.monitoringbackend.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigurationService {

    @Autowired
    ConfigurationRepository configurationRepository;

    public Configuration save(Configuration configuration) {
        return configurationRepository.save(configuration);
    }

    public List<Configuration> getAll() {
        return configurationRepository.findAll();
    }

    public Optional<Configuration> get(String id) {
        return configurationRepository.findById(id);
    }
}
