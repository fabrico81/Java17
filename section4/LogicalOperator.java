package section4;

import org.junit.jupiter.api.Test;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


    }

    @Test
    public void testOperator() {
        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens");

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }

    @Test
    public void logicalOrOperator() {
        int topScore = 100;
        if (topScore < 100 || topScore > 100) {
            System.out.println("Either or both of the conditions are true");
        }
    }

    @Test
    public void assignmentOperator() {
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
    }
    @Test
    public void assignmentOperatorWithBoolean() {
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }
    }

    @Test
    public void ternaryOperator() {
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }

    /**
     * Challenge
     * Step 1: Create a double variable with the value 20
     * Step 2: Create a second variable of type double with the value 80
     * Step 3: Add both numbers up, then multiply by 100
     * Step 4: Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
     * Step 5: Create a boolean variable that assigns the value a true, "if" the remaining total (#4) is equal to 20 or less.
     * Step 6: output the boolean variable that you created in step 5
     * Step 7: Write an if-then statement that displays "Got some remainder" if the boolean in step 6 is not true.
     */
    @Test
    public void challenge() {
        double var = 20.00;
        double var2 = 80.00;
        double sum = (var + var2) * 25;
        double reminder = sum % 40;
        boolean isReminder = reminder <= 20.00 ? true : false;

        if (isReminder) {
            System.out.println("Total was over the limit");
        } else {
            System.out.println("Got same reminder" + reminder);
        }
    }
}
