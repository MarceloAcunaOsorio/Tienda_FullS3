package com.sumativa.tienda_fs3.Service;

import org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.XsiNilLoader.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;

import com.sumativa.tienda_fs3.Dto.UsuarioRegistroDTO;
import com.sumativa.tienda_fs3.Model.Rol;
import com.sumativa.tienda_fs3.Model.Usuario;
import com.sumativa.tienda_fs3.Repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    //declaramos una variable desde usuariorepository
    private UsuarioRepository usuarioRepository;

    @Autowired
	private BCryptPasswordEncoder passwordEncoder;

    //creamos el constructor de la variable declarada
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
       
        Usuario usuario = new Usuario(registroDTO.get_nombre(),
                                      registroDTO.get_apellido(),
                                      registroDTO.get_direccion(),
                                      registroDTO.get_email(),
                                      passwordEncoder.encode(registroDTO.get_password()),
                                      Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepository.saveAndFlush(usuario);
    }
    
}
