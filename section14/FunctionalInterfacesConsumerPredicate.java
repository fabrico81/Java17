package section14;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class FunctionalInterfacesConsumerPredicate {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("john", "Jane", "Jack", "Jill"));

        names.forEach(s -> System.out.println(s));

        int result = calculator((a, b) -> a + b, 3, 5);
        System.out.println(result);
        System.out.println("----");

        var coords = Arrays.asList(
                new double[]{32.656, 65.544},
                new double[]{54.873, 76.635},
                new double[]{54.874, 75.434}
        );

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("lat:.%3f lon:%3f", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);
        System.out.println("-----");
        names.addAll(List.of("Milan", "Mila"));
        names.removeIf(p -> p.startsWith("Mi"));
        System.out.println(names);
        System.out.println("----");
        names.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        names.forEach(s -> System.out.println(s));
        String[] emptyString = new String[10];
        System.out.println(Arrays.toString(emptyString));
        Arrays.fill(emptyString, "");
        System.out.println(Arrays.toString(emptyString));

        Arrays.setAll(emptyString, i -> "" + (i + 1) + ".");
        System.out.println(Arrays.toString(emptyString));

        Arrays.setAll(emptyString, (i) -> "" + (i + 1) + "."
                + switch (i) {
            case 0 -> "one";
            case 1 -> "two";
            case 2 -> "three";
            default -> "";

        });
        System.out.println(Arrays.toString(emptyString));

        String[] namesValue = new String[]{"Carol, John, Sam, Jenny"};

        String[] randomNameValue =
                randomString(15, namesValue,
                        () -> new Random().nextInt(0, namesValue.length));

        System.out.println(Arrays.toString(randomNameValue));


    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T value1, T value2, BiConsumer<T, T> consumer) {
        consumer.accept(value1, value2);
    }

    public static String[] randomString(int count, String[] values, Supplier<Integer> supplier) {

        String[] selectedValue = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValue[i] = values[supplier.get()];
        }
        return selectedValue;
    }
}
