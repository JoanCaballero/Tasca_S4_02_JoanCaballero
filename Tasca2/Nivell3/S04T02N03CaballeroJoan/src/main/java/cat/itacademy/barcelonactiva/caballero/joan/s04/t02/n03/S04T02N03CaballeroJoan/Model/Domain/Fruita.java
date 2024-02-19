package cat.itacademy.barcelonactiva.caballero.joan.s04.t02.n03.S04T02N03CaballeroJoan.Model.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "fruites")
public class Fruita {
    @Id
    private String id;
    @Field("nom")
    private String nom;
    @Field("quantitatQuilos")
    private int quantitatQuilos;

    public Fruita(){}

    public Fruita(String nom, int quantitatQuilos){
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    public String getId() {
        return id;
    }
}
