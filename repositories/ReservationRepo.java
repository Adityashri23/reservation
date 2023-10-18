package com.paytmbus.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paytmbus.reservation.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // You can add custom query methods if needed
}