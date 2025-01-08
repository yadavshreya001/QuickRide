package com.quickride.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Passenger extends User {
    @ManyToMany
    private List<Ride> rides;
}


/*


Passenger ---- Ride => M:M
 */