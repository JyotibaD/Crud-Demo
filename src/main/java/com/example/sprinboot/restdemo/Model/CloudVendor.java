package com.example.sprinboot.restdemo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    @Id
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String phoneNumber;

    public CloudVendor(){

    }

    public CloudVendor(String vendorID,String vendorName,String vendorAddress,String phoneNumber){
        this.vendorID=vendorID;
        this.vendorName=vendorName;
        this.vendorAddress=vendorAddress;
        this.phoneNumber=phoneNumber;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
