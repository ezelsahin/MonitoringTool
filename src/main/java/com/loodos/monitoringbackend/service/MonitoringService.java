package com.loodos.monitoringbackend.service;

import com.loodos.monitoringbackend.entity.Monitoring;
import com.loodos.monitoringbackend.repository.MonitoringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitoringService {

    @Autowired
    MonitoringRepository monitoringRepository;

    public Monitoring get()
}
