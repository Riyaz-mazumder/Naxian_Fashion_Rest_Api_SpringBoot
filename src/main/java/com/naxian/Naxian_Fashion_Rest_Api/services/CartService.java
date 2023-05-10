package com.naxian.Naxian_Fashion_Rest_Api.services;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.Customers.CardRepo;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
   private CardRepo cardRepo;

    public List<Card> getAllCart(){
        return cardRepo.findAll();
    }

    public Card getById(Long id){
        return cardRepo.getById(id);
    }

    public void addToCart(Card card){
        cardRepo.save(card);
    }

    public void deleteCart(Long id){
        cardRepo.deleteById(id);
    }

    public void updateCartQuantity(Card card){
        cardRepo.save(card);
    }
}
