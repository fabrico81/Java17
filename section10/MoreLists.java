package section10;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apple", "banana", "orange"};

        List<String> list = List.of(items);
// list.add(0, "pear"); // error immutable list
        System.out.println(list);

        List<String> groceryList = new ArrayList<>(list);
        groceryList.add("milk");
        System.out.println(groceryList);
        Integer integer = 3;
        System.out.println(integer.getClass().getName());

        Integer [] array = {integer};
        System.out.println(array[0]);
        System.out.println(array.getClass().getName());

        int intPrimitive = 9;
        System.out.println(intPrimitive);
    }
}
