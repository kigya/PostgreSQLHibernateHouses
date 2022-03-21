package com.kigya.service.impl;

import com.kigya.entity.House;
import com.kigya.repository.HouseRepository;

import java.util.List;

public class HouseServiceImpl {
    HouseRepository repository = new HouseRepository();
    public List<House> findAll() {
        return repository.selectAll();
    }
}
