package com.loodos.monitoringbackend.service;

import org.springframework.stereotype.Service;

@Service
public class SlackService {
    private String m_slackAddress;

    public String getM_slackAddress() {
        return m_slackAddress;
    }

    public void setM_slackAddress(String m_slackAddress) {
        this.m_slackAddress = m_slackAddress;
    }
}
