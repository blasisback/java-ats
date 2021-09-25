
package mx.com.gm.HolaSpring.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ejecutando el controlador Spring MVC");
        //model.addAttribute("persona", persona);
        return "index";
    }   
    
}
        