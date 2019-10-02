package com.nguyenducmanh.service;

import com.nguyenducmanh.entity.District;

import java.util.List;

public interface DistricService {
    List<District> findDistrictByCity(String cityName);
}
