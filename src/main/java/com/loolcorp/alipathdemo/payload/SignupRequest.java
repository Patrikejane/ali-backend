package com.loolcorp.alipathdemo.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jdk.jfr.SettingDefinition;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author sskma
 * @Created 02/06/2024 - 2:59 AM
 * @project alipathdemo
 */

@Getter
@Setter
public class SignupRequest {

    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size (max = 50)
    @Email
    private String email;

    private Set <String> roles;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
}
