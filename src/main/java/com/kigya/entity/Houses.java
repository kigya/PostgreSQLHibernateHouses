package com.kigya.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Houses {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Basic
    @Column(name = "number", nullable = false)
    private short number;

    @Basic
    @Column(name = "area", nullable = false, precision = 3)
    private BigDecimal area;

    @Basic
    @Column(name = "floors", nullable = false)
    private short floors;

    @Basic
    @Column(name = "rooms", nullable = true)
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
        return "Houses{" +
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

    @Override
    public int hashCode() {
        return Objects.hash(id, number, area, floors, rooms,
                street, serviceLife, type);
    }
}
