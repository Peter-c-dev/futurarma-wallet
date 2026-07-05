
package com.example.futurarma.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@Table(name = "banks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 300)
    private String bankLocation;

    @NotBlank
    @Column(nullable = false, length = 300)
    private String bankName;

    @NotBlank
    @Column(nullable = false, length = 300)
    private String bankOpeningHours;

    private boolean bankOpen;

    @DecimalMin("0.0")
    @DecimalMax("5.0")
    private Double bankRating;

    @DecimalMin("0.0")
    @DecimalMax("5.0")
    private Double customerSatisfactionRating;


    @OneToMany(
            mappedBy = "bank",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<AccountEntity> accounts = new ArrayList<>();

    public void addAccount(AccountEntity account) {
        accounts.add(account);
        account.setBank(this);
    }
    public void removeAccount(AccountEntity account) {
        accounts.remove(account);
        account.setBank(null);

        }
    }

