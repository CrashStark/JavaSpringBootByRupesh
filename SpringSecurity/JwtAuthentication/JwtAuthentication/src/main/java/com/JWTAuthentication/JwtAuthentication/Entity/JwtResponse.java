package com.JWTAuthentication.JwtAuthentication.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private  String jwtToken;
    private String userName;
}
