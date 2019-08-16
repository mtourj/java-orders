package com.lambdaschool.javaorders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentCode;

    @Column(nullable = false)
    private String agentName;
    private String workingArea;
    private double commission;
    private String phone;
    private String country;

    @OneToMany(mappedBy = "agent",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    @JsonIgnoreProperties("agent")
    private List<Customer> customers = new ArrayList<>();

    public Agent(String agentName, String workingArea, double commission, String phone, String country) {
        this.agentName = agentName;
        this.workingArea = workingArea;
        this.commission = commission;
        this.phone = phone;
        this.country = country;
    }

    public Agent() {}

    public long getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(long agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
