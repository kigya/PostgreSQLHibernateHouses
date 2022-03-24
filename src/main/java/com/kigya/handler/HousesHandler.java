package com.kigya.handler;

import com.kigya.entity.Houses;
import com.kigya.service.impl.HouseServiceImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.Range;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HousesHandler {

    private static final String SAVING_ERROR_TEXT =
            "Error with saving database contents to file";
    private static final HouseServiceImpl service = new HouseServiceImpl();
    private static final List<Houses> houses = service.findAll();

    @SneakyThrows
    public static void saveToFileCurrentDatabase() {
        String str = String.valueOf(houses);
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("dbContents.txt"))) {
            writer.write(str.replace("},", "}"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(SAVING_ERROR_TEXT, e);
        }

        log.info("Current database contents saved to file");
    }

    @SneakyThrows
    public static void saveToFileFilteredByRooms(int rooms) {

        StringBuilder str = new StringBuilder();
        for (Houses house : houses) {
            if (house.getRooms() != null && house.getRooms() == rooms) {
                str.append(house);
            }
        }

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("roomsFilter.txt"))) {
            writer.write(str.toString().replace("},", "}"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(SAVING_ERROR_TEXT, e);
        }

        log.info("Current database contents filtered by rooms saved to file");
    }

    @SneakyThrows
    public static void saveToFileFilteredByRoomsStreamAPI(int rooms) {

        String str = houses
                .stream()
                .filter(house -> house.getRooms() != null && house.getRooms() == rooms)
                .map(String::valueOf).collect(Collectors.joining());

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("roomsFilterStreamAPI.txt"))) {
            writer.write(str.replace("},", "}"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(SAVING_ERROR_TEXT, e);
        }

        log.info("Current database contents filtered by rooms StreamAPI saved to file");
    }

    @SneakyThrows
    public static void saveToFileFilteredByFloorsStreamAPI(int rooms, Range<Integer> rangeFloor) {

        String str = houses
                .stream()
                .filter(house -> house.getRooms() != null &&
                        house.getRooms() == rooms &&
                rangeFloor
                        .contains((int) house
                                .getFloors()))
                .map(String::valueOf)
                .collect(Collectors.joining());

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("floorFilterStreamAPI.txt"))) {
            writer.write(str.replace("},", "}"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(SAVING_ERROR_TEXT, e);
        }

        log.info("Current database contents filtered by floors Stream API saved to file");
    }

    @SneakyThrows
    public static void saveToFileFilteredByFloors(int rooms, Range<Integer> rangeFloor) {

        StringBuilder str = new StringBuilder();

        for (Houses house : houses) {
            if (house.getRooms() != null && house.getRooms() == rooms &&
                    rangeFloor.contains((int) house.getFloors())) {
                str.append(house);
            }
        }
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("floorFilter.txt"))) {
            writer.write(str.toString().replace("},", "}"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(SAVING_ERROR_TEXT, e);
        }

        log.info("Current database contents filtered by floors saved to file");
    }

    @SneakyThrows
    public static void saveToFileFilteredByArea(double area) {

        StringBuilder str = new StringBuilder();

        for (Houses house : houses) {
            if (house.getArea() >= area) {
                str.append(house);
            }
        }

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("areaFilter.txt"))) {
            writer.write(str.toString().replace("},", "}"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(SAVING_ERROR_TEXT, e);
        }

        log.info("Current database contents filtered by area saved to file");
    }

    @SneakyThrows
    public static void saveToFileFilteredByAreaStreamAPI(double area) {

        String str = houses.
                stream()
                .filter(house -> house.getArea() >= area)
                .map(String::valueOf).collect(Collectors.joining());

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("areaFilterStreamAPI.txt"))) {
            writer.write(str.replace("},", "}"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(SAVING_ERROR_TEXT, e);
        }

        log.info("Current database contents filtered by area Stream API saved to file");
    }
}


