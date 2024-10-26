package com.sumativa.tienda_fs3.Model;

import java.util.Collection;

import jakarta.persistence.FetchType;
import javax.persistence.Column;
import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import jakarta.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import jakarta.persistence.CascadeType;

@Entity
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email")
    private String email;
    private String password;



    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "usuarios_roles",
			joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
			)
    


    private Collection<Rol> roles;

   
   //constructor
    public Usuario(Long _id, String _nombre, String _apellido, String _direccion, String _email, String _password,
            Collection<Rol> _roles) {
        this.id = _id;
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.direccion = _direccion;
        this.email = _email;
        this.password = _password;
        this.roles = _roles;
    }

    
    //constructor sin ID
    public Usuario(String _nombre, String _apellido, String _direccion, String _email, String _password,
            Collection<Rol> _roles) {
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.direccion = _direccion;
        this.email = _email;
        this.password = _password;
        this.roles = _roles;
    }



    //constructor vacio
    public Usuario() {
    }

    // Getter and Setter
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

    public String get_apellido() {
        return apellido;
    }

    public void set_apellido(String _apellido) {
        this.apellido = _apellido;
    }

    public String get_direccion() {
        return direccion;
    }

    public void set_direccion(String _direccion) {
        this.direccion = _direccion;
    }

    public String get_email() {
        return email;
    }

    public void set_email(String _email) {
        this.email = _email;
    }

    public String get_password() {
        return password;
    }

    public void set_password(String _password) {
        this.password = _password;
    }

    public Collection<Rol> get_roles() {
        return roles;
    }

    public void set_roles(Collection<Rol> _roles) {
        this.roles = _roles;
    }

}
