package com.loolcorp.alipathdemo.repository;

import com.loolcorp.alipathdemo.enums.ERole;
import com.loolcorp.alipathdemo.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author sskma
 * @Created 01/06/2024 - 11:57 PM
 * @project alipathdemo
 */

@Repository
public interface RoleRepository extends MongoRepository <Role, String> {
    Optional <Role> findByName( ERole name);
}
