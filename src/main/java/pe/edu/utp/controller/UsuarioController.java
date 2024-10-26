package pe.edu.utp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {

 @GetMapping("/iniciar-sesion")
 public String iniciar() {
     return "iniciarSesion";
 }
 
}
