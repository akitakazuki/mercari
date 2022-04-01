package com.example.mercari.controller;

import java.util.List;

import com.example.mercari.domain.Items;
import com.example.mercari.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mercari")
public class OriginalContoroller {

@Autowired
private ItemService itemService;

    @RequestMapping("/list")
    public String showList(Model model){
        List<Items> itemList = itemService.findAll();
        model.addAttribute("itemList", itemList);
        return "list";
    }
}
