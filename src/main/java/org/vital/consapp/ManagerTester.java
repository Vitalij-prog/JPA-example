package org.vital.consapp;


import org.vital.consapp.dao.Dao;
import org.vital.entity.Supermarket;

import java.util.List;

public class ManagerTester {
    public static void main(String[] args) {

        ConsoleManager manager = new ConsoleManager();

        Dao<Supermarket> implDao = (Dao<Supermarket>) manager.getImplementationDao(EntityType.SUPERMARKET);

        Supermarket s = new Supermarket();
       /* s.setName("new market");
        s.setCity("Brooklyn");
        s.setStreet("new street");
        s.setHouseNumber(20);*/

        manager.begin();

       /* s = implDao.get(4);

        s.setName("Cool market");

        implDao.update(s);*/

        //implDao.delete(5);

        List<Supermarket> list = implDao.getList();

        manager.end();

        for(Supermarket supermarket : list) {
            System.out.println(supermarket);
        }
    }
}
