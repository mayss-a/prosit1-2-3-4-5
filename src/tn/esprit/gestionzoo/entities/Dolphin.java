package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Constructeur paramétré
    public Dolphin(String habitat, float swimmingSpeed) {
        super("Dolphin", "Default Dolphin", 0, true, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getter et Setter pour swimmingSpeed
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Redéfinition de toString pour inclure l'attribut spécifique
    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed=" + swimmingSpeed + " km/h";
    }

    // Redéfinition de la méthode swim
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
