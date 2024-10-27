package com.sumativa.tienda_fs3.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.sumativa.tienda_fs3.Dto.UsuarioRegistroDTO;
import com.sumativa.tienda_fs3.Model.Rol;
import com.sumativa.tienda_fs3.Model.Usuario;
import com.sumativa.tienda_fs3.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepositorio;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

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
				                      passwordEncoder.encode(registroDTO.get_password()),Arrays.asList(new Rol("ROLE_USER")));
		return usuarioRepositorio.save(usuario);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepositorio.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password inválidos");
		}
		return new User(usuario.get_email(),usuario.get_password(), mapearAutoridadesRoles(usuario.get_roles()));
	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.get_nombre())).collect(Collectors.toList());
	}
	
	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioRepositorio.findAll();
	}
    
}
