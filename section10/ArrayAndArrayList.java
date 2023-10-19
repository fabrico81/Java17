package section10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayList {

    public static void main(String[] args) {
        String[] originalArray = new String[] {"apple", "banana", "orange"};
        var originalList = Arrays.asList(originalArray);
        originalList.set(0, "pear");
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array" + Arrays.toString(originalArray));
      //  originalList.remove(0);


        List<String> newList = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday");

    }
}
