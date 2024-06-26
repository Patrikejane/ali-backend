package com.loolcorp.alipathdemo.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author sskma
 * @Created 02/06/2024 - 3:03 AM
 * @project alipathdemo
 */

@Getter
@Setter
@AllArgsConstructor
public class JwtResponse {

    private String token;
    private String type = "Bearer";
    private String id;
    private String username;
    private String email;
    private List <String> roles;


    public JwtResponse(String accessToken, String id, String username, String email, List<String> roles) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

}
