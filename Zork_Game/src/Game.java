import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        System.out.printf("Willkommen zu Zork");

        System.out.printf("Willkommen zu Zork - Das verlassene Hotel\n\nDu betrittst das verlassene Hotel. Dunkelheit und Stille umgeben dich. Der Boden ist mit Staub bedeckt, und die Möbel sind verwittert.\nVor dir erstreckt sich ein langer Flur.\nEin verwittertes Schild zeigt auf einen Fahrstuhl, der nach oben führt. Daneben siehst du eine Treppe, die in die Dunkelheit hinabführt.\nBist du bereit, die Geheimnisse dieses Ortes zu erkunden und das Rätsel des verlassenen Hotels zu lösen?\n\nGib deine Befehle ein, um voranzukommen und herauszufinden, was hier geschehen ist. Viel Glück!\n");


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