package com.JWTAuthentication.JwtAuthentication.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {

    private String userEmail;
    private String userPassword;
}
