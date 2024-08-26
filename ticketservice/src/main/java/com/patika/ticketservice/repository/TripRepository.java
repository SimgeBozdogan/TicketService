package com.patika.ticketservice.repository;

import com.patika.ticketservice.model.Trip;
import com.patika.ticketservice.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip,Long> {
    List<Trip> findByCityAndVehicleTypeAndDepartureTime(String city, VehicleType vehicleType, LocalDateTime departureTime);
}
