package com.dnekh.democatshop.controllers;

import com.dnekh.democatshop.models.Item;
import com.dnekh.democatshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("item/add")
    public String add() {
        return "add-item";
    }

    @PostMapping("item/add")
    public String store(@RequestParam String title,
                        @RequestParam String img,
                        @RequestParam String price,
                        @RequestParam String info) {
        Item item = new Item(title, info, img, Short.parseShort(price));
        itemRepository.save(item);
        return "redirect:/";
    }
}
