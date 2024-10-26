package com.sumativa.tienda_fs3.Dto;

public class UsuarioRegistroDTO {

    private Long _id;
    private String _nombre;
    private String _apellido;
    private String _direccion;
    private String _email;
    private String _password;

    // constructor
    public UsuarioRegistroDTO(Long _id, String _nombre, String _apellido, String _direccion, String _email,
            String _password) {
        this._id = _id;
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._direccion = _direccion;
        this._email = _email;
        this._password = _password;
    }

    // constructor sin ID
    public UsuarioRegistroDTO(String _nombre, String _apellido, String _direccion, String _email, String _password) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._direccion = _direccion;
        this._email = _email;
        this._password = _password;
    }

    // constructor email
    public UsuarioRegistroDTO(String _email) {
        this._email = _email;
    }

    // constructor vacio
    public UsuarioRegistroDTO() {
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

}
