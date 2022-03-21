package com.kigya.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .configure(new File("/Users/kirillborichevskiy/Desktop/HouseStreamAPI/src/main/resources/hibernate.cfg.xml"))
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial Session Factory creation failed" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        AtomicBoolean isStarted = new AtomicBoolean(false);
        if (isStarted.compareAndSet(false, true)) {
            buildSessionFactory();
        }
        return sessionFactory;
    }

    public static void close() {
        getSessionFactory().close();
    }
}