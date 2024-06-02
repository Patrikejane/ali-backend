package com.loolcorp.alipathdemo.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author sskma
 * @Created 02/06/2024 - 12:39 AM
 * @project alipathdemo
 */
public interface UserDetailService {
     UserDetails loadUserByUsername( String username) throws UsernameNotFoundException;

}
