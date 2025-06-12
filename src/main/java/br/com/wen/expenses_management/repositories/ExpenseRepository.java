package br.com.wen.expenses_management.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wen.expenses_management.entities.Expense;

public interface  ExpenseRepository extends JpaRepository<Expense, UUID> {
    

}
