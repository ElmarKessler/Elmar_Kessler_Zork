import java.util.ArrayList;

public class Item {
    String name;
    String description;


    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {
        return description;

          }


    public void use() {
        // Implementiere das Verhalten, wenn das Item benutzt wird
    }
}
