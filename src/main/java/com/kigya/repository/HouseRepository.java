package com.kigya.repository;

import com.kigya.entity.House;
import com.kigya.exception.RepositoryException;
import com.kigya.utils.HibernateUtil;
import lombok.SneakyThrows;
import org.hibernate.Session;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;


import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    @SneakyThrows
    public List<House> selectAll() {
        List<House> house = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<House> criteria = builder.createQuery(House.class);
            criteria.from(House.class);
            List<House> houses = session.createQuery(criteria).getResultList();
            return houses;
        }
        catch (Exception ex) {
            throw new RepositoryException(ex, "Error occured while selecting all");
        }
    }
}
