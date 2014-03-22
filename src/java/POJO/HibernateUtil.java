/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POJO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Mohamed-ITI
 */
public class HibernateUtil {

    
    private static final SessionFactory sessionFactory = getSessionFactory();
    
    
    
    public static SessionFactory getSessionFactory() {
        return  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
}
