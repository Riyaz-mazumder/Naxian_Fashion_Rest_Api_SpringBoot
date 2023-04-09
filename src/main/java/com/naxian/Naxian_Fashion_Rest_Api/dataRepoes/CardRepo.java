package com.naxian.Naxian_Fashion_Rest_Api.dataRepoes;

import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepo extends JpaRepository<Card,Long> {
}
