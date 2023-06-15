package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @GetMapping("/HelloWorld2/{nom}")
    public String saluda2(@PathVariable(value = "nom", required = false) String nom) {
        if (nom != null) {
            return "Hola, " + nom + ". Estàs executant un projecte Maven";
        } else {
            return "Hola, UNKNOWN. Estàs executant un projecte Maven";
        }
    }
    
}