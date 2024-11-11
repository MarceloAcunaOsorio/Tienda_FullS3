package com.sumativa.tienda_fs3.Service.imple;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumativa.tienda_fs3.Model.Rol;
import com.sumativa.tienda_fs3.Repository.RoleRepository;
import com.sumativa.tienda_fs3.Service.RolService;



@Service
public class RolServiceImple implements RolService{
    
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Optional<Rol> findByname(String name) {
        return roleRepository.findByName(name);
    }
}
