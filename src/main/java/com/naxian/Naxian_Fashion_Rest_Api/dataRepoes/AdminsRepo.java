package com.naxian.Naxian_Fashion_Rest_Api.dataRepoes;

import com.naxian.Naxian_Fashion_Rest_Api.models.admins.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepo extends JpaRepository<Admins, Long> {
}
