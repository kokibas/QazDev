package com.SpringQazDev.SpringWebApp.service;

import com.SpringQazDev.SpringWebApp.Entity.Documents;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;


@Service
public class SaveService {

    private SessionFactory sessionFactory;

    public SaveService() {

        sessionFactory = new Configuration().configure().addAnnotatedClass(Documents.class).buildSessionFactory();

    }

    public void save(String text) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Documents documents = new Documents();
        documents.setContent(text);
        Long id = (Long) session.save(documents);
        System.out.println(id);
        transaction.commit();
        session.close();
    }





}
