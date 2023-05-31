import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private Item item1 = new Item("Sword", "Useful weapon against enemies.");
    private Item item2 = new Item("Key", "To open doors.");
    private Item item3 = new Item("Potion", "It can save your live.");
    private Item item4 = new Item("Leaflet", "Leaflet with useful hints.");
    private ArrayList<Item> inventoryItems;

    public Player() {
        inventoryItems = new ArrayList<>();
    }

    public Room getCurrentRoom() {

        return null;
    }

    public void setCurrentRoom(Room room) {
    }

    public void addItem1ToInventory(){
inventoryItems.add(item1);
    }
    public void addItem2ToInventory(){
        inventoryItems.add(item2);
    }
    public void addItem3ToInventory(){
        inventoryItems.add(item3);
    }
    public void addItem4ToInventory(){
        inventoryItems.add(item4);
    }
    public ArrayList<Item> getInventoryItems() {
        return inventoryItems;
    }

    public void pickupItem(Item item) {

    }

    public void dropItem(Item item) {

    }
public void printInventory(){
    System.out.println(inventoryItems.size());
    for (Item item : inventoryItems) {
        System.out.println(item);

    }
}

}
