package cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n01.S04T02N01CaballeroJoan.Model.Repository;

import cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n01.S04T02N01CaballeroJoan.Model.Domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitaRepository extends JpaRepository<Fruita,Integer> {
}
