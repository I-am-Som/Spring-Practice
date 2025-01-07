package com.springPractice.crudOps.prac1.LaptopController;

import com.springPractice.crudOps.prac1.Entities.Laptop;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("laptop")
public class LaptopController {

    Laptop lap;

//    @GetMapping("{srNo}")
//    public Laptop getLaptop(@PathVariable String srNo) {
//        Laptop laptop = new Laptop(srNo, "HP", 95344);
//        return laptop;
//    }

    @PostMapping
    String Create(@RequestBody Laptop lap) {
        this.lap = lap;
        return "Laptop Created";
    }

    @GetMapping("{srNo}")
    Laptop fetchLap(@PathVariable String srNo) {
        return lap;
    }

    @PutMapping
    String update(@RequestBody Laptop lap) {
        this.lap = lap;
        return "Laptop updated";
    }

    @DeleteMapping("{srNo}")
    String delete(@PathVariable String srNo) {
        lap = null;
        return "Laptop deleted";
    }
}
