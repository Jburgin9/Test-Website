package com.quietlip.carol_shop.view;

import com.quietlip.carol_shop.api.dao.plans.PlansService;
import com.quietlip.carol_shop.api.dao.users.UserService;
import com.quietlip.carol_shop.model.Plans;
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
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/home")
public class WebsiteController {
    @Autowired
    private final PlansService plansService;
    @Autowired
    private final UserService userServiceDAO;
    @Autowired
    WebClient webClient;

    @GetMapping
    public String home(Model model){
        List<Plans> plansList = plansService.getPlans();
        model.addAttribute("plans", plansList);
        return "home";
    }

    /**
     *
     * Login section
     */
    @GetMapping("/login")
    public String showLogin(Model model){
        User newUser = new User();
        model.addAttribute("loggedInUser",newUser);
        return "login";
    }

    @PostMapping("/login")
    public String loginVerification(@ModelAttribute User loggedInUser){
        System.out.println("verification called");
        System.out.println(userServiceDAO.findUserByUsername(loggedInUser.getUsername()));
        return "home";
    }

    /**
     *
     * Register section
     */
    @GetMapping("/register")
    public String showRegistration(Model model){
        User newUser = new User();
        model.addAttribute("newUser", newUser);
        return "register";
    }

    @PostMapping("/register")
    public String submitRegistration(@Valid @ModelAttribute User newUser){
        System.out.println(newUser + " Registration successful");
        userServiceDAO.insertNewUser(newUser);
        System.out.println(userServiceDAO.getAllUsers());
        return "home";
    }

    /**
     *
     * Trades section
     */

    /**
     *
     * Used methods/codes below
     */
    public ResponseEntity errorPage(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Error");
    }

    @GetMapping("/stock")
    public void getStock(){
        System.out.println("Get Stock called");
        System.out.println(plansService.getStockInfo(webClient));
    }
}
