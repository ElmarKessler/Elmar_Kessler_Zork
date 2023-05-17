import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Command {
    public String getAction() {
        // Implementiere den Zugriff auf die Aktion des Kommandos
        return "";
    }

    public List<String> getParameters() {
        // Implementiere den Zugriff auf die Parameter des Kommandos
        return new ArrayList<>();
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toLowerCase();
        switch (userInput) {

            case "look":
                System.out.println("You look around the room. You see a leaflet in front of you");
                break;
            case "go":
                System.out.println("Where you want to move to?");
                String specifiedInput = scanner.nextLine().toLowerCase();
                if (specifiedInput.equals("forward")) {
<<<<<<< HEAD
                    System.out.println(".");
=======
                    System.out.println("Hier ist ein Flur, umgeben von Hotelzimmer.");
>>>>>>> 166586e7386083584046038737706fb25c7472ba
                }
                if (specifiedInput.equals("right")) {
                    System.out.println("Hier ist eine Treppe, die nach unten führt.");
                }
                if (specifiedInput.equals("Hier ist ein Aufzug, der nach oben führt.")) {

                }
                if (specifiedInput.equals("back")) {
                    System.out.println("Hier ist der Ausgang, versperrt.");
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
                break;
            default:
                System.out.println("I don't recognize this command.");
                break;
        }
        // Implementiere das Parsen der Benutzereingabe und die Erzeugung eines Command-Objekts

    }
}
