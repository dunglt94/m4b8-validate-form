package com.example.validateform.service;


import java.util.Optional;

public interface IGenerateService<T> {

    Optional<T> findById(Long id);

    void save(T Object);

    void delete(Long id);
}
