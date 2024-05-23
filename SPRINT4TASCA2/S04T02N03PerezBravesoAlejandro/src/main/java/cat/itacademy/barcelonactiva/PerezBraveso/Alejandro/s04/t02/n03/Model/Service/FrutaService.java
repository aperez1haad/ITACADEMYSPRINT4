package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Service;

import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Domain.Fruta;
import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FrutaService {
    @Autowired
    private FrutaRepository frutaRepository;
    public List<Fruta> getAllFruta() {
        return frutaRepository.findAll();
    }
    public Optional<Fruta> getFrutaById(String id) {
        return frutaRepository.findById(id);
    }
    public Fruta addFruta(Fruta fruta) {
        return frutaRepository.save(fruta);
    }
    public Fruta updateFruta(Fruta fruta, String id) {
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
    public void deleteFruta(String id) {
        frutaRepository.deleteById(id);
    }
    public void deleteAll() {
        frutaRepository.deleteAll();
    }
}

