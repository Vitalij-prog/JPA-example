package org.vital.consapp;

import org.vital.consapp.dao.Dao;
import org.vital.consapp.dao.DaoFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsoleManager {
    private EntityManagerFactory emf;
    private EntityManager em;

    private EntityType entity;
    private QueryType query;

    public ConsoleManager() {
        emf = Persistence.createEntityManagerFactory("SuperUnit");
        em = emf.createEntityManager();

    }

    /*public void setEntity(EntityType entity) {
        this.entity = entity;
    }

    public void setQuery(QueryType query) {
        this.query = query;
    }

    public void setRules(EntityType entity, QueryType query) {
        this.entity = entity;
        this.query = query;
    }*/



    public Dao<?> getImplementationDao(EntityType entity) {
        return DaoFactory.createDao(em, entity);
    }


    public void begin() {
        if(emf == null && em == null) {
            emf = Persistence.createEntityManagerFactory("SuperUnit");
            em = emf.createEntityManager();
        } else if(emf == null) {
            emf = Persistence.createEntityManagerFactory("SuperUnit");
            em.close();
            em = emf.createEntityManager();
        } else if(em == null) {
            em = emf.createEntityManager();
        }

        em.getTransaction().begin();
    }

    public void end() {
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
