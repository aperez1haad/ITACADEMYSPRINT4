package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Repository;

import cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepository extends JpaRepository<Fruta, Integer> {
}

// Hereda los metodos CRUD
