package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Domain.Fruta;
import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Service.FrutaService;

@RestController
@RequestMapping("/fruta")
public class FrutaController {
    @Autowired
    private FrutaService frutaService;
    @GetMapping("/getAll")
    public List<Fruta> getAllFruta() {
        return frutaService.getAllFruta();
    }
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruta> getFrutaById(@PathVariable String id) {
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
    public ResponseEntity<Fruta> updateFruta(@RequestBody Fruta fruta, @PathVariable String id) {
        Optional<Fruta> frutaDb = frutaService.getFrutaById(id);
        if (frutaDb.isPresent()) {
            Fruta updatedFruta = frutaService.updateFruta(fruta, id);
            return ResponseEntity.ok(updatedFruta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruta(@PathVariable String id) {
        frutaService.deleteFruta(id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAllFruta() {
        frutaService.deleteAll();
        return ResponseEntity.ok().build();
    }
}
