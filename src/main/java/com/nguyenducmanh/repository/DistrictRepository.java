package com.nguyenducmanh.repository;

import com.nguyenducmanh.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Long> {
    List<District> findAllByCity_Id(long id);
}
