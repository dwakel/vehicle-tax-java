package com.pluralsight.conferencedemo.api;

import com.pluralsight.conferencedemo.Request.SearchAndSortRequest;
import com.pluralsight.conferencedemo.models.VehicleCategoryModel;
import com.pluralsight.conferencedemo.models.VehicleTaxDto;
import com.pluralsight.conferencedemo.models.VehicleTaxModel;
import com.pluralsight.conferencedemo.models.VehicleTypeModel;
import com.pluralsight.conferencedemo.services.VehicleTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class VehicleController {
    private final VehicleTaxService taxService;

    @Autowired
    public VehicleController(VehicleTaxService taxService) {
        this.taxService = taxService;
    }

    @GetMapping("VehicleCategories")
    public List<VehicleCategoryModel> listCategories(
            @RequestParam Optional<Long> endingBefore,
            @RequestParam Optional<Long> startingAfter,
            @RequestParam Long limit){

        VehicleCategoryModel[] cat = taxService.listVehicleCategory(endingBefore, startingAfter, null, limit);
        return Arrays.stream(cat).toList();
    }

    @GetMapping("VehicleTypes")
    public List<VehicleTypeModel> listCategories(
            @RequestParam Optional<Long> endingBefore,
            @RequestParam Optional<Long> startingAfter,
            @RequestParam Optional<Long> vehicleCategoryId,
            @RequestParam Long limit){

        VehicleTypeModel[] type = taxService.listVehicleType(endingBefore, startingAfter, vehicleCategoryId, limit);
        return Arrays.stream(type).toList();
    }

    @GetMapping("TaxInformation")
    public List<VehicleTaxModel> listTax(
            @RequestParam Optional<Long> endingBefore,
            @RequestParam Optional<Long> startingAfter,
            @RequestParam Long limit){

        VehicleTaxModel[] type = taxService.listVehicleTax(endingBefore, startingAfter, null, limit);
        return Arrays.stream(type).toList();
    }

    @GetMapping("TaxInformation/SearchSort")
    public List<VehicleTaxDto> listTaxSearchSort(@RequestBody SearchAndSortRequest searchAndSortRequest){

        VehicleTaxDto[] type = taxService.listVehicleTaxSearchSort(searchAndSortRequest.getSearchBy(),
                searchAndSortRequest.getSortBy(),
                searchAndSortRequest.getPage(),
                searchAndSortRequest.getPerPage());
        return Arrays.stream(type).toList();
    }


}
