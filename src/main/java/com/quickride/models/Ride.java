package com.quickride.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ride extends BaseModel {
    private String source;
    private String dest;
    private double amount;
    private int availableSeatCount;

    @ManyToMany(mappedBy = "rides")
    private List<Passenger> passengers;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Vehicle vehicle;

    @Enumerated(EnumType.ORDINAL)
    private RideStatus rideStatus;

    private Date startTime;
    private Date endTime;
}