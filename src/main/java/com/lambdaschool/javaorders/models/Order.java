package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderNum;

    private double ordAmount;
    private double advanceAmount;

    @ManyToOne
    @JoinColumn(name = "customerCode", nullable = false)
    private long customerCode;

    private String orderDesc;

    public Order(double ordAmount, double advanceAmount, long customerCode, String orderDesc) {
        this.ordAmount = ordAmount;
        this.advanceAmount = advanceAmount;
        this.customerCode = customerCode;
        this.orderDesc = orderDesc;
    }

    public Order() {}

    public long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(long orderNum) {
        this.orderNum = orderNum;
    }

    public double getOrdAmount() {
        return ordAmount;
    }

    public void setOrdAmount(double ordAmount) {
        this.ordAmount = ordAmount;
    }

    public double getAdvanceAmount() {
        return advanceAmount;
    }

    public void setAdvanceAmount(double advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    public long getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(long customerCode) {
        this.customerCode = customerCode;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
}
