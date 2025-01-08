package com.som.sp.prac2.Repositories;

import com.som.sp.prac2.Entites.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BikeRepo extends JpaRepository<Bike, String> {

}

