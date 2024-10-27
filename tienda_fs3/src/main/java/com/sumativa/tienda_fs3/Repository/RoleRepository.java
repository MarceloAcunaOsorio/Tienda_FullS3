package com.sumativa.tienda_fs3.Repository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sumativa.tienda_fs3.Model.Rol;

@Repository
public interface RoleRepository extends JpaRepository<Rol, Long> {

     Optional<Rol> findByName(String name);
    
}
