package com.loolcorp.alipathdemo.repository;

import com.loolcorp.alipathdemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author sskma
 * @Created 01/06/2024 - 11:55 PM
 * @project alipathdemo
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
