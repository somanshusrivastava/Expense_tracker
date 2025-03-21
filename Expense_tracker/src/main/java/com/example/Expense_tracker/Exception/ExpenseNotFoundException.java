package com.example.Expense_tracker.Exception;


public class ExpenseNotFoundException extends RuntimeException {
    public ExpenseNotFoundException(Long id) {
        super("Expense not found with id: " + id);
    }
}
