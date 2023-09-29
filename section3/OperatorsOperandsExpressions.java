package section3;

import org.junit.jupiter.api.Test;

public class OperatorsOperandsExpressions {


    @Test
    public void Operator() {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        result = result - 1; // 3 - 1 = 2
        System.out.println(previousResult + " - 1 = " + result);
    }

    @Test
    public void playChar() {
        char firstChar = 'A';
        char secondChar = 'B';
        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(firstChar + secondChar);
        System.out.println(firstChar + "" + secondChar);
    }

    @Test
    public void playMoltiplication() {
        int result = 10 * 5;
        System.out.println(result);
    }

    @Test
    public void playDivision() {
        int result = 10 / 5;
        System.out.println(result);
    }
    //remainder operator
    @Test
    public void playModulus() {
        int result = 10 % 5;
        System.out.println(result);
    }


    @Test
    public void playModulus2() {
        int result = 10 % 3;
        System.out.println(result);
    }

    /**
     * Abbreviating operators
     */

    @Test
    public void playAbbreviatingOperators() {
        int result = 1;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result -= 1;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 2;
        System.out.println(result);
        result %= 3;
        System.out.println(result);

    }

    @Test
    public void playAbbreviatingOperators2() {
        int result = 1;
        result--;
        result -= 1 ;
        System.out.println(result);
    }

    @Test
    public void statement() {
        {
            int result = 1;
            result++;
            System.out.println(result);
        }
        int result = 1;
        result++;
        System.out.println(result);
    }

    @Test
    public void precedence() {
        int result = 1 + 2 * 3;
        System.out.println(result);
    }

    @Test
    public void compoundStatement() {
        int result = 1;
        {
            result++;
            System.out.println(result);
        }
        result--;
        System.out.println(result);
    }
    @Test
    public void intAndDouble() {
        int result = 10;
        double doubleResult = 1.6;
        System.out.println(result);
        System.out.println(doubleResult);
        result += doubleResult;
        System.out.println("Int + double: " + result);

        result -= 5.5;
        System.out.println(": " + result);
    }
    @Test
    public void DoubleWithInt() {
        double result = 10.5;
        int intResult = 1;
        System.out.println(result);
        System.out.println(intResult);
        result += intResult;
        System.out.println("Double + int: " + result);

        result -= 5;
        System.out.println(": " + result);
    }
}
