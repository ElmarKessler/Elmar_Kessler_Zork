import java.util.ArrayList;
import java.util.List;

public class Player {
private ArrayList<Item> inventoryItems;
    public Room getCurrentRoom() {
        // Implementiere den Zugriff auf den aktuellen Raum des Spielers
        return null;
    }

    public void setCurrentRoom(Room room) {
        // Setze den aktuellen Raum des Spielers

    }

    public void pickupItem(Item item) {
        // Implementiere das Aufheben eines Items durch den Spieler
    }

    public void dropItem(Item item) {
        // Implementiere das Ablegen eines Items durch den Spieler
    }

    public List<Item> getInventory() {
        // Implementiere den Zugriff auf das Inventar des Spielers
        return new ArrayList<>();
    }
}
