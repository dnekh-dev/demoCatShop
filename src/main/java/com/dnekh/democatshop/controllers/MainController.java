package com.dnekh.democatshop.controllers;

import com.dnekh.democatshop.models.Item;
import com.dnekh.democatshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/")
    public String getIndex(Model model) {
        //get all the data from database
        Iterable<Item> items = itemRepository.findAll();
        //passing that data into the templates
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/about-us")
    public String getAboutUs(@RequestParam(name = "userName", required = false,
            defaultValue = "something goes wrong!") String userName, Model model) {
        model.addAttribute("about", userName);
        return "aboutUs";
    }
}
