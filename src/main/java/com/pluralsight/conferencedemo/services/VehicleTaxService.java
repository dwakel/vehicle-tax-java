package com.pluralsight.conferencedemo.services;

import com.pluralsight.conferencedemo.models.VehicleCategoryModel;
import com.pluralsight.conferencedemo.models.VehicleTaxDto;
import com.pluralsight.conferencedemo.models.VehicleTaxModel;
import com.pluralsight.conferencedemo.models.VehicleTypeModel;

import java.util.Map;
import java.util.Optional;

public interface VehicleTaxService {
    VehicleCategoryModel[] listVehicleCategory(Optional<Long> endingBefore,
                                               Optional<Long> startingAfter,
                                               Optional<Long> vehicleCategoryId,
                                               Long limit);

    VehicleTypeModel[] listVehicleType(Optional<Long> endingBefore,
                                       Optional<Long> startingAfter,
                                       Optional<Long> vehicleCategoryId,
                                       Long limit);

    VehicleTaxModel[] listVehicleTax(Optional<Long> endingBefore,
                                     Optional<Long> startingAfter,
                                     Optional<Long> vehicleCategoryId,
                                     Long limit);

    VehicleTaxDto[] listVehicleTaxSearchSort(Map<String, Object> searchBy,
                                             Map<String, Object> sortBy,
                                             Integer page,
                                             Integer perPage);

    double calculateDuty(Long vehicleTypeId, Double cif);
}
