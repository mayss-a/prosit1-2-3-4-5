package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Getter et Setter pour nbrLegs
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    // Redéfinition de toString pour inclure l'attribut spécifique
    @Override
    public String toString() {
        return super.toString() + ", Number of Legs=" + nbrLegs;
    }
}
