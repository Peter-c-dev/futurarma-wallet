package com.example.futurarma.dto;
import jakarta.validation.constraints.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankRequestDTO {
    @NotBlank
    private String bankLocation;
    @NotBlank
    private String bankName;
    @NotBlank
    private String bankOpeningHours;

    private boolean bankOpen;

    @DecimalMin("0.0")
    @DecimalMax("5.00")
    private Double bankRating;

    @DecimalMin("0.0")
    @DecimalMax("5.0")
    private Double customerSatisfactionRating;
}
