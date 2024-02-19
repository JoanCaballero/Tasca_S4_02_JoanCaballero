package cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n02.S04T02N02CaballeroJoan.Controllers;

import cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n02.S04T02N02CaballeroJoan.Model.Domain.Fruita;
import cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n02.S04T02N02CaballeroJoan.Model.Services.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruita")
public class FruitaController {
    @Autowired
    private final FruitaService fruitaService;

    @Autowired
    public FruitaController(FruitaService fruitaService){
        this.fruitaService = fruitaService;
    }

    @PostMapping("/add")
    public ResponseEntity<Fruita> addFruita(@RequestBody Fruita fruita){
        return ResponseEntity.status(HttpStatus.CREATED).body(fruitaService.addFruita(fruita));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruita> updateFruita(@PathVariable int id, @RequestBody Fruita fruita2){
        Fruita fruita = fruitaService.updateFruita(id, fruita2);
        if(fruita != null){
            return ResponseEntity.ok(fruita);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Fruita> getFruita(@PathVariable int id){
        Optional<Fruita> fruita = fruitaService.getFruita(id);
        if(fruita.isPresent()){
            return ResponseEntity.ok(fruita.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruita>> getFruites(){
        List<Fruita> fruites = fruitaService.getFruites();
        return ResponseEntity.ok(fruites);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruita(@PathVariable int id){
        fruitaService.deleteFruita(id);
        return ResponseEntity.noContent().build();
    }
}
