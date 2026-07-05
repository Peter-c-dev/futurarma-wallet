package com.example.futurarma.entity;

import com.example.futurarma.enums.AccountStatus;
import com.example.futurarma.enums.AccountType;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 300)
    private String accountName;

    @NotBlank
    @Column(nullable = false, unique = true, length = 12)
    private String accountNumber;

    @NotBlank
    @Column(nullable = false, length = 8)
    private String sortCode;

    @NotNull
    @Min(1000)
    @Max(9999)
    private Integer bankPin;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private AccountStatus accountStatus = AccountStatus.ACTIVE;

    @Builder.Default
    private boolean accountOpen = true;

    @Builder.Default
    private boolean transactionsAllowed = true;

    @Column(nullable = false)
    private LocalDateTime dateCreated;

    @PrePersist
    public void prePersist() {
        if (dateCreated == null) {
            dateCreated = LocalDateTime.now();
        }
    }

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private BankEntity bank;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private CharacterEntity character;

    @OneToMany(
            mappedBy = "account",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<TransactionEntity> transactions = new ArrayList<>();


}
