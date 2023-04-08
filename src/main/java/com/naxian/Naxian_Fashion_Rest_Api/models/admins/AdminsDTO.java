package com.naxian.Naxian_Fashion_Rest_Api.models.admins;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AdminsDTO {
    private String name;
    private String email;
    private String gender;
    private LocalDate dob;
}
