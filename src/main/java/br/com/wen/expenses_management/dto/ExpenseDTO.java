package br.com.wen.expenses_management.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ExpenseDTO(

        String description,
        LocalDate date,
        BigDecimal amount,
        String category,
        LocalDate createAt,
        String email
) {
}
