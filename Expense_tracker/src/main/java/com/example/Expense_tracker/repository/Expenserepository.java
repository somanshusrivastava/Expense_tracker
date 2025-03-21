package com.example.Expense_tracker.repository;

import com.example.Expense_tracker.model.Expense;




import org.springframework.data.jpa.repository.JpaRepository;

public interface Expenserepository extends JpaRepository<Expense, Long> {}
