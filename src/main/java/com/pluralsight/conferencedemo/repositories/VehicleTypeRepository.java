package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.VehicleTypeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

//@EnableJpaRepositories
@Repository("vehicleTypeRepository")
public interface VehicleTypeRepository extends JpaRepository<VehicleTypeModel, Long> {
}
