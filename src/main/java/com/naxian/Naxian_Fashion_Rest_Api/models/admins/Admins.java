package com.naxian.Naxian_Fashion_Rest_Api.models.admins;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Admins {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String adminPriority;
}
