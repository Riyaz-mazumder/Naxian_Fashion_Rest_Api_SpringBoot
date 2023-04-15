package com.naxian.Naxian_Fashion_Rest_Api.services;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.Customers.WishListRepo;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {
    @Autowired
    private WishListRepo wishListRepo;

    public List<WishList> getAllWishList(){
        return wishListRepo.findAll();
    }
    public void addToWishList(WishList wishList){
        wishListRepo.save(wishList);
    }
}
