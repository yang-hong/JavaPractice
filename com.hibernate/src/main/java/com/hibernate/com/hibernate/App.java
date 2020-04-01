package com.hibernate.com.hibernate;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.io.Serializable;

//import javax.transaction.Transaction;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("Emphmp.xml");
        System.out.println("Configuration Object Created Successfully");
        SessionFactory sf = cfg.buildSessionFactory();
        System.out.println("Session Factory Object is Created");
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Emp e = new Emp();
        e.setId("201");
        e.setName("Yang Hong");
        Set<PhoneNumber> set = new HashSet<PhoneNumber>();
        Map<Integer, Set<PhoneNumber>> map = new HashMap<Integer,Set<PhoneNumber>>();
        PhoneNumber ph1 = new PhoneNumber();
        ph1.setPid("301");
        ph1.setNetwork("IDEA");
        ph1.setPhonenumber("9900003333");
        set.add(ph1);
        map.put(1, set);
        PhoneNumber ph2 = new PhoneNumber();
        ph2.setPid("304");
        ph2.setNetwork("HAHA");
        ph2.setPhonenumber("8879999809");
        set.add(ph2);
        e.setPhoneno(map);
        s.persist(e);
        tx.commit();
        s.close();
        sf.close();
    }
}
