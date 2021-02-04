package org.vital.consapp.dao;

import java.util.List;

public interface Dao<T> {

    void add(T ob);
    T get(int id);
    void update(T ob);
    void delete(int id);
    List<T> getList();

}
