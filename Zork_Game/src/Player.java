import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private ArrayList<Item> inventoryItems;

    public Player() {
        inventoryItems = new ArrayList<>();
    }

    public Room getCurrentRoom() {
        // Implementiere den Zugriff auf den aktuellen Raum des Spielers
        return null;
    }

    public void setCurrentRoom(Room room) {
        // Setze den aktuellen Raum des Spielers

    }

    public ArrayList<Item> getInventoryItems() {
        return inventoryItems;
    }

    public void pickupItem(Item item) {
        // Implementiere das Aufheben eines Items durch den Spieler
    }

    public void dropItem(Item item) {
        // Implementiere das Ablegen eines Items durch den Spieler
    }
public void printInventory(){
    for (int i = 0; i < inventoryItems.size(); i++) {
        Item item = inventoryItems.get(i);
        System.out.println(item.getName());
    }
}

}
