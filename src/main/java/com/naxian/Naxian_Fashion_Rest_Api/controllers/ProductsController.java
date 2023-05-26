package com.naxian.Naxian_Fashion_Rest_Api.controllers;


import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.ProductsDTO;
import com.naxian.Naxian_Fashion_Rest_Api.services.ProductsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.beans.BeanUtils.copyProperties;

@RestController
@RequestMapping("/api/v1")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/products")
    public Page<Products> getAllProduct(@PageableDefault(size = 5, direction = Sort.Direction.DESC) Pageable page){

        return  productsService.findAll(page);

//        List<Products> allProducts = productsService.findAll();
//        List<ProductsDTO> allProductsDto = new ArrayList<>();
//
//        for (Products products:allProducts){
//            ProductsDTO productsDTO = new ProductsDTO();
//            copyProperties(products, productsDTO);
//            allProductsDto.add(productsDTO);
//        }
////        return allProductsDto;
//
//        return new PageImpl<>(allProductsDto, page, allProducts.getTotalElements());
    }

    @GetMapping("/products/{id}")
    public ProductsDTO getById(@PathVariable Long id){

        Products products = productsService.GetOneProduct(id);
        ProductsDTO productsDTO = new ProductsDTO();

        copyProperties(products, productsDTO);
        return productsDTO;
    }

    @PostMapping("/products")
    public void saveProduct(@RequestBody ProductsDTO productsDTO){
        Products products = new Products();
        copyProperties(productsDTO, products);
        productsService.SaveProduct(products);
    }

    @PutMapping("/products")
    public void editProduct(@RequestBody ProductsDTO productsDTO){
        Products products = new Products();
        copyProperties(productsDTO, products);
        productsService.SaveProduct(products);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        productsService.deleteTheProduct(id);
    }

    @GetMapping("/product/{subCategory}")
    public List<Products> searchedProduct(@PathVariable String subCategory){
      return  productsService.getAllProductsBySearch(subCategory);
    }

}