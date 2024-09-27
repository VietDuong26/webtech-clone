package com.example.webtech.controller;

import com.example.webtech.entity.Stock;
import com.example.webtech.service.ColorService;
import com.example.webtech.service.ProductService;
import com.example.webtech.service.SizeService;
import com.example.webtech.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StockController {
    @Autowired
    SizeService sizeService;
    @Autowired
    ColorService colorService;
    @Autowired
    ProductService productService;
    @Autowired
    StockService stockService;
    @GetMapping("/receipt")
}