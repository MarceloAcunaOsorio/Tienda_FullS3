package com.sumativa.tienda_fs3.Service.imple;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sumativa.tienda_fs3.Model.Producto;
import com.sumativa.tienda_fs3.Repository.ProductoRepository;
import com.sumativa.tienda_fs3.Service.ProductoService;


@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;


    //mostrar listado de productos
    @Override
    public List<Producto>getAllProductos(){
        return productoRepository.findAll();
    }

    //Consultar Producto por ID
    @Override
    public Optional<Producto>getProductoById(Long _IdProducto){
        return productoRepository.findById(_IdProducto);
    }

    //Crear Producto
    @Override
    public Producto createProducto(Producto producto){
        return productoRepository.save(producto);
    }


    //Actualizar Producto
    @Override
    public Producto updateProducto(Long _IdProducto, Producto producto){
        if (productoRepository.existsById(_IdProducto)) {
            producto.set_IdProducto(_IdProducto);
            return productoRepository.save(producto);
        }
        else
        {
            return null;
        }
    }


    //borrar producto
    @Override
    public void deleteProducto(Long _IdProducto){
        productoRepository.deleteById(_IdProducto);
    }
}
