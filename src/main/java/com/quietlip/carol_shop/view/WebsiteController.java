package com.quietlip.carol_shop.view;

import com.quietlip.carol_shop.api.dao.PlansService;
import com.quietlip.carol_shop.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
@RequestMapping("/home")
public class WebsiteController {
    @Autowired
    private final PlansService
            plansService;
    @Autowired
    WebClient webClient;
    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/stock")
    public void getStock(){
        System.out.println("Get Stock called");
        System.out.println(plansService.getStockInfo(webClient));
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        System.out.println("login called");
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    @GetMapping("/register")
    public String showRegistration(Model model){
        User newUser = new User();
        model.addAttribute("newUser", newUser);
        return "register";
    }

    @PostMapping("/register")
    public String submitRegistration(@Valid @ModelAttribute User newUser){
        System.out.println(newUser + " Registration successful");
        return "home";
    }


    public ResponseEntity errorPage(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Error");
    }
}
