package com.som.sp.prac2.Controller;

import com.som.sp.prac2.Entites.Bike;
import com.som.sp.prac2.Service.BikeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bike")
public class BikeController {

    BikeService bikeService;

    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }

    @PostMapping
    String createBike(@RequestBody Bike bike) {
        String msg = bikeService.createBike(bike);
        return msg;
    }

//    @GetMapping("{engNo}")
//    Bike fetchBike(@PathVariable String engNo) {
//        return bike;
//    }
//
//    @PutMapping
//    String updateBike(@RequestBody Bike bike) {
//        this.bike = bike;
//        return "bike updated";
//    }
//
//    @DeleteMapping("{engNo}")
//    String deleteBike(@PathVariable String engNo) {
//        this.bike = null;
//        return "Bike deleted";
//    }
}
