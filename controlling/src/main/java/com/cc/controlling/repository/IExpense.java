package com.cc.controlling.repository;

import com.cc.controlling.model.ExpenseEntity;

public interface IExpense {

    void save(ExpenseEntity expense);
}
