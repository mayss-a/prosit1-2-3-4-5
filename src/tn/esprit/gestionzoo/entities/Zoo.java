package tn.esprit.gestionzoo.entities;


public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages;
    private int animalCount = 0;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    
    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

  
    @SuppressWarnings("unused")
    private int aquaticAnimalCount = 0;
    public boolean addAnimal(Animal animal) {
       
        if (isZooFull()) {
            System.out.println("Zoo is full, cannot add more animals.");
            return false;
        }
        if (isAnimalExists(animal)) {
            System.out.println("This animal already exists in the zoo.");
            return false;
        }
        if (animal instanceof Aquatic) {
            // Ajouter l'animal aquatique dans le tableau aquaticAnimals
            for (int i = 0; i < aquaticAnimals.length; i++) {
                if (aquaticAnimals[i] == null) {
                    aquaticAnimals[i] = (Aquatic) animal;
                    aquaticAnimalCount++;
                    return true;
                }
            }
            System.out.println("Tableau des animaux aquatiques plein");
            return false;
        } else {
            // Ajouter l'animal non aquatique dans le tableau animals
            animals[animalCount++] = animal;
            return true;
        }
    }

// Méthode pour vérifier si le zoo est plein
public boolean isZooFull() {
    return animalCount >= nbrCages;
}

    // Méthode pour ajouter un animal aquatique
public void addAquaticAnimal(Aquatic aquaticAnimal) {
    if (isZooFull()) {
        System.out.println("Zoo is full, cannot add more animals.");
        return;
    }
    if (isAnimalExists(aquaticAnimal)) {        System.out.println("This animal already exists in the zoo.");
        return;
    }
    // Ajouter l'animal aquatique dans le tableau aquaticAnimals
    for (int i = 0; i < aquaticAnimals.length; i++) {
        if (aquaticAnimals[i] == null) {
            aquaticAnimals[i] = aquaticAnimal;            return;
        }
    }
    System.out.println("Zoo is full, cannot add more animals.");
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
    // Méthode pour afficher la méthode swim() de tous les animaux aquatiques
public void displayAquaticAnimals() {
    for (Aquatic aquaticAnimal : aquaticAnimals) {
        if (aquaticAnimal != null) {
            aquaticAnimal.swim();
        }
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
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimal;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

public static void main(String[] args) {
    Zoo zoo = new Zoo("Mon zoo", "Ma ville", 10);
    Penguin penguin1 = new Penguin("Antarctica", 10.0f);
    Penguin penguin2 = new Penguin("Arctic", 15.0f);
    Penguin penguin3 = new Penguin("Australia", 8.0f);
    zoo.addAnimal(penguin1);
    zoo.addAnimal(penguin2);
    zoo.addAnimal(penguin3);
    float maxDepth = zoo.maxPenguinSwimmingDepth();
    System.out.println("La profondeur maximale de nage des penguins est de " + maxDepth + " mètres.");
}
public void displayNumberOfAquaticsByType() {
    int dolphinCount = 0;
    int penguinCount = 0;

    for (Aquatic aquatic : aquaticAnimals) {
        if (aquatic instanceof Dolphin) {
            dolphinCount++;
        } else if (aquatic instanceof Penguin) {
            penguinCount++;
        }
    }

    System.out.println("Nombre de dauphins : " + dolphinCount);
    System.out.println("Nombre de pingouins : " + penguinCount);
}
}


