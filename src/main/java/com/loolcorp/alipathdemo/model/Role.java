package com.loolcorp.alipathdemo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.loolcorp.alipathdemo.enums.ERole;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author sskmal
 * @Created 01/06/2024 - 11:25 PM
 * @project alipathdemo
 */
@Document(collation = "roles")
@NoArgsConstructor
@Setter
@Getter
public class Role {

    @Id
    private String id;
    private ERole name;

    public Role(ERole name) {
        this.name = name;
      }


}
