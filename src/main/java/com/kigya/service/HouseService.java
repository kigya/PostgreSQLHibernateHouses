package com.kigya.service;

import com.kigya.entity.Houses;

import java.util.List;

public interface HouseService {
    List<Houses> findAll();
    void addItem(Houses house);
}
