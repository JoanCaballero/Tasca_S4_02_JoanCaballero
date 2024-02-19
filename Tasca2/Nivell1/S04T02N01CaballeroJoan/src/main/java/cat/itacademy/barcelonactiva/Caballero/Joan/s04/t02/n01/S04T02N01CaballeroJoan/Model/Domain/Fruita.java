package cat.itacademy.barcelonactiva.Caballero.Joan.s04.t02.n01.S04T02N01CaballeroJoan.Model.Domain;

import jakarta.persistence.*;

@Entity
public class Fruita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nom;
    @Column
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

    public int getId() {
        return id;
    }
}
