package com.kigya.main;

import com.kigya.handler.HousesHandler;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.Range;

@Log4j2
public class Main {

    public static void main(String[] args) {
        HousesHandler.addNewHouse();
        HousesHandler.saveToFileCurrentDatabase();
        HousesHandler.saveToFileFilteredByRooms(9);
        HousesHandler.saveToFileFilteredByRoomsStreamAPI(9);
        HousesHandler.saveToFileFilteredByFloors(4, Range.between(1, 3));
        HousesHandler.saveToFileFilteredByFloorsStreamAPI(4, Range.between(1, 3));
        HousesHandler.saveToFileFilteredByArea(100);
        HousesHandler.saveToFileFilteredByAreaStreamAPI(100);
    }
}

