package com.petometry.petservice.repository;

import com.petometry.petservice.repository.model.PetShop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface PetShopRepository extends JpaRepository<PetShop, Long> {
    Optional<PetShop> findByOwnerIdAndValidFor(String owner_id, LocalDate validFor);
}