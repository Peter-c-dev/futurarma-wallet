package com.example.futurarma.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.example.futurarma.entity.UserEntity;


public interface UserRepository
    extends JpaRepository<UserEntity, Long> {
        Optional<UserEntity> findByUsername(String username);

        boolean existsByUsername(String username);

    }

