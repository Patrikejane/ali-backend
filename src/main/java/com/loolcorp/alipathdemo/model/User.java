package com.loolcorp.alipathdemo.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sskma
 * @Created 01/06/2024 - 11:25 PM
 * @project alipathdemo
 */
@Document(collection = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private String id;

    @NotBlank
    @Size (max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 120)
    private String password;

    @DBRef
    private Set <Role> roles = new HashSet <> ();


    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


}
