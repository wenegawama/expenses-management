package br.com.wen.expenses_management.controllers;

import br.com.wen.expenses_management.dto.ExpenseDTO;
import br.com.wen.expenses_management.entities.Expense;
import br.com.wen.expenses_management.services.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesService service;

    @PostMapping("/create")
    public ResponseEntity<Expense> create(@RequestBody ExpenseDTO dto) {
        var expense = service.create(dto);
        return ResponseEntity.ok().body(expense);
    }

    @GetMapping
    public ResponseEntity<List<Expense>> getAll() {
        var expenses = service.getAllExpenses();
        return  ResponseEntity.ok().body(expenses);
    }
}
