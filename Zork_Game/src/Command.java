import java.util.Scanner;

public class Command {
    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        String command;

        // Game introduction
        System.out.println("Welcome to Zork!");
        System.out.println("You find yourself in a house.");

        // Game loop
        while (true) {
            System.out.println();
            System.out.print("> ");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "help":
                    System.out.println("Available commands: look, go, take, use, quit.");
                    break;
                case "look":
                    System.out.println("You look around the room. You see a leaflet in front of you.");
                    break;
                case "go":
                    System.out.println("Where do you want to move to?");
                    String specifiedInput = scanner.nextLine().toLowerCase();
                    switch (specifiedInput) {
                        case "forward":
                            System.out.println("There are three rooms.");
                            break;
                        case "right":
                            System.out.println("Here is a staircase that leads downstairs.");
                            break;
                        case "up":
                            System.out.println("Here is an elevator that leads upstairs.");
                            break;
                        case "back":
                            System.out.println("Here is the exit, blocked.");
                            break;
                        default:
                            System.out.println("You can't go there.");
                            break;
                    }
                    break;
                case "take":
                    System.out.println("What do you want to take?");
                    break;
                case "use":
                    System.out.println("What do you want to use?");
                    break;
                case "quit":
                    System.out.println("Goodbye.");
                    System.exit(0);
                    break;
                case "look up":
                    System.out.println("There's nothing interesting above you.");
                    break;
                case "look down":
                    System.out.println("You see the floor beneath your feet.");
                    break;
                case "go left":
                    System.out.println("There's a wall blocking your way.");
                    break;
                case "take pen":
                    System.out.println("You don't see a pen anywhere.");
                    break;
                case "use leaflet":
                    System.out.println("The leaflet doesn't seem to have any use.");
                    break;
                case "go through door":
                    System.out.println("There's no door in this room.");
                    break;
                case "take key":
                    System.out.println("You don't see a key anywhere.");
                    break;
                case "use door":
                    System.out.println("The door is locked.");
                    break;
                default:
                    System.out.println("I don't recognize this command.");
                    break;
            }
        }
    }
}
