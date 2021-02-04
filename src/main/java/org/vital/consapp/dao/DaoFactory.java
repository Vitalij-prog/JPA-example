package org.vital.consapp.dao;

import org.vital.consapp.EntityType;

import javax.persistence.EntityManager;

public class DaoFactory {

    public static Dao<?> createDao(EntityManager em, EntityType type) {
        if(type.equals(EntityType.SUPERMARKET)) {
            return new SupermarketDao(em);
        } else if(type.equals(EntityType.SELLER)) {
            return new SellerDao();
        } else {
            throw new NullPointerException(type.toString() + "not found");
        }
    }
}
