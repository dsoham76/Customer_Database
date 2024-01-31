package com.example.CustomerData.model;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JWTResponse {
    private String username;
    private String jwtToken;
}
