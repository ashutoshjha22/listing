package com.listing.logo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.listing.logo.model.Salon;
import com.listing.logo.repo.SalonRepository;
import com.listing.logo.service.SalonService;

@Service
public class SalonServiceImpl implements SalonService {

    @Autowired
    private SalonRepository salonRepository;

    @Override
    public List<Salon> getAllSalons() {
        return salonRepository.findAll();
    }

    @Override
    public Salon getSalonById(Long id) {
        Optional<Salon> salon = salonRepository.findById(id);
        return salon.orElse(null);
    }

    @Override
    public Salon createSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    @Override
    public Salon updateSalon(Long id, Salon salon) {
        Optional<Salon> existingSalon = salonRepository.findById(id);
        if (existingSalon.isPresent()) {
            Salon s = existingSalon.get();
            s.setDescription(salon.getDescription());
            s.setCompanyWebsite(salon.getCompanyWebsite());
            s.setWhatsappNumber(salon.getWhatsappNumber());
            s.setListingLogo(salon.getListingLogo());
            return salonRepository.save(s);
        }
        return null;
    }

    @Override
    public void deleteSalon(Long id) {
        salonRepository.deleteById(id);
    }
}
