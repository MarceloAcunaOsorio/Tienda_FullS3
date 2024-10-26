package com.sumativa.tienda_fs3.Service;

import java.util.Arrays;


import org.springframework.stereotype.Service;
import com.sumativa.tienda_fs3.Dto.UsuarioRegistroDTO;
import com.sumativa.tienda_fs3.Model.Rol;
import com.sumativa.tienda_fs3.Model.Usuario;
import com.sumativa.tienda_fs3.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepositorio;


	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.get_nombre(), 
				                      registroDTO.get_apellido(),
                                      registroDTO.get_email(),
                                      registroDTO.get_direccion(),
				                      registroDTO.get_password(),
                                      Arrays.asList(new Rol("ROLE_USER")));
                                      
		return usuarioRepositorio.save(usuario);
	}
    
}
