package com.cc.controlling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller to test bootstrap
 * 
 * @author MyName
 *
 */
@Controller
public class ExampleBootstrap {

    @GetMapping("/bootstrap")
    public String exampleForm(Model model) {
	return "example/bootstrap";
    }

}
