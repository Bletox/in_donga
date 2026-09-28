package com.example.repositories;

import java.util.List;

public interface Repository<T, ID> {
    public List<T> findAll(); //index
    // T findById(ID id); //show
    public T save(T t); //store
    public T update(T t);
    public int delete(ID id);
    
} 
