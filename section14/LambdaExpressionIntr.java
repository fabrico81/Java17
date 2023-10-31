package section14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionIntr {

    record Person(String name, String surname) {
        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
    }

    public static void main(String[] args) {

        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSurname().compareTo(p2.getSurname());
            }
        };


        List<Person> persons = Arrays.asList(new Person("John", "Doe"), new Person("Jane", "Doe"));
        persons.sort(Comparator.comparing(Person::getSurname));
        System.out.println(persons);

        interface EnhancedComparator<T> extends Comparator<T> {
             int secondLevelCompare(T t1, T t2);
        }

        var comparator = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int result = p1.getSurname().compareTo(p2.getSurname());
                return result != 0 ? result : secondLevelCompare(p1, p2);
            }

            @Override
            public int secondLevelCompare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        persons.sort(comparator);
        System.out.println(persons);
    }
}
