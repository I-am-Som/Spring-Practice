package com.som.sp.prac2.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {

    @Id
    String engNo;
    String brand;
    int cost;

    public Bike() {
    }

    public Bike(String engNo, String brand, int cost) {
        this.engNo = engNo;
        this.brand = brand;
        this.cost = cost;
    }

    public String getEngNo() {
        return engNo;
    }

    public void setEngNo(String engNo) {
        this.engNo = engNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "BikeController{" +
                "engNo='" + engNo + '\'' +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}
