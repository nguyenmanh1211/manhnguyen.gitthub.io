package com.nguyenducmanh.service.impl;

import com.nguyenducmanh.entity.Manager;
import com.nguyenducmanh.repository.ManagerRepository;
import com.nguyenducmanh.service.ManagerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    ManagerRepository managerRepository;

    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }
}
