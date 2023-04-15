package com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.Customers;

import com.naxian.Naxian_Fashion_Rest_Api.models.customers.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepo extends JpaRepository<WishList, Long> {
}
