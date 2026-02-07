package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model)
    {
        System.out.println("Home Page Handler");
        model.addAttribute("name", "JPMC Services");
        model.addAttribute("Employee Name", "Sahil Sethi");
        model.addAttribute("Github Repository", "https://github.com/sahilsethi2/contact-manager-enterprise");
        return "home";
    }
}
