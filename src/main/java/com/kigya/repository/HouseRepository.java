package com.kigya.repository;

import com.kigya.entity.Houses;
import com.kigya.exception.RepositoryException;
import com.kigya.utils.HibernateUtil;
import lombok.SneakyThrows;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import javax.persistence.Lob;
import javax.persistence.Transient;
import java.util.List;

public class HouseRepository {

    @SneakyThrows
    @Transient
    @Lob
    public List<Houses> findAll() {
        Transaction tx = null;
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        List<Houses> houses;
        try {
            tx = session.beginTransaction();
            houses = session.createQuery("FROM Houses").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw new RepositoryException(e, "Initialization transaction error!");
        } catch (Exception e) {
            throw new RepositoryException(e, "House Repository error!");
        } finally {
            session.close();
        }
        return houses;
    }

    @SneakyThrows
    public void addItem(Houses house) {
        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(house);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw new RepositoryException(e, "Initialization transaction error!");
        } catch (Exception e) {
            throw new RepositoryException(e, "House Repository error!");
        }
    }
}
