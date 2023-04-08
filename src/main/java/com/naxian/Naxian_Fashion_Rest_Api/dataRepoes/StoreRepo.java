package com.naxian.Naxian_Fashion_Rest_Api.dataRepoes;

import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import com.naxian.Naxian_Fashion_Rest_Api.models.stores.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreRepo extends JpaRepository<Store, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM Store WHERE is_approved = true;")
    public List<CustomersProductOrders> findAllApprovedStores();

    @Query(nativeQuery = true, value = "SELECT * FROM Store WHERE is_approved = false;")
    public List<CustomersProductOrders> findAllUnApprovedStores();
}
