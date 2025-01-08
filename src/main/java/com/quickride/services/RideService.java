package com.quickride.services;

import com.quickride.exceptions.VehicleNotFoundException;
import com.quickride.models.Ride;
import com.quickride.models.Vehicle;
import com.quickride.repositories.DriverRepository;
import com.quickride.repositories.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RideService {
    private VehicleRepository vehicleRepository;
    private DriverRepository driverRepository;


    public RideService(VehicleRepository vehicleRepository,
                       DriverRepository driverRepository) {
        this.vehicleRepository = vehicleRepository;
        this.driverRepository = driverRepository;
    }

    public Ride proposeRide(Long vehicleId,
                            String source,
                            String destination,
                            Long driverId,
                            double amount,
                            int availableSeatCounts) throws VehicleNotFoundException { // POJO

        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(vehicleId);

        if (optionalVehicle.isEmpty()) {
            throw new VehicleNotFoundException("Vehicle with id : " + vehicleId + " not found, please first add your vehicle in the Database.");
        }


        // .....


        return new Ride();
    }
}