package com.loodos.monitoringbackend.entity;

public class Communication {
    private CommunicationType m_communicationType;
    private String m_communicationAddress;

    public CommunicationType getCommunicationType() {
        return m_communicationType;
    }

    public void setCommunicationType(CommunicationType m_communicationType) {
        this.m_communicationType = m_communicationType;
    }

    public String getCommunicationAddress() {
        return m_communicationAddress;
    }

    public void setCommunicationAddress(String m_communicationAddress) {
        this.m_communicationAddress = m_communicationAddress;
    }
}
