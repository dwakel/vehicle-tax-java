package com.pluralsight.conferencedemo.api;

import com.pluralsight.conferencedemo.Request.SearchAndSortRequest;
import com.pluralsight.conferencedemo.models.VehicleCategoryModel;
import com.pluralsight.conferencedemo.models.VehicleTaxDto;
import com.pluralsight.conferencedemo.models.VehicleTaxModel;
import com.pluralsight.conferencedemo.models.VehicleTypeModel;
import com.pluralsight.conferencedemo.repositories.VehicleCategoryRepository;
import com.pluralsight.conferencedemo.repositories.VehicleTaxRepository;
import com.pluralsight.conferencedemo.repositories.VehicleTypeRepository;
//import com.pluralsight.conferencedemo.services.VehicleTaxService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Vehicle")
public class VehicleController {

    //private final VehicleTaxService taxService;

    @Autowired
    private VehicleCategoryRepository vehicleCategoryRepository;

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    @Autowired
    private VehicleTaxRepository vehicleTaxRepository;

//    @Autowired
//    public VehicleController(VehicleTaxService taxService) {
//        this.taxService = taxService;
//    }

    @PostMapping
    @RequestMapping("Category")
    @ResponseStatus(HttpStatus.CREATED)
    public VehicleCategoryModel createCategory(@RequestBody VehicleCategoryModel category){
        //In actual sense a proper validation will be needed before just storing in table
        return vehicleCategoryRepository.saveAndFlush(category);
    }

    @RequestMapping(value = "Category/{id}", method = RequestMethod.PUT)
    public VehicleCategoryModel putCategory(@PathVariable("id") Long id, @RequestBody VehicleCategoryModel category){
        //In actual sense a proper validation will be needed before just storing in table
        VehicleCategoryModel oldData = vehicleCategoryRepository.getOne(id);
        BeanUtils.copyProperties(category, oldData, "id");
        return vehicleCategoryRepository.saveAndFlush(oldData);
    }

    @GetMapping
    @RequestMapping("Category/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VehicleCategoryModel getCategory(@PathVariable Long id){
        return vehicleCategoryRepository.getOne(id);
    }

    @GetMapping
    @RequestMapping("Categories")
    @ResponseStatus(HttpStatus.OK)
    public List<VehicleCategoryModel> listCategory(){
        return vehicleCategoryRepository.findAll();
    }

    @GetMapping
    @RequestMapping("Type/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VehicleTypeModel getType(@PathVariable Long id){
        return vehicleTypeRepository.getOne(id);
    }

    @GetMapping
    @RequestMapping("Types")
    @ResponseStatus(HttpStatus.OK)
    public List<VehicleTypeModel> listTypes(){
        return vehicleTypeRepository.findAll();
    }

//    @GetMapping("Tax/{typeId}")
//    public VehicleTypeModel getTax(@PathVariable Long typeId){
//        return vehicleTaxRepository.findOne();
//    }

    @GetMapping
    @RequestMapping("Taxes")
    @ResponseStatus(HttpStatus.OK)
    public List<VehicleTaxModel> listTaxes(@PathVariable Long id){
        return vehicleTaxRepository.findAll();
    }

    @GetMapping
    @RequestMapping("Type/{typeId}/CalculateDuty")
    @ResponseStatus(HttpStatus.OK)
    public Double calculateDuty(@PathVariable Long typeId, @RequestParam Double cif){
         return vehicleTaxRepository.getOne(typeId).calculateDuty(cif);
    }

//    @GetMapping("VehicleCategories")
//    public List<VehicleCategoryModel> listCategories(
//            @RequestParam Optional<Long> endingBefore,
//            @RequestParam Optional<Long> startingAfter,
//            @RequestParam Long limit){
//
//        VehicleCategoryModel[] cat = taxService.listVehicleCategory(endingBefore, startingAfter, null, limit);
//        return Arrays.stream(cat).toList();
//    }
//
//    @GetMapping("VehicleTypes")
//    public List<VehicleTypeModel> listCategories(
//            @RequestParam Optional<Long> endingBefore,
//            @RequestParam Optional<Long> startingAfter,
//            @RequestParam Optional<Long> vehicleCategoryId,
//            @RequestParam Long limit){
//
//        VehicleTypeModel[] type = taxService.listVehicleType(endingBefore, startingAfter, vehicleCategoryId, limit);
//        return Arrays.stream(type).toList();
//    }
//
//    @GetMapping("TaxInformation")
//    public List<VehicleTaxModel> listTax(
//            @RequestParam Optional<Long> endingBefore,
//            @RequestParam Optional<Long> startingAfter,
//            @RequestParam Long limit){
//
//        VehicleTaxModel[] type = taxService.listVehicleTax(endingBefore, startingAfter, null, limit);
//        return Arrays.stream(type).toList();
//    }
//
//    @GetMapping("TaxInformation/SearchSort")
//    public List<VehicleTaxDto> listTaxSearchSort(@RequestBody SearchAndSortRequest searchAndSortRequest){
//
//        VehicleTaxDto[] type = taxService.listVehicleTaxSearchSort(searchAndSortRequest.getSearchBy(),
//                searchAndSortRequest.getSortBy(),
//                searchAndSortRequest.getPage(),
//                searchAndSortRequest.getPerPage());
//        return Arrays.stream(type).toList();
//    }


}
