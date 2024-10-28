package com.sumativa.tienda_fs3.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumativa.tienda_fs3.Model.Producto;
import com.sumativa.tienda_fs3.Service.ProductoService;


@RestController
public class VerifyTokenController {
    
    private ProductoService productoService;

    @RequestMapping("/token")
    public String token() {
        return "Hola si funciona el token de acceso!";
    }



    
    //Seccion de admin
    @RequestMapping("/admin")
    public String admin() {
        return "Hola bienvenido Admin!";
    }

    //Crear
    @PostMapping("/admin/crearproducto")
    public Producto createProducto(@RequestBody Producto producto){
      return productoService.createProducto(producto);
    }

    //Actualizar
    @PutMapping("/admin/actualizar/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto){
        return productoService.updateProducto(id, producto);
    }

    //Eliminar
    @DeleteMapping("/admin/eliminar/{id}")
    public void deleteProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
    }







    //Seccion de usuario
    @GetMapping("/user/{id}")
    public Optional<Producto>getProductoById(@PathVariable Long id){
        return productoService.getProductoById(id);
    }

    @RequestMapping("/user")
    public String user() {
        return "Hola bienvenido User!";
    }

}
