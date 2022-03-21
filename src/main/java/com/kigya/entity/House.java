package com.kigya.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private BigInteger id;

    @Column(name = "number", nullable = false)
    private short number;

    @Column(name = "area", nullable = false, precision = 3)
    private BigDecimal area;

    @Column(name = "floors", nullable = false)
    private short floors;

    @Basic
    @Column(name = "rooms", nullable = true)
    private Short rooms;

    @Column(name = "street", nullable = false, length = 30)
    private String street;

    @Column(name = "service_life", nullable = false)
    private short serviceLife;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(id, house.id) && number == house.number && floors == house.floors &&
                serviceLife == house.serviceLife && Objects.equals(area, house.area) &&
                Objects.equals(rooms, house.rooms) && Objects.equals(street, house.street) &&
                Objects.equals(type, house.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, area,
                floors, rooms, street, serviceLife, type);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", number=" + number +
                ", area=" + area +
                ", floors=" + floors +
                ", rooms=" + rooms +
                ", street='" + street + '\'' +
                ", serviceLife=" + serviceLife +
                ", type='" + type + '\'' +
                '}';
    }
}
