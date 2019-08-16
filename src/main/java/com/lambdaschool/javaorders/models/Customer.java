package com.lambdaschool.javaorders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerCode;

    @Column(nullable = false)
    private String customerName;

    private String customerCity;
    private String workingArea;
    private String grade;
    private double openingAmt;
    private double receiveAmt;
    private double paymentAmt;
    private double outstandingAmt;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "agentCode", nullable = false)
    private Agent agent;

    @OneToMany(mappedBy = "customerCode",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private List<Order> orders = new ArrayList<>();


    public Customer(String customerName, String customerCity, String workingArea, String grade, double openingAmt, double receiveAmt, double paymentAmt, double outstandingAmt, String phone, long agentCode) {
        this.customerName = customerName;
        this.customerCity = customerCity;
        this.workingArea = workingArea;
        this.grade = grade;
        this.openingAmt = openingAmt;
        this.receiveAmt = receiveAmt;
        this.paymentAmt = paymentAmt;
        this.outstandingAmt = outstandingAmt;
        this.phone = phone;
        this.agent = agent;
    }

    public Customer() {}

    public long getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(long customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getOpeningAmt() {
        return openingAmt;
    }

    public void setOpeningAmt(double openingAmt) {
        this.openingAmt = openingAmt;
    }

    public double getReceiveAmt() {
        return receiveAmt;
    }

    public void setReceiveAmt(double receiveAmt) {
        this.receiveAmt = receiveAmt;
    }

    public double getPaymentAmt() {
        return paymentAmt;
    }

    public void setPaymentAmt(double paymentAmt) {
        this.paymentAmt = paymentAmt;
    }

    public double getOutstandingAmt() {
        return outstandingAmt;
    }

    public void setOutstandingAmt(double outstandingAmt) {
        this.outstandingAmt = outstandingAmt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Agent getAgentCode() {
        return agent;
    }

    public void setAgentCode(Agent agentCode) {
        this.agent = agentCode;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
