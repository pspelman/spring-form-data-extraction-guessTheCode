package com.philspelman.samurai.code.springsecretsamuraicode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(@ModelAttribute("errors") String errors, Model model) {

        System.out.println("Reached index request");

        if (errors != "") {
            System.out.println("got errors: " + errors);

        }
        model.addAttribute("path", "");


        return "index";
    }

    @RequestMapping("/user_guess")
    public String index(@ModelAttribute("errors") String errors, @RequestParam("user_guess") String user_guess, RedirectAttributes redirectAttributes) {

        System.out.println("recieved the path: " + user_guess);

        System.out.println("errors string: " + errors);
        if (user_guess.equals("bushido")) {
            System.out.println("SUCCESS!");
            return "redirect:/code";
        } else {
            redirectAttributes.addFlashAttribute("errors", "wrong code");
            return "redirect:/";

        }

    }




    @RequestMapping("/code")
    public String code() {
        System.out.println("reached the code");
            return "code";
    }


    @RequestMapping("/{test_code}")
    public String code(@PathVariable("test_code") String test_code, Model model) {

        System.out.println("received test code: " + test_code);
        if (test_code.equals("bushido")) {
            System.out.println("GOT THE CODE!!!");
            return "code";
        } else {
            return "index";

        }


    }

}
