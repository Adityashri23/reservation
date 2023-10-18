package com.paytmbus.reservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paytmbus.reservation.models.Admin;
import com.paytmbus.reservation.repositories.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Implement service methods using adminRepository
    // ...
}