package com.paradigmas.gym.repositories;

import com.paradigmas.gym.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByCpf(String cpf);
    public User findByFirstName(String name);
}
