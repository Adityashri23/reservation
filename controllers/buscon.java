package com.paytmbus.reservation.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.paytmbus.reservation.models.bus;
import com.paytmbus.reservation.services.BusService;

@RestController
@RequestMapping("/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public ResponseEntity<List<Bus>> getAllBuses() {
        List<Bus> buses = busService.getAllBuses();
        return ResponseEntity.ok(buses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        Bus bus = busService.getBusById(id);
        if (bus != null) {
            return ResponseEntity.ok(bus);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<String> saveBus(@RequestBody Bus bus) {
        busService.saveBus(bus);
        return ResponseEntity.status(HttpStatus.CREATED).body("Bus saved successfully!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
        return ResponseEntity.ok("Bus deleted successfully!");
    }
}