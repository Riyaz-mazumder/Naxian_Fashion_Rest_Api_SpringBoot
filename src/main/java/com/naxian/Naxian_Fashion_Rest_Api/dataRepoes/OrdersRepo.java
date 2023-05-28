package com.naxian.Naxian_Fashion_Rest_Api.dataRepoes;

import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepo extends JpaRepository<CustomersProductOrders, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM naxian_fashion.customers_product_orders WHERE is_approved = false;")
    public List<CustomersProductOrders> findAllUnApprovedOrdersList();

    @Query(nativeQuery = true, value = "SELECT * FROM customers_product_orders WHERE is_approved = true")
    public List<CustomersProductOrders> findAllApprovedOrdersList();

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE naxian_fashion.customers_product_orders SET is_approved = true WHERE id =? :orderId AND is_approved = false")
    public int setApproved(@Param("orderId") Long orderId);



    List<CustomersProductOrders> findByIsApprovedFalse();
}
