package com.pluralsight.conferencedemo.models;

public class VehicleTaxDto {
    private Long id;
    private Long vehicleTypeId;
    private String vehicleTypeName;
    private String vehicleTypeDescription;
    private Long vehicleCategoryId;
    private String vehicleCategoryName;
    private String vehicleCategoryDescription;
    private double importDuty;
    private double vat;
    private double nhil;
    private double getfundLevy;
    private double auLevy;
    private double ecowasLevy;
    private double eximLevy;
    private double examLevy;
    private double processingFee;
    private double specialImportLevy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Long vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    public void setVehicleTypeName(String vehicleTypeName) {
        this.vehicleTypeName = vehicleTypeName;
    }

    public String getVehicleTypeDescription() {
        return vehicleTypeDescription;
    }

    public void setVehicleTypeDescription(String vehicleTypeDescription) {
        this.vehicleTypeDescription = vehicleTypeDescription;
    }

    public Long getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(Long vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    public String getVehicleCategoryDescription() {
        return vehicleCategoryDescription;
    }

    public void setVehicleCategoryDescription(String vehicleCategoryDescription) {
        this.vehicleCategoryDescription = vehicleCategoryDescription;
    }

    public double getImportDuty() {
        return importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getNhil() {
        return nhil;
    }

    public void setNhil(double nhil) {
        this.nhil = nhil;
    }

    public double getGetfundLevy() {
        return getfundLevy;
    }

    public double getAuLevy() {
        return auLevy;
    }

    public void setAuLevy(double auLevy) {
        this.auLevy = auLevy;
    }

    public double getEcowasLevy() {
        return ecowasLevy;
    }

    public void setEcowasLevy(double ecowasLevy) {
        this.ecowasLevy = ecowasLevy;
    }

    public double getEximLevy() {
        return eximLevy;
    }

    public void setEximLevy(double eximLevy) {
        this.eximLevy = eximLevy;
    }

    public double getExamLevy() {
        return examLevy;
    }

    public void setExamLevy(double examLevy) {
        this.examLevy = examLevy;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public double getSpecialImportLevy() {
        return specialImportLevy;
    }

    public void setSpecialImportLevy(double specialImportLevy) {
        this.specialImportLevy = specialImportLevy;
    }

    public double calculteVat(double cif){
        return (cif + cif*getImportDuty() + cif + nhil + cif * getGetfundLevy());
    }

    public double calculateDuty(double cif){
        return cif * (getImportDuty() + getNhil() + getGetfundLevy() + getAuLevy() + getEcowasLevy()
                + getEximLevy() + getExamLevy() + getProcessingFee() + getSpecialImportLevy());
    }
}
