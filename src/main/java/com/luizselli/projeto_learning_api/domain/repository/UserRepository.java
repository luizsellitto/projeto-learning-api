package com.luizselli.projeto_learning_api.domain.repository;

import com.luizselli.projeto_learning_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
