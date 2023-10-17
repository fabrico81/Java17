package section5;

public class Methods {

    public static void main(String[] args) {
        calculateScore();

       displayHighScorePosition("Player1", calculateHighScorePosition(1500));
       displayHighScorePosition("Player2", calculateHighScorePosition(1000));
       displayHighScorePosition("Player3", calculateHighScorePosition(500));
       displayHighScorePosition("Player4", calculateHighScorePosition(100));
       displayHighScorePosition("Player5", calculateHighScorePosition(25));

    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    /**
     * methods recap
     */
    public static void methodsRecap() {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 0;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            position = 2;
        }else if (playerScore >= 100 && playerScore < 500) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
