package com.JWTAuthentication.JwtAuthentication.Entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private String userId;
    private String userName;
    private String userEmail;
}
