package com.pluralsight.conferencedemo.models;

public class VehicleTaxModel {
    private Long id;
    private Long vehicleTypeId;
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
}
