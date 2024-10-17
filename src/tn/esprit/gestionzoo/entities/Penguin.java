package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Constructeur paramétré
    public Penguin(String habitat, float swimmingDepth) {
        super("Penguin", "Default Penguin", 0, true, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter et Setter pour swimmingDepth
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

// Redéfinition de toString pour inclure l'attribut spécifique
}
