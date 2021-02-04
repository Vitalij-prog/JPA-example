package org.vital;

import org.vital.entity.Seller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "SuperUnit" );
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select s from Seller s", Seller.class);
        List<Seller> list = query.getResultList();

        entityManager.getTransaction().commit();
        emf.close();
        entityManager.close();


        for(Seller s: list) {
            System.out.println(s);
        }
    }
}
