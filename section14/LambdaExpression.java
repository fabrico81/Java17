package section14;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("John", "Jane", "Jack", "Jill"));

        for(String name : names) {
            System.out.println(name);
        }
        System.out.println("-----");

        names.forEach(name -> System.out.println(name));

        names.forEach(name -> {
            char m = name.charAt(0);
            System.out.println("The " + m +" as "+ name);
        });

        int result = calculator(( a, b) -> a + b, 14,20);
        System.out.println(result);
    }


    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operator(value1, value2);
        System.out.println("Result of operation: "+ result);
        return result;
    }


}
