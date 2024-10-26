package com.sumativa.tienda_fs3.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="IdProducto")
    private Long _IdProducto;

    @NotNull
    @Size(min = 4, max = 50)
    @Column(name = "nombre")
    private String _NombreProducto;

    @NotNull
    @Size(min = 4,max = 150)
    @Column(name="descripcion")
    private String _DescripcionProducto;

    @NotNull
    @Size(min = 4, max = 50)
    @Column(name = "modelo")
    private String _ModeloProducto;

    @NotNull
    @Size(min = 4, max = 50)
    @Column(name = "marca")
    private String _MarcaProducto;

    @NotNull
    @Size(min = 4, max = 50)
    @Column(name = "talla")
    private int _TallaProducto;

    @NotNull
    @Size(min = 4, max = 50)
    @Column(name = "color")
    private int _ColorProducto;




    //Getter and Setter
    public Long get_IdProducto() {
        return _IdProducto;
    }

    public void set_IdProducto(Long _IdProducto) {
        this._IdProducto = _IdProducto;
    }

    public String get_NombreProducto() {
        return _NombreProducto;
    }

    public void set_NombreProducto(String _NombreProducto) {
        this._NombreProducto = _NombreProducto;
    }

    public String get_DescripcionProducto() {
        return _DescripcionProducto;
    }

    public void set_DescripcionProducto(String _DescripcionProducto) {
        this._DescripcionProducto = _DescripcionProducto;
    }

    public String get_ModeloProducto() {
        return _ModeloProducto;
    }

    public void set_ModeloProducto(String _ModeloProducto) {
        this._ModeloProducto = _ModeloProducto;
    }

    public String get_MarcaProducto() {
        return _MarcaProducto;
    }

    public void set_MarcaProducto(String _MarcaProducto) {
        this._MarcaProducto = _MarcaProducto;
    }

    public int get_TallaProducto() {
        return _TallaProducto;
    }

    public void set_TallaProducto(int _TallaProducto) {
        this._TallaProducto = _TallaProducto;
    }

    public int get_ColorProducto() {
        return _ColorProducto;
    }

    public void set_ColorProducto(int _ColorProducto) {
        this._ColorProducto = _ColorProducto;
    }
    
}
