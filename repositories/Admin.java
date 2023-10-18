package com.paytmbus.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paytmbus.reservation.models.admin;

public interface AdminRepository extends JpaRepository<admin, Long> {
    // Add custom methods if needed
}