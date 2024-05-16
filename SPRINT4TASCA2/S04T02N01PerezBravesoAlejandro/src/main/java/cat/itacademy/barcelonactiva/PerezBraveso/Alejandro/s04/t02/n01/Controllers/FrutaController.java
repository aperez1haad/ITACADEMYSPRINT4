package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Controllers;
import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Domain.Fruta;
import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Services.FrutaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;



@RestController
@RequestMapping("/fruta")
public class FrutaController {
    @Autowired
    private FrutaService frutaService;
    @GetMapping ("/getAll")
    public List<Fruta> getAllFruta() {
        return frutaService.getAllFruta();
    }
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruta> getFrutaById(@PathVariable int id) {
        Optional<Fruta> fruta = frutaService.getFrutaById(id);
        if (fruta.isPresent()) {
            return ResponseEntity.ok(fruta.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/add")
    public Fruta addFruta(@RequestBody Fruta fruta) {
        return frutaService.addFruta(fruta);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Fruta> updateFruta(@RequestBody Fruta fruta, @PathVariable int id) {
        Optional<Fruta> frutaDb = frutaService.getFrutaById(id);
        if (frutaDb.isPresent()) {
            Fruta updatedFruta = frutaService.updateFruta(fruta, id);
            return ResponseEntity.ok(updatedFruta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruta(@PathVariable int id) {
        frutaService.deleteFruta(id);
        return ResponseEntity.ok().build();
    }
}
