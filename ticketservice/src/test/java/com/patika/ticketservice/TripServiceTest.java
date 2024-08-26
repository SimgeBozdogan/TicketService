package com.patika.ticketservice;

import com.patika.ticketservice.model.Trip;
import com.patika.ticketservice.model.VehicleType;
import com.patika.ticketservice.repository.TripRepository;
import com.patika.ticketservice.service.TripService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@SpringBootTest
public class TripServiceTest {

    @Mock
    private TripRepository tripRepository;

    @InjectMocks
    private TripService tripService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSearchTrips() {
        String city = "Istanbul";
        VehicleType vehicleType = VehicleType.BUS;
        LocalDateTime departureTime = LocalDateTime.now();

        Trip trip = new Trip();
        trip.setCity(city);
        trip.setVehicleType(vehicleType);
        trip.setDepartureTime(departureTime);

        List<Trip> expectedTrips = Collections.singletonList(trip);

        when(tripRepository.findByCityAndVehicleTypeAndDepartureTime(city, vehicleType, departureTime))
                .thenReturn(expectedTrips);

        List<Trip> actualTrips = tripService.searchTrips(city, vehicleType, departureTime);

        // Assertion
        assertEquals(expectedTrips, actualTrips);
    }
}
