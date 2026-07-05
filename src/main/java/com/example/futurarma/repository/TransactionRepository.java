package com.example.futurarma.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.futurarma.entity.TransactionEntity;
import com.example.futurarma.enums.TransactionType;
import java.util.List;

public interface TransactionRepository
        extends JpaRepository<TransactionEntity, Long> {

    List<TransactionEntity> findByAccountId(Long accountId);
    List<TransactionEntity> findByTransactionType(TransactionType transactionType);
}