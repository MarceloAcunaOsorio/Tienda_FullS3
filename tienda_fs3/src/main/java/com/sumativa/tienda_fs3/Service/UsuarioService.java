package com.sumativa.tienda_fs3.Service;

import com.sumativa.tienda_fs3.Dto.UsuarioRegistroDTO;
import com.sumativa.tienda_fs3.Model.Usuario;

public interface UsuarioService {

    public Usuario guardar (UsuarioRegistroDTO registroDTO);
    
}
