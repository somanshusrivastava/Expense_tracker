package com.example.Expense_tracker.service;


import com.example.Expense_tracker.Exception.ExpenseNotFoundException;

import com.example.Expense_tracker.model.Expense;
import com.example.Expense_tracker.repository.Expenserepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private final Expenserepository repository;

    public ExpenseService(Expenserepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }


    public Expense getExpenseById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ExpenseNotFoundException(id));
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        Expense existingExpense = repository.findById(id)
                .orElseThrow(() -> new ExpenseNotFoundException(id));

        existingExpense.setDescription(updatedExpense.getDescription());
        existingExpense.setAmount(updatedExpense.getAmount());
        existingExpense.setCategory(updatedExpense.getCategory());

        return repository.save(existingExpense);
    }



    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

    public double getTotalExpenses() {
        return repository.findAll().stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

}
