package com.sumativa.tienda_fs3.Service;

import java.util.List;
import java.util.Optional;
import com.sumativa.tienda_fs3.Model.Producto;

public interface ProductoService {
 
    List<Producto> getAllProductos();
    Optional<Producto> getProductoById(Long Id);
 
    Producto createProducto(Producto producto);
    Producto updateProducto(Long id, Producto producto);
    void deleteProducto(Long id);

}
