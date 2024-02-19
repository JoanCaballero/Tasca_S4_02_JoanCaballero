package cat.itacademy.barcelonactiva.caballero.joan.s04.t02.n03.S04T02N03CaballeroJoan.Model.Services;

import cat.itacademy.barcelonactiva.caballero.joan.s04.t02.n03.S04T02N03CaballeroJoan.Model.Domain.Fruita;
import cat.itacademy.barcelonactiva.caballero.joan.s04.t02.n03.S04T02N03CaballeroJoan.Model.Repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitaService {
    private final FruitaRepository fruitaRepository;

    @Autowired
    public FruitaService(FruitaRepository fruitaRepository){
        this.fruitaRepository = fruitaRepository;
    }

    public Fruita addFruita(Fruita fruita){
        return fruitaRepository.save(fruita);
    }

    public Fruita updateFruita(String id, Fruita fruita){
        Optional<Fruita> fruitaValida = fruitaRepository.findById(id);

        if(fruitaValida.isPresent()){
            Fruita fruitaARetornar = fruitaValida.get();
            fruitaARetornar.setNom(fruita.getNom());
            fruitaARetornar.setQuantitatQuilos(fruita.getQuantitatQuilos());
            fruitaRepository.save(fruitaARetornar);
            return fruitaARetornar;
        }else{
            return null;
        }
    }

    public void deleteFruita(String id){
        fruitaRepository.deleteById(id);
    }

    public Optional<Fruita> getFruita(String id){
        return fruitaRepository.findById(id);
    }

    public List<Fruita> getFruites(){
        return fruitaRepository.findAll();
    }
}
