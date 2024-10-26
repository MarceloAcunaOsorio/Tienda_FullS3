package com.sumativa.tienda_fs3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sumativa.tienda_fs3.Dto.UsuarioRegistroDTO;
import com.sumativa.tienda_fs3.Service.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {


    private UsuarioService usuarioService;

    //Constructor
    public RegistroUsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
   @ModelAttribute("usuario")
   public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
    return new UsuarioRegistroDTO();
   }


   @GetMapping
   public String mostrarFormularioDeRegistro(){
    return "registro";
   }


   @PostMapping
   public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO){
    usuarioService.guardar(registroDTO);
    return "redirect:/registro?exito";

   }

    
}
