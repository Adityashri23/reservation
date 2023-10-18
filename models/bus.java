package com.paytmbus.reservation.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Bus Number cannot be null!")
    @NotBlank(message = "Bus Number cannot be blank!")
    private String busNumber;

    @NotNull(message = "Route From cannot be null!")
    @NotBlank(message = "Route From cannot be blank!")
    private String routeFrom;

    @NotNull(message = "Route To cannot be null!")
    @NotBlank(message = "Route To cannot be blank!")
    private String routeTo;

    @NotNull(message = "Arrival Time cannot be null!")
    @NotBlank(message = "Arrival Time cannot be blank!")
    private String arrivalTime;

    @NotNull(message = "Departure Time cannot be null!")
    @NotBlank(message = "Departure Time cannot be blank!")
    private String departureTime;

    @NotNull(message = "Total Seats cannot be null!")
    private int totalSeats;

    @NotNull(message = "Available Seats cannot be null!")
    private int availableSeats;
}


