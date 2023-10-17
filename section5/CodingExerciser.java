package section5;

import org.junit.jupiter.api.Test;

public class CodingExerciser {


    @Test
    public void printMegaBytesAndKiloBytes() {
        int kilobyte = 2500;
        int megaByte = Math.round(kilobyte / 1024);
        int reminder = kilobyte % 1024;
        System.out.println(kilobyte + " KB = " + megaByte + " MB and " + reminder + " KB");
    }

    public static void main(String[] args) {
      /*  System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("\n");

        System.out.println(isLeapYear(2017));
      */  System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiply the numbers by 1000 to shift three decimal places to the right
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        // Compare the integers after scaling
        return scaledNum1 == scaledNum2;
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /*
    Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
     */

}
