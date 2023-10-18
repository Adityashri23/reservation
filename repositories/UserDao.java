package com.paytmbus.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paytmbus.reservation.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom methods if needed
}
