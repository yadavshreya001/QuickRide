package com.quickride.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Driver extends User {
    @OneToMany(mappedBy = "driver")
    private List<Vehicle> vehicles;

    @OneToMany(mappedBy = "driver")
    private List<Ride> rides;

    private String licenseNumber;
}


/*

Driver ---- Vehicle => 1:M

Driver ---- Ride => 1:M

 */