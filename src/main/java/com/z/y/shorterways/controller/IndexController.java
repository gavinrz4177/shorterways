package com.z.y.shorterways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{

    @RequestMapping("")
    public String index(Model model)
    {
        model.addAttribute("message", "shortways.com");
        return "index";
    }
}
