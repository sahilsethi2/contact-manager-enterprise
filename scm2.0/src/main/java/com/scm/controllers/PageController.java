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

        //sending a data to the view
        model.addAttribute("name", "JPMC Services");
        model.addAttribute("youtubeChannel", "Sahil Sethi");
        model.addAttribute("gitRepo", "https://github.com/sahilsethi2/contact-manager-enterprise");
        return "home";
    }
}
