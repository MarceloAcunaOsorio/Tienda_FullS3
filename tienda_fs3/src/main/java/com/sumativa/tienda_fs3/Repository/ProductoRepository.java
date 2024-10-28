package com.sumativa.tienda_fs3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumativa.tienda_fs3.Model.Producto;

public interface ProductoRepository extends JpaRepository<Producto , Long>{
    
}
