package com.sumativa.tienda_fs3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sumativa.tienda_fs3.Model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto , Long>{
    
}
