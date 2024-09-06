package com.listing.logo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listing.logo.model.Salon;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Long> {
}
