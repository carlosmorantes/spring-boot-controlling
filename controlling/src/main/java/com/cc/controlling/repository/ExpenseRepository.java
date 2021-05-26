package com.cc.controlling.repository;

import org.springframework.data.repository.CrudRepository;

import com.cc.controlling.model.ExpenseEntity;

public interface ExpenseRepository extends CrudRepository<ExpenseEntity, Integer> {

}
