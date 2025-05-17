package com.luizselli.projeto_learning_api.service;

import com.luizselli.projeto_learning_api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
