package es.cic.curso25.proy005;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//LLamo a este controlador 
@RestController
//Si la peticion en la url contiene /telefono ejecutara y devolvera el mensaje Hola por el navegador
@RequestMapping("/telefono")

public class TelefonoController {

    @GetMapping
    public String mensaje(){
        return "Hola mundo";
    }

}
