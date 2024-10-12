package main.java.com.example.webtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.webtech.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.java.com.example.webtech.entity.CartItem;

@Controller
public class CartController {
    @Autowired
    CartService cartService;
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;
    @Autowired
    SizeService sizeService;
    @Autowired
    ColorService colorService;

    @GetMapping("/Cart")
    String showCart() {

    }

    @RequestMapping("/addToCart")
    String addToCart() {

    }

    @RequestMapping("/minusItem/{id}")
    String minusItem() {

    }

    @RequestMapping("/addOneToCart/{id}")
    String addOneItem() {

    }

    @RequestMapping("/removeAllFromCart/{id}")
    String removeAll() {

    }
}
