package com.listing.logo.service;


import java.util.List;

import com.listing.logo.model.Salon;

public interface SalonService {
    List<Salon> getAllSalons();
    Salon getSalonById(Long id);
    Salon createSalon(Salon salon);
    Salon updateSalon(Long id, Salon salon);
    void deleteSalon(Long id);
}
