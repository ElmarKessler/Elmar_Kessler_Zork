import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        System.out.printf("Willkommen zu Zork");

        System.out.printf("Willkommen zu Zork - \n\nGib deine Befehle ein, um voranzukommen und herauszufinden, was hier geschehen ist. Viel Glück!\n");


   Command command =new Command();
   command.userInput();
    }

    Item sword = new Item("Sword", "A sharp weapon for battles");
    Item potion = new Item("Health Potion", "Restores health points");
    Item key = new Item("Key", "Unlocks doors");

    Room room1 = new Room("You are in a dark room.", sword);
    Room room2 = new Room("You enter a large hall.", potion);
    Room room3 = new Room("You find yourself in a mysterious chamber.", key);
}