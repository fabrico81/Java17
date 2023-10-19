package section10;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 0);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class ListAndArrayList {

    public static void main(String[] args) {

        GroceryItem [] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("Milk");
        groceryItems[1] = new GroceryItem("apples", "FRUIT", 5);
        groceryItems[2] =  new GroceryItem("eggs", "DAIRY", 12);
        System.out.println(Arrays.toString(groceryItems));

        ArrayList objects = new ArrayList();
        objects.add("Yougurt");
        objects.add(new GroceryItem("Butter"));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milks"));
        groceryList.add(new GroceryItem("Eggs", "DAIRY", 12));
        groceryList.set(0, new GroceryItem("Apples", "FRUIT", 5));
        groceryList.remove(1);
        System.out.println(groceryList);

    }
}
