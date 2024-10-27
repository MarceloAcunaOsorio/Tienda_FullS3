package com.sumativa.tienda_fs3.Service;

import java.util.Optional;
import com.sumativa.tienda_fs3.Model.Rol;

public interface RolService {
    
    public Optional<Rol> findByname(String name);
}
