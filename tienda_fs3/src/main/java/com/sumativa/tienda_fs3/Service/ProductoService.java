package com.sumativa.tienda_fs3.Service;

import java.util.List;
import java.util.Optional;
import com.sumativa.tienda_fs3.Model.Producto;

public interface ProductoService {
 
    //listar producto
    List<Producto> getAllProductos();

    //buscar producto por id
    Optional<Producto> getProductoById(Long Id);
 
    //metodo para actualizar, crear y eliminar
    Producto createProducto(Producto producto);
    Producto updateProducto(Long id, Producto producto);
    void deleteProducto(Long id);

}
