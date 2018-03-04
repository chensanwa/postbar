package com.postbar.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestJdbc {

    @Test
    public void testJdbc(){

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setId(2);
        user.setName("Bob");
        user.setGender("boy");
        user.setAddress("NewYork");
        user.setPassword("123456");

        session.save(user);
        transaction.commit();
        session.close();
    }
}
