package com.linkdoan.backend.repository.common;

import com.linkdoan.backend.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, String> {
    List<District> findAllByProvinceCityId(String provinceCityId);
}