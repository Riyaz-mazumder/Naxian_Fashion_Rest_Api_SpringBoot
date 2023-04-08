package com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.Customers;

import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Card;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.WishList;
import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepo extends JpaRepository<Customers, Long> {

    @Query(nativeQuery = true, value = "INSERT INTO Customers (card) VALUES(:cardValue)")
    public void setToCart(@Param("cardValue") List<Card> cardValue);

    @Query(nativeQuery = true, value = "INSERT INTO Customers (wishList) VALUES(:wishListValue)")
    public void setToWishList(@Param("wishListValue") List<WishList> wishListValue);

    @Query(nativeQuery = true, value = "INSERT INTO Customers (customersProductOrders) VALUES(:customersProductOrdersValue)")
    public void setCustomersProductsOrder(@Param("customersProductOrdersValue") List<CustomersProductOrders> customersProductOrdersValue);

}
