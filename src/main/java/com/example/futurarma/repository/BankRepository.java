package com.example.futurarma.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.futurarma.entity.BankEntity;
import java.util.Optional;

public interface BankRepository
        extends JpaRepository<BankEntity, Long> {

    Optional<BankEntity> findByBankName(String bankName);

    boolean existsByBankName(String bankName);
}