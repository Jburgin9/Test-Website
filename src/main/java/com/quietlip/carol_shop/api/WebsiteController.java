package com.quietlip.carol_shop.api;

import com.quietlip.carol_shop.api.exception.ApiRequestException;
import com.quietlip.carol_shop.model.Inventory;
import com.quietlip.carol_shop.model.Plans;
import com.quietlip.carol_shop.model.User;
import com.quietlip.carol_shop.model.YahooAPIResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/home")
public class WebsiteController {
    @Autowired
    private final PlansService plansService;

    @Autowired
    WebClient webClient;

    public static final String API_URL = "https://yahoo-finance97.p.rapidapi.com/stock-info";

    @GetMapping
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home_page");
        List<Plans> plans = plansService.getPlans();
        System.out.println("Home Called");
        getStock();
//        mav.addObject("stocks", objs);
        mav.addObject("plans", plans);
        return mav;
    }

    public void getStock(){
        System.out.println("Get Stock called");
        System.out.println(plansService.getStockInfo(webClient));
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

    @ExceptionHandler
    @RequestMapping("/error")
    public Exception errorPage(){
        return new IllegalStateException("wrong");
    }
}
