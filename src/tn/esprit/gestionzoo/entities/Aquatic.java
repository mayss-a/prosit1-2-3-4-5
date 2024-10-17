package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
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
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}
