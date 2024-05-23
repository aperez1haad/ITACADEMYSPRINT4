package cat.itacademy.barcelonactiva.PerezBraveso.Alejandro.s04.t02.n03.Model.Domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Document(collection = "FRUTA")
public class Fruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Field("nom")
    private String nom;
    @Field("quantitatKilos")
    private int quantitatKilos;

    public Fruta() {
        // CONSTRUCTOR VACIO PARA QUE JPA CORRECTO FUNCIONANDO
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
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
