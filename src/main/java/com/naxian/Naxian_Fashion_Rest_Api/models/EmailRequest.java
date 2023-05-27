package com.naxian.Naxian_Fashion_Rest_Api.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
    private String email;
    private String subject;
    private String body;

    // Getters and setters
}
