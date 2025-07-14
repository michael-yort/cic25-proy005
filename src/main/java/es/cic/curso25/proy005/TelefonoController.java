package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//LLamo a este controlador 
@RestController
// Si la peticion en la url contiene /telefono ejecutara y devolvera el mensaje
// Hola por el navegador
@RequestMapping("/telefono")

public class TelefonoController {

    // @GetMapping
    // public String mensaje(){
    // return "Hola mundo";
    // }

    //Al estar fuera puedo llenar la lista cada vez que meto una url con un id
    List<Telefono> resultado = new ArrayList<>();
    

    @GetMapping("/{id}")
    public List<Telefono> list(@PathVariable long id) {
        int a = ++contador;

        Telefono telefono0 = new Telefono();
        telefono0.setId(id);
        telefono0.setNumero("55555555");
        telefono0.setTipoContrato(3);
        telefono0.setTitular("Juan" + id);

        resultado.add(telefono0);
        // System.out.println(a);ç

        return resultado;
    }

    private int contador = 0;

    @GetMapping("/{id}/{contrato}")
    public Telefono get(@PathVariable int id, @PathVariable int contrato) {

        List<Telefono> resultado = new ArrayList<>();

        Telefono telefono1 = new Telefono();
        telefono1.setId(1);
        telefono1.setNumero("1111111");
        telefono1.setTipoContrato(1);
        telefono1.setTitular("Juan1");

        resultado.add(telefono1);

        Telefono telefono2 = new Telefono();
        telefono2.setId(2);
        telefono2.setNumero("22222222");
        telefono2.setTipoContrato(2);
        telefono2.setTitular("Juan2");

        resultado.add(telefono2);

        return resultado.stream().filter(i -> (i.getId() == id) && (i.getTipoContrato() == contrato)).findFirst()
                .orElseThrow(() -> new RuntimeException("El indice " + id + " No coincide con el contrato"));
    }

    ////////////////////////////////////
    // @GetMapping("/{id}")
    // public Telefono get(@PathVariable long id) {

    // List<Telefono> resultado = new ArrayList<>();

    // Telefono telefono3 = new Telefono();
    // telefono3.setId(3);
    // telefono3.setNumero("55555555");
    // telefono3.setTipoContrato(3);
    // telefono3.setTitular("Juan3");

    // resultado.add(telefono3);

    // Telefono telefono4 = new Telefono();
    // telefono4.setId(4);
    // telefono4.setNumero("6666666");
    // telefono4.setTipoContrato(4);
    // telefono4.setTitular("Juan4");

    // resultado.add(telefono4);

    // Telefono telefono5 = new Telefono();
    // telefono5.setId(5);
    // telefono5.setNumero("7777777");
    // telefono5.setTipoContrato(3);
    // telefono5.setTitular("Juan5");

    // resultado.add(telefono5);

    // Telefono telefono6 = new Telefono();
    // telefono6.setId(6);
    // telefono6.setNumero("888888");
    // telefono6.setTipoContrato(3);
    // telefono6.setTitular("Juan6");

    // resultado.add(telefono6);

    // return resultado.stream().filter(i -> i.getId() == id).findFirst()
    // .orElseThrow(() -> new RuntimeException("El indice " + id + " no existe."));
    // }

}
