import java.util.ArrayList;
import java.util.List;

public class Room<Direction> {
    String description;

    private ArrayList<Item> items;


    public Room(String description, Item item) {
        this.description = description;
        this.items = items;
    }

    public String getDescription(){


        return description;
    }


    public void addItem(Item item) {
        items.add(item);

    }

    public Room getExit(Direction direction) {

        return null;
    }


    public void removeItem(Item item) {

    }

    public List<Item> getItems() {

        return new ArrayList<>();
    }

}
