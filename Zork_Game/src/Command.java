import java.util.Scanner;

public class Command {
    private String firstWord;
    private String secondWord;
    private String command;

    public void userInput() {
        String[] keywords = {"go", "take", "use", "look", "inventory", "quit", "help"};
        Scanner scanner = new Scanner(System.in);
        command = scanner.nextLine().toLowerCase();
        String[] parts = command.split("\\s+");

        if (parts.length >= 1) {
            firstWord = parts[0];
        }

        if (parts.length >= 2) {
            secondWord = parts[1];
        }
    }

    public void InputHandler() {
        Scanner scanner = new Scanner(System.in);
        switch (firstWord) {
            case "help":
                System.out.println("Available commands: look, go, take, use, quit.");
                break;
            case "look":
                String room = "room1";
                if (room.equals("room1")) {
                    System.out.println("You look around the room. You see a leaflet in front of you.");
                }
                break;
            case "go":
                if (secondWord == null) {
                    System.out.println("Where do you want to go?");
                    Scanner scanDirection = new Scanner(System.in);
                    String specifiedInput = scanDirection.nextLine().toLowerCase();
                    switch (specifiedInput) {
                        case "north":
                            System.out.println("Here is a door to another room");
                            break;
                        case "east":
                            System.out.println("Here is a staircase that leads downstairs.");
                            break;
                        case "south":
                            System.out.println("Here is an elevator that leads upstairs.");
                            break;
                        case "west":
                            System.out.println("Here is the exit, blocked.");
                            break;
                        default:
                            System.out.println("You can't go there.");
                            break;
                    }
                } else {
                    switch (secondWord) {
                        case "north":
                            System.out.println("Here is a door to another room");
                            break;
                        case "east":
                            System.out.println("Here is a staircase that leads downstairs.");
                            break;
                        case "south":
                            System.out.println("Here is an elevator that leads upstairs.");
                            break;
                        case "west":
                            System.out.println("Here is the exit, blocked.");
                            break;
                        default:
                            System.out.println("You can't go there.");
                            break;
                    }
                }
                break;
            case "take":
                if (secondWord == null) {
                    System.out.println("What do you want to take?");
                    Scanner scanItem = new Scanner(System.in);
                    String specifiedInput = scanItem.nextLine().toLowerCase();
                    switch (specifiedInput) {
                        case "item1":
                            Item item1 = new Item("Sword", "Useful weapon against enemies.");
                            Player player = new Player();
                            player.getInventoryItems().add(item1);
                            System.out.println("Taken.");
                            break;
                        case "item2":
                            Item item2 = new Item("Key", "To open doors.");
                            Player player2 = new Player();
                            player2.getInventoryItems().add(item2);
                            System.out.println("Taken.");
                            break;
                        case "item3":
                            Item item3 = new Item("Potion", "It heals you.");
                            Player player3 = new Player();
                            player3.getInventoryItems().add(item3);
                            System.out.println("Taken.");
                            break;
                        case "item4":
                            Item item4 = new Item("Leaflet", "Leaflet with useful hints.");
                            Player player4 = new Player();
                            player4.getInventoryItems().add(item4);
                            System.out.println("Taken.");
                            break;
                        default:
                            System.out.println("There is no such item.");
                            break;
                    }
                } else {
                    switch (secondWord) {
                        case "item1":
                            System.out.println("Taken.");
                            break;
                        case "item2":
                            System.out.println("Taken.");
                            break;
                        case "item3":
                            System.out.println("Taken.");
                            break;
                        case "item4":
                            System.out.println("Taken.");
                            break;
                        default:
                            System.out.println("There is no such item.");
                            break;
                    }
                }
                break;
            case "use":
                if (secondWord == null) {
                    System.out.println("What do you want to take?");
                    Scanner scanUseItem = new Scanner(System.in);
                    String specifiedInput = scanUseItem.nextLine().toLowerCase();
                    switch (specifiedInput) {
                        case "item1":
                            System.out.println("Used.");
                            break;
                        case "item2":
                            System.out.println("Used.");
                            break;
                        case "item3":
                            System.out.println("Used.");
                            break;
                        case "item4":
                            System.out.println("Used.");
                            break;
                        default:
                            System.out.println("You can't use this item.");
                            break;
                    }
                } else {
                    switch (secondWord) {
                        case "item1":
                            System.out.println("Used.");
                            break;
                        case "item2":
                            System.out.println("Used.");
                            break;
                        case "item3":
                            System.out.println("Used.");
                            break;
                        case "item4":
                            System.out.println("Used.");
                            break;
                        default:
                            System.out.println("You can't use this item.");
                            break;
                    }
                }
                break;
            case "quit":
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            case "inventory":
                Player player = new Player();
                player.printInventory();
                break;

        }
    }
}

