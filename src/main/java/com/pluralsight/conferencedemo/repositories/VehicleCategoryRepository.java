package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.VehicleCategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VehicleCategoryRepository extends JpaRepository<VehicleCategoryModel, Long> {
//    List<VehicleCategoryModel> listVehicleCategories(
//            Optional<Long> EndingBefore,
//            Optional<Long> StartingAfter,
//            Long Limit);
}
