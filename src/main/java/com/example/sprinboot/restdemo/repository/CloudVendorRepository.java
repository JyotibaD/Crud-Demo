package com.example.sprinboot.restdemo.repository;

import com.example.sprinboot.restdemo.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {

}
