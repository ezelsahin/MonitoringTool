package com.loodos.monitoringbackend.entity;

import org.springframework.data.annotation.Id;

public class Monitoring {
    @Id
    private String m_Id;
    private String m_endpoint;
    private int m_requestCount;
    private Long m_responseTime;
    private Long m_uptime;
    private Long m_downtime;
    private Long m_monitoringTime;
    // ? private String m_statusCode;

    public String getM_Id() {
        return m_Id;
    }

    public void setM_Id(String m_Id) {
        this.m_Id = m_Id;
    }

    public String getM_endpoint() {
        return m_endpoint;
    }

    public void setM_endpoint(String m_endpoint) {
        this.m_endpoint = m_endpoint;
    }

    public int getM_requestCount() {
        return m_requestCount;
    }

    public void setM_requestCount(int m_requestCount) {
        this.m_requestCount = m_requestCount;
    }

    public Long getM_responseTime() {
        return m_responseTime;
    }

    public void setM_responseTime(Long m_responseTime) {
        this.m_responseTime = m_responseTime;
    }

    public Long getM_uptime() {
        return m_uptime;
    }

    public void setM_uptime(Long m_uptime) {
        this.m_uptime = m_uptime;
    }

    public Long getM_downtime() {
        return m_downtime;
    }

    public void setM_downtime(Long m_downtime) {
        this.m_downtime = m_downtime;
    }

    public Long getM_monitoringTime() {
        return m_monitoringTime;
    }

    public void setM_monitoringTime(Long m_monitoringTime) {
        this.m_monitoringTime = m_monitoringTime;
    }
}
