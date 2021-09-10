
package mx.com.gm.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador Rest"); 
        return "HolaMundo con Spring";
    }   
    
}
        