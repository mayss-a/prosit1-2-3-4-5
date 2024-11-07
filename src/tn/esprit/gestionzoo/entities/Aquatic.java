package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public  abstract class Aquatic extends Animal {
    private String habitat;

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Getter et Setter pour habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Redéfinition de toString pour inclure l'attribut spécifique
    @Override
    public String toString() {
        return super.toString() + ", Habitat='" + habitat + "'";
    }

    // Méthode swim
    public abstract  void swim() ;
        
@Override
public boolean equals(Object o) {
    if (this == o) {
        return true;
    }
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
    Aquatic that = (Aquatic) o;
    return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(habitat, that.habitat);
}
}
