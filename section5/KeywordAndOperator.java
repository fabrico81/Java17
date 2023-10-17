package section5;

import org.junit.jupiter.api.Test;

public class KeywordAndOperator {

    public static void main(String[] args) {
        // Keyword
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        // Operator
        int d = 10;
        int e = 20;
        int f = d + e;
        System.out.println(f);
    }
    @Test
    public void expressionChallenge() {
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }
        int health = 100;
        if((health < 25) && (health > 1000)) {
            highScore = highScore - 100;
        }
        System.out.println(highScore);
    }


}
