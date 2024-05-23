package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Repository;

import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Domain.Fruta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FrutaRepository extends MongoRepository<Fruta, String> {
}
