package com.review.mvctestshc.controller;

import com.review.mvctestshc.dto.EventReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @GetMapping("/test1")
    public String test1(){
        return "test_page1";
    }

    @GetMapping("/account")
    public ModelAndView account(){
        System.out.println("accountPage가 나왔다!");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("account1data", "id");
        modelAndView.setViewName("account/account_page");
        return modelAndView;
    }

    @GetMapping("/register")
    public String register(Model model, @RequestParam String strData, @RequestParam String name){
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data", strData);
        model.addAttribute("name", name);

        return "account/register";
    }

    @GetMapping("/event")
    public String event(Model model ,EventReqDto eventReqDto){
//        System.out.println(eventReqDto.getStrData());
//        System.out.println(eventReqDto.getName());
//        System.out.println(eventReqDto.getNumber());
        System.out.println(eventReqDto);

        model.addAttribute("data", eventReqDto.getStrData());
        model.addAttribute("data", eventReqDto.getStrData());
        model.addAttribute("data", eventReqDto.getStrData());

        return "account/event";
    }
}
