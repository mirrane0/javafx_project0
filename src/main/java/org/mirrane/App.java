package org.mirrane;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.mirrane.model.HibernateUtil;
import org.mirrane.model.StudentEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int studentId = (int) session.save(new StudentEntity("mirrane","hajar",19));
        transaction.commit();
        session.close();
    }
}
