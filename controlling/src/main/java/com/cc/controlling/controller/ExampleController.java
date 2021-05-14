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

import com.cc.controlling.model.ExampleEntity;
import com.cc.controlling.repository.IExample;

@Controller
public class ExampleController {

    @Autowired
    private IExample exampleService;

    Logger logger = LoggerFactory.getLogger(ExampleController.class);

    /**
     * We can directly give the entity (ExampleEntity) and we dont need to use the
     * Model. Dont forget to rename as well the object in the html-file
     * 
     * @param model
     * @return
     */
    @GetMapping("/example")
    public String exampleForm(Model model) {
	model.addAttribute("example", new ExampleEntity());
	return "example/example";
    }

    /**
     * The order is important. BindingResult after @Valid Entity. If we use a
     * Model-Object in the get-Method we need to define
     * the @ModelAttribute([alias_for_entity])
     * 
     * @param example
     * @param bindingResult
     * @param model
     * @return
     */
    @PostMapping("/example")
    public String greetingSubmit(@Valid @ModelAttribute("example") ExampleEntity example, BindingResult bindingResult,
	    Model model) {
	if (bindingResult.hasErrors()) {
	    return "example/example";
	}

	model.addAttribute("example", example);
	exampleService.save(example);
	logger.info("Save example [{}]", example.getName());
	return "example/result";
    }

}
