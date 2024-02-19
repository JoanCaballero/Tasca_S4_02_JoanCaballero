package cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n02.S04T02N02CaballeroJoan.Model.Repository;

import cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n02.S04T02N02CaballeroJoan.Model.Domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitaRepository extends JpaRepository<Fruita,Integer> {
}
