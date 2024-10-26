package com.sumativa.tienda_fs3.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    // constructor
    public Rol(Long _id, String _nombre) {
        this.id = _id;
        this.nombre = _nombre;
    }

    
    //constructor de nombre
    public Rol(String _nombre) {
        this.nombre = _nombre;
    }

    // constructor vacio
    public Rol() {
    }

    // getter and setter
    public Long get_id() {
        return id;
    }

    public void set_id(Long _id) {
        this.id = _id;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String _nombre) {
        this.nombre = _nombre;
    }

}
