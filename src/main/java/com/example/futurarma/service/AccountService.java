package com.example.futurarma.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.futurarma.repository.TransactionRepository;
import com.example.futurarma.entity.TransactionEntity;
import com.example.futurarma.enums.TransactionType;
import java.util.List;
import java.math.BigDecimal;
import com.example.futurarma.repository.AccountRepository;
import com.example.futurarma.entity.AccountEntity;
@Service
@RequiredArgsConstructor
@Transactional
public class AccountService {
    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public AccountEntity create(AccountEntity account) {
        return accountRepository.save(account);
    }

    public List<AccountEntity> getAll() {
        return accountRepository.findAll();
    }

    public AccountEntity find(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() ->
                        new RuntimeException("Account not found"));
    }

    public void delete(Long accountId) {
        accountRepository.deleteById(accountId);
    }

    public void withdrawMoney(
            Long accountId,
            Integer amount) {
        if (amount <= 0) {
            throw new RuntimeException("Invalid amount");
        }
        AccountEntity account =
                accountRepository.findById(accountId)
                        .orElseThrow(() ->
                                new RuntimeException("Account not found"));
        BigDecimal withdrawalAmount =
                BigDecimal.valueOf(amount);
        if (account.getBalance()
                .compareTo(withdrawalAmount) < 0) {
            throw new RuntimeException("Insufficient balance");
        }
        account.setBalance(
                account.getBalance()
                        .subtract(withdrawalAmount)
        );
        accountRepository.save(account);
        logTransaction(
                account,
                withdrawalAmount,
                TransactionType.WITHDRAWAL);

    }

    public void depositMoney(
            Long accountId,
            Integer amount) {
        AccountEntity account =
                accountRepository.findById(accountId)
                        .orElseThrow(() ->
                                new RuntimeException("Account not found"));
        if (amount <= 0) {
            throw new RuntimeException("Invalid amount");
        }
        BigDecimal depositAmount =
                BigDecimal.valueOf(amount);
        account.setBalance(
                account.getBalance()
                        .add(depositAmount)
        );
        accountRepository.save(account);
        logTransaction(
                account,
                depositAmount,
                TransactionType.DEPOSIT);
    }

    public void transferMoney(
            Long fromAccountId,
            Long toAccountId,
            Integer amount) {
        if (amount <= 0) {
            throw new RuntimeException("Invalid amount");
        }
        AccountEntity from =
                accountRepository.findById(fromAccountId)
                        .orElseThrow(() ->
                                new RuntimeException("From account not found"));
        AccountEntity to =
                accountRepository.findById(toAccountId)
                        .orElseThrow(() ->
                                new RuntimeException("To account not found"));
        BigDecimal transferAmount =
                BigDecimal.valueOf(amount);
        if (from.getBalance()
                .compareTo(transferAmount) < 0) {
            throw new RuntimeException("Insufficient balance");
        }
        from.setBalance(
                from.getBalance()
                        .subtract(transferAmount)
        );
        to.setBalance(
                to.getBalance()
                        .add(transferAmount)
        );
        accountRepository.save(from);
        accountRepository.save(to);
        logTransaction(
                from,
                transferAmount,
                TransactionType.TRANSFER);
    }

    private void logTransaction(
            AccountEntity account,
            BigDecimal amount,
            TransactionType type) {

        TransactionEntity transaction =
                new TransactionEntity();

        transaction.setAccount(account);
        transaction.setAmount(amount);

        // CHANGE THIS LINE
        transaction.setTransactionType(type);

        transactionRepository.save(transaction);
    }
}