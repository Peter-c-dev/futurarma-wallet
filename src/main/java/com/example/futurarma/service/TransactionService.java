package com.example.futurarma.service;

import com.example.futurarma.entity.TransactionEntity;
import com.example.futurarma.repository.TransactionRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionService {

private final TransactionRepository transactionRepository;

public List<TransactionEntity> getAllTransactions() {
    return transactionRepository.findAll();
}

    public TransactionEntity createTransaction(TransactionEntity transaction) {

        transaction.setTimestamp(LocalDateTime.now());

        return transactionRepository.save(transaction);
}
public TransactionEntity getTransaction(
        Long id) {
    return transactionRepository.findById(id)
            .orElseThrow(() ->
                    new RuntimeException(
                            "Transaction not found"));

}
public void deleteTransaction(Long id) {
    transactionRepository.deleteById(id);
}
public List<TransactionEntity> getTransactionsByAccount(Long accountId) {
    return transactionRepository.findByAccountId(accountId);
}
}
