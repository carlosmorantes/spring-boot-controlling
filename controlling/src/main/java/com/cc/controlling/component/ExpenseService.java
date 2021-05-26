package com.cc.controlling.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.controlling.model.ExpenseEntity;
import com.cc.controlling.repository.ExpenseRepository;
import com.cc.controlling.repository.IExpense;

@Service
public class ExpenseService implements IExpense {

    @Autowired
    private ExpenseRepository repository;

    @Override
    public void save(ExpenseEntity expense) {
	repository.save(expense);
    }
}
