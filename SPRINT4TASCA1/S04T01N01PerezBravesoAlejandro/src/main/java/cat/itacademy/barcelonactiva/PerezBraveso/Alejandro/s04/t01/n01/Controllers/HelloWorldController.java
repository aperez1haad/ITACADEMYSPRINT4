package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t01.n01.Controllers;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
    public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
    /*
    @GetMapping( {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(name = "nom", required = false) Optional<String> nom) {
        return "Hola, " + nom.orElse("UNKNOWN") + ". Estàs executant un projecte Maven";
    }*/

    @GetMapping( {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(name = "nom", required = false) String nom) {
        if (nom == null) {
            nom = "UNKNOWN";
        }
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
}