package cat.itacademy.barcelonactiva.caballero.joan.s04.t02.n03.S04T02N03CaballeroJoan.Model.Repository;


import cat.itacademy.barcelonactiva.caballero.joan.s04.t02.n03.S04T02N03CaballeroJoan.Model.Domain.Fruita;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitaRepository extends MongoRepository<Fruita,String> {
}
