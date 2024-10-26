package com.sumativa.tienda_fs3.Model;

import jakarta.persistence.Column;
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
    @Column(name = "iduser")
    private Long _id;

    @Column(name = "nombre")
    private String _nombre;

    // constructor
    public Rol(Long _id, String _nombre) {
        this._id = _id;
        this._nombre = _nombre;
    }

    
    //constructor de nombre
    public Rol(String _nombre) {
        this._nombre = _nombre;
    }

    // constructor vacio
    public Rol() {
    }

    // getter and setter
    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

}
