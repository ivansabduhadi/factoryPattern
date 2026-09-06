package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Choose your pet number: ");
            choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);

                    System.out.print("Enter Dog breed: ");
                    String breed = input.next();
                    ((Dog) pet).setBreed(breed);

                    System.out.println("Pet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    break;


                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Miming");
                    petFile.setPet(pet);

                    System.out.print("Enter Cat number of lives: ");
                    int lives = input.nextInt();
                    ((Cat) pet).setNoOfLives(lives);

                    System.out.println("Pet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                    default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }
}
