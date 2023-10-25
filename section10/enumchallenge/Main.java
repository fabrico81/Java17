package section10.enumchallenge;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek day = DayOfTheWeek.MON;
        System.out.println(day);

        System.out.printf("Name is %s, ordinal is %d%n", DayOfTheWeek.FRI.name(), DayOfTheWeek.FRI.ordinal());
        System.out.println(getRandomDay());

    }

    public static DayOfTheWeek getRandomDay() {
        var allDays = DayOfTheWeek.values();
        int randomIndex = new Random().nextInt(7);
        return DayOfTheWeek.values()[randomIndex];
    }
}
