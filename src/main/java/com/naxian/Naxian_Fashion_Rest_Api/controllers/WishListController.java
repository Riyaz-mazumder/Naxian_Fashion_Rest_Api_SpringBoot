package com.naxian.Naxian_Fashion_Rest_Api.controllers;

import com.naxian.Naxian_Fashion_Rest_Api.models.customers.WishList;
import com.naxian.Naxian_Fashion_Rest_Api.services.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class WishListController {
    @Autowired
    private WishListService wishListService;

    @PostMapping("wishList")
    public void addToCart(@RequestBody WishList wishList){
        wishListService.addToWishList(wishList);
    }

    @GetMapping("wishList")
    public List<WishList> getAllWishList(){
        return wishListService.getAllWishList();
    }

    @DeleteMapping("wishList/{id}")
    public void deleteWishList(@PathVariable Long id){
        wishListService.delete(id);
    }
}
