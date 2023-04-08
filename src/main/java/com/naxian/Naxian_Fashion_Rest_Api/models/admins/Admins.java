package com.naxian.Naxian_Fashion_Rest_Api.models.admins;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Admins extends BaseModel {
    private String name;
    private String email;
    private String gender;
    private LocalDate dob;
    private String password;
    private String adminPriority;
}
