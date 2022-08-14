package Rikkei.academy.service;

import java.util.List;

public interface IGeneric<T>{
    List<T> findAll();
    void sort();
    void save(T obj);
    T findById(int id);
    void deleteById(int id);
}
