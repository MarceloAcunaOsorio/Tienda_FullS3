package com.sumativa.tienda_fs3.Model;

import java.util.Collection;

import javax.persistence.FetchType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;

@Entity
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private Long _id;

    @Column(name = "nombre")
    private String _nombre;

    @Column(name = "apellido")
    private String _apellido;

    @Column(name = "direccion")
    private String _direccion;

    @Column(name = "email")
    private String _email;

    @Column(name = "password")
    private String _password;



    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "usuarios_roles",
			joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "iduser")
			)
    @Column(name = "rol")
    private Collection<Rol> _roles;

   
   //constructor
    public Usuario(Long _id, String _nombre, String _apellido, String _direccion, String _email, String _password,
            Collection<Rol> _roles) {
        this._id = _id;
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._direccion = _direccion;
        this._email = _email;
        this._password = _password;
        this._roles = _roles;
    }

    
    //constructor sin ID
    public Usuario(String _nombre, String _apellido, String _direccion, String _email, String _password,
            Collection<Rol> _roles) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._direccion = _direccion;
        this._email = _email;
        this._password = _password;
        this._roles = _roles;
    }



    //constructor vacio
    public Usuario() {
    }

    // Getter and Setter
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

    public String get_apellido() {
        return _apellido;
    }

    public void set_apellido(String _apellido) {
        this._apellido = _apellido;
    }

    public String get_direccion() {
        return _direccion;
    }

    public void set_direccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public Collection<Rol> get_roles() {
        return _roles;
    }

    public void set_roles(Collection<Rol> _roles) {
        this._roles = _roles;
    }

}
