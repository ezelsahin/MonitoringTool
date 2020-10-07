package com.loodos.monitoringbackend.service;

import org.springframework.stereotype.Service;

@Service
public class MailService {
    private String m_mailAddress;

    public String getM_mailAddress() {
        return m_mailAddress;
    }

    public void setM_mailAddress(String m_mailAddress) {
        this.m_mailAddress = m_mailAddress;
    }
}

