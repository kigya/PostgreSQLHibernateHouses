package com.kigya.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@Log4j2
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        String path = "/Users/kirillborichevskiy/Desktop/HouseStreamAPI/src/main/resources/hibernate.cfg.xml";
        try {
            return new Configuration()
                    .configure(new File(path))
                    .buildSessionFactory();
        } catch (ExceptionInInitializerError ex) {
            log.error("Initial Session Factory creation failed" + ex);
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