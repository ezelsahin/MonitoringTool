package com.loodos.monitoringbackend.controller;

import com.loodos.monitoringbackend.service.MonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

    @Autowired
    MonitoringService monitoringService;


}
