package com.quietlip.carol_shop.api;

import com.quietlip.carol_shop.api.exception.ApiRequestException;
import com.quietlip.carol_shop.model.Inventory;
import com.quietlip.carol_shop.model.Plans;
import com.quietlip.carol_shop.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/home")
public class WebsiteController {
    @Autowired
    private final PlansService plansService;

    @GetMapping
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home_page");
        List<Plans> plans =
                plansService.getPlans();
        System.out.println(plans);
        mav.addObject("plans", plans);
        return mav;
    }

    @GetMapping("/login")
    public ModelAndView login(@ModelAttribute("username") User user){
        System.out.println(user);
        ModelAndView mav = new ModelAndView("login");

        return mav;
    }

    @GetMapping("/register")
    public ModelAndView register(@ModelAttribute(
            "newUsername") User newUserData){
//        ModelAndViewContainer==
//        plansService.addUser(newUser);
        return new ModelAndView("register");
    }

    public ApiRequestException requestException(){
        throw new ApiRequestException("Error");
    }

    @ExceptionHandler
    public Exception errorPage(){
        return new IllegalStateException("wrong");
    }
}
