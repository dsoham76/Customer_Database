package com.example.CustomerData.model;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JWTRequest {
    private String jwtToken;
    private String username;
    private String password;

}
