package com.codingdojo.counter.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CounterController {
    @RequestMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        else {
            int count = (int) session.getAttribute("count");
            session.setAttribute("count", count + 1);
        }

        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(){
        return "counter.jsp";
    }
}
