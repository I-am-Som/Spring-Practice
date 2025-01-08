package com.som.sp.prac2.Service;

import com.som.sp.prac2.Entites.Bike;
import com.som.sp.prac2.Repositories.BikeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeServiceImplemetation implements BikeService {

    BikeRepo bikeRepo;

    public BikeServiceImplemetation(BikeRepo bikeRepo) {
        this.bikeRepo = bikeRepo;
    }

    @Override
    public String createBike(Bike bike) {
        bikeRepo.save(bike);
        return "Bike object created and saved";
    }

    @Override
    public List<Bike> fetchAllBikes() {
        return List.of();
    }

    @Override
    public String updateBike(Bike bike) {
        return "";
    }

    @Override
    public String deleteBike(String engNo) {
        return "";
    }
}
