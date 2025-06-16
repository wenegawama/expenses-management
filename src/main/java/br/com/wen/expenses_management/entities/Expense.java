package br.com.wen.expenses_management.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import br.com.wen.expenses_management.dto.ExpenseDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="TBL_WEN_EXPENSES")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of= "ID")
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @Column(name = "CATEGORY", nullable = false)
    private String category;

    @CreatedDate
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDate createdAt;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    public Expense(ExpenseDTO dto) {
        this.amount = dto.amount();
        this.category = dto.category();
        this.createdAt = dto.createAt();
        this.date = dto.date();
        this.description = dto.description();
        this.email = dto.email();
    }
}
