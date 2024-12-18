package com.sumativa.tienda_fs3.Service.imple;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sumativa.tienda_fs3.Model.Rol;
import com.sumativa.tienda_fs3.Model.UserEntity;
import com.sumativa.tienda_fs3.Repository.UserRepository;


@Service("userDetailService")
@Transactional(readOnly=true)
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado!"));
        ArrayList<GrantedAuthority> roles = new ArrayList<>();
        for (Rol rol : user.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getName()));
        }
        return new User(user.getEmail() , user.getPassword(), roles);
    }
}
