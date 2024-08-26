package com.patika.ticketservice.controller;

import com.patika.ticketservice.model.Trip;
import com.patika.ticketservice.model.VehicleType;
import com.patika.ticketservice.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/admin/trips")
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping
    public Trip addTrip(@RequestBody Trip trip) {
        return tripService.addTrip(trip);
    }

    @DeleteMapping("/{id}")
    public void cancelTrip(@PathVariable Long id) {
        tripService.cancelTrip(id);
    }

    @GetMapping
    public List<Trip> searchTrips(
            @RequestParam String city,
            @RequestParam VehicleType vehicleType,
            @RequestParam LocalDateTime departureTime) {
        return tripService.searchTrips(city, vehicleType, departureTime);
    }
}
