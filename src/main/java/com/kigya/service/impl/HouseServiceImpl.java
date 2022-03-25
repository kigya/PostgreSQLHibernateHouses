package com.kigya.service.impl;

import com.kigya.entity.Houses;
import com.kigya.repository.HouseRepository;
import com.kigya.service.HouseService;

import java.util.List;

public class HouseServiceImpl implements HouseService {
    HouseRepository repository = new HouseRepository();

    @Override
    public List<Houses> findAll() {
        return repository.findAll();
    }

    @Override
    public void addItem(Houses house) {
        repository.addItem(house);
    }
}
