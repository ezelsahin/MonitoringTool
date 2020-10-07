package com.loodos.monitoringbackend.entity;

import org.springframework.data.annotation.Id;

public class Configuration {
    @Id
    private String m_id;
    private String m_endpoint;
    private Long m_interval;
    private Communication m_communication;

    public String getId() {
        return m_id;
    }

    public void setId(String m_id) {
        this.m_id = m_id;
    }

    public String getEndpoint() {
        return m_endpoint;
    }

    public void setEndpoint(String m_endpoint) {
        this.m_endpoint = m_endpoint;
    }

    public Long getInterval() {
        return m_interval;
    }

    public void setInterval(Long m_interval) {
        this.m_interval = m_interval;
    }

    public Communication getCommunication() {
        return m_communication;
    }

    public void setCommunication(Communication m_communication) {
        this.m_communication = m_communication;
    }
}
