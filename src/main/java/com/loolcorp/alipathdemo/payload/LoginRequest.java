package com.loolcorp.alipathdemo.payload;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * @author sskma
 * @Created 02/06/2024 - 2:58 AM
 * @project alipathdemo
 */

@Getter
@Setter
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
