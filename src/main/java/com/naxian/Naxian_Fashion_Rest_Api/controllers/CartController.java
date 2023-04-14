package com.naxian.Naxian_Fashion_Rest_Api.controllers;

import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Card;
import com.naxian.Naxian_Fashion_Rest_Api.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("cart")
    public List<Card> getAllCart(){
        return cartService.getAllCart();
    }

    @PostMapping("cart")
    public void sateToCart(@RequestBody Card card){
        cartService.addToCart(card);
    }

    @DeleteMapping("cart/{id]")
    public void deleteCart(@PathVariable Long id){
        cartService.deleteCart(id);
    }
}
