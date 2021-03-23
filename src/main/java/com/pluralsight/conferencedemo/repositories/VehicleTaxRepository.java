package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.VehicleTaxModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTaxRepository extends JpaRepository<VehicleTaxModel, Long> {
}
