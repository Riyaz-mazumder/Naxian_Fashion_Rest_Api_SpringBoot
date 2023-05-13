package com.naxian.Naxian_Fashion_Rest_Api.dataRepoes;

import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.ProductsReviews;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.QAndA_AboutTheProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Long> {

    @Query(nativeQuery = true, value = "INSERT INTO Products (productsReviews) VALUES(:productsReviewsValue)")
    public void setProductsReviews(@Param("productsReviewsValue") List<ProductsReviews> productsReviewsValue);

    @Query(nativeQuery = true, value = "INSERT INTO Products (qAndA_aboutTheProduct) VALUES(:qAndA_aboutTheProductValue)")
    public void setProductsQAndA_AboutTheProduct(@Param("qAndA_aboutTheProductValue") List<QAndA_AboutTheProduct> qAndA_aboutTheProductValue);

    @Query(nativeQuery = true, value = "SELECT * FROM naxian_fashion.products where sub_cate = ?")
    public List<Products> searchdProductsBySubCategory(String subCategory);

}
