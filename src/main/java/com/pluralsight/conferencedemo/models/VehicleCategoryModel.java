package com.pluralsight.conferencedemo.models;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity(name = "vehicle_category")
public class VehicleCategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="short_name")
    private String shortName;

    @Column(name="short_name")
    private String description;

    @OneToMany
    @JoinTable(
            name = "vehicle_category",
            joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "type_id", referencedColumnName = "id")
    )
    private List<VehicleTypeModel> vehicleTypes;

    public VehicleCategoryModel(@JsonProperty("id") Long id,
                                @JsonProperty("shortName") String shortName,
                                @JsonProperty("description") String description, List<VehicleTypeModel> vehicleTypes){
        this.id = id;
        this.shortName = shortName;
        this.description = description;
        this.vehicleTypes = vehicleTypes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<VehicleTypeModel> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypeModel> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
