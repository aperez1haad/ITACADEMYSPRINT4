package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n01.Model.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "FRUTA")
public class Fruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "QUANTITAT_KILOS")
    private int quantitatKilos;


    public Fruta() {
        // CONSTRUCTOR VACIO PARA QUE JPA CORRECTO FUNCIONANDO
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getQuantitatKilos() {
        return quantitatKilos;
    }
    public void setQuantitatKilos(int quantitatKilos) {
        this.quantitatKilos = quantitatKilos;
    }
}
