package com.pluralsight.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VehicleTaxDto {
    public VehicleTaxDto(@JsonProperty("id") Long id,
                         @JsonProperty("vehicleTypeId") Long vehicleTypeId,
                         @JsonProperty("vehicleTypeName") String vehicleTypeName,
                         @JsonProperty("vehicleTypeDescription") String vehicleTypeDescription,
                         @JsonProperty("vehicleCategoryId") Long vehicleCategoryId,
                         @JsonProperty("vehicleCategoryName") String vehicleCategoryName,
                         @JsonProperty("vehicleCategoryDescription") String vehicleCategoryDescription,
                         @JsonProperty("importDuty") double importDuty,
                         @JsonProperty("vat") double vat,
                         @JsonProperty("getfundLevy") double getfundLevy,
                         @JsonProperty("nhil") double nhil,
                         @JsonProperty("auLevy") double auLevy,
                         @JsonProperty("ecowasLevy") double ecowasLevy,
                         @JsonProperty("eximLevy") double eximLevy,
                         @JsonProperty("examLevy") double examLevy,
                         @JsonProperty("processingFee") double processingFee,
                         @JsonProperty("specialImportLevy") double specialImportLevy) {
        this.id = id;
        this.vehicleTypeId = vehicleTypeId;
        this.vehicleTypeName = vehicleTypeName;
        this.vehicleTypeDescription = vehicleTypeDescription;
        this.vehicleCategoryId = vehicleCategoryId;
        this.vehicleCategoryName = vehicleCategoryName;
        this.vehicleCategoryDescription = vehicleCategoryDescription;
        this.importDuty = importDuty;
        this.vat = vat;
        this.nhil = nhil;
        this.getfundLevy = getfundLevy;
        this.auLevy = auLevy;
        this.ecowasLevy = ecowasLevy;
        this.eximLevy = eximLevy;
        this.examLevy = examLevy;
        this.processingFee = processingFee;
        this.specialImportLevy = specialImportLevy;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="vehicle_type_id")
    private Long vehicleTypeId;
    @Column(name="vehicle_type_name")
    private String vehicleTypeName;
    @Column(name="vehicle_type_description")
    private String vehicleTypeDescription;
    @Column(name="vehicle_category_id")
    private Long vehicleCategoryId;
    @Column(name="vehicle_category_name")
    private String vehicleCategoryName;
    @Column(name="vehicle_category_description")
    private String vehicleCategoryDescription;
    @Column(name="import_duty")
    private double importDuty;
    @Column(name="vat")
    private double vat;
    @Column(name="nhil")
    private double nhil;
    @Column(name="getfund_levy")
    private double getfundLevy;
    @Column(name="au_levy")
    private double auLevy;
    @Column(name="ecowas_levy")
    private double ecowasLevy;
    @Column(name="exim_levy")
    private double eximLevy;
    @Column(name="exam_levy")
    private double examLevy;
    @Column(name="processing_fee")
    private double processingFee;
    @Column(name="special_import_duty")
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
