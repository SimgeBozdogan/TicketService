package com.patika.ticketservice.service;


import com.patika.ticketservice.model.Trip;
import com.patika.ticketservice.model.VehicleType;
import com.patika.ticketservice.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@EnableCaching
public class TripService {

    @Autowired
    private TripRepository tripRepository;
    @Cacheable(value = "trips", key = "#city + '_' + #vehicleType")
    public List<Trip> searchTrips(String city, VehicleType vehicleType, LocalDateTime departureTime) {
        return tripRepository.findByCityAndVehicleTypeAndDepartureTime(city, vehicleType, departureTime);
    }
    @CacheEvict(cacheNames = "trip", allEntries = true)
    public Trip addTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public void cancelTrip(Long id) {
        tripRepository.deleteById(id);
    }
}
