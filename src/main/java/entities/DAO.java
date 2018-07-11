package entities;

import java.util.List;

public interface DAO<T> {
    T get(int pk);
    T insert(T entity);
    T update(T entity);
    void delete(int pk);
    List<T> getAll();
}
