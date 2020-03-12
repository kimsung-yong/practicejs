package com.example.practicejs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "view/dom/index";
    }
    @GetMapping("/editnode")
    public String editnode(){
        return "view/dom/editnode";
    }
    @GetMapping("/textcontent")
    public String textcontent(){
        return "view/dom/textcontent";
    }
    @GetMapping("/innertext")
    public String innertext(){
        return "view/dom/innertext";
    }
    @GetMapping("/appendchild")
    public String appendchild(){
        return "view/dom/appendchild";
    }
    @GetMapping("/insertbefore")
    public String insertbefore(){
        return "view/dom/insertbefore";
    }
    @GetMapping("/movenode")
    public String movenode(){
        return "view/dom/movenode";
    }
    @GetMapping("/addattribute")
    public String addattribute(){
        return "view/dom/addattribute";
    }
    @GetMapping("/removechild")
    public String removechild(){
        return "view/dom/removechild";
    }
}
