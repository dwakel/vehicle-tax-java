package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.VehicleTypeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleTypeModel, Long> {
}
