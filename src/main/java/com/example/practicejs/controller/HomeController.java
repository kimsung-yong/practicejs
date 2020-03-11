package com.example.practicejs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "view/index";
    }
    @GetMapping("/editnode")
    public String editnode(){
        return "view/editnode";
    }
    @GetMapping("/textcontent")
    public String textcontent(){
        return "view/textcontent";
    }
    @GetMapping("/innertext")
    public String innertext(){
        return "view/innertext";
    }
    @GetMapping("/appendchild")
    public String appendchild(){
        return "view/appendchild";
    }
}
