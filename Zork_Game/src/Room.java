import java.util.ArrayList;
import java.util.List;

public class Room<Direction> {
    String description;

    private ArrayList<Item> items;

    private List<Item> items;



    public Room(String description, Item item) {
        this.description = description;
        this.items = items;
    }

    public String getDescription(){


        return description;
    }


    public void addItem(Item item) {
        items.add(item);

        return "";
    }

    public Room getExit(Direction direction) {
        // Implementiere den Zugriff auf den Raum in der angegebenen Richtung
        return null;
    }

    public void addItem(Item item) {
        // Implementiere das Hinzufügen eines Items zum Raum

    }

    public void removeItem(Item item) {
        // Implementiere das Entfernen eines Items aus dem Raum
    }

    public List<Item> getItems() {
        // Implementiere den Zugriff auf die Items im Raum
        return new ArrayList<>();
    }

}
