package org.vital.consapp.dao;

import org.vital.consapp.QueryType;
import org.vital.entity.Seller;
import org.vital.entity.Supermarket;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class SupermarketDao implements Dao<Supermarket> {
    EntityManager em;

    public SupermarketDao(EntityManager em) {
        this.em = em;
    }

    public void add(Supermarket ob) {
        em.persist(ob);
    }

    public Supermarket get(int id) {
        /*Query query = em.createQuery("select s from Supermarket s where s.id = ?", Seller.class);
        query.setParameter(1, id);*/

        return em.find(Supermarket.class, id);
    }

    public void update(Supermarket ob) {
        em.merge(ob);
    }

    public void delete(int id) {
        em.remove(get(id));
    }

    public List<Supermarket> getList() {
        Query query = em.createQuery("select s from Supermarket s", Supermarket.class);
        List<Supermarket> list = query.getResultList();
        return list;
    }

}
