//package com.pluralsight.conferencedemo.services;
//
//import com.pluralsight.conferencedemo.models.VehicleCategoryModel;
//import com.pluralsight.conferencedemo.models.VehicleTaxDto;
//import com.pluralsight.conferencedemo.models.VehicleTaxModel;
//import com.pluralsight.conferencedemo.models.VehicleTypeModel;
//import com.pluralsight.conferencedemo.repositories.VehicleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service("vehicleTaxService")
//public class VehicleTaxServiceImpl implements VehicleTaxService {
////    private VehicleRepository repository;
////
////    @Autowired
////    public VehicleTaxServiceImpl(VehicleRepository repository) {
////        this.repository = repository;
////    }
////
////    public VehicleCategoryModel[] listVehicleCategory(Optional<Long> endingBefore, Optional<Long> startingAfter, Optional<Long> vehicleCategoryId, Long limit) {
////        List<VehicleCategoryModel> categories = this.repository.listVehicleCategories(endingBefore,startingAfter,limit);
////        return categories.toArray(new VehicleCategoryModel[categories.size()]);
////
////    }
////
////    public VehicleTypeModel[] listVehicleType(Optional<Long> endingBefore, Optional<Long> startingAfter, Optional<Long> vehicleCategoryId, Long limit) {
////        List<VehicleTypeModel> types = this.repository.listVehicleType(endingBefore,startingAfter, vehicleCategoryId, limit);
////        if (types == null)
////            return new VehicleTypeModel[0];
////        else
////            return types.toArray(new VehicleTypeModel[types.size()]);
////    }
////
////    public VehicleTaxModel[] listVehicleTax(Optional<Long> endingBefore, Optional<Long> startingAfter, Optional<Long> vehicleCategoryId, Long limit) {
////        List<VehicleTaxModel> types = this.repository.listVehicleTax(endingBefore,startingAfter, vehicleCategoryId, limit);
////        if (types == null)
////            return new VehicleTaxModel[0];
////        else
////            return types.toArray(new VehicleTaxModel[types.size()]);
////    }
////
////    public VehicleTaxDto[] listVehicleTaxSearchSort(Map<String, Object> searchBy, Map<String, Object> sortBy, Integer page, Integer perPage) {
////        List<VehicleTaxDto> duty = this.repository.listVehicleTaxSearchAndSort(searchBy, sortBy);
////        int skip = 0;
////        int take = perPage;
////        if (duty == null)
////            return new VehicleTaxDto[0];
////        else{
////            if (perPage >= 0)
////                skip = (page - 1) * perPage;
////            else
////                take = duty.size();
////            return Arrays.stream(duty.toArray(new VehicleTaxDto[duty.size()])).skip(skip).limit(take).toArray(size -> new VehicleTaxDto[perPage]);
////        }
////
////
////    }
//
////    public double calculateDuty(Long vehicleTypeId, Double cif) {
////        return this.repository.fetchVehicleTaxByTypeId(vehicleTypeId).calculateDuty(cif);
////    }
//}
