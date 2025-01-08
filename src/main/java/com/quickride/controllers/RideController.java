package com.quickride.controllers;

import com.quickride.dtos.ProposeRideRequestDto;
import com.quickride.dtos.ProposeRideResponseDto;
import com.quickride.exceptions.VehicleNotFoundException;
import com.quickride.models.Ride;
import com.quickride.services.RideService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/rides/create

@RestController
@RequestMapping("/rides")
public class RideController {
    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }


    @PostMapping("/create")
    public ProposeRideResponseDto proposeRide(ProposeRideRequestDto requestDto) throws VehicleNotFoundException {
        rideService.proposeRide(
                10L,
                "Delhi",
                "Mumbai",
                100L,
                2000,
                4
        );

        return null;
    }
}
