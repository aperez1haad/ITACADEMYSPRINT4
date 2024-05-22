package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n02.Model.Repository;

import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n02.Model.Domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrutaRepository extends JpaRepository<Fruta, Integer> {
}
