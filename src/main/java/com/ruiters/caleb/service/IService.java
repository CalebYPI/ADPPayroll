package com.ruiters.caleb.service;

public interface IService<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
