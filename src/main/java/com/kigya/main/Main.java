package com.kigya.main;

import com.kigya.utils.HibernateUtil;
import lombok.extern.log4j.Log4j2;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.transaction.*;
import java.util.List;

@Log4j2
public class Main {


    public static void main(String[] args) throws SystemException {


        Transaction tx = null;
        //Get the session object.
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        try{
            tx = session.beginTransaction();
            List students =
                    session.createQuery("FROM Houses ").list();
            for(Object student : students){
                System.out.println(student.toString());
            }
            tx.commit();
        }catch (HibernateException e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }




    }

