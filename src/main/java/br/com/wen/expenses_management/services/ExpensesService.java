package br.com.wen.expenses_management.services;

import br.com.wen.expenses_management.dto.ExpenseDTO;
import br.com.wen.expenses_management.entities.Expense;
import br.com.wen.expenses_management.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense create(ExpenseDTO dto) {
        Expense expense = new Expense();
        expense.setCreatedAt(dto.createAt());
        expense.setAmount(dto.amount());
        expense.setDate(dto.date());
        expense.setEmail(dto.email());
        expense.setCategory(dto.category());
        expense.setDescription(dto.description());

        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
