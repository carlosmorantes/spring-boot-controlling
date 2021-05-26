package com.cc.controlling.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cc.controlling.model.ExpenseEntity;
import com.cc.controlling.repository.IExpense;

@Controller
public class ExpenseController {

    @Autowired
    private IExpense expenseService;

    Logger logger = LoggerFactory.getLogger(ExpenseController.class);

    @GetMapping("/editExpense")
    public String read(Model model) {
	model.addAttribute("expense", new ExpenseEntity());
	return "editExpense";
    }

    @PostMapping("/editExpense")
    public String create(@Valid @ModelAttribute("expense") ExpenseEntity newExpense, BindingResult bindingResult,
	    Model model) {
	if (bindingResult.hasErrors()) {
	    return "editExpense";
	}

	model.addAttribute("expense", newExpense);
	expenseService.save(newExpense);

	return "expense";
    }

}
