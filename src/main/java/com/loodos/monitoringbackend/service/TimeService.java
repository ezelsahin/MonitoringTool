package com.loodos.monitoringbackend.service;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class TimeService {
    @Bean
    @Scope("prototype")
    public LocalDateTime getLocaldateTime(){
        return LocalDateTime.now();
    }

    @Bean
    public ApplicationRunner runDisplayDate()
    {
        return args -> {
            LocalDate today = LocalDate.now();

            System.out.printf("Today: %02d/%02d/%04d", today.getDayOfMonth(), today.getMonthValue(), today.getYear() );
        };
    }
}
