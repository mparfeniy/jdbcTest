package net.proselyte.test.repository;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Generic repository interface
 */
public interface GenericRepository<T, ID> {

    void save(T t);

    T getById(ID id);

    Collection<T> getAll() throws SQLException;

    void delete(ID id);
}
