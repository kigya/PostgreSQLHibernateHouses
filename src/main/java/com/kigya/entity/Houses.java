package com.kigya.entity;

import com.kigya.exception.*;
import com.kigya.valid.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Houses implements Serializable, Cloneable, Comparable<Houses> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Basic
    @Column(name = "number", nullable = false)
    private short number;

    @Basic
    @Column(name = "area", nullable = false, precision = 3)
    private Double area;

    @Basic
    @Column(name = "floors", nullable = false)
    private short floors;

    @Basic
    @Column(name = "rooms")
    private Short rooms;

    @Basic
    @Column(name = "street", nullable = false, length = 30)
    private String street;

    @Basic
    @Column(name = "service_life", nullable = false)
    private short serviceLife;

    @Basic
    @Column(name = "type", nullable = false, length = 50)
    private String type;

    public Houses(short number, Double area, short floors,
                  Short rooms, String street, short serviceLife, String type) {
        setNumber(number);
        setArea(area);
        setFloors(floors);
        setRooms(rooms);
        setStreet(street);
        setServiceLife(serviceLife);
        setType(type);
    }

    public Houses(short number, Double area, short floors,
                  String street, short serviceLife, String type) {
        setNumber(number);
        setArea(area);
        setFloors(floors);
        setStreet(street);
        setServiceLife(serviceLife);
        setType(type);
    }

    @SneakyThrows
    public void setNumber(short number) {
        if (ValidNumber.isValidNumber(number)) {
            this.number = number;
        } else {
            throw new HouseNumberException("Incorrect house number!");
        }
    }

    @SneakyThrows
    public void setArea(Double area) {
        if (ValidArea.isValidArea(area)) {
            this.area = area;
        } else {
            throw new HouseAreaException("Incorrect house area!");
        }
    }

    @SneakyThrows
    public void setFloors(short floors) {
        if (ValidFloors.isValidFloors(floors)) {
            this.floors = floors;
        } else {
            throw new HouseFloorsException("Incorrect house floors!");
        }
    }

    @SneakyThrows
    public void setRooms(Short rooms) {
        if (ValidRooms.isValidRooms(rooms)) {
            this.rooms = rooms;
        } else {
            throw new HouseRoomsException("Incorrect house rooms!");
        }
    }

    @SneakyThrows
    public void setStreet(String street) {
        if (ValidStreet.isValidStreet(street)) {
            this.street = street;
        } else {
            throw new HouseStreetException("Incorrect house street!");
        }
    }

    @SneakyThrows
    public void setServiceLife(short serviceLife) {
        if (ValidServiceLife.isValidServiceLife(serviceLife)) {
            this.serviceLife = serviceLife;
        } else {
            throw new HouseServiceLifeException("Incorrect house service life!");
        }
    }

    @SneakyThrows
    public void setType(String type) {
        if (ValidType.isValidType(type)) {
            this.type = type;
        } else {
            throw new HouseTypeException("Incorrect house type!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Houses houses = (Houses) o;
        return id == houses.id && number == houses.number &&
                floors == houses.floors && serviceLife == houses.serviceLife &&
                Objects.equals(area, houses.area) && Objects.equals(rooms, houses.rooms) &&
                Objects.equals(street, houses.street) && Objects.equals(type, houses.type);
    }

    @Override
    public String toString() {
        return "\n\nHouses{" +
                "id=" + id +
                ", \n number=" + number +
                ", \n area=" + area +
                ", \n floors=" + floors +
                ", \n rooms=" + rooms +
                ", \n street='" + street + '\'' +
                ", \n serviceLife=" + serviceLife +
                ", \n type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, area, floors, rooms,
                street, serviceLife, type);
    }

    @Override
    public Houses clone() {
        try {
            return (Houses) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(@NotNull Houses o) {
        return (int) (this.id - o.getId());
    }
}
