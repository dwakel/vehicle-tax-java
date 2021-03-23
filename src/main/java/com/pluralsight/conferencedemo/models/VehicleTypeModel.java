package com.pluralsight.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

public class VehicleTypeModel {
    public VehicleTypeModel(@JsonProperty("id") Long id,
                            @JsonProperty("vehicleCategoryId") Long vehicleCategoryId,
                            @JsonProperty("shortName") String shortName,
                            @JsonProperty("description") String description) {
        this.id = id;
        this.vehicleCategoryId = vehicleCategoryId;
        ShortName = shortName;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="vehicle_category_id")
    private Long vehicleCategoryId;

    @Column(name="short_name")
    private String ShortName;

    @Column(name="description")
    private String description;

    @ManyToOne
    private VehicleCategoryModel category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(Long vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VehicleCategoryModel getCategory() {
        return category;
    }

    public void setCategory(VehicleCategoryModel category) {
        this.category = category;
    }
}
