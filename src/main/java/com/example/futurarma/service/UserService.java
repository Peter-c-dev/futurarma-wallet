package com.example.futurarma.service;

import com.example.futurarma.entity.UserEntity;
import com.example.futurarma.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

    @Service
    @RequiredArgsConstructor
    @Transactional
    public class UserService {

        private final UserRepository userRepository;

        public UserEntity create(UserEntity user) {
            return userRepository.save(user);
        }

        public List<UserEntity> getAll() {
            return userRepository.findAll();
        }

        public UserEntity find(Long id) {
            return userRepository.findById(id)
                    .orElseThrow(() ->
                            new RuntimeException("User not found"));
        }

        public void delete(Long id) {
            userRepository.deleteById(id);
        }
        public UserEntity login(String username) {
            return userRepository.findByUsername(username)
                    .orElseThrow(() ->
                            new RuntimeException("User not found"));
        }
    }





