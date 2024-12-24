package com.example.validateform.controller;

import com.example.validateform.model.User;
import com.example.validateform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class FormController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String showForm(ModelMap model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/validateUser")
    public String checkValidation(@Validated @ModelAttribute("user") User user,
                                  BindingResult bindingResult, ModelMap model) {
        if (bindingResult.hasFieldErrors()) {
            return "index";
        }
        userService.save(user);
        userService.findById(user.getId());
        model.addAttribute("user", user);
        return "result";
    }
}

