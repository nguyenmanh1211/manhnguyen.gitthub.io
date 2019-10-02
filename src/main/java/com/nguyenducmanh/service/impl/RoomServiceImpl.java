package com.nguyenducmanh.service.impl;


import com.nguyenducmanh.entity.Room;
import com.nguyenducmanh.repository.RoomRepository;
import com.nguyenducmanh.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }
}
