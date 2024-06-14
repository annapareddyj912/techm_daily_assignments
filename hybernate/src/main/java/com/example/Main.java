package com.example;

import com.example.entity.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student("John Doe", 25);

        // Get a session from the SessionFactory
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        // Begin a transaction
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            
            // Save the student object
            session.save(student);
            
            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        // Shutdown the SessionFactory
        HibernateUtil.shutdown();
    }
}
