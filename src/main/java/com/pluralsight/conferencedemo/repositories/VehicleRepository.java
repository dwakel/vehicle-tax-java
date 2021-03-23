//package com.pluralsight.conferencedemo.repositories;
//
//import com.pluralsight.conferencedemo.models.VehicleCategoryModel;
//import com.pluralsight.conferencedemo.models.VehicleTaxDto;
//import com.pluralsight.conferencedemo.models.VehicleTaxModel;
//import com.pluralsight.conferencedemo.models.VehicleTypeModel;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.lang.Nullable;
//import org.springframework.scheduling.config.Task;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//public interface VehicleRepository extends JpaRepository<VehicleCategoryModel, Long> {
//
//    List<VehicleTypeModel> listVehicleType(
//            Optional<Long> EndingBefore,
//            Optional<Long> StartingAfter,
//            Optional<Long> VehicleCategoryId,
//            Long Limit);
//    List<VehicleTaxModel> listVehicleTax(
//            Optional<Long> EndingBefore,
//            Optional<Long> StartingAfter,
//            Optional<Long> VehicleCategoryId,
//            Long Limit);
//    List<VehicleTaxDto> listVehicleTaxSearchAndSort(
//            Map<String, Object> SearchBy,
//            Map<String, Object> SortBy);
//
//    VehicleTaxDto fetchVehicleTaxByTypeId(
//            Long VehicleTypeId);
//}
