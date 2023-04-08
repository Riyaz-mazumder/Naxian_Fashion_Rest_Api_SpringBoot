package com.naxian.Naxian_Fashion_Rest_Api.controllers;


import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.ProductsDTO;
import com.naxian.Naxian_Fashion_Rest_Api.services.ProductsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/products")
    public List<ProductsDTO> getAllProduct(){

        List<Products> allProducts = productsService.GetAllProducts();
        List<ProductsDTO> allProductsDto = new ArrayList<>();

        for (Products products:allProducts){
            ProductsDTO productsDTO = new ProductsDTO();
            BeanUtils.copyProperties(products, productsDTO);
            allProductsDto.add(productsDTO);
        }
        return allProductsDto;
    }

    @GetMapping("/products/{id}")
    public ProductsDTO getById(@PathVariable Long id){

        Products products = productsService.GetOneProduct(id);
        ProductsDTO productsDTO = new ProductsDTO();

        BeanUtils.copyProperties(products, productsDTO);
        return productsDTO;
    }

    @PostMapping("/products")
    public void saveProduct(@RequestBody ProductsDTO productsDTO){
        Products products = new Products();
        BeanUtils.copyProperties(productsDTO, products);
        productsService.SaveProduct(products);
    }

    @PutMapping("/products")
    public void editProduct(@RequestBody ProductsDTO productsDTO){
        Products products = new Products();
        BeanUtils.copyProperties(productsDTO, products);
        productsService.SaveProduct(products);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        productsService.deleteTheProduct(id);
    }

}