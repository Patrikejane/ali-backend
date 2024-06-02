package com.loolcorp.alipathdemo.security;

import com.loolcorp.alipathdemo.model.User;
import com.loolcorp.alipathdemo.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author sskma
 * @Created 02/06/2024 - 12:39 AM
 * @project alipathdemo
 */
@Service
public class UserDetailServiceImpl  implements UserDetailService{


    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername( String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }

}
