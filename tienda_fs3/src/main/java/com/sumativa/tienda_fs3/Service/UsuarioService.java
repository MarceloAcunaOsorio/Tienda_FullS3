package com.sumativa.tienda_fs3.Service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sumativa.tienda_fs3.Dto.UsuarioRegistroDTO;
import com.sumativa.tienda_fs3.Model.Usuario;

public interface UsuarioService extends UserDetailsService{

    public Usuario guardar (UsuarioRegistroDTO registroDTO);
    
    public List<Usuario> listarUsuarios();
    
}
