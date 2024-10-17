package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages;
    private int animalCount = 0;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full, cannot add more animals.");
            return false;
        }
        if (isAnimalExists(animal)) {
            System.out.println("This animal already exists in the zoo.");
            return false;
        }
        animals[animalCount++] = animal;
        return true;
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Méthode pour comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }

    // Méthode pour chercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].toString().equals(animal.toString())) {
                return i;
            }
        }
        return -1;
    }

    // Méthode pour afficher le zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }

    // Méthode pour afficher les animaux
    public void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Setter pour le nom du zoo
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Zoo name cannot be empty.");
        }
    }

    // Getter pour le nom du zoo
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }

    // Méthode pour vérifier si un animal existe déjà
    private boolean isAnimalExists(Animal animal) {
        return searchAnimal(animal) != -1;
    }
}


