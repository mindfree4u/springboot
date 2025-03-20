package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceTomeetYou(Model model) {
        model.addAttribute("username", "상현");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYoyNext(Model model) {
        model.addAttribute("nickname", "sanghyeon");
        return "goodbye";
    }

}
