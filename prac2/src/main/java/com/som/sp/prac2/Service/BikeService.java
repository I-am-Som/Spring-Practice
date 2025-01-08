package com.som.sp.prac2.Service;

import com.som.sp.prac2.Entites.Bike;

import java.util.List;

public interface BikeService {

    public String createBike(Bike bike);

    public List<Bike> fetchAllBikes();

    public String updateBike(Bike bike);

    public String deleteBike(String engNo);
}
