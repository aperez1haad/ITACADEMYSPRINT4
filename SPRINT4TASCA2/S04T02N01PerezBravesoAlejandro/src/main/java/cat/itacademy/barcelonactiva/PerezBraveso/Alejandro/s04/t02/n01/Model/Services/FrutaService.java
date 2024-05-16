package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Services;
import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Domain.Fruta;
import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class FrutaService {
    @Autowired
    private FrutaRepository frutaRepository;
    public List<Fruta> getAllFruta() {
        return frutaRepository.findAll();
    }
    public Optional<Fruta> getFrutaById(int id) {
        return frutaRepository.findById(id);
    }
    public Fruta addFruta(Fruta fruta) {
        return frutaRepository.save(fruta);
    }
    public Fruta updateFruta(Fruta fruta, int id) {
        if (!frutaRepository.existsById(id)) {
            return null;
        }
        else {
            Fruta frutaDb = frutaRepository.findById(id).get();
            frutaDb.setNom(fruta.getNom());
            frutaDb.setQuantitatKilos(fruta.getQuantitatKilos());

            return frutaRepository.save(frutaDb);
        }
    }
    public void deleteFruta(int id) {
        frutaRepository.deleteById(id);
    }
}
