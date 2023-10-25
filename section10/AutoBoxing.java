package section10;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoBoxing {

    public static void main(String[] args) {
        Integer i = 10; // autoboxing
        int j = i; // auto-unboxing
        System.out.println(i + " " + j);

        Integer boxedInt = Integer.valueOf(10);
        int unboxedInt = boxedInt.intValue(); // unboxing unnecessary

        Double resultBoxed = getDoublePrimitive(); // autoboxing
        double resultUnboxed = getDoubleObject(); // auto-unboxing

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 10; // autoboxing
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character [] charArray = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(charArray));
        var ourList = getIntegerList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static Double getDoubleObject() {
        return Double.valueOf(10.0);
    }

    private static double getDoublePrimitive() {
        return 10.0;
    }

    private static ArrayList<Integer> getIntegerList(int... args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : args) { // auto-unboxing
            list.add(i); // autoboxing
        }
        return list;
    }

    private static int returnInt(Integer i) {
        return i;
    }

    private static Integer returnInteger(int i) {
        return i;
    }
}
