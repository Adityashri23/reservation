package com.paytmbus.reservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paytmbus.reservation.models.User;
import com.paytmbus.reservation.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Implement service methods using userRepository
    // ...
}