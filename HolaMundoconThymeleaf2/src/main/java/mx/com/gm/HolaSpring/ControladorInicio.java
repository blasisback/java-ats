
package mx.com.gm.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j  
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;
    
        
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje="Hola Mundo con Thymeleaf";
        var persona = new Persona();
        persona.setNombre("Juan");  
        persona.setApellido("Perez");
        persona.setEmail("Jperez@gmail.com");
        persona.setTelefono("1233434");
        
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("Persona", persona);
        return "index";
    }
    
}
        