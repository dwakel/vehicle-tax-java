package com.pluralsight.conferencedemo.models;

public class VehicleTypeModel {
    private Long id;
    private Long vehicleCategoryId;
    private String ShortName;
    private String description;

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
}
