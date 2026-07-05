package com.example.futurarma.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.futurarma.entity.AccountEntity;
import com.example.futurarma.enums.AccountStatus;

import java.util.List;
import java.util.Optional;

public interface AccountRepository
        extends JpaRepository<AccountEntity, Long> {

    Optional<AccountEntity> findByAccountNumber(String accountNumber);

    List<AccountEntity> findByAccountStatus(AccountStatus accountStatus);

    boolean existsByAccountNumber(String accountNumber);

}