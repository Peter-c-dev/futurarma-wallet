
package com.example.futurarma.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.example.futurarma.repository.BankRepository;
import com.example.futurarma.entity.BankEntity;
@Service
@RequiredArgsConstructor
@Transactional
public class BankService {

    private final BankRepository bankRepository;

    public BankEntity create(BankEntity bank) {
        return bankRepository.save(bank);
    }
    public List<BankEntity> getAll() {
        return bankRepository.findAll();
    }
    public BankEntity find(Long id) {
        return bankRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Bank not found"));
    }
    public void delete(Long id) {
        bankRepository.deleteById(id);
    }
    public BankEntity update(Long id, BankEntity bank) {
        BankEntity existingBank = bankRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Bank not found"));

        existingBank.setBankName(bank.getBankName());
        existingBank.setBankLocation(bank.getBankLocation());
        existingBank.setBankOpeningHours(bank.getBankOpeningHours());
        existingBank.setBankOpen(bank.isBankOpen());
        existingBank.setBankRating(bank.getBankRating());
        existingBank.setCustomerSatisfactionRating(
                bank.getCustomerSatisfactionRating());

                return bankRepository.save(existingBank);
    }
}