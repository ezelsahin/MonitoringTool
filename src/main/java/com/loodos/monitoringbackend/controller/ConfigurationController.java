package com.loodos.monitoringbackend.controller;

import com.loodos.monitoringbackend.entity.Configuration;
import com.loodos.monitoringbackend.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ConfigurationController {
    @Autowired
    ConfigurationService configurationService;

    @GetMapping("/all")
    List<Configuration> getConfigurations() {
        /*Configuration configuration = new Configuration();
        configuration.setId(123L);
        configuration.setEndpoint("www.google.com");
        configuration.setInterval(100000L);
        Communication communication = new Communication();
        communication.setCommunicationAddress("ezelsahin@gmail.com");
        communication.setCommunicationType(CommunicationType.MAIL);
        configuration.setCommunication(communication);
        return configuration;*/
        return configurationService.getAll();
    }

    @GetMapping("/")
    Optional<Configuration> getConfiguration(@RequestParam(name = "id") String id) {
        return configurationService.get(id);
    }

    @PostMapping("/")
    Configuration saveConfiguration(@RequestBody Configuration configuration) {
        return configurationService.save(configuration);
    }
}
