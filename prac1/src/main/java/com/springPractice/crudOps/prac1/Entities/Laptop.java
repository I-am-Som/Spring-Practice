package com.springPractice.crudOps.prac1.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Laptop {

    String srNo;
    String brand;
    int cost;

    public Laptop() {
    }

    public Laptop(String srNo, String brand, int cost) {
        this.srNo = srNo;
        this.brand = brand;
        this.cost = cost;
    }

    public String getSrNo() {
        return srNo;
    }

    public String getBrand() {
        return brand;
    }

    public int getCost() {
        return cost;
    }

    public void setSrNo(String srNo) {
        this.srNo = srNo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "srNo='" + srNo + '\'' +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}
