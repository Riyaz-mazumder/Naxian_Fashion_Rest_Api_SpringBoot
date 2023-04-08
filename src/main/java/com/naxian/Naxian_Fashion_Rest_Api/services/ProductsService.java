package com.naxian.Naxian_Fashion_Rest_Api.services;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.ProductsRepo;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepo productsRepo;

    public List<Products> GetAllProducts(){
        return productsRepo.findAll();
    }

    public void SaveProduct(Products products){
        productsRepo.save(products);
    }

    public Products GetOneProduct(Long id){
        return productsRepo.findById(id).orElse(new Products());
    }

    public void deleteTheProduct(Long id){
        productsRepo.deleteById(id);
    }
}
