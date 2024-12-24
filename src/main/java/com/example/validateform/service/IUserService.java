package com.example.validateform.service;

import com.example.validateform.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService extends IGenerateService<User>{
    Page<User> findAll(Pageable pageable);
}
