package com.luizselli.projeto_learning_api.service.impl;

import com.luizselli.projeto_learning_api.domain.model.User;
import com.luizselli.projeto_learning_api.domain.repository.UserRepository;
import com.luizselli.projeto_learning_api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already existis.");
        }
        return userRepository.save(userToCreate);
    }
}
