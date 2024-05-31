package com.paradigmas.gym.services;

import com.paradigmas.gym.models.User;
import com.paradigmas.gym.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> readAllUsers() {
        return userRepository.findAll();
    }

    public User findUserByCpf(String cpf) {
        return userRepository.findByCpf(cpf);
    }

    public User findByName(String name){
        return userRepository.findByFirstName(name);
    }
}
