package br.com.wen.expenses_management.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

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
    private UUID id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @Column(name = "CATEGORY", nullable = false)
    private String category;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDate createdAt;

    @Column(name = "EMAIL", nullable = false)
    private String email;
}
