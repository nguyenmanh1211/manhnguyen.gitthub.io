package com.nguyenducmanh.controller;

import com.nguyenducmanh.entity.City;
import com.nguyenducmanh.entity.District;
import com.nguyenducmanh.entity.Manager;
import com.nguyenducmanh.entity.Room;
import com.nguyenducmanh.service.CityService;
import com.nguyenducmanh.service.DistricService;
import com.nguyenducmanh.service.ManagerService;
import com.nguyenducmanh.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    CityService cityService;
    RoomService roomService;
    ManagerService managerService;
    DistricService districService;

    public HomeController(CityService cityService, RoomService roomService, ManagerService managerService, DistricService districService) {
        this.cityService = cityService;
        this.roomService = roomService;
        this.managerService = managerService;
        this.districService = districService;
    }

    @GetMapping("/managers")
    public List<Manager> getAllManagers(){
        return managerService.findAll();
    }
    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomService.findAll();
    }
    @GetMapping("/citys")
    public List<City> getAllCity(){
        return cityService.findAll();
    }
    @GetMapping("/district")
    public List<District> getDistrictsByCity(@RequestParam String cityName)
    {
        return districService.findDistrictByCity(cityName);
    }

}
