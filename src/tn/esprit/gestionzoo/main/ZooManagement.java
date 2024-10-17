package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instruction 1 et 2 : Saisie de l'utilisateur
        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        // Création d'un zoo
        Zoo myZoo = new Zoo(zooName, "Ariana", nbrCages);

        // Création d'animaux
        Animal lion = new Terrestrial("Cat", "Sim", 8, true, 4);
        Animal dog = new Terrestrial("Dog", "Sugar", 2, true, 4);
        Animal dolphin = new Dolphin("Ocean", 25.5f);
        Animal penguin = new Penguin("Antarctica", 50.0f);

        // Ajout d'animaux au zoo
        System.out.println("Ajout de lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout de chien : " + myZoo.addAnimal(dog));
        System.out.println("Ajout de dauphin : " + myZoo.addAnimal(dolphin));
        System.out.println("Ajout de pingouin : " + myZoo.addAnimal(penguin));

        // Affichage des animaux dans le zoo
        System.out.println("Animaux dans le zoo :");
        myZoo.displayAnimals();

        // Rechercher un animal
        System.out.println("Recherche de l'animal : " + lion.getName());
        int index = myZoo.searchAnimal(lion);
        System.out.println(index >= 0 ? "Animal trouvé à l'indice : " + index : "Animal non trouvé.");

        // Tentative d'ajout d'un animal qui existe déjà
        System.out.println("Tentative d'ajout du lion à nouveau : " + myZoo.addAnimal(lion));

        // Affichage du zoo
        myZoo.displayZoo();

        // Vérification si le zoo est plein
        System.out.println("Le zoo est plein ? " + (myZoo.isZooFull() ? "Oui" : "Non"));

        scanner.close();
    }
}
